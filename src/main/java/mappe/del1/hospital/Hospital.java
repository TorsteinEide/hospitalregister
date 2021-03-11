package mappe.del1.hospital;

import java.util.HashMap;

/**
 * This class represents a real life hospital where employees are working and patients being treated
 *
 * @author Torstein Eide
 * @version 0.1
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
        if(hospitalName.isBlank())
        {
            throw new IllegalArgumentException("Hospital name can not be null");
        }
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
     * finds a department object with corresponding name
     * @param departmentName name of department
     * returns an object of department
     * @return an object of department
     */
    public Department getDepartment(String departmentName)
    {
        if(departmentName.isBlank())
        {
            throw new IllegalArgumentException("There are not departments with name null");
        }
        Department department = departments.get(departmentName);
        return department;
    }

    /**
     * Adds a department to the list of departments
     * @param department the department to be added
     */
    public void addDepartment(Department department)
    {
        if(department == null)
        {
            throw new IllegalArgumentException("Department can not be null");
        }
        departments.put(department.getDepartmentName(), department);
    }

    /**
     * Redefines toString for class Hospital
     * returns a redefined toString
     * @return a redefined toString
     */
    @Override
    public String toString()
    {
        String newToString = "Hospital name: " + hospitalName;
        return newToString;
    }
















}
