package ch04lab2;

import java.util.Random;
import java.util.Scanner;

/**
 * Program for pass the pig until you lose.
 * 03/01/2018
 * @author Ramiro
 */
public class PassThePigs {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);//variable for user input.
        Random randGen = new Random();//variable for random numbers.

        final String SIDER_WITHNODOT = "Sider(nodot)";//name for Sider with dot
        final String SIDER_WITHDOT = "Sider(dot)";//name for Sider with no dot.
        final String TROTTER_ONFOURLEGS = "Trotter";//name for trotter.
        final String SNOUTER_ONNOSE = "Snouter";//name for snouter.
        final String RAZOR_BACK = "Razorback";//name for razorback.
        final String LEANING_JOWLER = "Leaning";//name for jowler.

        final int WITH_OUT = 0;//the amount of points you get.
        final int WITH_DOT = 0;//the amount of points you get.
        final int TROTTER_NUM = 5;//the amount of points you get.
        final int RAZOR_NUM = 5;//the amount of the points you get.
        final int SNOUTER_NUM = 10;//the amount points you get.
        final int LEANING_NUM = 15;//the amount of points you get.

        final int NODOT_PROB = 33;//the probably of rolling this.
        final int DOT_PROB = 66;//the probably of rolling this.
        final int TROTTER_PROB = 76;//the probability of rolling this.
        final int RAZOR_PROB = 96;//the probability of rolling this.
        final int SNOUT_PROB = 99;//the probability of rolling this.
        final int LEANING_PROB = 100;//the probability of rolling this.
        String pigOne = "";//name of the first pig.
        String pigTwo = "";//name of the second pig.
        String bothPigs = (pigOne + " && " + pigTwo);
        int scoreOne = 0;//name for the score of pig one.
        int scoreTwo = 0;//name for the score of pig two.

        int numRolled = 0;//the sum of the two pigs.
        int totalScore = 0;//the total points.
        int ranNum;//name for random numbers.
        String userAns = "";//name of the user input.
        char ansYes = 'Y';//if user answer yes.
        char ansNo = 'N';//if user answer no.

        do {//will run the output of both pigs depending on the random number.
            System.out.print("Rolling... ");

            ranNum = randGen.nextInt(100);
            if (ranNum < NODOT_PROB) {
                pigOne = SIDER_WITHNODOT;
                scoreOne = WITH_OUT;
            }

            if (ranNum < DOT_PROB) {
                pigOne = SIDER_WITHDOT;
                scoreOne = WITH_DOT;
            } else if (ranNum < TROTTER_PROB) {
                pigOne = TROTTER_ONFOURLEGS;
                scoreOne = TROTTER_NUM;
            } else if (ranNum < RAZOR_PROB) {
                pigOne = RAZOR_BACK;
                scoreOne = RAZOR_NUM;

            } else if (ranNum < SNOUT_PROB) {
                pigOne = SNOUTER_ONNOSE;
                scoreOne = SNOUTER_NUM;
            } else if (ranNum < LEANING_PROB) {
                pigOne = LEANING_JOWLER;
                scoreOne = LEANING_NUM;
            }


            ranNum = randGen.nextInt(100);
            if (ranNum < NODOT_PROB) {
                pigTwo = SIDER_WITHNODOT;
                scoreTwo = WITH_OUT;
            }
            if (ranNum < DOT_PROB) {
                pigTwo = SIDER_WITHDOT;
                scoreTwo = WITH_DOT;
            } else if (ranNum < TROTTER_PROB) {
                pigTwo = TROTTER_ONFOURLEGS;
                scoreTwo = TROTTER_NUM;
            } else if (ranNum < RAZOR_PROB) {
                pigTwo = RAZOR_BACK;
                scoreTwo = RAZOR_NUM;

            } else if (ranNum < SNOUT_PROB) {
                pigTwo = SNOUTER_ONNOSE;
                scoreTwo = SNOUTER_NUM;
            } else if (ranNum < LEANING_PROB) {
                pigTwo = LEANING_JOWLER;
                scoreTwo = LEANING_NUM;
            }


            numRolled = scoreOne + scoreTwo;//score of both pigs.
            System.out.println(pigOne + " && " + pigTwo);//prints the outcome of both pigs
            if ((pigOne.equals(SIDER_WITHDOT)) && (pigOne.equals(SIDER_WITHDOT))) {//if both pigs are the same then the score doubles
                numRolled = (scoreOne + scoreTwo) + 1;
            }
            if (pigOne.equals(pigTwo)) {
                numRolled = (scoreOne + scoreTwo) * 2;
            } else if (bothPigs.equals(SIDER_WITHNODOT)) {
                numRolled = (scoreOne + scoreTwo) + 1;


                totalScore += numRolled;//sum of the rounds or multiple rounds
                System.out.println("This roll: " + numRolled);//the points of the roll of both pigs.
                System.out.println("This Turn: " + totalScore);//the total of both pigs.
                System.out.print("Roll again " + ansYes + "/" + ansNo + ": ");//ask if user wishes to continue.
                userAns = scnr.next();//user input.


            }
        } while (userAns.equals("Y"));//will continue as long as it is true.


    }
}

