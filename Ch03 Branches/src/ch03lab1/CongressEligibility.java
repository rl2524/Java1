package ch03lab1;
import java.util.Scanner;

/**
 * This program determines eligibility to be a US Senator, Representative or both depending on age
 * and how long they been a citizen.
 * 2/7/2018
 * @author Ramiro
 * @author Roberto J
 */
public class CongressEligibility {
   public static void main (String [] args)   {
      Scanner scnr = new Scanner(System.in);//Variable to get the input from the user

      int userAge = 0;//user's age
      int userCitYear = 0;// user's year of citizenship
      final int MIN_AGE_SEN = 30;//minimum age to be a senator
      final int MIN_AGE_REP = 25;//minimum age to be a representative
      final int MIN_CIT_SEN = 9;//minimum year's of citizenship to be a senator
      final int MIN_CIT_REP = 7;//minimum year's of citizenship to be a representative

      System.out.print("Enter your age: ");
      userAge = scnr.nextInt();//input of the user's age
      System.out.print("Enter the years of citizenship: ");
      userCitYear = scnr.nextInt();//input of user's years of citizen


      if ( (userAge >= MIN_AGE_SEN) && (userCitYear >= MIN_CIT_SEN))  {
         System.out.println("You are eligible to be a member of the House or the Senate.");
      }
      else if (userAge >= MIN_AGE_REP && userCitYear >= MIN_CIT_REP )   {
         System.out.println("You are eligible to be a member of the House.");
      }
      else   {
         System.out.println("You are not eligible to be a member of Congress.");
      }

















   }
}
