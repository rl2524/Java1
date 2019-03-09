package lecture;

import java.util.Scanner;

/**
 * Create columns of characters and their int values
 * 2016-06-16
 * https://docs.google.com/document/d/1zPaopSeztlw_VbM6fajKZ24LYjnftoHXBqjSajoy3Es/edit#
 * @author john maxfield
 */
public class CharacterTables {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);         // for user input
      final int ROWS      = 10;                      // number of rows in table
      final int MIN_VALUE = 0;                       // smallest allowable input
      final int MAX_VALUE = 118;                     // largest allowable input
      int       startValue;                          // first value in table (user input)
      String    userKey;                             // C = continue, Q = quit

      // main loop. do-while because we want to do it at least once
      do {
         // get the user's start point
         System.out.print("Enter a starting integer between " +
                              MIN_VALUE + " and " + MAX_VALUE + ": ");
         startValue = scnr.nextInt();

         // check for invalid value
         if (startValue < MIN_VALUE || startValue > MAX_VALUE) {
            System.out.println("Game over, thank you for playing.");
            break;
         }

         // display two columns: numbers (int) and the corresponding character
         // for loop because we know how many times to do it. (counting)
         for (int i = startValue; i < startValue + ROWS; i++) {
            System.out.println(i + "\t" + (char) i);
         }

         // see if the user wants to quit
         System.out.print("Enter C to continue, Q to quit: ");
         userKey = scnr.next();
         if (userKey.charAt(0) == 'Q') {
            break;
         }
      } while (true);
   }
}