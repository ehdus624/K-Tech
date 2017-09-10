package com.ktech.ourapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.rosuda.JRI.REXP;
import org.rosuda.JRI.Rengine;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ktech.ourapp.dao.IKtechRepository;
import com.ktech.ourapp.model.FmeasureVO;
import com.ktech.ourapp.model.GamesVO;
import com.ktech.ourapp.model.KtechVO;
import com.ktech.ourapp.model.PredictVO;

@Service
public class KtechService implements IKtechService {
	
	private static final Logger logger = LoggerFactory.getLogger(KtechService.class);
	
	@Autowired
	IKtechRepository ktechRepository;
	
	@Autowired
	Rengine rEngine;

	   @Override
	   public ArrayList<PredictVO> getPredictList(List<String> preds, String gameId) {
	      String str = "";
	      String subGameId = gameId.substring(1, gameId.length());
	      int size = 0;
	      if(preds != null) {
	         size = preds.size();
	      }
	      switch(size) {
	      case 0:
	         break;
	      case 1:
	         str = "," +  preds.get(0);
	         break;
	      case 2:
	         str = "," + preds.get(0) + "," + preds.get(1);
	         break;
	      case 3:
	         str = "," + preds.get(0) + "," + preds.get(1)+ "," + preds.get(2);
	         break;
	      case 4:
	         str = "," + preds.get(0) + "," + preds.get(1)+ "," + preds.get(2)+ "," + preds.get(3);
	         break;
	      case 5:
	         str = "," + preds.get(0) + "," + preds.get(1)+ "," + preds.get(2)+ "," + preds.get(3)+ "," + preds.get(4);
	         break;
	      case 6:
	         str = "," + preds.get(0) + "," + preds.get(1)+ "," + preds.get(2)+ "," + preds.get(3)+ "," + preds.get(4)+ "," + preds.get(5);
	         break;
	      case 7:
		         str = "," + preds.get(0) + "," + preds.get(1)+ "," + preds.get(2)+ "," + preds.get(3)+ "," + preds.get(4)+ "," + preds.get(5)+ "," + preds.get(6);
		         break;
	      }
	      //         String evalString = "game <- subset(game, select=c(gameId" +str + "))";
	      //         System.out.println(evalString);

//	      rEngine.eval("install.packages(\"xgboost\")");
//	      rEngine.eval("install.packages(\"e1071\")");
//	      rEngine.eval("install.packages(\"readxl\")");
	      rEngine.eval("rm(list = ls())");
	      rEngine.eval("library(readxl)");
	      rEngine.eval("library(e1071)");
	      rEngine.eval("library(xgboost)");
	      rEngine.eval("data1_1<-read_excel(\"D://projects//workplace//Data//training.xlsx\")");
	      String evalString = "data<-subset(data1_1, select =c(GAME_ID,GOALS_FOR_3,GOALS_AGAINST_3,GOAL_DIFFERENCE_3,CUM_GOALS_FOR,"
	            + "CUM_GOALS_AGAINST,AGAINST_GOALS_FOR_3,AGAINST_GOALS_AGAINST_3,AGAINST_GOAL_DIFFERENCE_3,"
	            + "AGAINST_CUM_GOALS_FOR,AGAINST_CUM_GOALS_AGAINST,AGAINST_CUM_GOAL_DIFFERENCE,AVG_TARGET_SHOT,"
	            + "AGAINST_TARGET_SHOT_3,AGAINST_AVG_TARGET_SHOT,RECENT_RESULT_WIN,RECENT_RESULT_DRAW,RECENT_RESULT_LOSE,"
	            + "AGAINST_RECENT_RESULT_WIN,AGAINST_RECENT_RESULT_DRAW,AGAINST_RECENT_RESULT_LOSE,WIN,DRAW,LOSE,AGAINST_WIN,"
	            + "AGAINST_DRAW,AGAINST_LOSE,DRAW_RATE,AGAINST_WIN_RATE,AGAINST_DRAW_RATE,AGAINST_LOSE_RATE,AGAINST_TEAM_ABILITY_3,"
	            + "AVG_TEAM_ABILITY,AVG_AGAINST_TEAM_ABILITY,AVG_ABILITY_DIFFERENCE,WIN_MARKOV,DRAW_MARKOV,"
	            + "LOSE_MARKOV,AGAINST_WIN_MARKOV,AGAINST_DRAW_MARKOV,AGAINST_LOSE_MARKOV,PREV_RANK,AGAINST_PREV_RANK,AGAINST_CUM_POINTS,"
	            + "AGAINST_PREV_RESULT,TEAM_ABILITY_3,CUM_POINTS,LOSE_RATE" + str + ",GAME_RESULT))";
	      rEngine.eval(evalString);
	      rEngine.eval("analysis<-data");
	      rEngine.eval("analysis<-subset(analysis,select=-c(GAME_ID)");
	      rEngine.eval("y_train<-analysis[ , ncol(analysis)]");
	      rEngine.eval("y_train<-as.matrix(y_train)");
	      rEngine.eval("x_train <- subset(analysis, select = -GAME_RESULT)");
	      rEngine.eval("x_train <- as.matrix(x_train)");
	      rEngine.eval("x_train <- matrix(suppressWarnings(as.numeric(x_train)), nrow(x_train), ncol(x_train))");
	      rEngine.eval("x_train <- as.matrix(x_train)");
	      rEngine.eval("param <- list(\"objective\" = \"multi:softprob\", \"eval_metric\" = \"mlogloss\", \"num_class\" = 3, \"nthread\" = 8)");
	      rEngine.eval("model_xg<-xgboost(param = param, data = x_train[1:length(y_train),], nrounds =  120, label = y_train, missing = NaN)");
	      rEngine.eval("tdata<-read_excel(\"D://projects//workplace//Data//predicting.xlsx\")");
	      String evalString2 = "predata<-subset(tdata, select =c(GAME_ID, GOALS_FOR_3, GOALS_AGAINST_3, GOAL_DIFFERENCE_3, "
	            + "CUM_GOALS_FOR, CUM_GOALS_AGAINST, AGAINST_GOALS_FOR_3, AGAINST_GOALS_AGAINST_3, "
	            + "AGAINST_GOAL_DIFFERENCE_3, AGAINST_CUM_GOALS_FOR, AGAINST_CUM_GOALS_AGAINST, AGAINST_CUM_GOAL_DIFFERENCE,"
	            + " AVG_TARGET_SHOT, AGAINST_TARGET_SHOT_3, AGAINST_AVG_TARGET_SHOT, RECENT_RESULT_WIN, RECENT_RESULT_DRAW,"
	            + " RECENT_RESULT_LOSE, AGAINST_RECENT_RESULT_WIN, AGAINST_RECENT_RESULT_DRAW, AGAINST_RECENT_RESULT_LOSE, WIN, DRAW, LOSE,"
	            + " AGAINST_WIN, AGAINST_DRAW, AGAINST_LOSE, DRAW_RATE, AGAINST_WIN_RATE, AGAINST_DRAW_RATE, AGAINST_LOSE_RATE,"
	            + " AGAINST_TEAM_ABILITY_3, AVG_TEAM_ABILITY, AVG_AGAINST_TEAM_ABILITY, AVG_ABILITY_DIFFERENCE, "
	            + "WIN_MARKOV, DRAW_MARKOV, LOSE_MARKOV, AGAINST_WIN_MARKOV, AGAINST_DRAW_MARKOV, AGAINST_LOSE_MARKOV, PREV_RANK, "
	            + "AGAINST_PREV_RANK, AGAINST_CUM_POINTS, AGAINST_PREV_RESULT,TEAM_ABILITY_3,CUM_POINTS,LOSE_RATE" + str + "))";
	      rEngine.eval(evalString2);
	      rEngine.eval("predata<-subset(predata, GAME_ID == \"1" + subGameId + "\" | GAME_ID == \"0" + subGameId + "\")");
	      rEngine.eval("predata<-subset(predata,select=-c(GAME_ID))");
	      rEngine.eval("predata<-as.matrix(predata)");
	      rEngine.eval("predicted_data <- predict(model_xg, predata, type=\"probs\", missing = NaN)");
	      rEngine.eval("predicted_data<-matrix(predicted_data, ncol = 3, nrow = length(predicted_data)/3, byrow = TRUE) ");
	      REXP homeWin = rEngine.eval("round((home_win_pct<-(predicted_data[1,1]+predicted_data[2,3])*100/2),2)");
	      REXP homeDraw = rEngine.eval("round((home_draw_pct<-(predicted_data[1,2]+predicted_data[2,2])*100/2),2)");
	      REXP homeLose = rEngine.eval("round((home_lose_pct<-(predicted_data[1,3]+predicted_data[2,1])*100/2),2)");
	      REXP awayWin = rEngine.eval("round((away_win_pct<-home_lose_pct),2)");
	      REXP awayDraw = rEngine.eval("round((away_draw_pct<-home_draw_pct),2)");
	      REXP awayLose = rEngine.eval("round((away_lose_pct<-home_win_pct),2)");

	      PredictVO pred = new PredictVO();
	      ArrayList<PredictVO> predlist = new ArrayList<PredictVO>();      

	      pred.setHomeWin(homeWin.asDouble());   
	      pred.setHomeDraw(homeDraw.asDouble());
	      pred.setHomeLose(homeLose.asDouble());
	      pred.setAwayWin(awayWin.asDouble());
	      pred.setAwayDraw(awayDraw.asDouble());
	      pred.setAwayLose(awayLose.asDouble());

	      predlist.add(pred);
	      rEngine.end();
	      return predlist;
	   }

	   @Override
	   public List<GamesVO> getScheduleInfo() {   
	      return ktechRepository.getScheduleInfo();
	   }

	   @Override
	   public GamesVO getTeamInfo(String gameId) {
	      return ktechRepository.getTeamInfo(gameId);
	   }
	   
	   @Override
	   public List<GamesVO> getGamedateList(String league) {
	      return ktechRepository.getGamedateList(league);
	   }

	   @Override
	   public GamesVO getGamedateInfo(String gameId) {
	      return ktechRepository.getGamedateInfo(gameId);
	   }

	@Override
	public List<GamesVO> getScheduleList(String league) {
		return ktechRepository.getScheduleList(league);
	}


	@Override
	public GamesVO getGameInfo(String gameId) {
		return ktechRepository.getGameInfo(gameId);
	}
	
	@Override
    public List<GamesVO> getGamedateList() {      
       return ktechRepository.getGamedateList();
    }
}
