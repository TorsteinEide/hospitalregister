package folder1.idata2001;
import java.util.HashMap;
import java.util.List;

/**
 * This class represents a real life department at a real life hospital where patients are being treated and employees are working
 */
public class Department {
    private String departmentName;
    private HashMap<String, Patient> patients;
    private HashMap<String, Employee> employees;

    /**
     * Constructor initializes an object of class Department
     * @param departmentName name of department
     */
    public Department(String departmentName)
    {
        this.departmentName = departmentName;
    }

    /**
     * Sets a new name for a department
     * @param departmentName new name of department
     */
    public void setDepartmentName(String departmentName)
    {
        this.departmentName = departmentName;
    }

    /**
     * returns department name
     * @return department name
     */
    public String getDepartmentName()
    {
        return departmentName;
    }

    /**
     * returns employees
     * @return employees
     */
    public HashMap<String, Employee> getEmployees()
    {
        return employees;
    }

    /**
     * Adds a new employee to the register of employees
     * @param employee the new employee to be added to employee register
     */
    public void addEmployee(Employee employee)
    {
        employees.put(employee.getSocialSecurityNumber(), employee);
    }

    /**
     * returns patients
     * @return patients
     */
    public HashMap<String, Patient> getPatients()
    {
        return patients;
    }

    /**
     * Adds a new patient to the register of patients
     * @param patient the patient to be added to the patient register
     */
    public void addPatients(Patient patient)
    {
        patients.put(patient.getSocialSecurityNumber(), patient);
    }

    /**
     * Removes a given person
     * @param person person to be removed
     */
    public void remove(Person person)
    {

    }

    /**
     * redefines toString for class Department
     * returns a redefined toString for department
     * @return a redefined toString for department
     */
    public String toString()
    {
        String newToString = "Department name: " + getDepartmentName();
        return newToString;
    }



















}
