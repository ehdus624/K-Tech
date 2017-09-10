package com.woowafootball.ourapp.games;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.woowafootball.ourapp.games.model.NewGamesVO;
import com.woowafootball.ourapp.games.service.IGameService;

public class AddNewGameMain {
	public static void main(String[] args) {

		AbstractApplicationContext context =
				new ClassPathXmlApplicationContext("spring/application-config.xml");
		IGameService gameService = context.getBean("gameService", IGameService.class);

		NewGamesVO newGames = new NewGamesVO();

		List<Map<String, Object>> schedule = gameService.getSchedule();
		
//		for(int i = 0; i < schedule.size(); i++) {
//			System.out.println(schedule.get(i));	
//		}
		
		for(int i = 0; i < schedule.size(); i++) {
			for(int j = 0; j < 2; j++) {
				if(j == 0) {
					newGames.setTeam(schedule.get(i).get("HOME").toString());
					newGames.setAgainstTeam(schedule.get(i).get("AWAY").toString());
					newGames.setIsHome(0);
				} else if(j == 1) {
					newGames.setTeam(schedule.get(i).get("AWAY").toString());
					newGames.setAgainstTeam(schedule.get(i).get("HOME").toString());
					newGames.setIsHome(1);
				}

				List<Map<String, Object>> homeRecent3 = gameService.getRecent3(newGames.getTeam());
				List<Map<String, Object>> awayRecent3 = gameService.getRecent3(newGames.getAgainstTeam());
				List<Map<String, Object>> homeAvgCum = gameService.getAvgCumData(newGames.getTeam());
				List<Map<String, Object>> awayAvgCum = gameService.getAvgCumData(newGames.getAgainstTeam());
				List<Map<String, Object>> homeMarkov = gameService.getMarkov(newGames.getTeam());
				List<Map<String, Object>> awayMarkov = gameService.getMarkov(newGames.getAgainstTeam());
				
				newGames.setSeason(2017);
				newGames.setLeague(schedule.get(i).get("LEAGUE").toString());
				newGames.setGameDate(schedule.get(i).get("GAME_DATE").toString().substring(0, 10));
				
				if(j == 0) {
					if(newGames.getLeague().equals("클래식")) {
						newGames.setGameId("0" + "2017" + "1" + schedule.get(i).get("GAME_NUM").toString());
					} else if(newGames.getLeague().equals("챌린지")) {
						newGames.setGameId("0" + "2017" + "2" + schedule.get(i).get("GAME_NUM").toString());
					}
				} else if(j == 1) {
					if(newGames.getLeague().equals("클래식")) {
						newGames.setGameId("1" + "2017" + "1" + schedule.get(i).get("GAME_NUM").toString());
					} else if(newGames.getLeague().equals("챌린지")) {
						newGames.setGameId("1" + "2017" + "2" + schedule.get(i).get("GAME_NUM").toString());
					}
				}
				newGames.setGoalsFor3(Integer.parseInt(homeRecent3.get(0).get("GOALS_FOR_3").toString()));
				newGames.setAgainstGoalsFor3(Integer.parseInt(awayRecent3.get(0).get("GOALS_FOR_3").toString()));
				newGames.setGoalsAgainst3(Integer.parseInt(homeRecent3.get(0).get("GOALS_AGAINST_3").toString()));
				newGames.setAgainstGoalsAgainst3(Integer.parseInt(awayRecent3.get(0).get("GOALS_AGAINST_3").toString()));
				newGames.setGoalDifference3(Integer.parseInt(homeRecent3.get(0).get("GOAL_DIFFERENCE_3").toString()));
				newGames.setAgainstGoalDifference3(Integer.parseInt(awayRecent3.get(0).get("GOAL_DIFFERENCE_3").toString()));
				newGames.setTargetShot3(Integer.parseInt(homeRecent3.get(0).get("TARGET_SHOT_3").toString()));
				newGames.setAgainstTargetShot3(Integer.parseInt(awayRecent3.get(0).get("TARGET_SHOT_3").toString()));
				newGames.setTeamAbility3(Integer.parseInt(homeRecent3.get(0).get("TEAM_ABILITY_3").toString()));
				newGames.setAgainstTeamAbility3(Integer.parseInt(awayRecent3.get(0).get("TEAM_ABILITY_3").toString()));

				newGames.setAvgTargetShot(Double.parseDouble(homeAvgCum.get(0).get("AVG_TARGET_SHOT").toString()));
				newGames.setAgainstAvgTargetShot(Double.parseDouble(awayAvgCum.get(0).get("AVG_TARGET_SHOT").toString()));
				newGames.setAvgTeamAbility(Double.parseDouble(homeAvgCum.get(0).get("AVG_TEAM_ABILITY").toString()));
				newGames.setAvgAgainstTeamAbility(Double.parseDouble(awayAvgCum.get(0).get("AVG_TEAM_ABILITY").toString()));
				newGames.setCumGoalsFor(Integer.parseInt(homeAvgCum.get(0).get("CUM_GOALS_FOR").toString()));
				newGames.setAgainstCumGoalsFor(Integer.parseInt(awayAvgCum.get(0).get("CUM_GOALS_FOR").toString()));
				newGames.setCumGoalsAgainst(Integer.parseInt(homeAvgCum.get(0).get("CUM_GOALS_AGAINST").toString()));
				newGames.setAgainstCumGoalsAgainst(Integer.parseInt(awayAvgCum.get(0).get("CUM_GOALS_AGAINST").toString()));
				newGames.setCumGoalDifference(Integer.parseInt(homeAvgCum.get(0).get("CUM_GOAL_DIFFERENCE").toString()));
				newGames.setAgainstCumGoalDifference(Integer.parseInt(awayAvgCum.get(0).get("CUM_GOAL_DIFFERENCE").toString()));
				newGames.setCumPoints(Integer.parseInt(homeAvgCum.get(0).get("CUM_POINTS").toString()));
				newGames.setAgainstCumPoints(Integer.parseInt(awayAvgCum.get(0).get("CUM_POINTS").toString()));
				newGames.setWin(Integer.parseInt(homeAvgCum.get(0).get("WIN").toString()));
				newGames.setAgainstWin(Integer.parseInt(awayAvgCum.get(0).get("WIN").toString()));
				newGames.setDraw(Integer.parseInt(homeAvgCum.get(0).get("DRAW").toString()));
				newGames.setAgainstDraw(Integer.parseInt(awayAvgCum.get(0).get("DRAW").toString()));
				newGames.setLose(Integer.parseInt(homeAvgCum.get(0).get("LOSE").toString()));
				newGames.setAgainstLose(Integer.parseInt(awayAvgCum.get(0).get("LOSE").toString()));
				newGames.setCumPointsDifference(newGames.getCumPoints() - newGames.getAgainstCumPoints());
				newGames.setWinRate((double)newGames.getWin() / ((double)newGames.getWin() + (double)newGames.getDraw() + (double)newGames.getLose()));
				newGames.setAgainstWinRate((double)newGames.getAgainstWin() / ((double)newGames.getAgainstWin() + (double)newGames.getAgainstDraw() + (double)newGames.getAgainstLose()));
				newGames.setDrawRate((double)newGames.getDraw() / ((double)newGames.getWin() + (double)newGames.getDraw() + (double)newGames.getLose()));
				newGames.setAgainstDrawRate((double)newGames.getAgainstDraw() / ((double)newGames.getAgainstWin() + (double)newGames.getAgainstDraw() + (double)newGames.getAgainstLose()));
				newGames.setLoseRate((double)newGames.getLose() / ((double)newGames.getWin() + (double)newGames.getDraw() + (double)newGames.getLose()));
				newGames.setAgainstLoseRate((double)newGames.getAgainstLose() / ((double)newGames.getAgainstWin() + (double)newGames.getAgainstDraw() + (double)newGames.getAgainstLose()));
				newGames.setAbilityDifference3(newGames.getTeamAbility3() - newGames.getAgainstTeamAbility3());
				newGames.setAvgAbilityDifference(newGames.getAvgTeamAbility() - newGames.getAvgAgainstTeamAbility());

				newGames.setRecentResultWin(gameService.getRecentResultWin(newGames.getSeason(), newGames.getLeague(), newGames.getTeam()));
				newGames.setAgainstRecentResultWin(gameService.getRecentResultWin(newGames.getSeason(), newGames.getLeague(), newGames.getAgainstTeam()));
				newGames.setRecentResultDraw(gameService.getRecentResultDraw(newGames.getSeason(), newGames.getLeague(), newGames.getTeam()));
				newGames.setAgainstRecentResultDraw(gameService.getRecentResultDraw(newGames.getSeason(), newGames.getLeague(), newGames.getAgainstTeam()));
				newGames.setRecentResultLose(gameService.getRecentResultLose(newGames.getSeason(), newGames.getLeague(), newGames.getTeam()));
				newGames.setAgainstRecentResultLose(gameService.getRecentResultLose(newGames.getSeason(), newGames.getLeague(), newGames.getAgainstTeam()));

				newGames.setPrevRank(gameService.getRank(newGames.getSeason(), newGames.getLeague(), newGames.getTeam()));
				newGames.setAgainstPrevRank(gameService.getRank(newGames.getSeason(), newGames.getLeague(), newGames.getAgainstTeam()));

				newGames.setPrevResult(gameService.getPrevResult(newGames.getTeam()));
				newGames.setAgainstPrevResult(gameService.getPrevResult(newGames.getAgainstTeam()));

				newGames.setWinMarkov(Double.parseDouble(homeMarkov.get(0).get("WIN_MARKOV").toString()));
				newGames.setAgainstWinMarkov(Double.parseDouble(awayMarkov.get(0).get("WIN_MARKOV").toString()));
				newGames.setDrawMarkov(Double.parseDouble(homeMarkov.get(0).get("DRAW_MARKOV").toString()));
				newGames.setAgainstDrawMarkov(Double.parseDouble(awayMarkov.get(0).get("DRAW_MARKOV").toString()));
				newGames.setLoseMarkov(Double.parseDouble(homeMarkov.get(0).get("LOSE_MARKOV").toString()));
				newGames.setAgainstLoseMarkov(Double.parseDouble(awayMarkov.get(0).get("LOSE_MARKOV").toString()));

				try {
					gameService.addNewGame(newGames);
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
		context.close();
		System.out.println("입력완료");
	}
}