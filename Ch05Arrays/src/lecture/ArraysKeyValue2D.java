package lecture;

import java.util.Scanner;

public class ArraysKeyValue2D {
   public static void main (String [] args) {
      final int NUM_ROWS = 2;
      final int NUM_COLS = 2;
      int [][] milesTracker = new int[NUM_ROWS][NUM_COLS];
      int i;
      int j;
      int maxMiles; // Assign with first element in milesTracker before loop
      int minMiles ; // Assign with first element in milesTracker before loop

      milesTracker[0][0] = -10;
      milesTracker[0][1] = 20;
      milesTracker[1][0] = 30;
      milesTracker[1][1] = 40;

      /* Your solution goes here  */
      minMiles = maxMiles = milesTracker [0][0];
      for(i = 0; i < milesTracker.length; i++) {
         for (j = 0; j < milesTracker[i].length; j++) {
            if (minMiles > milesTracker[i][j]) {
               minMiles = milesTracker[i][j];
            }
            if (maxMiles < milesTracker[i][j]) {
               maxMiles = milesTracker[i][j];
            }
         }
      }

      System.out.println("Min miles: " + minMiles);
      System.out.println("Max miles: " + maxMiles);
   }
}