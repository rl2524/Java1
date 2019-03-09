package ch02lab1;
import java.util.Scanner;
/**
 * <purpose>
 * 1/24/2018
 * @author Ramiro Rojas
 * @author Roberto Quinones
 * @author Michael Simonetti
 */
public class TrainWeight {
   public static void main (String [] args){
      Scanner scnr = new Scanner(System.in);

      final double GEAC60000CW_WEIGHT = 423000.00;  //weight of the locomotive
      final double EMPTY_TRAIN_CART = 58000.00;     //weight of an empty train cart

      int locomotiveWeight;  //number of locomotives
      int cartWeight;  //number of empty train cart
      double totalWeight;  //total weight of locomotive and empty train cart




      System.out.print("Please enter the number of engines for this train: ");//user input
      locomotiveWeight = scnr.nextInt();  //user imputs number of locomotives
      System.out.print("Please enter the number of cars for this train: ");
      cartWeight = scnr.nextInt();  //user imputs number of empty carts
      totalWeight = locomotiveWeight * GEAC60000CW_WEIGHT + cartWeight * EMPTY_TRAIN_CART;
      //equation for the total of weight

      System.out.println("The total empty weight of the train is : " + totalWeight);


   }
}

