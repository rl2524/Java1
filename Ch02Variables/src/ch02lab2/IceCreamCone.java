package ch02lab2;
import java.util.Scanner;

/**
 * 1/31/2018
 * @author Ramiro Rojas
 * @author Roberto Quinones
 **/
public class IceCreamCone {
   public static void main (String [] args){
      Scanner scnr = new Scanner(System.in);//

      String flavorType;  // type of ice cream flavor
      double coneHeight;  // the height of the cone's height
      double coneDiameter;  // the diameter of the cone
      String iceQuote;// will say i like  user input ice cream

      // Get's the user's input of favorite flavor, the height of the cone and the diameter.
      System.out.print("What is your favorite ice cream flavor?");
      flavorType = scnr.next();

      System.out.print("Enter the height of an ice cream cone: ");
      coneHeight = scnr.nextDouble();

      System.out.print("Enter the diameter of an ice cream cone: ");
      coneDiameter = scnr.nextDouble();

      // it will print the upper case and the length of letter's of the user's favorite ice cream.
      iceQuote = ("I like " + flavorType + " ice cream!");

      System.out.println(iceQuote);
      System.out.println(iceQuote.toUpperCase());
      System.out.println("There are " + flavorType.length() +
                             " letters in " + "\"" + flavorType + "\"" + ".");


      //The math for volume of the ice cream
      double theRadius = coneDiameter * 1/2; // finding the radius
      double piValue = Math.PI; //variable for the value fo Pi
      double iceVolume = (1.0/3.0) * piValue * Math.pow(theRadius, 2) * coneHeight;

      // The final results will print
      System.out.print("An ice cream cone of that size will hold this much "
                           + flavorType + " ice cream: " + iceVolume);







   }
}
