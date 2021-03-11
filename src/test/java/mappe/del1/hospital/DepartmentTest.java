package mappe.del1.hospital;

import mappe.del1.hospital.exception.RemoveException;
import mappe.del1.hospital.healthpersonal.Nurse;
import mappe.del1.hospital.healthpersonal.doctor.Surgeon;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;


/**
 * Class responsible for making sure that the remove-method in class Department works as intended
 */
public class DepartmentTest {

    /**
     * Tests if a person can be successfully removed
     */
    @Test
    public void testIfPersonIsSuccessfullyRemoved()
    {
        //initializes a department
        Department testDepartment = new Department("test department");

        //initializes employees and add them to register
        Surgeon surgeonJens = new Surgeon("Jens", "Storbu", "123456789333");
        Nurse nurseJakob = new Nurse("Jakob", "Lillebu", "123431253333");
        testDepartment.addEmployee(surgeonJens);
        testDepartment.addEmployee(nurseJakob);

        //initializes patients and adds them to patient register
        Patient patientStine = new Patient("Stine", "Syk", "391857373841");
        testDepartment.addPatients(patientStine);


        try {
            testDepartment.remove(surgeonJens);
            testDepartment.remove(nurseJakob);
            testDepartment.remove(patientStine);
            assertTrue(true);

        } catch (RemoveException e) {
            fail("Person does not exist in register");
        }
    }

    /**
     * Tests what happens if a person is not successfully removed (does not exist in register)
     */
    @Test
    public void testIfPersonIsNotSuccessfullyRemoved()
    {
        Department testDepartment = new Department("test department");
        Patient patientStine = new Patient("Stine", "Syk", "391857373841");

        try{
            testDepartment.remove(patientStine);
            fail("Person does not exist in register");
        } catch (RemoveException e) {
            assertTrue(true);
        }
    }
}
