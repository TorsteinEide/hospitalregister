package folder1.idata2001;

/**
 * This class represents a real life patient at a real life hospital
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
        super(firstName, lastName,socialSecurityNumber);
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
        this.diagnosis = diagnosis;
    }

    //TODO: add toString redefinition

}