package lecture;

/**
 * <purpose>
 * 3/19/2018
 * @author rl2524
 */
public class maximum {
   public static void main(String[] args) {
      final int SIZE_LIST = 4;
      int[] keysList = new int[SIZE_LIST];
      double maximum;
      int i;

      keysList[0] = 45;
      keysList[1] = 105;
      keysList[2] = 101;
      keysList[3] = 100;


      //Your solution goes here
      maximum = keysList[0];
      for (i = 0; i < keysList.length; i++) {
         if (keysList[i] > maximum) {
            maximum = keysList[i];

         }


         System.out.println("the Maximum is " + maximum);
      }
   }
}


