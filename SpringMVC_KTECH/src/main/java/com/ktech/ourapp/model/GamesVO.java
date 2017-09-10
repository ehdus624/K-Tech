package com.ktech.ourapp.model;

public class GamesVO {
	private String gameId;
	private String gameDate;
	private String gameTime;
	private String team;
	private String againstTeam;
	private int goalsFor;
	private int goalsAgainst;
	private int goalDifference;
	private int cumGoalsFor;
	private int cumGoalsAgainst;
	private int cumGoalDifference;
	private int isHome;
	private int gameResult;
	private int prevResult;
	private int recentResultWin;
	private int recentResultDraw;
	private int recentResultLose;
	private int points;
	private int cumPoints;
	private int prevDiffPoints;
	private int nextDiffPoints;
	private int win;
	private int draw;
	private int lose;
	private int againstWin;
	private int againstDraw;
	private int againstLose;
	private int prevRank;
	private int currRank;
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
	private int teamAbility;
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
	private int againstTeamAbility;
	private int gameTerm;
	private int gameTermK;
	private double goalSaveRate;
	private int targetShot;
	private double goalkeeperSave;
	private int season;
	private String league;
	private int goalsFor3;
	private int goalsAgainst3;
	private int goalDifference3;
	private double goalSaveRate3;
	private int targetShot3;
	private double goalkeeperSave3;
	private int teamAbility3;
	private int againstTeamAbility3;
	private double winProb;
	private double drawProb;
	private double loseProb;
	
