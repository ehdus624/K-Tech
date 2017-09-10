package com.woowafootball.ourapp.games.model;

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
	private double goalsFor3;
	private double goalsAgainst3;
	private double goalDifference3;
	private double goalSaveRate3;
	private double targetShot3;
	private double goalkeeperSave3;
	private double teamAbility3;
	private double againstTeamAbility3;
	
	private double AgainstGoalsFor3;
	private double AgainstGoalsAgainst3;
	private double AgainstGoalDifference3;
	private int AgainstCumGoalsFor;
	private int AgainstCumGoalsAgainst;
	private int AgainstCumGoalDifference;
	private double againstTargetShot3;
	private double againstGoalkeeperSave3;
	private int termDifference;
	private int againstRecentResultWin;
	private int againstRecentResultDraw;
	private int againstRecentResultLose;
	private int againstCumPoints;
	private int cumPointsDifference;
	private int againstWin;
	private int againstDraw;
	private int againstLose;
	private double againstWinRate;
	private double winRate;
	private double againstDrawRate;
	private double drawRate;
	private double againstLoseRate;
	private double loseRate;
	private int againstPrevRank;
	private int againstPrevResult;
	private double againstAvgTargetShot;
	private double avgTargetShot;
	private double againstAvgGoalkeeperSave;
	private double avgGoalkeeperSave;
	private double abilityDifference3;
	private double avgTeamAbility;
	private double avgAgainstTeamAbility;
	private double avgAbilityDifference;
	private double againstWinMarkov;
	private double WinMarkov;
	private double againstDrawMarkov;
	private double drawMarkov;
	private double againstLoseMarkov;
	private double loseMarkov;
	private int againstGameResult;
	
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
	public double getGoalsFor3() {
		return goalsFor3;
	}
	public void setGoalsFor3(double goalsFor3) {
		this.goalsFor3 = goalsFor3;
	}
	public double getGoalsAgainst3() {
		return goalsAgainst3;
	}
	public void setGoalsAgainst3(double goalsAgainst3) {
		this.goalsAgainst3 = goalsAgainst3;
	}
	public double getGoalDifference3() {
		return goalDifference3;
	}
	public void setGoalDifference3(double goalDifference3) {
		this.goalDifference3 = goalDifference3;
	}
	public double getGoalSaveRate3() {
		return goalSaveRate3;
	}
	public void setGoalSaveRate3(double goalSaveRate3) {
		this.goalSaveRate3 = goalSaveRate3;
	}
	public double getTargetShot3() {
		return targetShot3;
	}
	public void setTargetShot3(double targetShot3) {
		this.targetShot3 = targetShot3;
	}
	public double getGoalkeeperSave3() {
		return goalkeeperSave3;
	}
	public void setGoalkeeperSave3(double goalkeeperSave3) {
		this.goalkeeperSave3 = goalkeeperSave3;
	}
	public double getTeamAbility3() {
		return teamAbility3;
	}
	public void setTeamAbility3(double teamAbility3) {
		this.teamAbility3 = teamAbility3;
	}
	public double getAgainstTeamAbility3() {
		return againstTeamAbility3;
	}
	public void setAgainstTeamAbility3(double againstTeamAbility3) {
		this.againstTeamAbility3 = againstTeamAbility3;
	}
	public double getAgainstGoalsFor3() {
		return AgainstGoalsFor3;
	}
	public void setAgainstGoalsFor3(double againstGoalsFor3) {
		AgainstGoalsFor3 = againstGoalsFor3;
	}
	public double getAgainstGoalsAgainst3() {
		return AgainstGoalsAgainst3;
	}
	public void setAgainstGoalsAgainst3(double againstGoalsAgainst3) {
		AgainstGoalsAgainst3 = againstGoalsAgainst3;
	}
	public double getAgainstGoalDifference3() {
		return AgainstGoalDifference3;
	}
	public void setAgainstGoalDifference3(double againstGoalDifference3) {
		AgainstGoalDifference3 = againstGoalDifference3;
	}
	public int getAgainstCumGoalsFor() {
		return AgainstCumGoalsFor;
	}
	public void setAgainstCumGoalsFor(int againstCumGoalsFor) {
		AgainstCumGoalsFor = againstCumGoalsFor;
	}
	public int getAgainstCumGoalsAgainst() {
		return AgainstCumGoalsAgainst;
	}
	public void setAgainstCumGoalsAgainst(int againstCumGoalsAgainst) {
		AgainstCumGoalsAgainst = againstCumGoalsAgainst;
	}
	public int getAgainstCumGoalDifference() {
		return AgainstCumGoalDifference;
	}
	public void setAgainstCumGoalDifference(int againstCumGoalDifference) {
		AgainstCumGoalDifference = againstCumGoalDifference;
	}
	public double getAgainstTargetShot3() {
		return againstTargetShot3;
	}
	public void setAgainstTargetShot3(double againstTargetShot3) {
		this.againstTargetShot3 = againstTargetShot3;
	}
	public double getAgainstGoalkeeperSave3() {
		return againstGoalkeeperSave3;
	}
	public void setAgainstGoalkeeperSave3(double againstGoalkeeperSave3) {
		this.againstGoalkeeperSave3 = againstGoalkeeperSave3;
	}
	public int getTermDifference() {
		return termDifference;
	}
	public void setTermDifference(int termDifference) {
		this.termDifference = termDifference;
	}
	public int getAgainstRecentResultWin() {
		return againstRecentResultWin;
	}
	public void setAgainstRecentResultWin(int againstRecentResultWin) {
		this.againstRecentResultWin = againstRecentResultWin;
	}
	public int getAgainstRecentResultDraw() {
		return againstRecentResultDraw;
	}
	public void setAgainstRecentResultDraw(int againstRecentResultDraw) {
		this.againstRecentResultDraw = againstRecentResultDraw;
	}
	public int getAgainstRecentResultLose() {
		return againstRecentResultLose;
	}
	public void setAgainstRecentResultLose(int againstRecentResultLose) {
		this.againstRecentResultLose = againstRecentResultLose;
	}
	public int getAgainstCumPoints() {
		return againstCumPoints;
	}
	public void setAgainstCumPoints(int againstCumPoints) {
		this.againstCumPoints = againstCumPoints;
	}
	public int getCumPointsDifference() {
		return cumPointsDifference;
	}
	public void setCumPointsDifference(int cumPointsDifference) {
		this.cumPointsDifference = cumPointsDifference;
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
	public double getAgainstWinRate() {
		return againstWinRate;
	}
	public void setAgainstWinRate(double againstWinRate) {
		this.againstWinRate = againstWinRate;
	}
	public double getWinRate() {
		return winRate;
	}
	public void setWinRate(double winRate) {
		this.winRate = winRate;
	}
	public double getAgainstDrawRate() {
		return againstDrawRate;
	}
	public void setAgainstDrawRate(double againstDrawRate) {
		this.againstDrawRate = againstDrawRate;
	}
	public double getDrawRate() {
		return drawRate;
	}
	public void setDrawRate(double drawRate) {
		this.drawRate = drawRate;
	}
	public double getAgainstLoseRate() {
		return againstLoseRate;
	}
	public void setAgainstLoseRate(double againstLoseRate) {
		this.againstLoseRate = againstLoseRate;
	}
	public double getLoseRate() {
		return loseRate;
	}
	public void setLoseRate(double loseRate) {
		this.loseRate = loseRate;
	}
	public int getAgainstPrevRank() {
		return againstPrevRank;
	}
	public void setAgainstPrevRank(int againstPrevRank) {
		this.againstPrevRank = againstPrevRank;
	}
	public int getAgainstPrevResult() {
		return againstPrevResult;
	}
	public void setAgainstPrevResult(int againstPrevResult) {
		this.againstPrevResult = againstPrevResult;
	}
	public double getAgainstAvgTargetShot() {
		return againstAvgTargetShot;
	}
	public void setAgainstAvgTargetShot(double againstAvgTargetShot) {
		this.againstAvgTargetShot = againstAvgTargetShot;
	}
	public double getAvgTargetShot() {
		return avgTargetShot;
	}
	public void setAvgTargetShot(double avgTargetShot) {
		this.avgTargetShot = avgTargetShot;
	}
	public double getAgainstAvgGoalkeeperSave() {
		return againstAvgGoalkeeperSave;
	}
	public void setAgainstAvgGoalkeeperSave(double againstAvgGoalkeeperSave) {
		this.againstAvgGoalkeeperSave = againstAvgGoalkeeperSave;
	}
	public double getAvgGoalkeeperSave() {
		return avgGoalkeeperSave;
	}
	public void setAvgGoalkeeperSave(double avgGoalkeeperSave) {
		this.avgGoalkeeperSave = avgGoalkeeperSave;
	}
	public double getAbilityDifference3() {
		return abilityDifference3;
	}
	public void setAbilityDifference3(double abilityDifference3) {
		this.abilityDifference3 = abilityDifference3;
	}
	public double getAvgTeamAbility() {
		return avgTeamAbility;
	}
	public void setAvgTeamAbility(double avgTeamAbility) {
		this.avgTeamAbility = avgTeamAbility;
	}
	public double getAvgAgainstTeamAbility() {
		return avgAgainstTeamAbility;
	}
	public void setAvgAgainstTeamAbility(double avgAgainstTeamAbility) {
		this.avgAgainstTeamAbility = avgAgainstTeamAbility;
	}
	public double getAvgAbilityDifference() {
		return avgAbilityDifference;
	}
	public void setAvgAbilityDifference(double avgAbilityDifference) {
		this.avgAbilityDifference = avgAbilityDifference;
	}
	public double getAgainstWinMarkov() {
		return againstWinMarkov;
	}
	public void setAgainstWinMarkov(double againstWinMarkov) {
		this.againstWinMarkov = againstWinMarkov;
	}
	public double getWinMarkov() {
		return WinMarkov;
	}
	public void setWinMarkov(double winMarkov) {
		WinMarkov = winMarkov;
	}
	public double getAgainstDrawMarkov() {
		return againstDrawMarkov;
	}
	public void setAgainstDrawMarkov(double againstDrawMarkov) {
		this.againstDrawMarkov = againstDrawMarkov;
	}
	public double getDrawMarkov() {
		return drawMarkov;
	}
	public void setDrawMarkov(double drawMarkov) {
		this.drawMarkov = drawMarkov;
	}
	public double getAgainstLoseMarkov() {
		return againstLoseMarkov;
	}
	public void setAgainstLoseMarkov(double againstLoseMarkov) {
		this.againstLoseMarkov = againstLoseMarkov;
	}
	public double getLoseMarkov() {
		return loseMarkov;
	}
	public void setLoseMarkov(double loseMarkov) {
		this.loseMarkov = loseMarkov;
	}
	public int getAgainstGameResult() {
		return againstGameResult;
	}
	public void setAgainstGameResult(int againstGameResult) {
		this.againstGameResult = againstGameResult;
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
				+ nextDiffPoints + ", win=" + win + ", draw=" + draw + ", lose=" + lose + ", prevRank=" + prevRank
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
				+ teamAbility3 + ", againstTeamAbility3=" + againstTeamAbility3 + ", AgainstGoalsFor3="
				+ AgainstGoalsFor3 + ", AgainstGoalsAgainst3=" + AgainstGoalsAgainst3 + ", AgainstGoalDifference3="
				+ AgainstGoalDifference3 + ", AgainstCumGoalsFor=" + AgainstCumGoalsFor + ", AgainstCumGoalsAgainst="
				+ AgainstCumGoalsAgainst + ", AgainstCumGoalDifference=" + AgainstCumGoalDifference
				+ ", againstTargetShot3=" + againstTargetShot3 + ", againstGoalkeeperSave3=" + againstGoalkeeperSave3
				+ ", termDifference=" + termDifference + ", againstRecentResultWin=" + againstRecentResultWin
				+ ", againstRecentResultDraw=" + againstRecentResultDraw + ", againstRecentResultLose="
				+ againstRecentResultLose + ", againstCumPoints=" + againstCumPoints + ", cumPointsDifference="
				+ cumPointsDifference + ", againstWin=" + againstWin + ", againstDraw=" + againstDraw + ", againstLose="
				+ againstLose + ", againstWinRate=" + againstWinRate + ", winRate=" + winRate + ", againstDrawRate="
				+ againstDrawRate + ", drawRate=" + drawRate + ", againstLoseRate=" + againstLoseRate + ", loseRate="
				+ loseRate + ", againstPrevRank=" + againstPrevRank + ", againstPrevResult=" + againstPrevResult
				+ ", againstAvgTargetShot=" + againstAvgTargetShot + ", avgTargetShot=" + avgTargetShot
				+ ", againstAvgGoalkeeperSave=" + againstAvgGoalkeeperSave + ", avgGoalkeeperSave=" + avgGoalkeeperSave
				+ ", abilityDifference3=" + abilityDifference3 + ", avgTeamAbility=" + avgTeamAbility
				+ ", avgAgainstTeamAbility=" + avgAgainstTeamAbility + ", avgAbilityDifference=" + avgAbilityDifference
				+ ", againstWinMarkov=" + againstWinMarkov + ", WinMarkov=" + WinMarkov + ", againstDrawMarkov="
				+ againstDrawMarkov + ", drawMarkov=" + drawMarkov + ", againstLoseMarkov=" + againstLoseMarkov
				+ ", loseMarkov=" + loseMarkov + ", againstGameResult=" + againstGameResult + "]";
	}
}