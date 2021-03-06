package mappe.del1.hospital;

/**
 * This class represents a real life patient at a real life hospital who is to be
 * diagnosed.
 *
 * @author Torstein Eide
 * @version 0.1
 */
public class Patient extends Person implements Diagnosable
{
    private String diagnosis = "";

    /**
     * Constructor initializes an object of class Patient
     * @param firstName first name of a patient
     * @param lastName last name of a patient
     * @param socialSecurityNumber social security number of a patient
     */
    protected Patient(String firstName, String lastName, String socialSecurityNumber)
    {
        super(firstName, lastName, socialSecurityNumber);
    }

    /**
     * returns the diagnosis given to a patient
     * @return the diagnosis given to a patient
     */
    protected String getDiagnosis()
    {
        return diagnosis;
    }

    /**
     * Sets a diagnosis for a patient
     * @param diagnosis diagnosis of a patient
     */
    public void setDiagnosis(String diagnosis)
    {
        if(diagnosis.isBlank())
        {
            throw new IllegalArgumentException("Diagnosis cannot be empty or null");
        }

        this.diagnosis = diagnosis;
    }

    /**
     * redefines toString for class Patient
     * returns a redefined toString
     * @return a redefined toString
     */
    @Override
    public String toString()
    {
        String newToString = "Patient: " + getFullName() + "Social security number: " + getSocialSecurityNumber() + "Diagnose: " + getDiagnosis();
        return newToString;
    }
}