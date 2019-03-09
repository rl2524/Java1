package lecture;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;


/**
 * <purpose>
 * this is the whole program
 * 4/23/2018
 * @author rl2524
 */
public class FileReadNums {
   /**
    *
    * @param args unused
    * @throws IOException when something goes horribly wrong with the file
    */
   public static void main (String[] args) throws IOException {
      FileInputStream fileByteStream = null; // File input stream
      Scanner inFS = null;                   // Scanner object
      int fileNum1 = 0;                      // Data value from file
      int fileNum2 = 0;                      // Data value from file

      // Try to open file
      System.out.println("Opening file myfile.txt.");
      fileByteStream = new FileInputStream("myfile.txt");
      inFS = new Scanner(fileByteStream);

      // File is open and valid if we got this far (otherwise exception thrown)
      // myfile.txt should contain two integers, else problems
      System.out.println("Reading two integers.");
      fileNum1 = inFS.nextInt();
      fileNum2 = inFS.nextInt();

      // Output values read from file
      System.out.println("num1: " + fileNum1);
      System.out.println("num2: " + fileNum2);
      System.out.println("num1+num2: " + (fileNum1 + fileNum2));

      // Done with file, so try to close it
      System.out.println("Closing file myfile.txt.");
      fileByteStream.close(); // close() may throw IOException if fails

      return;
   }
}