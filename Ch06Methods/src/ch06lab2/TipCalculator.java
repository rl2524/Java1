package ch06lab2;

import java.util.Scanner;

/**
 * Uses methods to get user input then calculates cost per diner with tip then outputs user cost
 * 4/2/2018
 * @author Ramiro
 * @author Jacob M
 * @author Jim
 */
public class TipCalculator {
   public static Scanner scnr =
       new Scanner(System.in);               // for user input

   /**
    * Calls methods to calculate total check amount and tip
    * @param args name of strings
    */
   public static void main (String[] args){

      double checkAmount = getCheckAmount(); //stores check amount
      double tipPct = getTipPct();           //stores tip amount
      getTotal(checkAmount, tipPct);         //Calls getTotal
      double dinerCount = getDinerCount();   //Stores the amount of diners
      double dinerShare =                    //Stores the amount of how much each diner pays
          (checkAmount + (checkAmount * tipPct)) / dinerCount;
      displayData
          (checkAmount, tipPct, dinerShare);//Calls displaydata
   }

   /**
    * Prints users calculated input
    * @param checkAmount is the total cost before tip
    * @param tipPct percentage to tip
    * @param dinerShare how much each user pays
    */
   public static void displayData(double checkAmount, double tipPct, double dinerShare){
      System.out.println("If the check is $" + checkAmount);
      System.out.println("and the desired tip is " + (tipPct * 100) + "%");
      System.out.print("then each person's share is $" + dinerShare);
   }

   /**
    * Calculates the total amount
    * @param checkAmount is the total cost before tip
    * @param tipPct percentage to tip
    * @return returns total cost of check
    */
   public static double getTotal (double checkAmount, double tipPct){
      double total = checkAmount * tipPct;
      return total;
   }

   /**
    * get user input for dinercount
    * @return returns dinercount
    */
   public static int getDinerCount(){
      int dinerCount;
      System.out.println("How many will share the bill? ");
      dinerCount = scnr.nextInt();

      while ( dinerCount < 1){
         System.out.print("Error! Number of diners must be at least 1. Please re-enter: ");
         dinerCount = scnr.nextInt();
      }
      return dinerCount;
   }

   /**
    * ask for the amount of tip
    * @return returns the tip percent
    */
   public static double getTipPct(){
      double tipPct;
      System.out.print("How much should the tip be? (Enter 18 for 18%) ");
      tipPct = scnr.nextDouble()/ 100.0;

      while (tipPct <= 0.0 || tipPct > 1.0) {
         System.out.print("Error! Tip must be between 0 and 100. Please re-enter: ");
         tipPct = scnr.nextDouble() / 100.0;
      }
      return tipPct;
   }

   /**
    * Get user input for check amount
    * @return returns the checkamounts
    */
   public static double getCheckAmount(){
      double checkAmount;
      System.out.print("Enter amount of check (before tip): ");
      checkAmount = scnr.nextDouble();

      while ( checkAmount < 0.0 ){
         System.out.print("Error! check amount must be greater than 0.00. Please re-enter: ");
         checkAmount = scnr.nextDouble();
      }
      return checkAmount;
   }

}
