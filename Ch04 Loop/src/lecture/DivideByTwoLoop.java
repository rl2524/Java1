package lecture;

import java.util.Scanner;

public class DivideByTwoLoop {
   public static void main (String [] args) {
      int userNum;

      userNum = 40;

      while (userNum > 1)   {
         userNum /= 2;
         System.out.print(userNum + " ");
      }

      System.out.println("");
   }
}