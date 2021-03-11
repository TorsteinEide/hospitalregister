package mappe.del1.hospital;

/**
 * This class represents a real life employee at a real life hospital
 *
 * @author Torstein Eide
 * @version 0.1
 */
public class Employee extends Person
{

    /**
     * Constructor initializes an object of class Employee
     * @param firstName first name of employee
     * @param lastName last name of employee
     * @param socialSecurityNumber social security number of employee
     */
    public Employee(String firstName, String lastName, String socialSecurityNumber)
    {
        super(firstName, lastName, socialSecurityNumber);
    }

    /**
     * redefines toString for class Employee
     * returns the new toString
     * @return the new toString
     */
    @Override
    public String toString()
    {
        String newToString = "Name of employee: " + getFirstName() + " " + getLastName() + "\n Social security number: " + getSocialSecurityNumber();
        return newToString;
    }

}