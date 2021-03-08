package mappe.del1.hospital;

import mappe.del1.hospital.exception.RemoveException;

public class Main
{
    public Main()
    {

    }

    public static void main(String[] args) {
        Department department = new Department("test");
        Person person = new Employee("test", "test", "test");
        Employee person2 = new Employee("123", "123", "12319023");
        department.addEmployee(person2);
        try {
            department.remove(person2);
            System.out.println("Person was successfully removed from system");
        } catch (RemoveException e) {
            System.out.println("This person does not exist in the system");
        }
    }






}
