package com.ktech.ourapp.model;

import java.sql.Date;
import java.util.Arrays;

import org.slf4j.Marker;

public class KtechVO {
	private String type;
	private String name;
	private double[] data;
	private Marker marker;
	private double accuracy;
	private String team;
	private String nameKor;
	private Date born;
	private String gameDate;
	private int season;
	private String league;
	private String againstTeam;
	private int targetShot;
	private double goalkeeperSave;
	private int win;
	private int draw;
	private int lose;
	private int currRank;
	private int teamAbility;
	private int againstTeamAbility;
	private String player1;
	private String player2;
	private String player3;
	private String player4;
	private String player5;
	private String player6;
	private String player7;
	private String player8;
	private String player9;
	private String player10;
	private String player11;
	private String againstPlayer1;
	private String againstPlayer2;
	private String againstPlayer3;
	private String againstPlayer4;
	private String againstPlayer5;
	private String againstPlayer6;
	private String againstPlayer7;
	private String againstPlayer8;
	private String againstPlayer9;
	private String againstPlayer10;
	private String againstPlayer11;
	private int goalsFor;
	private int goalsAgainst;
	private String gameId;


	public String getGameId() {
		return gameId;
	}
	public void setGameId(String gameId) {
		this.gameId = gameId;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public String getNameKor() {
		return nameKor;
	}
	public void setNameKor(String nameKor) {
		this.nameKor = nameKor;
	}
	public Date getBorn() {
		return born;
	}
	public void setBorn(Date born) {
		this.born = born;
	}
	public String getGameDate() {
		return gameDate;
	}
	public void setGameDate(String gameDate) {
		this.gameDate = gameDate;
	}
	public int getSeason() {
		return season;
	}
	public void setSeason(int season) {
		this.season = season;
	}
	public String getLeague() {
		return league;
	}
	public void setLeague(String league) {
		this.league = league;
	}
	public String getAgainstTeam() {
		return againstTeam;
	}
	public void setAgainstTeam(String againstTeam) {
		this.againstTeam = againstTeam;
	}
	public int getTargetShot() {
		return targetShot;
	}
	public void setTargetShot(int targetShot) {
		this.targetShot = targetShot;
	}
	public double getGoalkeeperSave() {
		return goalkeeperSave;
	}
	public void setGoalkeeperSave(double goalkeeperSave) {
		this.goalkeeperSave = goalkeeperSave;
	}
	public int getWin() {
		return win;
	}
	public void setWin(int win) {
		this.win = win;
	}
	public int getDraw() {
		return draw;
	}
	public void setDraw(int draw) {
		this.draw = draw;
	}
	public int getLose() {
		return lose;
	}
	public void setLose(int lose) {
		this.lose = lose;
	}
	public int getCurrRank() {
		return currRank;
	}
	public void setCurrRank(int currRank) {
		this.currRank = currRank;
	}
	public int getTeamAbility() {
		return teamAbility;
	}
	public void setTeamAbility(int teamAbility) {
		this.teamAbility = teamAbility;
	}
	public int getAgainstTeamAbility() {
		return againstTeamAbility;
	}
	public void setAgainstTeamAbility(int againstTeamAbility) {
		this.againstTeamAbility = againstTeamAbility;
	}
	public String getPlayer1() {
		return player1;
	}
	public void setPlayer1(String player1) {
		this.player1 = player1;
	}
	public String getPlayer2() {
		return player2;
	}
	public void setPlayer2(String player2) {
		this.player2 = player2;
	}
	public String getPlayer3() {
		return player3;
	}
	public void setPlayer3(String player3) {
		this.player3 = player3;
	}
	public String getPlayer4() {
		return player4;
	}
	public void setPlayer4(String player4) {
		this.player4 = player4;
	}
	public String getPlayer5() {
		return player5;
	}
	public void setPlayer5(String player5) {
		this.player5 = player5;
	}
	public String getPlayer6() {
		return player6;
	}
	public void setPlayer6(String player6) {
		this.player6 = player6;
	}
	public String getPlayer7() {
		return player7;
	}
	public void setPlayer7(String player7) {
		this.player7 = player7;
	}
	public String getPlayer8() {
		return player8;
	}
	public void setPlayer8(String player8) {
		this.player8 = player8;
	}
	public String getPlayer9() {
		return player9;
	}
	public void setPlayer9(String player9) {
		this.player9 = player9;
	}
	public String getPlayer10() {
		return player10;
	}
	public void setPlayer10(String player10) {
		this.player10 = player10;
	}
	public String getPlayer11() {
		return player11;
	}
	public void setPlayer11(String player11) {
		this.player11 = player11;
	}
	public String getAgainstPlayer1() {
		return againstPlayer1;
	}
	public void setAgainstPlayer1(String againstPlayer1) {
		this.againstPlayer1 = againstPlayer1;
	}
	public String getAgainstPlayer2() {
		return againstPlayer2;
	}
	public void setAgainstPlayer2(String againstPlayer2) {
		this.againstPlayer2 = againstPlayer2;
	}
	public String getAgainstPlayer3() {
		return againstPlayer3;
	}
	public void setAgainstPlayer3(String againstPlayer3) {
		this.againstPlayer3 = againstPlayer3;
	}
	public String getAgainstPlayer4() {
		return againstPlayer4;
	}
	public void setAgainstPlayer4(String againstPlayer4) {
		this.againstPlayer4 = againstPlayer4;
	}
	public String getAgainstPlayer5() {
		return againstPlayer5;
	}
	public void setAgainstPlayer5(String againstPlayer5) {
		this.againstPlayer5 = againstPlayer5;
	}
	public String getAgainstPlayer6() {
		return againstPlayer6;
	}
	public void setAgainstPlayer6(String againstPlayer6) {
		this.againstPlayer6 = againstPlayer6;
	}
	public String getAgainstPlayer7() {
		return againstPlayer7;
	}
	public void setAgainstPlayer7(String againstPlayer7) {
		this.againstPlayer7 = againstPlayer7;
	}
	public String getAgainstPlayer8() {
		return againstPlayer8;
	}
	public void setAgainstPlayer8(String againstPlayer8) {
		this.againstPlayer8 = againstPlayer8;
	}
	public String getAgainstPlayer9() {
		return againstPlayer9;
	}
	public void setAgainstPlayer9(String againstPlayer9) {
		this.againstPlayer9 = againstPlayer9;
	}
	public String getAgainstPlayer10() {
		return againstPlayer10;
	}
	public void setAgainstPlayer10(String againstPlayer10) {
		this.againstPlayer10 = againstPlayer10;
	}
	public String getAgainstPlayer11() {
		return againstPlayer11;
	}
	public void setAgainstPlayer11(String againstPlayer11) {
		this.againstPlayer11 = againstPlayer11;
	}
	public int getGoalsFor() {
		return goalsFor;
	}
	public void setGoalsFor(int goalsFor) {
		this.goalsFor = goalsFor;
	}
	public int getGoalsAgainst() {
		return goalsAgainst;
	}
	public void setGoalsAgainst(int goalsAgainst) {
		this.goalsAgainst = goalsAgainst;
	}
	public double getAccuracy() {
		return accuracy;
	}
	public void setAccuracy(double accuracy) {
		this.accuracy = accuracy;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double[] getData() {
		return data;
	}
	public void setData(double[] data) {
		this.data = data;
	}
	public Marker getMarker() {
		return marker;
	}
	public void setMarker(Marker marker) {
		this.marker = marker;
	}
	
	@Override
	public String toString() {
		return "KtechVO [type=" + type + ", name=" + name + ", data=" + Arrays.toString(data) + ", marker=" + marker
				+ ", accuracy=" + accuracy + ", team=" + team + ", nameKor=" + nameKor + ", born=" + born
				+ ", gameDate=" + gameDate + ", season=" + season + ", league=" + league + ", againstTeam="
				+ againstTeam + ", targetShot=" + targetShot + ", goalkeeperSave=" + goalkeeperSave + ", win=" + win
				+ ", draw=" + draw + ", lose=" + lose + ", currRank=" + currRank + ", teamAbility=" + teamAbility
				+ ", againstTeamAbility=" + againstTeamAbility + ", player1=" + player1 + ", player2=" + player2
				+ ", player3=" + player3 + ", player4=" + player4 + ", player5=" + player5 + ", player6=" + player6
				+ ", player7=" + player7 + ", player8=" + player8 + ", player9=" + player9 + ", player10=" + player10
				+ ", player11=" + player11 + ", againstPlayer1=" + againstPlayer1 + ", againstPlayer2=" + againstPlayer2
				+ ", againstPlayer3=" + againstPlayer3 + ", againstPlayer4=" + againstPlayer4 + ", againstPlayer5="
				+ againstPlayer5 + ", againstPlayer6=" + againstPlayer6 + ", againstPlayer7=" + againstPlayer7
				+ ", againstPlayer8=" + againstPlayer8 + ", againstPlayer9=" + againstPlayer9 + ", againstPlayer10="
				+ againstPlayer10 + ", againstPlayer11=" + againstPlayer11 + ", goalsFor=" + goalsFor
				+ ", goalsAgainst=" + goalsAgainst + ", gameId=" + gameId + "]";
	}
}
