package com.woowafootball.ourapp.games.service;

import java.util.List;
import java.util.Map;

import com.woowafootball.ourapp.games.model.GamesVO;
import com.woowafootball.ourapp.games.model.NewGamesVO;

public interface IGameService {
	void insertGame(GamesVO game);
	int getCA(String name, String team);
	int getCumGoalsFor(int season, String league, String team);
	int getCumGoalsAgainst(int season, String league, String team);
	int getCumGoalDiff(int season, String league, String team);
	int getWin(int season, String league, String team);
	int getDraw(int season, String league, String team);
	int getLose(int season, String league, String team);
	int getCumPoints(int season, String league, String team);
	int getRank(int season, String league, String team);
	int getRecentResultWin(int season, String league, String team);
	int getRecentResultDraw(int season, String league, String team);
	int getRecentResultLose(int season, String league, String team);
	public int getPrevResult(int season, String league, String team);
	
	List<Map<String, Object>> getGameId();
	int getNo(int season, String league, String team, String gameId);
	int getAgainstNo(int season, String league, String againstTeam, String gameId);
	void updateGoalsFor3(int season, String league, String team, int no, String gameId);
	void updateAgainstGoalsFor3(int season, String league, String againstTeam, int no, String gameId);
	void updateGoalsAgainst3(int season, String league, String team, int no, String gameId);
	void updateAgainstGoalsAgainst3(int season, String league, String againstTeam, int no, String gameId);
	void updateGoalDifference3(int season, String league, String team, int no, String gameId);
	void updateAgainstGoalDifference3(int season, String league, String againstTeam, int no, String gameId);
	void updateTargetShot3(int season, String league, String team, int no, String gameId);
	void updateAgainstTargetShot3(int season, String league, String againstTeam, int no, String gameId);
	void updateTeamAbility3(int season, String league, String team, int no, String gameId);
	void updateAgainstTeamAbility3(int season, String league, String againstTeam, int no, String gameId);
	void updateAvgTargetShot(int season, String league, String team, int no, String gameId);
	void updateAgainstAvgTargetShot(int season, String league, String againstTeam, int no, String gameId);
	void updateAvgTeamAbility(int season, String league, String team, int no, String gameId);
	void updateAvgAgainstTeamAbility(int season, String league, String againstTeam, int no, String gameId);
	void updateWDLRate();
	void updateMarkov();
	void updateAbilityDifference();
	void updatePrevResult(int season, String league, String team, int no, String gameId);
	void updateAgainstPrevResult(int season, String league, String AgainstTeam, int no, String gameId);
	void updateMissingValue();
	
	void addNewGame(NewGamesVO newGames);
	List<Map<String, Object>> getRecent3(String team);
	List<Map<String, Object>> getAvgCumData(String team);
	int getPrevResult(String team);
	List<Map<String, Object>> getMarkov(String team);
	List<Map<String, Object>> getSchedule();
}