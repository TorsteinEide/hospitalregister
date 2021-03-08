package mappe.del1.hospital.healthpersonal.doctor;
//TODO: Add exceptions

import mappe.del1.hospital.Patient;

/**
 * This class represents a real life surgeon at a hospital
 */
public class Surgeon extends Doctor
{

    /**
     * Constructor initializes an object of class Surgeon
     */
    public Surgeon(String firstName, String lastName, String socialSecurityNumber)
    {
        super(firstName, lastName, socialSecurityNumber);
    }

    /**
     * Sets a patients diagnose
     * @param patient the patient who is to be given a diagnose
     * @param diagnosis the diagnosis to be given to a patient
     */
    public void setDiagnosis(Patient patient, String diagnosis)
    {
        patient.setDiagnosis(diagnosis);
    }











}