package com.ktech.ourapp.model;

public class FmeasureVO {

   private double accuracy;
   private double fWin;
   private double fDraw;
   private double fLose;   
   
   public double getAccuracy() {
      return accuracy;
   }
   public void setAccuracy(double accuracy) {
      this.accuracy = accuracy;
   }
   public double getfWin() {
      return fWin;
   }
   public void setfWin(double fWin) {
      this.fWin = fWin;
   }
   public double getfDraw() {
      return fDraw;
   }
   public void setfDraw(double fDraw) {
      this.fDraw = fDraw;
   }
   public double getfLose() {
      return fLose;
   }
   public void setfLose(double fLose) {
      this.fLose = fLose;
   }
   
   @Override
   public String toString() {
      return "FmeasureVO [accuracy=" + accuracy + ", fWin=" + fWin + ", fDraw=" + fDraw + ", fLose=" + fLose
            +  "]";
   }
}