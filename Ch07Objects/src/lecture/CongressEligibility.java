package lecture;

/**
 * <purpose>
 * 4/9/2018
 * @author rl2524
 */
public class CongressEligibility {
   private int age;          //age of the person
   private int yearCitizen; //year of citizen
   public final static int SENATE_AGE_MIN = 30;
   public final static int HOUSE_AGE_MIN = 25;
   public final static int SENATE_YEAR_MIN = 9;
   public final static int HOUSE_YEAR_MIN = 7;

   public CongressEligibility(int personAge, int years){
      //age = personAge;
      this.setAge(personAge);
      //years = years;
      this.setYearCitizen(years);
   }


   public CongressEligibility(){
      this.age = 0;
      this.yearCitizen = 0;

   }



   public void setAge(int age){
      if (age >= 0)   {
         this.age = age;
      }
   }

   public void setYearCitizen(int years)   {
      if (yearCitizen >= 0)   {
         yearCitizen = years;
      }
   }

   public int getAge()  {
      return age;
   }

   public int getYearCitizen()   {
      return yearCitizen;
   }

   public boolean isSenateEligible()   {
      return age >= SENATE_AGE_MIN  && yearCitizen >= SENATE_YEAR_MIN;
   }

   public boolean isHouseEligible()   {
      return age >= HOUSE_AGE_MIN && yearCitizen >= HOUSE_YEAR_MIN;
   }
}






