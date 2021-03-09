package mappe.del1.hospital;

import mappe.del1.hospital.exception.RemoveException;


/**
 * This class represents a simple client
 */
public class HospitalClient
{

    /**
     *
     */
    public static void main(String[] args)
    {
        //initializes a hospital object and fills with test data
        Hospital hospital = new Hospital("Hospital");

        HospitalTestData.fillRegisterWithTestData(hospital);
        Department department = hospital.getDepartment("Akutten");

        //Assignes a variable to a registered person
        Employee oddEvenPrimtallet = department.getEmployees().get("12345678901");

        //Removed said person from the department register
        try {
            department.remove(oddEvenPrimtallet);
            System.out.println("Person was successfully removed!");

        } catch (RemoveException e)
        {
            System.out.println("This person is not registered in this department..");
        }

        //initializes an object of a person that does not exist in the department register
        Patient stineSyk = new Patient("Stine", "Syk", "12345678996");

        //Removes a person not assigned to the register
        try {
            department.remove(stineSyk);
            System.out.println("Person was successfully removed!");
        } catch (RemoveException e) {
            System.out.println("This person is not registered in this department..");
        }
    }


}





