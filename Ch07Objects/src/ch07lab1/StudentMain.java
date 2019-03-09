package ch07lab1;

import java.util.Scanner;

/** Programs ask for user's first and last name and gpa and prints it out
 * 04/11/2018
 * @author Ramiro
 * @author Jim
 * @author Jacob M
 */

public class StudentMain {

    // for user input
    public static Scanner scnr = new Scanner(System.in);

    /**
     * calls methods in Student class to get student info
     * @param args
     */
    public static void main(String[] args) {

        //an array for student
        Student [] student;

        //a variable to store the number of student
        int numStudent;

        //Asking for the number of students
        System.out.print("Enter number of students: ");
        //user's input
        numStudent = scnr.nextInt();

        //stores the information into the array
        student = new Student [numStudent];

        //will ask for user info depending on the amount of students
        for (int i = 0; i < numStudent; i++) {
            //create a new student
            student[i] = new Student();

            //ask for the first name of the student
            System.out.print("Enter the first name of Student #" + (i+ 1) + ":");
            //user's input for first name
            student[i].setFirstName(scnr.next());

            //ask for the last name of the student
            System.out.print("Enter the last name of Student #" + (i +1) + ":");
            //user's input for last name
            student[i].setLastName(scnr.next());

            //ask for the gpa of the student
            System.out.print("Enter the GPA of Student #" + (i +1 ) + ":");
            //user's input for the gpa
            student[i].setGpa(scnr.nextDouble());
            }
        //will print all of the info of the amount of students the user inputted
        for(int i =0; i < student.length; i++){
            System.out.println(student[i].getFirstName() + " " + student[i].getLastName() +
                                   " GPA: " + student[i].getGpa());
        }
        }




    }


