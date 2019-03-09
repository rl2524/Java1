package lecture;

import java.util.Scanner;

public class AgeChecker {
   public static void main (String [] args) {
      int userAge;

      userAge = 17;

      if(18 <= userAge && userAge <= 25 ){
         System.out.println("Eligible");
      }
      else{
         System.out.println("Ineligible");
      }

      return;
   }
}