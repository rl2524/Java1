package ch05lab2;

import java.util.Scanner;

/**
 * Will print the amount of containers and what it contains  depending on the user's input.
 * 3/19/2018
 * @author Ramiro
 */
public class ArrayTrain {
   public static void main(String[] args) {

      //variable to get the user's input.
      Scanner  scnr = new Scanner(System.in);

      //user's answer for the amount of containers.
      int      userAns;

      //the number assign to the amount of containers that the user inputs.
      String[] containerNum;

      //asking the user for number of container.
      int      initialNum;


      //asking user for the amount of containers on train.
      System.out.println("How many containers are in the train? ");
      //the user's answer.
      userAns = scnr.nextInt();

      //the arrays that will be assign depending on user's answer.
      containerNum = new String[userAns];

      //asking the user for what each container contains.
      for (initialNum = 0; initialNum < userAns; initialNum++) {
         System.out.print("What is in container #" + (initialNum + 1) + "?");
         containerNum[initialNum] = scnr.next();
      }
      //printing everything in reverse.
      for (initialNum = containerNum.length - 1; initialNum >= 0; initialNum--) {
         System.out.println("Unloading " + containerNum[initialNum] + ".");
      }

   }

}
