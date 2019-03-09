package ch03lab2;
import java.util.Scanner;
/**
 * Finding if the user's input is a valid part number.
 * 2/14/2018
 * @author Ramiro
 * @author Andrew L
 */
public class ValidPartNumber {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);//variable to get the input of the user.

      String  partNumberInput;// variable name for the part number.
      String partNumberSub;//creates the string variable for the substring.
      final int PART_LENGTH = 6;// final variable for the part number length.
      boolean   isValid = true;// to determine if its true or false.


      System.out.print("Please enter in a part number: ");
      partNumberInput = scnr.nextLine();//input of the user's part number.
      partNumberSub = partNumberInput.substring(0, 2);//Substring of the first two characters.


      switch (partNumberSub) { //Checking for first two characters.
         case "SR":
            break;
         case "SD":
            break;
         case "TU":
            break;
         case "TR":
            break;
         default:
            isValid = false;

            break;

      }
      if (partNumberInput.length() != PART_LENGTH) {//Checking to see if length equals 6.
         isValid = false;
      }
      else {//Checking to see if it has a dash on the third character.

         if (partNumberInput.charAt(2) != '-') {
            isValid = false;
         }
         else {//Checking last three characters to confirm they are digits.
            if (!Character.isDigit(partNumberInput.charAt(3))) {
               isValid = false;

            }
            else if (!Character.isDigit(partNumberInput.charAt(4))) {
               isValid = false;

            }
            else if (!Character.isDigit(partNumberInput.charAt(5))) {
               isValid = false;
            }

         }


      }if (isValid) {//if it's  a valid part number print this statement
         System.out.println("The part number " + partNumberInput + " you entered is valid.");
      }
      else {//if it's a invalid part number print this statement.
         System.out.println("The part number " + partNumberInput + " you entered is not valid.");
      }
   }
}