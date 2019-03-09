package lecture;
import java.util.Scanner;

public class ConvertToGreek {
   public static void main (String [] args) {
      char origLetter;

      origLetter = 'a';

      switch (origLetter)   {
         case 'a': case 'A':
            System.out.println("Alpha");
            break;
         case 'b': case 'B':
            System.out.println("Beta");
            break;
         default:
            System.out.println("Unknown");
            break;
      }/* Your solution goes here  */
   }
}