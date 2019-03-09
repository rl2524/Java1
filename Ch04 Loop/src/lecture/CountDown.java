package lecture;

import java.util.Scanner;

public class CountDown {
   public static void main (String [] args) {
      int userNum = 0;
      int i = 0;

      userNum = 4;     // Assume positive

      //i = 1;
      //while(i <= userNum)   {
        // System.out.print(i + " ");
         //i = i + 1;
      //}
      for (i = 0; i < userNum; i = i + 1) {
         System.out.print((i + 1) + " ");
      }
      System.out.println("");
   }
}