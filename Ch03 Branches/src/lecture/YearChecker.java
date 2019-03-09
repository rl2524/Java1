package lecture;

import java.util.Scanner;

public class YearChecker {
   public static void main (String [] args) {
      int givenYear = 0;

      givenYear = 1776;

     if (givenYear >= 2100)   {
        System.out.print("Distant future");/* Your solution goes here  */
     }
     else if (givenYear >= 2000)   {
        System.out.print("21st Century");
     }
     else if (givenYear >= 1900)   {
        System.out.print("20th Century");
     }
     else   {
        System.out.print("Long ago");
     }

      return;
   }
}