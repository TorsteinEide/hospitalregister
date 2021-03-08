package mappe.del1.hospital;

import mappe.del1.hospital.healthpersonal.Nurse;
import mappe.del1.hospital.healthpersonal.doctor.GeneralPractitioner;
import mappe.del1.hospital.healthpersonal.doctor.Surgeon;

public class HospitalTestData {

    /**
     * Fills the hospital provided as a parameter with
     * departments and some employees and patients.
     *
     * @param hospital the hospital to be populated with testdata
     */
    public static void fillRegisterWithTestData(final Hospital hospital) {

        // Add some departments
        Department emergencyRoom = new Department("Akutten");
        emergencyRoom.addEmployee(new Employee("Odd Even", "Primtallet", "12345678901"));
        emergencyRoom.addEmployee(new Employee("Huppasahn", "DelFinito", "12345678902"));
        emergencyRoom.addEmployee(new Nurse("Rigmor", "Mortis", "12345678903"));
        emergencyRoom.addEmployee(new GeneralPractitioner("Inco", "Gnito", "12345678904"));
        emergencyRoom.addEmployee(new Surgeon("Inco", "Gnito", "12345678905"));
        emergencyRoom.addPatients(new Patient("Nina", "Teknologi", "12345678906"));
        emergencyRoom.addPatients(new Patient("Ove", "Ralt", "12345678907"));
        hospital.addDepartment(emergencyRoom);

        Department childrensPolyclinic = new Department("Barne poliklinikk");
        childrensPolyclinic.addEmployee(new Employee("Salti", "Kaffen", "1234567898"));
        childrensPolyclinic.addEmployee(new Employee("Nidel V.", "ElvefÃ¸lger", "12345678909"));
        childrensPolyclinic.addEmployee(new Nurse("Anton", "Nym", "12345678900"));
        childrensPolyclinic.addEmployee(new GeneralPractitioner("Gene", "Sis", "12345678991"));
        childrensPolyclinic.addPatients(new Patient("Nanna", "Na", "12345678992"));
        childrensPolyclinic.addPatients(new Patient("Nora", "Toriet", "12345678993"));
        hospital.addDepartment(childrensPolyclinic);
    }
}