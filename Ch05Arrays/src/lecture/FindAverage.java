package lecture;

/**
 * <purpose>
 * 3/19/2018
 * @author rl2524
 */
public class FindAverage {
   public static void main (String [] args) {
      final int SIZE_LIST = 4;
      int[] keysList = new int[SIZE_LIST];
      int sum;
      double average;
      int i;

      keysList[0] = 45;
      keysList[1] = 105;
      keysList[2] = 101;
      keysList[3] = 100;


      /* Your solution goes here  */
      sum = 0;
      for(i = 0; i < keysList.length; i++) {
         sum += keysList[i];
      }

      average = (double) sum / keysList.length;
      System.out.println("the average is: " + average);
   }
}

