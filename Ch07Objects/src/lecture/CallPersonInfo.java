package lecture;

/**
 * <purpose>
 * 4/9/2018
 * @author rl2524
 */
public class CallPersonInfo {
   public static void main (String [] args) {
      PersonInfo person1 = new PersonInfo();

      person1.setNumKids(3);

      /* Your solution goes here  */

      System.out.print("Kids: " + person1.getNumKids());
      person1.incNumKids();
      System.out.println("New baby, kids now: " + person1.getNumKids());
      return;
   }
}
// ===== end =====