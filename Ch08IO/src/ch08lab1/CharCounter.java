package ch08lab1;
import java.io.*;
import java.util.Scanner;

/**
 * Ask user for input?output files
 * counts the lines and characters in the input file
 * Then writes/displays the line/character count in the output file
 * 4/25/2018
 * @author Ramiro
 * @author Jacob M
 * @author Jim
 */
public class CharCounter {
   //for user input
   public static Scanner scnr = new Scanner(System.in);

   /**
    * Runs the program
    * @param args unused
    * @throws IOException
    */
   public static void main(String[] args) throws IOException{
      //the input file
      FileInputStream  inFile;

      //
      FileOutputStream outFile;

      //the output file
      String           message;

      inFile = getinfile();
      if(inFile!= null){
         outFile = getoutfile();
         message = readAndWrite(inFile, outFile);
         System.out.println(message);
      }




   }

   /**
    *Ask the uer for the input file
    * @return the inFile
    * @throws FileNotFoundException
    */

   public static FileInputStream getinfile() throws FileNotFoundException {
      System.out.print("Enter the name of the input file: ");
      String input = scnr.next();
      FileInputStream inFile = new FileInputStream(input);
      return inFile;


   }

   /**
    *Ask the user for the output file
    * @return the outFile
    * @throws FileNotFoundException
    */
   public static FileOutputStream getoutfile() throws FileNotFoundException{
      System.out.print("Enter the name of the output file: ");
      String output = scnr.next();
      FileOutputStream outFile = new FileOutputStream(output);
      return outFile;

   }

   /**
    *Counts line and character from input file then writes to output file
    * @param infile the input file
    * @param outfile the output file
    * @return message for main
    */
   public static String readAndWrite(FileInputStream infile, FileOutputStream outfile){
      //user input
      Scanner inFS = new Scanner(infile);

      //user output
      PrintWriter outFS = new PrintWriter(outfile);

      //variable name for a string of characters
      String charTotal;

      //variable name for total of line
      int lineTotal = 0;

      //variable name for total of characters
      int totalChars= 0;

      //begins writing output
      while(inFS.hasNextLine()){
         charTotal = inFS.nextLine();
         outFS.printf("%-5d %5d %n", lineTotal,charTotal.length());
         lineTotal++;
         totalChars += charTotal.length();


      }
      //flush the output
      outFS.flush();
      //closes the  output
      outFS.close();


      return "The input file has " + lineTotal + " lines and " + totalChars + " total characters.";
   }

}
