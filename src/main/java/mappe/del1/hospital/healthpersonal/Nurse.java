package mappe.del1.hospital.healthpersonal;

import mappe.del1.hospital.Employee;

/**
 * This class represents a real life nurse at a real life hospital
 *
 * @author Torstein Eide
 * @version 0.1
 */
public class Nurse extends Employee
{

    /**
     * Constructor initializes an object of class Nurse
     * @param firstName first name of Nurse
     * @param lastName last name of Nurse
     * @param socialSecurityNumber Social security number of Nurse
     */
    public Nurse(String firstName, String lastName, String socialSecurityNumber)
    {
        super(firstName, lastName, socialSecurityNumber);
    }

    /**
     * redefines toString for class Nurse
     * returns a redefined toString of class Nurse
     * @return a redefined toString of class Nurse
     */
    @Override
    public String toString()
    {
        String newToString = "Name of nurse: " + getFullName() + "Social security number: " + getSocialSecurityNumber();
        return newToString;
    }

}