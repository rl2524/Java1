package lecture;

import java.util.Scanner;

/**
 * <purpose>
 * 4/16/2018
 * @author rl2524
 */

   public class Comparison {
      private  static  Scanner scnr = new Scanner(System.in);
   public static void main(String[] args) {
      String name = "Cheryl";
      String inputName = scnr.next();
      Integer x = 5;
      if (x == 5){
         System.out.println("x == 5 is true");
      }
      if(name == inputName) {
         System.out.println("same?");
      }
      else{
         System.out.println("different?");
      }
      if (name.equals(inputName)){
         System.out.println("same!");
      }
      else{
         System.out.println("different!");
      }
   }
}

