package lecture;



/**
 * <purpose>
 * 4/9/2018
 * @author rl2524
 */
public class CongressMain {
   public static void main(String[] args) {
      CongressEligibility roberto = new CongressEligibility();
      CongressEligibility bunguiu = new CongressEligibility();


      System.out.println(roberto.getAge() + " " + roberto.getYearCitizen());
      roberto.setAge(27);
      roberto.setYearCitizen(roberto.getAge());
      System.out.println(roberto.getAge() + " " + roberto.getYearCitizen());


      bunguiu.setAge(19);
      bunguiu.setYearCitizen(19);
      System.out.println(bunguiu.getAge() + " " + bunguiu.getYearCitizen());

      System.out.println("Roberto:");
      printEligibility(roberto);

      System.out.println("Bunguiu:");
      printEligibility(bunguiu);


   }

   private static void printEligibility(CongressEligibility person)   {
      System.out.println("house eligible: " + person.isHouseEligible());
      System.out.println("senate eligible: " + person.isSenateEligible());

   }
}
