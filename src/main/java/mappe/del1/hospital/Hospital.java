package mappe.del1.hospital;
import java.util.HashMap;
//TODO: Add exceptions

/**
 * This class represents a real life hospital where employees are working and patients being treated
 */
public class Hospital {
    private final String hospitalName;
    private HashMap<String, Department> departments;

    /**
     * Constructor initializes an object of class Hospital
     * @param hospitalName name of the hospital
     */
    public Hospital(String hospitalName)
    {
        this.hospitalName = hospitalName;
        this.departments = new HashMap<>();
    }

    /**
     * returns the hospital name
     * @return the hospital name
     */
    public String getHospitalName()
    {
        return hospitalName;
    }

    /**
     * returns departments
     * @return departments
     */
    public HashMap<String, Department> getDepartments()
    {
        return departments;
    }

    /**
     * Adds a department to the list of departments
     * @param department the department to be added
     */
    public void addDepartment(Department department)
    {
        departments.put(department.getDepartmentName(), department);
    }

    /**
     * Redefines toString for class Hospital
     * returns a redefined toString
     * @return a redefined toString
     */
    public String toString()
    {
        String newToString = "Hospital name: " + hospitalName;
        return newToString;
    }
















}
