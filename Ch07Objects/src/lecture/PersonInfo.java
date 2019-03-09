package lecture;

/**
 * <purpose>
 * 4/9/2018
 * @author rl2524
 */
public class PersonInfo  {
   private int numKids;

   public void setNumKids(int personsKids) {
      numKids = personsKids;
      return;
   }

   public void incNumKids() {
      numKids = numKids + 1;
      return;
   }

   public int getNumKids() {
      return numKids;
   }
}
// ===== end =====
