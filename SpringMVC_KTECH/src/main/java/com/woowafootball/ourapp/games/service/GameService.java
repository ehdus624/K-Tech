package com.woowafootball.ourapp.games.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.woowafootball.ourapp.games.dao.IGameRepository;
import com.woowafootball.ourapp.games.model.GamesVO;
import com.woowafootball.ourapp.games.model.NewGamesVO;

@Service
public class GameService implements IGameService {

	@Autowired
	IGameRepository gameRepository;

	@Override
	public void insertGame(GamesVO game) {
		gameRepository.insertGame(game);
	}

	@Override
	public int getCA(String name, String team) {
		try {
			return gameRepository.getCA(name, team);
		} catch(EmptyResultDataAccessException e) {
			return 0;
		}
	}

	@Override
	public int getCumGoalsFor(int season, String league, String team) {
		try {
			return gameRepository.getCumGoalsFor(season, league, team);
		} catch(NullPointerException e) {
			return 0;
		}
	}

	@Override
	public int getCumGoalsAgainst(int season, String league, String team) {
		try {
			return gameRepository.getCumGoalsAgainst(season, league, team);
		} catch(NullPointerException e) {
			return 0;
		}
	}

	@Override
	public int getCumGoalDiff(int season, String league, String team) {
		try {
			return gameRepository.getCumGoalDiff(season, league, team);
		} catch(NullPointerException e) {
			return 0;
		}
	}

	@Override
	public int getWin(int season, String league, String team) {
		return gameRepository.getWin(season, league, team);
	}

	@Override
	public int getDraw(int season, String league, String team) {
		return gameRepository.getDraw(season, league, team);
	}

	@Override
	public int getLose(int season, String league, String team) {
		return gameRepository.getLose(season, league, team);
	}

	@Override
	public int getCumPoints(int season, String league, String team) {
		try {
			return gameRepository.getCumPoints(season, league, team);
		} catch(NullPointerException e) {
			return 0;
		}
	}

	@Override
	public int getRank(int season, String league, String team) {
		try {
			return gameRepository.getRank(season, league, team);
		} catch(EmptyResultDataAccessException e) {
			return 1;
		}
	}

	@Override
	public int getRecentResultWin(int season, String league, String team) {
		return gameRepository.getRecentResultWin(season, league, team);
	}

	@Override
	public int getRecentResultDraw(int season, String league, String team) {
		return gameRepository.getRecentResultDraw(season, league, team);
	}

	@Override
	public int getRecentResultLose(int season, String league, String team) {
		return gameRepository.getRecentResultLose(season, league, team);
	}

	@Override
	public int getPrevResult(int season, String league, String team) {
		try {
			return gameRepository.getPrevResult(season, league, team);
		} catch(EmptyResultDataAccessException e) {
			return 1;
		}

	}

	@Override
	public List<Map<String, Object>> getGameId() {
		return gameRepository.getGameId();
	}

	@Override
	public int getNo(int season, String league, String team, String gameId) {
		return gameRepository.getNo(season, league, team, gameId);
	}
	
	@Override
	public int getAgainstNo(int season, String league, String againstTeam, String gameId) {
		return gameRepository.getAgainstNo(season, league, againstTeam, gameId);
	}

	@Override
	public void updateGoalsFor3(int season, String league, String team, int no, String gameId) {
		gameRepository.updateGoalsFor3(season, league, team, no, gameId);
	}

	@Override
	public void updateAgainstGoalsFor3(int season, String league, String againstTeam, int no, String gameId) {
		gameRepository.updateAgainstGoalsFor3(season, league, againstTeam, no, gameId);
	}

	@Override
	public void updateGoalsAgainst3(int season, String league, String team, int no, String gameId) {
		gameRepository.updateGoalsAgainst3(season, league, team, no, gameId);
	}

	@Override
	public void updateAgainstGoalsAgainst3(int season, String league, String againstTeam, int no, String gameId) {
		gameRepository.updateAgainstGoalsAgainst3(season, league, againstTeam, no, gameId);
	}

	@Override
	public void updateGoalDifference3(int season, String league, String team, int no, String gameId) {
		gameRepository.updateGoalDifference3(season, league, team, no, gameId);
	}

	@Override
	public void updateAgainstGoalDifference3(int season, String league, String againstTeam, int no, String gameId) {
		gameRepository.updateAgainstGoalDifference3(season, league, againstTeam, no, gameId);
	}

	@Override
	public void updateTargetShot3(int season, String league, String team, int no, String gameId) {
		gameRepository.updateTargetShot3(season, league, team, no, gameId);
	}

	@Override
	public void updateAgainstTargetShot3(int season, String league, String againstTeam, int no, String gameId) {
		gameRepository.updateAgainstTargetShot3(season, league, againstTeam, no, gameId);
	}
	
	@Override
	public void updateTeamAbility3(int season, String league, String team, int no, String gameId) {
		gameRepository.updateTeamAbility3(season, league, team, no, gameId);
	}

	@Override
	public void updateAgainstTeamAbility3(int season, String league, String againstTeam, int no, String gameId) {
		gameRepository.updateAgainstTeamAbility3(season, league, againstTeam, no, gameId);
	}

	@Override
	public void updateAvgTargetShot(int season, String league, String team, int no, String gameId) {
		gameRepository.updateAvgTargetShot(season, league, team, no, gameId);
	}

	@Override
	public void updateAgainstAvgTargetShot(int season, String league, String againstTeam, int no, String gameId) {
		gameRepository.updateAgainstAvgTargetShot(season, league, againstTeam, no, gameId);
	}

	@Override
	public void updateAvgTeamAbility(int season, String league, String team, int no, String gameId) {
		gameRepository.updateAvgTeamAbility(season, league, team, no, gameId);
	}

	@Override
	public void updateAvgAgainstTeamAbility(int season, String league, String againstTeam, int no, String gameId) {
		gameRepository.updateAvgAgainstTeamAbility(season, league, againstTeam, no, gameId);
	}

	@Override
	public void updateWDLRate() {
		gameRepository.updateWDLRate();
	}

	@Override
	public void updateMarkov() {
		gameRepository.updateMarkov();
	}

	@Override
	public void updateAbilityDifference() {
		gameRepository.updateAbilityDifference();
	}

	@Override
	public void updatePrevResult(int season, String league, String team, int no, String gameId) {
		gameRepository.updatePrevResult(season, league, team, no, gameId);
	}

	@Override
	public void updateAgainstPrevResult(int season, String league, String AgainstTeam, int no, String gameId) {
		gameRepository.updateAgainstPrevResult(season, league, AgainstTeam, no, gameId);
	}

	@Override
	public void updateMissingValue() {
		gameRepository.updateMissingValue();
	}

	@Override
	public void addNewGame(NewGamesVO newGames) {
		gameRepository.addNewGame(newGames);
	}

	@Override
	public List<Map<String, Object>> getRecent3(String team) {
		return gameRepository.getRecent3(team);
	}

	@Override
	public List<Map<String, Object>> getAvgCumData(String team) {
		return gameRepository.getAvgCumData(team);
	}

	@Override
	public int getPrevResult(String team) {
		return gameRepository.getPrevResult(team);
	}

	@Override
	public List<Map<String, Object>> getMarkov(String team) {
		return gameRepository.getMarkov(team);
	}

	@Override
	public List<Map<String, Object>> getSchedule() {
		return gameRepository.getSchedule();
	}
}