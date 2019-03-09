package lecture;

import java.util.Scanner;

public class FindMatchValue {
   public static void main (String [] args) {
     // final int NUM_VALS = 4;
      int[] userValues = {2,2,1,1};
      int i;
      int matchValue;
      int numMatches = -99; // Assign numMatches with 0 before your for loop

      userValues[0] = 2;
      userValues[1] = 2;
      userValues[2] = 1;
      userValues[3] = 2;

      matchValue = 2;

      /* Your solution goes here  */
      /*numMatches = 0;
     for(i = 0; i < userValues.length; i++)   {
         if(userValues [i] == matchValue)   {
            numMatches++;
         }

      }*/

      for(i = userValues.length; i >= 0; i--)   {
         if (userValues[i] == matchValue)   {
            numMatches--;
         }
      }

      System.out.println("matchValue: " + matchValue + ", numMatches: " + numMatches);
   }
}