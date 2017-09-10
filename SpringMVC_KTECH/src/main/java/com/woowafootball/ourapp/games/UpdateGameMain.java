package com.woowafootball.ourapp.games;

import java.util.List;
import java.util.Map;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.woowafootball.ourapp.games.service.IGameService;

public class UpdateGameMain {
	public static void main(String[] args) {

		AbstractApplicationContext context =
				new ClassPathXmlApplicationContext("spring/application-config.xml");
		IGameService gameService = context.getBean("gameService", IGameService.class);
		
		List<Map<String, Object>> idInfo = gameService.getGameId();
		
//		for(int i = 0; i < idInfo.size(); i++){
//			System.out.println(idInfo.get(i));	
//		}
		System.out.print("0%");
		for(int i = 0; i < idInfo.size(); i++) {
			gameService.updateGoalsFor3(Integer.parseInt(idInfo.get(i).get("SEASON").toString()),
					idInfo.get(i).get("LEAGUE").toString(),
					idInfo.get(i).get("TEAM").toString(),
					gameService.getNo(Integer.parseInt(idInfo.get(i).get("SEASON").toString()),
							idInfo.get(i).get("LEAGUE").toString(),
							idInfo.get(i).get("TEAM").toString(),
							idInfo.get(i).get("GAME_ID").toString()),
					idInfo.get(i).get("GAME_ID").toString());
			
			gameService.updateAgainstGoalsFor3(Integer.parseInt(idInfo.get(i).get("SEASON").toString()),
					idInfo.get(i).get("LEAGUE").toString(),
					idInfo.get(i).get("AGAINST_TEAM").toString(),
					gameService.getAgainstNo(Integer.parseInt(idInfo.get(i).get("SEASON").toString()),
							idInfo.get(i).get("LEAGUE").toString(),
							idInfo.get(i).get("AGAINST_TEAM").toString(),
							idInfo.get(i).get("GAME_ID").toString()),
					idInfo.get(i).get("GAME_ID").toString());
			
			gameService.updateGoalsAgainst3(Integer.parseInt(idInfo.get(i).get("SEASON").toString()),
					idInfo.get(i).get("LEAGUE").toString(),
					idInfo.get(i).get("TEAM").toString(),
					gameService.getNo(Integer.parseInt(idInfo.get(i).get("SEASON").toString()),
							idInfo.get(i).get("LEAGUE").toString(),
							idInfo.get(i).get("TEAM").toString(),
							idInfo.get(i).get("GAME_ID").toString()),
					idInfo.get(i).get("GAME_ID").toString());
			
			gameService.updateAgainstGoalsAgainst3(Integer.parseInt(idInfo.get(i).get("SEASON").toString()),
					idInfo.get(i).get("LEAGUE").toString(),
					idInfo.get(i).get("AGAINST_TEAM").toString(),
					gameService.getAgainstNo(Integer.parseInt(idInfo.get(i).get("SEASON").toString()),
							idInfo.get(i).get("LEAGUE").toString(),
							idInfo.get(i).get("AGAINST_TEAM").toString(),
							idInfo.get(i).get("GAME_ID").toString()),
					idInfo.get(i).get("GAME_ID").toString());
			
			gameService.updateGoalDifference3(Integer.parseInt(idInfo.get(i).get("SEASON").toString()),
					idInfo.get(i).get("LEAGUE").toString(),
					idInfo.get(i).get("TEAM").toString(),
					gameService.getNo(Integer.parseInt(idInfo.get(i).get("SEASON").toString()),
							idInfo.get(i).get("LEAGUE").toString(),
							idInfo.get(i).get("TEAM").toString(),
							idInfo.get(i).get("GAME_ID").toString()),
					idInfo.get(i).get("GAME_ID").toString());
			
			gameService.updateAgainstGoalDifference3(Integer.parseInt(idInfo.get(i).get("SEASON").toString()),
					idInfo.get(i).get("LEAGUE").toString(),
					idInfo.get(i).get("AGAINST_TEAM").toString(),
					gameService.getAgainstNo(Integer.parseInt(idInfo.get(i).get("SEASON").toString()),
							idInfo.get(i).get("LEAGUE").toString(),
							idInfo.get(i).get("AGAINST_TEAM").toString(),
							idInfo.get(i).get("GAME_ID").toString()),
					idInfo.get(i).get("GAME_ID").toString());
			
			gameService.updateTargetShot3(Integer.parseInt(idInfo.get(i).get("SEASON").toString()),
					idInfo.get(i).get("LEAGUE").toString(),
					idInfo.get(i).get("TEAM").toString(),
					gameService.getNo(Integer.parseInt(idInfo.get(i).get("SEASON").toString()),
							idInfo.get(i).get("LEAGUE").toString(),
							idInfo.get(i).get("TEAM").toString(),
							idInfo.get(i).get("GAME_ID").toString()),
					idInfo.get(i).get("GAME_ID").toString());
			
			gameService.updateAgainstTargetShot3(Integer.parseInt(idInfo.get(i).get("SEASON").toString()),
					idInfo.get(i).get("LEAGUE").toString(),
					idInfo.get(i).get("AGAINST_TEAM").toString(),
					gameService.getAgainstNo(Integer.parseInt(idInfo.get(i).get("SEASON").toString()),
							idInfo.get(i).get("LEAGUE").toString(),
							idInfo.get(i).get("AGAINST_TEAM").toString(),
							idInfo.get(i).get("GAME_ID").toString()),
					idInfo.get(i).get("GAME_ID").toString());
			
			gameService.updateAvgTargetShot(Integer.parseInt(idInfo.get(i).get("SEASON").toString()),
					idInfo.get(i).get("LEAGUE").toString(),
					idInfo.get(i).get("TEAM").toString(),
					gameService.getNo(Integer.parseInt(idInfo.get(i).get("SEASON").toString()),
							idInfo.get(i).get("LEAGUE").toString(),
							idInfo.get(i).get("TEAM").toString(),
							idInfo.get(i).get("GAME_ID").toString()),
					idInfo.get(i).get("GAME_ID").toString());
			
			gameService.updateAgainstAvgTargetShot(Integer.parseInt(idInfo.get(i).get("SEASON").toString()),
					idInfo.get(i).get("LEAGUE").toString(),
					idInfo.get(i).get("AGAINST_TEAM").toString(),
					gameService.getAgainstNo(Integer.parseInt(idInfo.get(i).get("SEASON").toString()),
							idInfo.get(i).get("LEAGUE").toString(),
							idInfo.get(i).get("AGAINST_TEAM").toString(),
							idInfo.get(i).get("GAME_ID").toString()),
					idInfo.get(i).get("GAME_ID").toString());
			
			gameService.updateTeamAbility3(Integer.parseInt(idInfo.get(i).get("SEASON").toString()),
					idInfo.get(i).get("LEAGUE").toString(),
					idInfo.get(i).get("TEAM").toString(),
					gameService.getNo(Integer.parseInt(idInfo.get(i).get("SEASON").toString()),
							idInfo.get(i).get("LEAGUE").toString(),
							idInfo.get(i).get("TEAM").toString(),
							idInfo.get(i).get("GAME_ID").toString()),
					idInfo.get(i).get("GAME_ID").toString());
			
			gameService.updateAgainstTeamAbility3(Integer.parseInt(idInfo.get(i).get("SEASON").toString()),
					idInfo.get(i).get("LEAGUE").toString(),
					idInfo.get(i).get("AGAINST_TEAM").toString(),
					gameService.getAgainstNo(Integer.parseInt(idInfo.get(i).get("SEASON").toString()),
							idInfo.get(i).get("LEAGUE").toString(),
							idInfo.get(i).get("AGAINST_TEAM").toString(),
							idInfo.get(i).get("GAME_ID").toString()),
					idInfo.get(i).get("GAME_ID").toString());
			
			gameService.updateAvgTeamAbility(Integer.parseInt(idInfo.get(i).get("SEASON").toString()),
					idInfo.get(i).get("LEAGUE").toString(),
					idInfo.get(i).get("TEAM").toString(),
					gameService.getNo(Integer.parseInt(idInfo.get(i).get("SEASON").toString()),
							idInfo.get(i).get("LEAGUE").toString(),
							idInfo.get(i).get("TEAM").toString(),
							idInfo.get(i).get("GAME_ID").toString()),
					idInfo.get(i).get("GAME_ID").toString());
			
			gameService.updateAvgAgainstTeamAbility(Integer.parseInt(idInfo.get(i).get("SEASON").toString()),
					idInfo.get(i).get("LEAGUE").toString(),
					idInfo.get(i).get("AGAINST_TEAM").toString(),
					gameService.getAgainstNo(Integer.parseInt(idInfo.get(i).get("SEASON").toString()),
							idInfo.get(i).get("LEAGUE").toString(),
							idInfo.get(i).get("AGAINST_TEAM").toString(),
							idInfo.get(i).get("GAME_ID").toString()),
					idInfo.get(i).get("GAME_ID").toString());
			
			gameService.updatePrevResult(Integer.parseInt(idInfo.get(i).get("SEASON").toString()),
					idInfo.get(i).get("LEAGUE").toString(),
					idInfo.get(i).get("TEAM").toString(),
					gameService.getNo(Integer.parseInt(idInfo.get(i).get("SEASON").toString()),
							idInfo.get(i).get("LEAGUE").toString(),
							idInfo.get(i).get("TEAM").toString(),
							idInfo.get(i).get("GAME_ID").toString()),
					idInfo.get(i).get("GAME_ID").toString());
			
			gameService.updateAgainstPrevResult(Integer.parseInt(idInfo.get(i).get("SEASON").toString()),
					idInfo.get(i).get("LEAGUE").toString(),
					idInfo.get(i).get("AGAINST_TEAM").toString(),
					gameService.getAgainstNo(Integer.parseInt(idInfo.get(i).get("SEASON").toString()),
							idInfo.get(i).get("LEAGUE").toString(),
							idInfo.get(i).get("AGAINST_TEAM").toString(),
							idInfo.get(i).get("GAME_ID").toString()),
					idInfo.get(i).get("GAME_ID").toString());
			
			if(i == idInfo.size() / 2) {
				System.out.print("50%");
			} else if(i == idInfo.size() / 4) {
				System.out.print("25%");
			} else if(i == idInfo.size() * 3 / 4 ) {
				System.out.print("75%");
			} else if(i % 20 == 0) {
				System.out.print("-");
			}
		}
		gameService.updateWDLRate();
		gameService.updateMarkov();
		gameService.updateAbilityDifference();
		gameService.updateMissingValue();
		System.out.println(">100%");
		System.out.println("업데이트 완료");
	}
}