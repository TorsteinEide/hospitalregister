package mappe.del1.hospital.healthpersonal.doctor;

import mappe.del1.hospital.Patient;


/**
 * This class represents a real life general practitioner at a real life hospital
 *
 * @author Torstein Eide
 * @version 0.1
 */
public class GeneralPractitioner extends Doctor
{

    /**
     * Constructor initializes an object of class GeneralPractitioner
     * @param firstName first name of the general practitioner
     * @param lastName last name of the general practitioner
     * @param socialSecurityNumber social security number of the general practitioner
     */
    public GeneralPractitioner(String firstName, String lastName, String socialSecurityNumber)
    {
        super(firstName, lastName, socialSecurityNumber);
    }

    /**
     * Sets a patients their diagnose
     * @param patient the patient who is to be given a diagnose
     * @param diagnosis the diagnosis to be given to a patient
     */
    @Override
    public void setDiagnosis(Patient patient, String diagnosis)
    {
        patient.setDiagnosis(diagnosis);
    }





}