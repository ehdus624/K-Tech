package com.ktech.ourapp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ktech.ourapp.model.FmeasureVO;
import com.ktech.ourapp.model.GamesVO;
import com.ktech.ourapp.model.PredictVO;
import com.ktech.ourapp.service.IKtechService;

@Controller
@RequestMapping
public class KtechController {

	@Autowired
	IKtechService ktechService;

	@RequestMapping(value = "/getpred/{gameId}", method=RequestMethod.GET)
	public String getPredList(@PathVariable String gameId, HttpServletRequest request, Model model) {
		GamesVO game = ktechService.getGameInfo(gameId);
		model.addAttribute("game", game);
		return "ktech/getpred";
	}

	@RequestMapping(value="/postpred/{gameId}", method=RequestMethod.POST)
	public String postPredList (@PathVariable String gameId, @RequestParam(value="preds", required=false) List<String> preds, Model model){
		List<PredictVO> predList = ktechService.getPredictList(preds, gameId);
		GamesVO game = ktechService.getGameInfo(gameId);
		model.addAttribute("predList", predList);
		model.addAttribute("game", game);
		return "ktech/postpred";
	}

	@RequestMapping(value="/scheduleinfo")
	public String getScheduleInfo(Model model) {
		List<GamesVO> games = ktechService.getScheduleInfo();
		model.addAttribute("games", games);
		return "ktech/scheduleinfo";
	}

	@RequestMapping(value = "/scheduleinfo/{gameId}")
	public String getTeamInfo(@PathVariable String gameId, Model model) {
		GamesVO teamInfo = ktechService.getTeamInfo(gameId);
		model.addAttribute("teamInfo", teamInfo);
		return "ktech/teaminfo";
	}

	@RequestMapping("/date/{league}")
	public String getAllDate(@PathVariable String league, Model model) {
		List<GamesVO> dateList = ktechService.getGamedateList(league);
		model.addAttribute("dateList", dateList);
		return "ktech/gameDate";
	}

	@RequestMapping(value="{gameId}")
	public String getGamedateInfo(@PathVariable String gameId, Model model) {
		GamesVO gamedate = ktechService.getGamedateInfo(gameId);
		model.addAttribute("gamedate", gamedate);
		return "ktech/view";
	}
	
	@RequestMapping(value = "analysis")
	public String getAnalysisInquiry() {
		return "ktech/analysis";
	}
	
	@RequestMapping(value = "predict")
	public String getPredictInquiry() {
		return "ktech/predict";
	}
	
	@RequestMapping(value="/schedulelist")
	public String getScheduleList(Model model) {
		List<GamesVO> schedule1 = ktechService.getScheduleList("클래식");
		List<GamesVO> schedule2 = ktechService.getScheduleList("챌린지");
		model.addAttribute("schedule1", schedule1);
		model.addAttribute("schedule2", schedule2);
		return "ktech/schedulelist";
	}
	
	 @RequestMapping(value = "accuracy")
	   public String getAccuracy(Model model) {
	      List<GamesVO> dateList = ktechService.getGamedateList();
	      model.addAttribute("dateList2",dateList);
	      return "ktech/accuracy";
	   }

}