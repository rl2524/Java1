package lecture;

import java.util.Scanner;

/**
 * Determine whether an input string is a well-formed part number
 * https://docs.google.com/document/d/1aP4Ai2ydJAbWfYvZTpZxl_yJCTrsy16k0INVsLk5R6w/edit?usp=sharing
 * 2016-09-23
 *
 * @author John Maxfield
 */
public class ValidPartNumber2 {
   public static void main(String[] args) {
      final int PN_LENGTH = 6;                        // length of valid part number
      boolean   isValid   = true;                     // whether or not the part number is valid
      Scanner   scnr      = new Scanner(System.in);   // for input
      String    firstTwoCharacters;                   // the first 2 chars of the part number
      String    isOrIsNot;                            // either "is" or "is not"
      String    partNumber;                           // potential part number, entered by user

      System.out.print("Please enter a part number: ");
      partNumber = scnr.next();

      // check for length
      if (partNumber.length() != PN_LENGTH) {
         isValid = false;
      }
      else {    // length OK, check the characters

         // check the first two characters
         firstTwoCharacters = partNumber.substring(0, 2);
         switch (firstTwoCharacters) {
            case "SR":
            case "SD":
            case "TU":
            case "TR":
               break;          // all OK
            default:
               isValid = false;
               break;
         }

         // check for the '-'
         if (partNumber.charAt(2) != '-') {
            isValid = false;
         }

         // check for 3 digits.
         if (!Character.isDigit(partNumber.charAt(3))) {
            isValid = false;
         }
         if (!Character.isDigit(partNumber.charAt(4))) {
            isValid = false;
         }
         if (!Character.isDigit(partNumber.charAt(5))) {
            isValid = false;
         }
      }

      // set a short string
      isOrIsNot = (isValid) ? "is" : "is not";

      // all of the if statements above (beginning with if (partNumber.length() ...
      // could be replaced by this one line, if you were very cool
      // isOrIsNot = (partNumber.matches("(SR|SD|TU|TR)-\\d{3}")) ? "is" : "is not";

      // report
      System.out.println(
          "The part number (" + partNumber + ") you entered " + isOrIsNot + " valid.");
   }
}
