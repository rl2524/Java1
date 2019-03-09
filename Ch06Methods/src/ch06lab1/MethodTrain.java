package ch06lab1;

import java.util.Scanner;

/**
 * Uses method to get user input and places inside an array then outputs the array.
 * @author Ramiro
 * @author Jacob M
 * @author Jim
 */
public class MethodTrain {
    // for user input
    private static Scanner scnr = new Scanner(System.in);
    // Strings describing contents of containers on train
    public static void main(String[] args) {
        String[] trainContainers;

        // if the command line args exists, use it to load the "train"
        if (args.length > 0) {
            trainContainers = args;             // new reference to command line arguments
            System.out.println("Strings copied from command line.");
        }

        // otherwise, get the train contents from the user
        else {
            trainContainers = getContainers();
        }
        unloadTrain(trainContainers);



    }

    /**
     * Ask for the amount of containers from user input
     * @return Return numContainer as an integer
     */

    public static int getNumContainers() {
        //Num of containers
        int numContainers;


        //get user input for the amount of containers
        do {
            System.out.print("How many containers are in the train? (positive numbers)");
            numContainers = scnr.nextInt();
        }

        while (numContainers <= 0);

        return numContainers;
    }

    /**
     * asking for what is in the containers
     * @return return content for containers as string
     */
    public static String[] getContainers() {
        //Sets array lenght
        String [] nameContainers = new String[getNumContainers()];
        //get user input and assigns value
        for ( int initialNum = 0; initialNum < nameContainers.length; initialNum++) {
            System.out.print("What is in container #" + (initialNum + 1) + "?");
            nameContainers[initialNum] = scnr.next();
        }
        return nameContainers;
    }

    /**
     * Asking the user if he wants the containers to be unloaded from the front or back
     * @param nameVal the name of the array of string
     */

    public static void unloadTrain(String[] nameVal) {

        //Get user input
        System.out.print("Unload from the front or back f/b?" );
        //stores user answer
        char answer = scnr.next().charAt(0);
        // calls reverses value
        if(answer == 'f')   {
           reverseVals(nameVal);

        }
        //begin output
        for (int i = nameVal.length - 1; i >= 0; i--) {

            System.out.println("Unloading " + nameVal[i] + ".");
        }
    }

    /**
     * Reverses the value
     * @param nameVal the name of the array of string
     */

    public static void reverseVals(String[]nameVal) {

            for (int i = 0; i < nameVal.length /2; ++i) {
                String temp = nameVal[i]; // Do swap
                nameVal[i] = nameVal[nameVal.length - 1 - i];
                nameVal[nameVal.length - 1 - i] = temp;
            }

    }
}
