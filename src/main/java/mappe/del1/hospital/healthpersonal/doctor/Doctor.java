package mappe.del1.hospital.healthpersonal.doctor;
//TODO: Add exceptions

import mappe.del1.hospital.Employee;
import mappe.del1.hospital.Patient;

/**
 * This class represents a real life doctor at a real life hospital
 */
public abstract class Doctor extends Employee
{

    /**
     * Constructor initializes an object of class Doctor
     * @param firstName
     * @param lastName
     * @param socialSecurityNumber
     */
    protected Doctor(String firstName, String lastName, String socialSecurityNumber)
    {
        super(firstName, lastName, socialSecurityNumber);
    }

    /**
     * Sets a diagnosis for a patient
     * @param patient the patient who is to be given a diagnose
     * @param diagnosis the diagnosis to be given to a patient
     */
    public abstract void setDiagnosis(Patient patient, String diagnosis);
}