package lecture;

import java.util.Scanner;

public class OrderString {
   public static void main (String [] args) {
      String firstString;
      String secondString;

      firstString  = "rabbits";
      secondString = "capes";

      if(firstString.compareTo(secondString) > 0)   {
         System.out.println(secondString + " " + firstString);
      }
      else   {
         System.out.println(firstString + " " + secondString);
      }/* Your solution goes here  */

   }
}