	public String getGameId() {
		return gameId;
	}
	public void setGameId(String gameId) {
		this.gameId = gameId;
	}
	public String getGameDate() {
		return gameDate;
	}
	public void setGameDate(String gameDate) {
		this.gameDate = gameDate;
	}
	public String getGameTime() {
		return gameTime;
	}
	public void setGameTime(String gameTime) {
		this.gameTime = gameTime;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public String getAgainstTeam() {
		return againstTeam;
	}
	public void setAgainstTeam(String againstTeam) {
		this.againstTeam = againstTeam;
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
	public int getGoalDifference() {
		return goalDifference;
	}
	public void setGoalDifference(int goalDifference) {
		this.goalDifference = goalDifference;
	}
	public int getCumGoalsFor() {
		return cumGoalsFor;
	}
	public void setCumGoalsFor(int cumGoalsFor) {
		this.cumGoalsFor = cumGoalsFor;
	}
	public int getCumGoalsAgainst() {
		return cumGoalsAgainst;
	}
	public void setCumGoalsAgainst(int cumGoalsAgainst) {
		this.cumGoalsAgainst = cumGoalsAgainst;
	}
	public int getCumGoalDifference() {
		return cumGoalDifference;
	}
	public void setCumGoalDifference(int cumGoalDifference) {
		this.cumGoalDifference = cumGoalDifference;
	}
	public int getIsHome() {
		return isHome;
	}
	public void setIsHome(int isHome) {
		this.isHome = isHome;
	}
	public int getGameResult() {
		return gameResult;
	}
	public void setGameResult(int gameResult) {
		this.gameResult = gameResult;
	}
	public int getPrevResult() {
		return prevResult;
	}
	public void setPrevResult(int prevResult) {
		this.prevResult = prevResult;
	}
	public int getRecentResultWin() {
		return recentResultWin;
	}
	public void setRecentResultWin(int recentResultWin) {
		this.recentResultWin = recentResultWin;
	}
	public int getRecentResultDraw() {
		return recentResultDraw;
	}
	public void setRecentResultDraw(int recentResultDraw) {
		this.recentResultDraw = recentResultDraw;
	}
	public int getRecentResultLose() {
		return recentResultLose;
	}
	public void setRecentResultLose(int recentResultLose) {
		this.recentResultLose = recentResultLose;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public int getCumPoints() {
		return cumPoints;
	}
	public void setCumPoints(int cumPoints) {
		this.cumPoints = cumPoints;
	}
	public int getPrevDiffPoints() {
		return prevDiffPoints;
	}
	public void setPrevDiffPoints(int prevDiffPoints) {
		this.prevDiffPoints = prevDiffPoints;
	}
	public int getNextDiffPoints() {
		return nextDiffPoints;
	}
	public void setNextDiffPoints(int nextDiffPoints) {
		this.nextDiffPoints = nextDiffPoints;
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
	public int getAgainstWin() {
		return againstWin;
	}
	public void setAgainstWin(int againstWin) {
		this.againstWin = againstWin;
	}
	public int getAgainstDraw() {
		return againstDraw;
	}
	public void setAgainstDraw(int againstDraw) {
		this.againstDraw = againstDraw;
	}
	public int getAgainstLose() {
		return againstLose;
	}
	public void setAgainstLose(int againstLose) {
		this.againstLose = againstLose;
	}
	public int getPrevRank() {
		return prevRank;
	}
	public void setPrevRank(int prevRank) {
		this.prevRank = prevRank;
	}
	public int getCurrRank() {
		return currRank;
	}
	public void setCurrRank(int currRank) {
		this.currRank = currRank;
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
	public int getTeamAbility() {
		return teamAbility;
	}
	public void setTeamAbility(int teamAbility) {
		this.teamAbility = teamAbility;
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
	public int getAgainstTeamAbility() {
		return againstTeamAbility;
	}
	public void setAgainstTeamAbility(int againstTeamAbility) {
		this.againstTeamAbility = againstTeamAbility;
	}
	public int getGameTerm() {
		return gameTerm;
	}
	public void setGameTerm(int gameTerm) {
		this.gameTerm = gameTerm;
	}
	public int getGameTermK() {
		return gameTermK;
	}
	public void setGameTermK(int gameTermK) {
		this.gameTermK = gameTermK;
	}
	public double getGoalSaveRate() {
		return goalSaveRate;
	}
	public void setGoalSaveRate(double goalSaveRate) {
		this.goalSaveRate = goalSaveRate;
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
	public int getGoalsFor3() {
		return goalsFor3;
	}
	public void setGoalsFor3(int goalsFor3) {
		this.goalsFor3 = goalsFor3;
	}
	public int getGoalsAgainst3() {
		return goalsAgainst3;
	}
	public void setGoalsAgainst3(int goalsAgainst3) {
		this.goalsAgainst3 = goalsAgainst3;
	}
	public int getGoalDifference3() {
		return goalDifference3;
	}
	public void setGoalDifference3(int goalDifference3) {
		this.goalDifference3 = goalDifference3;
	}
	public double getGoalSaveRate3() {
		return goalSaveRate3;
	}
	public void setGoalSaveRate3(double goalSaveRate3) {
		this.goalSaveRate3 = goalSaveRate3;
	}
	public int getTargetShot3() {
		return targetShot3;
	}
	public void setTargetShot3(int targetShot3) {
		this.targetShot3 = targetShot3;
	}
	public double getGoalkeeperSave3() {
		return goalkeeperSave3;
	}
	public void setGoalkeeperSave3(double goalkeeperSave3) {
		this.goalkeeperSave3 = goalkeeperSave3;
	}
	public int getTeamAbility3() {
		return teamAbility3;
	}
	public void setTeamAbility3(int teamAbility3) {
		this.teamAbility3 = teamAbility3;
	}
	public int getAgainstTeamAbility3() {
		return againstTeamAbility3;
	}
	public void setAgainstTeamAbility3(int againstTeamAbility3) {
		this.againstTeamAbility3 = againstTeamAbility3;
	}
	public double getWinProb() {
		return winProb;
	}
	public void setWinProb(double winProb) {
		this.winProb = winProb;
	}
	public double getDrawProb() {
		return drawProb;
	}
	public void setDrawProb(double drawProb) {
		this.drawProb = drawProb;
	}
	public double getLoseProb() {
		return loseProb;
	}
	public void setLoseProb(double loseProb) {
		this.loseProb = loseProb;
	}
	
	@Override
	public String toString() {
		return "GamesVO [gameId=" + gameId + ", gameDate=" + gameDate + ", gameTime=" + gameTime + ", team=" + team
				+ ", againstTeam=" + againstTeam + ", goalsFor=" + goalsFor + ", goalsAgainst=" + goalsAgainst
				+ ", goalDifference=" + goalDifference + ", cumGoalsFor=" + cumGoalsFor + ", cumGoalsAgainst="
				+ cumGoalsAgainst + ", cumGoalDifference=" + cumGoalDifference + ", isHome=" + isHome + ", gameResult="
				+ gameResult + ", prevResult=" + prevResult + ", recentResultWin=" + recentResultWin
				+ ", recentResultDraw=" + recentResultDraw + ", recentResultLose=" + recentResultLose + ", points="
				+ points + ", cumPoints=" + cumPoints + ", prevDiffPoints=" + prevDiffPoints + ", nextDiffPoints="
				+ nextDiffPoints + ", win=" + win + ", draw=" + draw + ", lose=" + lose + ", againstWin=" + againstWin
				+ ", againstDraw=" + againstDraw + ", againstLose=" + againstLose + ", prevRank=" + prevRank
				+ ", currRank=" + currRank + ", player1=" + player1 + ", player2=" + player2 + ", player3=" + player3
				+ ", player4=" + player4 + ", player5=" + player5 + ", player6=" + player6 + ", player7=" + player7
				+ ", player8=" + player8 + ", player9=" + player9 + ", player10=" + player10 + ", player11=" + player11
				+ ", teamAbility=" + teamAbility + ", againstPlayer1=" + againstPlayer1 + ", againstPlayer2="
				+ againstPlayer2 + ", againstPlayer3=" + againstPlayer3 + ", againstPlayer4=" + againstPlayer4
				+ ", againstPlayer5=" + againstPlayer5 + ", againstPlayer6=" + againstPlayer6 + ", againstPlayer7="
				+ againstPlayer7 + ", againstPlayer8=" + againstPlayer8 + ", againstPlayer9=" + againstPlayer9
				+ ", againstPlayer10=" + againstPlayer10 + ", againstPlayer11=" + againstPlayer11
				+ ", againstTeamAbility=" + againstTeamAbility + ", gameTerm=" + gameTerm + ", gameTermK=" + gameTermK
				+ ", goalSaveRate=" + goalSaveRate + ", targetShot=" + targetShot + ", goalkeeperSave=" + goalkeeperSave
				+ ", season=" + season + ", league=" + league + ", goalsFor3=" + goalsFor3 + ", goalsAgainst3="
				+ goalsAgainst3 + ", goalDifference3=" + goalDifference3 + ", goalSaveRate3=" + goalSaveRate3
				+ ", targetShot3=" + targetShot3 + ", goalkeeperSave3=" + goalkeeperSave3 + ", teamAbility3="
				+ teamAbility3 + ", againstTeamAbility3=" + againstTeamAbility3 + ", winProb=" + winProb + ", drawProb="
				+ drawProb + ", loseProb=" + loseProb + "]";
	}

	
}