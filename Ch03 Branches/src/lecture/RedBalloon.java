package lecture;

import java.util.Scanner;

public class RedBalloon {
   public static void main (String [] args) {
      boolean isRed;
      boolean isBalloon;

      isRed = false;
      isBalloon = false;



      if (isBalloon && !isRed)   {
         System.out.println("Balloon");
      }

      else if (isBalloon && isRed)   {
         System.out.println("Red balloon");
      }
      else   {
         System.out.println("Not a balloon");
      }/* Your solution goes here  */

   }
}