package com.woowafootball.ourapp.games.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.woowafootball.ourapp.games.model.GamesVO;
import com.woowafootball.ourapp.games.model.NewGamesVO;

@Repository
public class GameRepository implements IGameRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void insertGame(GamesVO game) {
		String sql = "insert into game_records (game_id, game_date, game_time, season, league, team, "
				+ "against_team, is_home, goals_for, goals_against, goal_difference, cum_goals_for, "
				+ "cum_goals_against, cum_goal_difference, against_cum_goals_for, against_cum_goals_against, "
				+ "against_cum_goal_difference, target_shot, recent_result_win, recent_result_draw, recent_result_lose, "
				+ "against_recent_result_win, against_recent_result_draw, against_recent_result_lose, win, draw, lose, "
				+ "against_win, against_draw, against_lose, team_ability, against_team_ability, prev_rank, against_prev_rank, "
				+ "points, cum_points, against_cum_points, cum_points_difference, player_1, "
				+ "player_2, player_3, player_4, player_5, player_6, player_7, player_8, player_9, player_10, "
				+ "player_11, against_player_1, against_player_2, against_player_3, against_player_4, "
				+ "against_player_5, against_player_6, against_player_7, against_player_8, against_player_9, "
				+ "against_player_10, against_player_11, prev_result, against_prev_result, game_result, against_game_result) "
				+ "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
				+ "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		jdbcTemplate.update(sql,
				game.getGameId(),
				game.getGameDate(),
				game.getGameTime(),
				game.getSeason(),
				game.getLeague(),
				game.getTeam(),
				game.getAgainstTeam(),
				game.getIsHome(),
				game.getGoalsFor(),
				game.getGoalsAgainst(),
				game.getGoalDifference(),
				game.getCumGoalsFor(),
				game.getCumGoalsAgainst(),
				game.getCumGoalDifference(),
				game.getAgainstCumGoalsFor(),
				game.getAgainstCumGoalsAgainst(),
				game.getAgainstCumGoalDifference(),
				game.getTargetShot(),
				game.getRecentResultWin(),
				game.getRecentResultDraw(),
				game.getRecentResultLose(),
				game.getAgainstRecentResultWin(),
				game.getAgainstRecentResultDraw(),
				game.getAgainstRecentResultLose(),
				game.getWin(),
				game.getDraw(),
				game.getLose(),
				game.getAgainstWin(),
				game.getAgainstDraw(),
				game.getAgainstLose(),
				game.getTeamAbility(),
				game.getAgainstTeamAbility(),
				game.getPrevRank(),
				game.getAgainstPrevRank(),
				game.getPoints(),
				game.getCumPoints(),
				game.getAgainstCumPoints(),
				game.getCumPointsDifference(),
				game.getPlayer1(),
				game.getPlayer2(),
				game.getPlayer3(),
				game.getPlayer4(),
				game.getPlayer5(),
				game.getPlayer6(),
				game.getPlayer7(),
				game.getPlayer8(),
				game.getPlayer9(),
				game.getPlayer10(),
				game.getPlayer11(),
				game.getAgainstPlayer1(),
				game.getAgainstPlayer2(),
				game.getAgainstPlayer3(),
				game.getAgainstPlayer4(),
				game.getAgainstPlayer5(),
				game.getAgainstPlayer6(),
				game.getAgainstPlayer7(),
				game.getAgainstPlayer8(),
				game.getAgainstPlayer9(),
				game.getAgainstPlayer10(),
				game.getAgainstPlayer11(),
				game.getPrevResult(),
				game.getAgainstPrevResult(),
				game.getGameResult(),
				game.getAgainstGameResult()
				);
	}

	@Override
	public int getCA(String name, String team) {
		String sql = "select ca from players_ca where name_kor = ? and team = ?";
		return jdbcTemplate.queryForObject(sql, Integer.class, name, team);
	}

	@Override
	public int getCumGoalsFor(int season, String league, String team) {
		String sql = "select sum(goals_for) from game_records where season = ? and league = ? and team = ?";
		return jdbcTemplate.queryForObject(sql, Integer.class, season, league, team);
	}

	@Override
	public int getCumGoalsAgainst(int season, String league, String team) {
		String sql = "select sum(goals_against) from game_records where season = ? and league = ? and team = ?";
		return jdbcTemplate.queryForObject(sql, Integer.class, season, league, team);
	}

	@Override
	public int getCumGoalDiff(int season, String league, String team) {
		String sql = "select sum(goal_difference) from game_records where season = ? and league = ? and team = ?";
		return jdbcTemplate.queryForObject(sql, Integer.class, season, league, team);
	}

	@Override
	public int getWin(int season, String league, String team) {
		String sql = "select count(*) from game_records where season = ? and league = ? and team = ? and game_result = 0";
		return jdbcTemplate.queryForObject(sql, Integer.class, season, league, team);
	}

	@Override
	public int getDraw(int season, String league, String team) {
		String sql = "select count(*) from game_records where season = ? and league = ? and team = ? and game_result = 1";
		return jdbcTemplate.queryForObject(sql, Integer.class, season, league, team);
	}

	@Override
	public int getLose(int season, String league, String team) {
		String sql = "select count(*) from game_records where season = ? and league = ? and team = ? and game_result = 2";
		return jdbcTemplate.queryForObject(sql, Integer.class, season, league, team);
	}

	@Override
	public int getCumPoints(int season, String league, String team) {
		String sql = "select sum(points) from game_records where season = ? and league = ? and team = ?";
		return jdbcTemplate.queryForObject(sql, Integer.class, season, league, team);
	}

	@Override
	public int getRank(int season, String league, String team) {
		String sql = "select rank from(select season, league, team, cum_points, cum_goals_for, "
				+ "rank() over(order by cum_points desc, cum_goals_for desc) as rank "
				+ "from (select season, league, team, max(cum_points) as cum_points, max(cum_goals_for) as cum_goals_for "
				+ "from game_records group by season, league, team having season = ? and league = ?)) where team = ?";
		return jdbcTemplate.queryForObject(sql, Integer.class, season, league, team);
	}

	@Override
	public int getRecentResultWin(int season, String league, String team) {
		String sql = "select count(*) from(select rownum as no, game_date, team, game_result, "
				+ "season, league from(select season, league, game_date, team, game_result from "
				+ "game_records where season = ? and league = ? and team = ? "
				+ "order by game_date)) where game_result = 0 and no > (select max(no) "
				+ "from(select rownum as no, game_date, team, game_result, season, league from(select season, league, game_date, "
				+ "team, game_result from game_records where season = ? and league = ? and team = ? order by game_date))) - 5";
		return jdbcTemplate.queryForObject(sql, Integer.class, season, league, team, season, league, team);
	}

	@Override
	public int getRecentResultDraw(int season, String league, String team) {
		String sql = "select count(*) from(select rownum as no, game_date, team, game_result, "
				+ "season, league from(select season, league, game_date, team, game_result from "
				+ "game_records where season = ? and league = ? and team = ? "
				+ "order by game_date)) where game_result = 1 and no > (select max(no) "
				+ "from(select rownum as no, game_date, team, game_result, season, league from(select season, league, game_date, "
				+ "team, game_result from game_records where season = ? and league = ? and team = ? order by game_date))) - 5";
		return jdbcTemplate.queryForObject(sql, Integer.class, season, league, team, season, league, team);
	}

	@Override
	public int getRecentResultLose(int season, String league, String team) {
		String sql = "select count(*) from(select rownum as no, game_date, team, game_result, "
				+ "season, league from(select season, league, game_date, team, game_result from "
				+ "game_records where season = ? and league = ? and team = ? "
				+ "order by game_date)) where game_result = 2 and no > (select max(no) "
				+ "from(select rownum as no, game_date, team, game_result, season, league from(select season, league, game_date, "
				+ "team, game_result from game_records where season = ? and league = ? and team = ? order by game_date))) - 5";
		return jdbcTemplate.queryForObject(sql, Integer.class, season, league, team, season, league, team);
	}

	@Override
	public int getPrevResult(int season, String league, String team) {
		String sql = "select game_result from (select rownum as no, game_result from (select game_result from game_records "
				+ "where season = ? and league = ? and team = ? order by game_date)) where no = (select count(*) "
				+ "from game_records where season = ? and league = ? and team = ?)";
		return jdbcTemplate.queryForObject(sql, Integer.class, season, league, team, season, league, team);
	}

	@Override
	public List<Map<String, Object>> getGameId() {
		String sql = "select game_id, season, league, team, against_team from game_records order by game_date";
		return jdbcTemplate.queryForList(sql);
	}

	@Override
	public int getNo(int season, String league, String team, String gameId) {
		String sql = "select no from (select rownum as no, game_id from (select game_id, season, league, team, game_date from game_records where "
				+ "season = ? and league = ? and team = ? order by game_date)) where game_id = ?";
		return jdbcTemplate.queryForObject(sql, Integer.class, season, league, team, gameId);
	}

	@Override
	public int getAgainstNo(int season, String league, String againstTeam, String gameId) {
		String sql = "select no from (select rownum as no, game_id from (select game_id, season, league, team, game_date from game_records where "
				+ "season = ? and league = ? and against_team = ? order by game_date)) where game_id = ?";
		return jdbcTemplate.queryForObject(sql, Integer.class, season, league, againstTeam, gameId);
	}

	@Override
	public void updateGoalsFor3(int season, String league, String team, int no, String gameId) {
		String sql = "update game_records set goals_for_3 = (select sum(goals_for) from (select rownum as no, goals_for "
				+ "from (select goals_for, season, league, team, game_date from game_records where "
				+ "season = ? and league = ? and team = ? order by game_date)) where no between ? - 3 and ? - 1) "
				+ "where game_id = ?";
		jdbcTemplate.update(sql, season, league, team, no, no, gameId);
	}
	
	@Override
	public void updateAgainstGoalsFor3(int season, String league, String againstTeam, int no, String gameId) {
		String sql = "update game_records set against_goals_for_3 = (select sum(goals_for) from (select rownum as no, goals_for "
				+ "from (select goals_for, season, league, team, game_date from game_records where "
				+ "season = ? and league = ? and team = ? order by game_date)) where no between ? - 3 and ? - 1) "
				+ "where game_id = ?";
		jdbcTemplate.update(sql, season, league, againstTeam, no, no, gameId);
	}

	@Override
	public void updateGoalsAgainst3(int season, String league, String team, int no, String gameId) {
		String sql = "update game_records set goals_against_3 = (select sum(goals_against) from (select rownum as no, goals_against "
				+ "from (select goals_against, season, league, team, game_date from game_records where "
				+ "season = ? and league = ? and team = ? order by game_date)) where no between ? - 3 and ? - 1) "
				+ "where game_id = ?";
		jdbcTemplate.update(sql, season, league, team, no, no, gameId);
	}

	@Override
	public void updateAgainstGoalsAgainst3(int season, String league, String againstTeam, int no, String gameId) {
		String sql = "update game_records set against_goals_against_3 = (select sum(goals_against) from (select rownum as no, goals_against "
				+ "from (select goals_against, season, league, team, game_date from game_records where "
				+ "season = ? and league = ? and team = ? order by game_date)) where no between ? - 3 and ? - 1) "
				+ "where game_id = ?";
		jdbcTemplate.update(sql, season, league, againstTeam, no, no, gameId);
	}

	@Override
	public void updateGoalDifference3(int season, String league, String team, int no, String gameId) {
		String sql = "update game_records set goal_difference_3 = (select sum(goal_difference) from (select rownum as no, goal_difference "
				+ "from (select goal_difference, season, league, team, game_date from game_records where "
				+ "season = ? and league = ? and team = ? order by game_date)) where no between ? - 3 and ? - 1) "
				+ "where game_id = ?";
		jdbcTemplate.update(sql, season, league, team, no, no, gameId);
	}

	@Override
	public void updateAgainstGoalDifference3(int season, String league, String againstTeam, int no, String gameId) {
		String sql = "update game_records set against_goal_difference_3 = (select sum(goal_difference) from (select rownum as no, goal_difference "
				+ "from (select goal_difference, season, league, team, game_date from game_records where "
				+ "season = ? and league = ? and team = ? order by game_date)) where no between ? - 3 and ? - 1) "
				+ "where game_id = ?";
		jdbcTemplate.update(sql, season, league, againstTeam, no, no, gameId);
	}

	@Override
	public void updateTargetShot3(int season, String league, String team, int no, String gameId) {
		String sql = "update game_records set target_shot_3 = (select sum(target_shot) from (select rownum as no, target_shot "
				+ "from (select target_shot, season, league, team, game_date from game_records where "
				+ "season = ? and league = ? and team = ? order by game_date)) where no between ? - 3 and ? - 1) "
				+ "where game_id = ?";
		jdbcTemplate.update(sql, season, league, team, no, no, gameId);
	}

	@Override
	public void updateAgainstTargetShot3(int season, String league, String againstTeam, int no, String gameId) {
		String sql = "update game_records set against_target_shot_3 = (select sum(target_shot) from (select rownum as no, target_shot "
				+ "from (select target_shot, season, league, team, game_date from game_records where "
				+ "season = ? and league = ? and team = ? order by game_date)) where no between ? - 3 and ? - 1) "
				+ "where game_id = ?";
		jdbcTemplate.update(sql, season, league, againstTeam, no, no, gameId);
	}

	@Override
	public void updateTeamAbility3(int season, String league, String team, int no, String gameId) {
		String sql = "update game_records set team_ability_3 = (select sum(team_ability) from (select rownum as no, team_ability "
				+ "from (select team_ability, season, league, team, game_date from game_records where "
				+ "season = ? and league = ? and team = ? order by game_date)) where no between ? - 3 and ? - 1) "
				+ "where game_id = ?";
		jdbcTemplate.update(sql, season, league, team, no, no, gameId);
	}

	@Override
	public void updateAgainstTeamAbility3(int season, String league, String AgainstTeam, int no, String gameId) {
		String sql = "update game_records set against_team_ability_3 = (select sum(team_ability) from (select rownum as no, team_ability "
				+ "from (select team_ability, season, league, team, game_date from game_records where "
				+ "season = ? and league = ? and team = ? order by game_date)) where no between ? - 3 and ? - 1) "
				+ "where game_id = ?";
		jdbcTemplate.update(sql, season, league, AgainstTeam, no, no, gameId);
	}

	@Override
	public void updateAvgTargetShot(int season, String league, String team, int no, String gameId) {
		String sql = "update game_records set avg_target_shot = (select avg(target_shot) from (select rownum as no, target_shot "
				+ "from (select target_shot, season, league, team, game_date from game_records where "
				+ "season = ? and league = ? and team = ? order by game_date)) where no between 1 and ? - 1) "
				+ "where game_id = ?";
		jdbcTemplate.update(sql, season, league, team, no, gameId);
	}

	@Override
	public void updateAgainstAvgTargetShot(int season, String league, String againstTeam, int no, String gameId) {
		String sql = "update game_records set against_avg_target_shot = (select avg(target_shot) from (select rownum as no, target_shot "
				+ "from (select target_shot, season, league, team, game_date from game_records where "
				+ "season = ? and league = ? and team = ? order by game_date)) where no between 1 and ? - 1) "
				+ "where game_id = ?";
		jdbcTemplate.update(sql, season, league, againstTeam, no, gameId);
	}

	@Override
	public void updateAvgTeamAbility(int season, String league, String team, int no, String gameId) {
		String sql = "update game_records set avg_team_ability = (select avg(team_ability) from (select rownum as no, team_ability "
				+ "from (select team_ability, season, league, team, game_date from game_records where "
				+ "season = ? and league = ? and team = ? order by game_date)) where no between 1 and ? - 1) "
				+ "where game_id = ?";
		jdbcTemplate.update(sql, season, league, team, no, gameId);
	}

	@Override
	public void updateAvgAgainstTeamAbility(int season, String league, String againstTeam, int no, String gameId) {
		String sql = "update game_records set avg_against_team_ability = (select avg(team_ability) from (select rownum as no, team_ability "
				+ "from (select team_ability, season, league, team, game_date from game_records where "
				+ "season = ? and league = ? and team = ? order by game_date)) where no between 1 and ? - 1) "
				+ "where game_id = ?";
		jdbcTemplate.update(sql, season, league, againstTeam, no, gameId);
	}

	@Override
	public void updateWDLRate() {
		String sql = "update game_records set win_rate = (win / case when win + draw + lose = 0 then 1 else win + draw + lose "
				+ "end), draw_rate = (draw / case when win + draw + lose = 0 then 1 else win + draw + lose end), lose_rate = "
				+ "(lose / case when win + draw + lose = 0 then 1 else win + draw + lose end), against_win_rate = (against_win / "
				+ "case when against_win + against_draw + against_lose = 0 then 1 else against_win + against_draw + against_lose "
				+ "end), against_draw_rate = (against_draw / case when against_win + against_draw + against_lose = 0 then 1 "
				+ "else against_win + against_draw + against_lose end), against_lose_rate = (against_lose / case when against_win "
				+ "+ against_draw + against_lose = 0 then 1 else against_win + against_draw + against_lose end)";
		jdbcTemplate.update(sql);
	}

	@Override
	public void updateMarkov() {
		String sql = "update game_records set win_markov = (select win_markov from markov where team = game_records.team), "
				+ "draw_markov = (select draw_markov from markov where team = game_records.team), "
				+ "lose_markov = (select lose_markov from markov where team = game_records.team), "
				+ "against_win_markov = (select win_markov from markov where team = game_records.against_team), "
				+ "against_draw_markov = (select draw_markov from markov where team = game_records.against_team), "
				+ "against_lose_markov = (select lose_markov from markov where team = game_records.against_team)";
		jdbcTemplate.update(sql);
	}

	@Override
	public void updateAbilityDifference() {
		String sql = "update game_records set ability_difference_3 = (team_ability_3 - against_team_ability_3), "
				+ "avg_ability_difference = (avg_team_ability - avg_against_team_ability)";
		jdbcTemplate.update(sql);
	}

	@Override
	public void updatePrevResult(int season, String league, String team, int no, String gameId) {
		String sql = "update game_records set prev_result = (select game_result from (select rownum as no, game_result "
				+ "from (select game_result from game_records where season = ? and league = ? and team = ? order by game_date)) "
				+ "where no = ? - 1) where game_id = ?";
		jdbcTemplate.update(sql, season, league, team, no, gameId);
	}

	@Override
	public void updateAgainstPrevResult(int season, String league, String AgainstTeam, int no, String gameId) {
		String sql = "update game_records set against_prev_result = (select game_result from (select rownum as no, game_result "
				+ "from (select game_result from game_records where season = ? and league = ? and team = ? order by game_date)) "
				+ "where no = ? - 1) where game_id = ?";
		jdbcTemplate.update(sql, season, league, AgainstTeam, no, gameId);
	}

	@Override
	public void updateMissingValue() {
		String sql1 = "update game_records set goals_for_3 = 0 where goals_for_3 is null";
		String sql2 = "update game_records set goals_against_3 = 0 where goals_against_3 is null";
		String sql3 = "update game_records set goal_difference_3 = 0 where goal_difference_3 is null";
		String sql4 = "update game_records set against_goals_for_3 = 0 where against_goals_for_3 is null";
		String sql5 = "update game_records set against_goals_against_3 = 0 where against_goals_against_3 is null";
		String sql6 = "update game_records set against_goal_difference_3 = 0 where against_goal_difference_3 is null";
		String sql7 = "update game_records set target_shot_3 = 0 where target_shot_3 is null";
		String sql8 = "update game_records set avg_target_shot = 0 where avg_target_shot is null";
		String sql9 = "update game_records set against_target_shot_3 = 0 where against_target_shot_3 is null";
		String sql10 = "update game_records set against_avg_target_shot = 0 where against_avg_target_shot is null";
		String sql11 = "update game_records set team_ability_3 = 0 where team_ability_3 is null";
		String sql12 = "update game_records set against_team_ability_3 = 0 where against_team_ability_3 is null";
		String sql13 = "update game_records set ability_difference_3 = 0 where ability_difference_3 is null";
		String sql14 = "update game_records set avg_team_ability = 0 where avg_team_ability is null";
		String sql15 = "update game_records set avg_against_team_ability = 0 where avg_against_team_ability is null";
		String sql16 = "update game_records set avg_ability_difference = 0 where avg_ability_difference is null";
		String sql17 = "update game_records set prev_result = 1 where prev_result is null";
		String sql18 = "update game_records set against_prev_result = 1 where against_prev_result is null";
		jdbcTemplate.update(sql1);
		jdbcTemplate.update(sql2);
		jdbcTemplate.update(sql3);
		jdbcTemplate.update(sql4);
		jdbcTemplate.update(sql5);
		jdbcTemplate.update(sql6);
		jdbcTemplate.update(sql7);
		jdbcTemplate.update(sql8);
		jdbcTemplate.update(sql9);
		jdbcTemplate.update(sql10);
		jdbcTemplate.update(sql11);
		jdbcTemplate.update(sql12);
		jdbcTemplate.update(sql13);
		jdbcTemplate.update(sql14);
		jdbcTemplate.update(sql15);
		jdbcTemplate.update(sql16);
		jdbcTemplate.update(sql17);
		jdbcTemplate.update(sql18);
	}

	@Override
	public void addNewGame(NewGamesVO newGames) {
		String sql = "insert into predict_game (game_id,game_date,game_time,season,league,team,against_team,is_home,"
				+ "goals_for_3,goals_against_3,goal_difference_3,cum_goals_for,cum_goals_against,cum_goal_difference,"
				+ "against_goals_for_3,against_goals_against_3,against_goal_difference_3,against_cum_goals_for,"
				+ "against_cum_goals_against,against_cum_goal_difference,target_shot_3,avg_target_shot,"
				+ "against_target_shot_3,against_avg_target_shot,recent_result_win,recent_result_draw,"
				+ "recent_result_lose,against_recent_result_win,against_recent_result_draw,against_recent_result_lose,"
				+ "win,draw,lose,against_win,against_draw,against_lose,win_rate,draw_rate,lose_rate,against_win_rate,"
				+ "against_draw_rate,against_lose_rate,team_ability_3,against_team_ability_3,ability_difference_3,"
				+ "avg_team_ability,avg_against_team_ability,avg_ability_difference,win_markov,draw_markov,lose_markov,"
				+ "against_win_markov,against_draw_markov,against_lose_markov,prev_rank,against_prev_rank,cum_points,"
				+ "against_cum_points,cum_points_difference,prev_result,against_prev_result,game_result,"
				+ "against_game_result) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
				+ "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
				+ "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		jdbcTemplate.update(sql,
				newGames.getGameId(),
				newGames.getGameDate(),
				newGames.getGameTime(),
				newGames.getSeason(),
				newGames.getLeague(),
				newGames.getTeam(),
				newGames.getAgainstTeam(),
				newGames.getIsHome(),
				newGames.getGoalsFor3(),
				newGames.getGoalsAgainst3(),
				newGames.getGoalDifference3(),
				newGames.getCumGoalsFor(),
				newGames.getCumGoalsAgainst(),
				newGames.getCumGoalDifference(),
				newGames.getAgainstGoalsFor3(),
				newGames.getAgainstGoalsAgainst3(),
				newGames.getAgainstGoalDifference3(),
				newGames.getAgainstCumGoalsFor(),
				newGames.getAgainstCumGoalsAgainst(),
				newGames.getAgainstCumGoalDifference(),
				newGames.getTargetShot3(),
				newGames.getAvgTargetShot(),
				newGames.getAgainstTargetShot3(),
				newGames.getAgainstAvgTargetShot(),
				newGames.getRecentResultWin(),
				newGames.getRecentResultDraw(),
				newGames.getRecentResultLose(),
				newGames.getAgainstRecentResultWin(),
				newGames.getAgainstRecentResultDraw(),
				newGames.getAgainstRecentResultLose(),
				newGames.getWin(),
				newGames.getDraw(),
				newGames.getLose(),
				newGames.getAgainstWin(),
				newGames.getAgainstDraw(),
				newGames.getAgainstLose(),
				newGames.getWinRate(),
				newGames.getDrawRate(),
				newGames.getLoseRate(),
				newGames.getAgainstWinRate(),
				newGames.getAgainstDrawRate(),
				newGames.getAgainstLoseRate(),
				newGames.getTeamAbility3(),
				newGames.getAgainstTeamAbility3(),
				newGames.getAbilityDifference3(),
				newGames.getAvgTeamAbility(),
				newGames.getAvgAgainstTeamAbility(),
				newGames.getAvgAbilityDifference(),
				newGames.getWinMarkov(),
				newGames.getDrawMarkov(),
				newGames.getLoseMarkov(),
				newGames.getAgainstWinMarkov(),
				newGames.getAgainstDrawMarkov(),
				newGames.getAgainstLoseMarkov(),
				newGames.getPrevRank(),
				newGames.getAgainstPrevRank(),
				newGames.getCumPoints(),
				newGames.getAgainstCumPoints(),
				newGames.getCumPointsDifference(),
				newGames.getPrevResult(),
				newGames.getAgainstPrevResult(),
				newGames.getGameResult(),
				newGames.getAgainstGameResult()
				);
	}

	@Override
	public List<Map<String, Object>> getRecent3(String team) {
		String sql = "select sum(goals_for) as goals_for_3, sum(goals_against) as goals_against_3, sum(goal_difference) as goal_difference_3, "
				+ "sum(target_shot) as target_shot_3, sum(team_ability) as team_ability_3 "
				+ "from (select rownum as no, goals_for, goals_against, goal_difference, target_shot, team_ability "
				+ "from (select goals_for, goals_against, goal_difference, target_shot, team_ability from game_records "
				+ "where season = 2017 and team = ? order by game_date)) where no between (select count(*) "
				+ "from game_records where season = 2017 and team = ?) - 2 and (select count(*) from game_records "
				+ "where season = 2017 and team = ?)";
		return jdbcTemplate.queryForList(sql, team, team, team);
	}

	@Override
	public List<Map<String, Object>> getAvgCumData(String team) {
		String sql = "select avg(target_shot) as avg_target_shot, avg(team_ability) as avg_team_ability, "
				+ "sum(goals_for) as cum_goals_for, sum(goals_against) as cum_goals_against, sum(goal_difference) as cum_goal_difference, "
				+ "sum(points) as cum_points, max(win) as win, max(draw) as draw, max(lose) as lose from game_records where season = 2017 "
				+ "and team = ?";
		return jdbcTemplate.queryForList(sql, team);
	}

	@Override
	public int getPrevResult(String team) {
		String sql = "select game_result from (select rownum as no, game_result, win from (select game_result, win from game_records "
				+ "where season = 2017 and team = ? order by game_date)) where no = (select count(*) from game_records "
				+ "where season = 2017 and team = ?)";
		return jdbcTemplate.queryForObject(sql, Integer.class, team, team);
	}

	@Override
	public List<Map<String, Object>> getMarkov(String team) {
		String sql = "select win_markov, draw_markov, lose_markov from markov where team = ?";
		return jdbcTemplate.queryForList(sql, team);
	}

	@Override
	public List<Map<String, Object>> getSchedule() {
		String sql = "select s.league, s.game_num, s.game_date, n.team_name as home, m.team_name as away from game_schedule s "
				+ "join team_naming n on s.home = n.team join team_naming m on s.away = m.team where s.game_date - sysdate "
				+ "between 0 and 20 order by s.league desc, s.game_date, s.game_num";
		return jdbcTemplate.queryForList(sql);
	}
}
