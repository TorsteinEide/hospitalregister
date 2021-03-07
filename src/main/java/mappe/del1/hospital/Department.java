package mappe.del1.hospital;
import java.util.HashMap;
//TODO: Add exceptions

/**
 * This class represents a real life department at a real life hospital where patients are being treated and employees are working
 */
public class Department {
    private String departmentName;
    private HashMap<String, Patient> patients;
    private HashMap<String, Employee> employees;

    /**
     * Constructor initializes an object of class Department
     *
     * @param departmentName name of department
     */
    public Department(String departmentName) {
        if(departmentName.isBlank())
        {
            throw new IllegalArgumentException("Department name cannot be empty or null");
        }

        this.departmentName = departmentName;
    }

    /**
     * Sets a new name for a department
     *
     * @param departmentName new name of department
     */
    public void setDepartmentName(String departmentName) {
        if(departmentName.isBlank())
        {
            throw new IllegalArgumentException("new department name cannot be empty or null");
        }

        this.departmentName = departmentName;
    }

    /**
     * returns department name
     * @return department name
     */
    public String getDepartmentName() {
        return departmentName;
    }

    /**
     * returns employees
     *
     * @return employees
     */
    public HashMap<String, Employee> getEmployees() {
        return employees;
    }

    /**
     * Adds a new employee to the register of employees
     *
     * @param employee the new employee to be added to employee register
     */
    public void addEmployee(Employee employee) {
        try
        {
            employees.put(employee.getSocialSecurityNumber(), employee);
        } catch (Exception e )
        {
            throw e;
        }
    }

    /**
     * returns patients
     *
     * @return patients
     */
    public HashMap<String, Patient> getPatients() {
        return patients;
    }

    /**
     * Adds a new patient to the register of patients
     *
     * @param patient the patient to be added to the patient register
     */
    public void addPatients(Patient patient) {
        patients.put(patient.getSocialSecurityNumber(), patient);
    }

    /**
     * Removes a given person
     *
     * @param person person to be removed
     */
    public void remove(Person person)
    {
        if(checkForEmployee(person))
        {
            employees.remove(person.getSocialSecurityNumber(), person);
        } else if (checkForPatient(person))
        {
            patients.remove(person.getSocialSecurityNumber(), person);
        } //TODO: Add exception.
    }

    /**
     * Checks if a patient with a social security number is added to the list of patients,
     * if so returns true, if not returns false
     * @param person patient to be checked if already exists in register
     * returns true if patient exists in register, false if not
     * @return true if patient exists in register, false if not
     */
    public boolean checkForPatient(Person person)
    {
        boolean patientFound = false;

        if(patients.containsKey(person.getSocialSecurityNumber()))
        {
            patientFound = true;
        }

        return patientFound;
    }

    /**
     * Checks if a employee with a social security number is added to the list of employees,
     * if so returns true, if not returns false
     * @param person employee to be checked if already exists in register
     * returns true if employee exists in register, false if not
     * @return true if employee exists in register, false if not
     */
    public boolean checkForEmployee(Person person)
    {
        boolean employeeFound = false;

        if(employees.containsKey(person.getSocialSecurityNumber()))
        {
            employeeFound = true;
        }

        return employeeFound;
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
