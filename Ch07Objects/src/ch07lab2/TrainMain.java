package ch07lab2;


import java.util.Scanner;



/**
 * Get user input and place it into an ArrayList. Asking for number of containers
 * 4/18/2018
 * @author Ramiro
 * @author Jim
 * @author Jacob M.
 */
public class TrainMain {
   //for user input
   private static Scanner scnr = new Scanner(System.in);

   /**
    *prints the methods
    * @param args
    */
   public static void main(String[] args) {
      //the array list
      Train train = new Train();

      //gets container
      getContainers(train);

      //unloads container
      unloadTrain(train);

      //train.setContainer(1,"orange"); used to test setContainer

   }

   /**
    *ask the user for the number of containers
    * @return the  number of containers
    */
   public static int getNumContainers() {

      // variable for the number of containers
      int numContainer;

      //will ask the user for the number of train. If a negative number will ask again
      do {

         System.out.print("How many containers are on the train? (positive number)");
         numContainer = scnr.nextInt();
      } while (numContainer <= 0);
      return numContainer;

   }

   /**
    *Asking what is in the containers
    * @param train name of the array list
    */
   public static void getContainers(Train train) {

      //setting the variable
      int numContainers = getNumContainers();

      //begins output
      for (int i = 0; i < numContainers; i++) {
         System.out.print("What is in container #" + (i + 1) + "?");
         train.addContainer(scnr.next());
      }

   }

   /**
    *Asking if you what to unload it from the front or the back
    * @param train name of the array list
    */
   public static void unloadTrain(Train train) {

      //asking for which way to unload
      System.out.print("Unload from the front or back f/b?");

      //stores user answer
      char answer = scnr.next().charAt(0);

      //calls reverse value
      if (answer == 'f') {
         for (int i = 0; i < train.length(); i++) {
            System.out.println("Unloading " + train.getContainer(i) + ".");
         }
      }
      //begins output
      else {

         for (int i = train.length() - 1; i >= 0; i--) {

            System.out.println("Unloading " + train.getContainer(i) + ".");
         }
      }

   }
}
