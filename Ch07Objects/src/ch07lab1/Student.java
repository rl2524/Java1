package ch07lab1;

/**
 *  Stores first name, last name and gpa
 * @author Ramiro
 * @author Jim
 * @author Jacob M
 */

public class Student {
    private String lastName;    //variable name for lastname
    private String firstName;   //variable name for firstname
    private double gpa;         //variable name for gpa

    /**
     * gets last name
     * @return  the lastName
     */
    public String getLastName() {
        return lastName;

    }

    /**
     * sets student lastName
     * @param lName lastName
     */
    public void setLastName(String lName) {
        lastName = lName;

    }

    /**
     * get first name
     * @return  the fistName
     */
    public String getFirstName() {
        return firstName;

    }

    /**
     * sets first Name
     * @param fName firstName
     */
    public void setFirstName(String fName) {
        firstName = fName;

    }

    /**
     * gets gpa
     * @return the Gpa as a double
     */
    public double getGpa() {
        return gpa;

    }

    /**
     *Sets student gpa and corrects it if value is over/under
     * @param studentGpa student gpa
     */
    public void setGpa(double studentGpa){
        if (studentGpa >= 0 && studentGpa <=4.0){
            gpa= studentGpa;
        }
        else if(studentGpa < 0){
            gpa = 0.0;
        }
        else if (4.0 < studentGpa){
            gpa = 4.0;
        }

    }
}
