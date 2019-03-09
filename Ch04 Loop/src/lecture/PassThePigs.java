package lecture;

import java.util.Random;
import java.util.Scanner;

/**
 * implement one turn of the game of pass the pigs
 * https://docs.google.com/document/d/1zj43T8-b3I8gn-AMNMkX3AYxwjOr_TNk8YIeMTB_yMY/edit?usp=sharing
 * 2016-09-30
 *
 * @author John Maxfield
 */
public class PassThePigs {
   public static void main(String[] args) {
      // points for each roll - doubles are doubled
      final int NO_DOT_SCORE    = 0;               // "sider" with no dot
      final int DOT_SCORE       = 0;               // "sider" with dot
      final int TROTTER_SCORE   = 5;               // on all four legs
      final int RAZORBACK_SCORE = 5;               // four legs up
      final int SNOUTER_SCORE   = 10;              // on nose and front legs
      final int JOWLER_SCORE    = 15;              // nose and ear

      // cut-offs for chance of each roll out of 100
      final int NO_DOT_PCT    = 33;               // 33%
      final int DOT_PCT       = 66;               // 33%
      final int TROTTER_PCT   = 76;               // 10%
      final int RAZORBACK_PCT = 96;               // 20%
      final int SNOUTER_PCT   = 99;               // 3%
      final int JOWLER_PCT    = 100;              // 1%

      // names of rolls
      final String NO_DOT_NAME    = "Sider(no dot)";   // "sider" with no dot
      final String DOT_NAME       = "Sider(dot)";      // "sider" with dot
      final String TROTTER_NAME   = "Trotter";         // on all four legs
      final String RAZORBACK_NAME = "Razorback";       // four legs up
      final String SNOUTER_NAME   = "Snouter";         // on nose and front legs
      final String JOWLER_NAME    = "Leaning Jowler";  // nose and ear

      int    rollValue;                           // a number (0 - 99) representing a roll
      String pig1name = "", pig2name = "";        // the two rolled pigs
      int    rollScore;                           // user's score for this roll
      int    totalScore;                          // total score this and previous rolls

      Random  randGen   = new Random();             // initialize random number generator
      Scanner scnr      = new Scanner(System.in);   // to get user iput
      String  userInput = "n";                      // to store user input

      // do one turn
      // turn ends with a "pig out" (two siders, on opposite sides) or when user stops rolling
      totalScore = 0;
      do {
         rollScore = 0;

         // roll twice
         for (int roll = 0; roll < 2; roll++) {
            // on the first roll, this has no effect
            // on the second roll, it copies pig2name to pig1name
            // (before the big if-else-if assigns it to something new)
            pig1name = pig2name;
            rollValue = randGen.nextInt(JOWLER_PCT);
            if (rollValue < NO_DOT_PCT) {
               pig2name = NO_DOT_NAME;
               rollScore += NO_DOT_SCORE;
            }
            else if (rollValue < DOT_PCT) {
               pig2name = DOT_NAME;
               rollScore += DOT_SCORE;
            }
            else if (rollValue < TROTTER_PCT) {
               pig2name = TROTTER_NAME;
               rollScore += TROTTER_SCORE;
            }
            else if (rollValue < RAZORBACK_PCT) {
               pig2name = RAZORBACK_NAME;
               rollScore += RAZORBACK_SCORE;
            }
            else if (rollValue < SNOUTER_PCT) {
               pig2name = SNOUTER_NAME;
               rollScore += SNOUTER_SCORE;
            }
            else {
               pig2name = JOWLER_NAME;
               rollScore += JOWLER_SCORE;
            }
         }

         System.out.println("Rolling ... " + pig1name + " & " + pig2name);

         // check special combinations
         // first, look for pig out: opposite siders
         if ((pig1name.equals(NO_DOT_NAME) && pig2name.equals(DOT_NAME)) ||
             (pig1name.equals(DOT_NAME) && pig2name.equals(NO_DOT_NAME))) {
            // don't really need to do this: rollScore = 0;
            // don't really need to do this: totalScore = 0;
            System.out.println("Pig out! No score.");
            break;
         }

         // second and third: double the score for matching pigs (1 point for matching siders)
         if (pig1name.equals(pig2name)) {
            rollScore = (rollScore == 0) ? 1 : (rollScore * 2);
         }

         // add to total
         totalScore += rollScore;

         // report and ask to continue
         System.out.println("this roll: " + rollScore + "\nthis turn: " + totalScore);
         System.out.print("Roll again (y/n)? ");
         userInput = scnr.next();
      } while (Character.toLowerCase(userInput.charAt(0)) == 'y');
      System.out.println("Your turn is over.");
   }
}