package com.ktech.ourapp.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.ktech.ourapp.model.GamesVO;

@Repository
public class KtechRepository implements IKtechRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	
	private class KtechMapper implements RowMapper<GamesVO> {
		@Override
		public GamesVO mapRow(ResultSet rs, int count) throws SQLException {
			GamesVO games = new GamesVO();
			games.setGameDate(rs.getString("game_date"));
			games.setTeam(rs.getString("team"));
			games.setAgainstTeam(rs.getString("against_team"));
			games.setGoalsFor(rs.getInt("goals_for"));
			games.setGoalsAgainst(rs.getInt("goals_against"));
			games.setCumGoalsFor(rs.getInt("cum_goals_for"));
			games.setCumGoalsAgainst(rs.getInt("cum_goals_against"));
			return games;
		}         
	}
	
	private class KtechMapper2 implements RowMapper<GamesVO> {
		@Override
		public GamesVO mapRow(ResultSet rs, int count) throws SQLException {
			GamesVO games = new GamesVO();
			games.setGameId(rs.getString("game_id"));
			games.setGameDate(rs.getString("game_date"));
			games.setTeam(rs.getString("team"));
			games.setAgainstTeam(rs.getString("against_team"));
			games.setGoalsFor(rs.getInt("goals_for"));
			games.setGoalsAgainst(rs.getInt("goals_against"));
			games.setWin(rs.getInt("win"));
			games.setDraw(rs.getInt("draw"));
			games.setLose(rs.getInt("lose"));
			games.setAgainstWin(rs.getInt("against_win"));
			games.setAgainstDraw(rs.getInt("against_draw"));
			games.setAgainstLose(rs.getInt("against_lose"));
			games.setTeamAbility(rs.getInt("team_ability"));
			games.setAgainstTeamAbility(rs.getInt("against_team_ability"));
			games.setPlayer1(rs.getString("player_1"));
			games.setPlayer2(rs.getString("player_2"));
			games.setPlayer3(rs.getString("player_3"));
			games.setPlayer4(rs.getString("player_4"));
			games.setPlayer5(rs.getString("player_5"));
			games.setPlayer6(rs.getString("player_6"));
			games.setPlayer7(rs.getString("player_7"));
			games.setPlayer8(rs.getString("player_8"));
			games.setPlayer9(rs.getString("player_9"));
			games.setPlayer10(rs.getString("player_10"));
			games.setPlayer11(rs.getString("player_11"));
			games.setAgainstPlayer1(rs.getString("against_player_1"));
			games.setAgainstPlayer2(rs.getString("against_player_2"));
			games.setAgainstPlayer3(rs.getString("against_player_3"));
			games.setAgainstPlayer4(rs.getString("against_player_4"));
			games.setAgainstPlayer5(rs.getString("against_player_5"));
			games.setAgainstPlayer6(rs.getString("against_player_6"));
			games.setAgainstPlayer7(rs.getString("against_player_7"));
			games.setAgainstPlayer8(rs.getString("against_player_8"));
			games.setAgainstPlayer9(rs.getString("against_player_9"));
			games.setAgainstPlayer10(rs.getString("against_player_10"));
			games.setAgainstPlayer11(rs.getString("against_player_11"));
			return games;
		}         
	}

	@Override
	public List<GamesVO> getScheduleInfo() {
		String sql = "select game_id, game_date, team, against_team, cum_goals_for, "
				+ "cum_goals_against, goals_for, goals_against from game_records";
		return jdbcTemplate.query(sql, new RowMapper<GamesVO>() {
			@Override
			public GamesVO mapRow(ResultSet rs, int count) throws SQLException {
				GamesVO games = new GamesVO();
				games.setGameId(rs.getString("game_id"));
				games.setGameDate(rs.getString("game_date"));
				games.setTeam(rs.getString("team"));
				games.setAgainstTeam(rs.getString("against_team"));
				games.setGoalsFor(rs.getInt("goals_for"));
				games.setGoalsAgainst(rs.getInt("goals_against"));
				games.setCumGoalsFor(rs.getInt("cum_goals_for"));
				games.setCumGoalsAgainst(rs.getInt("cum_goals_against"));
				return games;   
			}
		});

	}

	@Override
	public GamesVO getTeamInfo(String gameId) {
		String sql = "select game_date, team, against_team, cum_goals_for, cum_goals_against, "
				+ "goals_for, goals_against"
				+ " from game_records where game_id = ?";
		return jdbcTemplate.queryForObject(sql, new KtechMapper(), gameId);
	}

	@Override
	public List<GamesVO> getGamedateList(String league) {
		if(league.equals("classic")) {
			league = "클래식";
		} else if(league.equals("challenge")) {
			league = "챌린지";
		}
		String sql = "select game_id, game_date, team, against_team,"
				+ "goals_for, goals_against from game_records where league = ? and is_home = 0 order by game_date desc";
		return jdbcTemplate.query(sql, new RowMapper<GamesVO>(){
			@Override
			public GamesVO mapRow(ResultSet rs, int count) throws SQLException {
				GamesVO ktech = new GamesVO();
				ktech.setGameId(rs.getString("game_id"));
				ktech.setGameDate(rs.getString("game_date"));
				ktech.setTeam(rs.getString("team"));
				ktech.setAgainstTeam(rs.getString("against_team"));
				ktech.setGoalsFor(rs.getInt("goals_for"));
				ktech.setGoalsAgainst(rs.getInt("goals_against"));

				return ktech;
			}   
		}, league);
	}

	@Override
	public GamesVO getGamedateInfo(String gameId) {
		String sql = "select game_id, game_date, team, against_team, "
				+ "goals_for, goals_against, "
				+ "win, draw, lose, "
				+ "against_win, against_draw, against_lose, "
				+ "team_ability, against_team_ability, "
				+ "player_1, player_2, player_3, player_4, player_5, "
				+ "player_6, player_7, player_8, player_9, player_10, player_11, "
				+ "against_player_1, against_player_2, against_player_3, against_player_4, against_player_5, "
				+ "against_player_6, against_player_7, against_player_8, against_player_9, against_player_10, against_player_11 "
				+  "from game_records where game_id=?";
		return jdbcTemplate.queryForObject(sql, new KtechMapper2(), gameId);
	}

	@Override
	public List<GamesVO> getScheduleList(String league) {
		if(league.equals("classic")) {
			league = "클래식";
		} else if(league.equals("challenge")) {
			league = "챌린지";
		}
		String sql = "select * from predict_game where league = ? and is_home=0 order by game_date";
		return jdbcTemplate.query(sql, new RowMapper<GamesVO>(){
			@Override
			public GamesVO mapRow(ResultSet rs, int count) throws SQLException {
				GamesVO ktech1 = new GamesVO();
				ktech1.setGameId(rs.getString("game_id"));
				ktech1.setGameDate(rs.getString("game_date"));
				ktech1.setLeague(rs.getString("league"));
				ktech1.setTeam(rs.getString("team"));
				ktech1.setAgainstTeam(rs.getString("against_team"));

				return ktech1;
			}   
		}, league);
	}

	@Override
	public GamesVO getGameInfo(String gameId) {
		String sql = "select * from predict_game where game_id = ?";
		return jdbcTemplate.queryForObject(sql, new RowMapper<GamesVO>() {
			@Override
			public GamesVO mapRow(ResultSet rs, int count) throws SQLException {
				GamesVO ktech = new GamesVO();
				ktech.setGameId(rs.getString("game_id"));
				ktech.setTeam(rs.getString("team"));
				ktech.setAgainstTeam(rs.getString("against_team"));
				return ktech;
			}
		}, gameId);
	}	
	
	@Override
	   public List<GamesVO> getGamedateList() {
	      
	      String sql = "select * from accuracy order by league desc, game_date desc";
	      return jdbcTemplate.query(sql, new RowMapper<GamesVO>(){
	         @Override
	         public GamesVO mapRow(ResultSet rs, int count) throws SQLException {
	            GamesVO ktech = new GamesVO();
	            ktech.setGameId(rs.getString("game_id"));
	            ktech.setGameDate(rs.getString("game_date"));
	            ktech.setTeam(rs.getString("team"));
	            ktech.setAgainstTeam(rs.getString("against_team"));
	            ktech.setGoalsFor(rs.getInt("goals_for"));
	            ktech.setGoalsAgainst(rs.getInt("goals_against"));
	            ktech.setWinProb(rs.getDouble("win_prob"));
	            ktech.setDrawProb(rs.getDouble("draw_prob"));
	            ktech.setLoseProb(rs.getDouble("lose_prob"));
	            return ktech;
	         }   
	      });
	   }
}