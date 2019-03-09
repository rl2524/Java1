package lecture;

public class NestedLoop {
   public static void main (String [] args) {
      int userNum;
      int i;
      int j;

      userNum  = 3;

      for (i = 0; i <= userNum; i++)   {
         for (j = 0; j < i; j++)   {
            System.out.print(" ");/* Your solution goes here  */
         }
         System.out.println(i);
      }


   }
}