package com.woowafootball.ourapp.players.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.woowafootball.ourapp.players.model.PlayersVO;

@Repository
public class PlayerRepository implements IPlayerRepository {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void insertPlayer(PlayersVO player) {
		String sql = "insert into players (name, player_ID, team, nation_ID, "
				+ "born, age,world_reputation, home_reputation, "
				+ "current_reputation, pa, ca, price, height, weight, "
				+ "position_string, aerial_ability, command_of_area, "
				+ "communication, eccentricity, handling, kicking, one_on_ones, "
				+ "reflexes, rushing_out, tendency_to_punch, throwing, corners, "
				+ "crossing, dribbling, finishing, first_touch, freekicks, "
				+ "heading, long_shots, long_throws, marking, passing, "
				+ "penalty_taking, tackling, technique, aggression, anticipation, "
				+ "bravery, composure, concentration, vision, decisions, "
				+ "determination, flair, leadership, off_the_ball, positioning, "
				+ "teamwork, workrate, acceleration, agility, balance, jumping, "
				+ "left_foot, natural_fitness, pace, right_foot, stamina, "
				+ "strength, consistency, dirtiness, important_matches, "
				+ "injury_proness, versatility, adaptability, ambition, "
				+ "loyalty, pressure, professional, sportsmanship, temperament, "
				+ "controversy, defender, wing_back, midfielder, "
				+ "attacking_Midfielder, right, left, centre, position_descval, "
				+ "goalkeeper, sweeper, striker, attacking_mid_central, "
				+ "attacking_mid_left, attacking_mid_right, defender_central, "
				+ "defender_left, defender_right, defensive_midfielder, "
				+ "midfielder_central, midfielder_left, midfielder_right, "
				+ "wing_back_left, wing_back_right) values "
				+ "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
				+ "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
				+ "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
				+ "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
				+ "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
				+ "?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		jdbcTemplate.update(sql,
				player.getName(),
				player.getPlayerId(),
				player.getTeam(),
				player.getNationId(),
				player.getBorn(),
				player.getAge(),
				player.getWorldReputation(),
				player.getHomeReputation(),
				player.getCurrentReputation(),
				player.getPa(),
				player.getCa(),
				player.getPrice(),
				player.getHeight(),
				player.getWeight(),
				player.getPositionString(),
				player.getAerialAbility(),
				player.getCommandOfArea(),
				player.getCommunication(),
				player.getEccentricity(),
				player.getHandling(),
				player.getKicking(),
				player.getOneOnOnes(),
				player.getReflexes(),
				player.getRushingOut(),
				player.getTendencyToPunch(),
				player.getThrowing(),
				player.getCorners(),
				player.getCrossing(),
				player.getDribbling(),
				player.getFinishing(),
				player.getFirstTouch(),
				player.getFreekicks(),
				player.getHeading(),
				player.getLongShots(),
				player.getLongthrows(),
				player.getMarking(),
				player.getPassing(),
				player.getPenaltyTaking(),
				player.getTackling(),
				player.getTechnique(),
				player.getAggression(),
				player.getAnticipation(),
				player.getBravery(),
				player.getComposure(),
				player.getConcentration(),
				player.getVision(),
				player.getDecisions(),
				player.getDetermination(),
				player.getFlair(),
				player.getLeadership(),
				player.getOffTheBall(),
				player.getPositioning(),
				player.getTeamwork(),
				player.getWorkrate(),
				player.getAcceleration(),
				player.getAgility(),
				player.getBalance(),
				player.getJumping(),
				player.getLeftFoot(),
				player.getNaturalFitness(),
				player.getPace(),
				player.getRightFoot(),
				player.getStamina(),
				player.getStrength(),
				player.getConsistency(),
				player.getDirtiness(),
				player.getImportantMatches(),
				player.getInjuryProness(),
				player.getVersatility(),
				player.getAdaptability(),
				player.getAmbition(),
				player.getLoyalty(),
				player.getPressure(),
				player.getProfessional(),
				player.getSportsmanship(),
				player.getTemperament(),
				player.getControversy(),
				player.getDefender(),
				player.getWingBack(),
				player.getMidfielder(),
				player.getAttackingMidfielder(),
				player.getRight(),
				player.getLeft(),
				player.getCentre(),
				player.getPositionsDescVal(),
				player.getGoalkeeper(),
				player.getSweeper(),
				player.getStriker(),
				player.getAttackingMidCentral(),
				player.getAttackingMidLeft(),
				player.getAttackingMidRight(),
				player.getDefenderCentral(),
				player.getDefenderLeft(),
				player.getDefenderRight(),
				player.getDefensiveMidfielder(),
				player.getMidfielderCentral(),
				player.getMidfielderLeft(),
				player.getMidfielderRight(),
				player.getWingBackLeft(),
				player.getWingBackRight());
	}

}
