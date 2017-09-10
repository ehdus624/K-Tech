package com.ktech.ourapp.model;

public class PredictVO {
   
   public double homeWin;
   public double homeDraw;
   public double homeLose;
   public double awayWin;
   public double awayDraw;
   public double awayLose;
   
   public double getHomeWin() {
      return homeWin;
   }
   public void setHomeWin(double homeWin) {
      this.homeWin = homeWin;
   }
   public double getHomeDraw() {
      return homeDraw;
   }
   public void setHomeDraw(double homeDraw) {
      this.homeDraw = homeDraw;
   }
   public double getHomeLose() {
      return homeLose;
   }
   public void setHomeLose(double homeLose) {
      this.homeLose = homeLose;
   }
   public double getAwayWin() {
      return awayWin;
   }
   public void setAwayWin(double awayWin) {
      this.awayWin = awayWin;
   }
   public double getAwayDraw() {
      return awayDraw;
   }
   public void setAwayDraw(double awayDraw) {
      this.awayDraw = awayDraw;
   }
   public double getAwayLose() {
      return awayLose;
   }
   public void setAwayLose(double awayLose) {
      this.awayLose = awayLose;
   }
   
   @Override
   public String toString() {
      return "PredictVO [homeWin=" + homeWin + ", homeDraw=" + homeDraw + ", homeLose=" + homeLose + ", awayWin="
            + awayWin + ", awayDraw=" + awayDraw + ", awayLose=" + awayLose + "]";
   }
}