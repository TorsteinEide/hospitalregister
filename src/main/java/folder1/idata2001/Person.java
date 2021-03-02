package folder1.idata2001;

/**
 * This class represents a real life person either employed at a hospital or a patient
 */
public abstract class Person {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    /**
     * constructor initializes an object of class Person
     * @param firstName first name of a person
     * @param lastName last name of a person
     * @param socialSecurityNumber social security number of a person
     */
    public Person(String firstName, String lastName, String socialSecurityNumber)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    /**
     * returns a persons social security number
     * @return a persons social security number
     */
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    /**
     * Sets a new social security number for a person
     * @param newSSN new soscial security number (SSN)
     * returns the new social security number given
     * @return the new social security number given
     */
    public String setSocialSecurityNumber(String newSSN)
    {
        socialSecurityNumber = newSSN;
        return socialSecurityNumber;
    }

    /**
     * sets a new first name for a person
     * @param newFN new first name (FN)
     * returns the new first name given
     * @return the new first name given
     */
    public String setFirstName(String newFN)
    {
        firstName = newFN;
        return firstName;
    }

    /**
     * Sets a new last name for a person
     * @param newLN new last name (LN)
     * returns the new last name given
     * @return the new last name given
     */
    public String setLastName(String newLN)
    {
        lastName = newLN;
        return lastName;
    }

    /**
     * returns the first name of a person
     * @return the first name of a person
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**
     * returns the last name of a person
     * @return the last name of a person
     */
    public String getLastName()
    {
        return lastName;
    }

    /**
     * returns the full name of a person
     * @return the full name of a person
     */
    public String getFullName()
    {
        String fullName = firstName + " " + lastName;
        return fullName;
    }

    /**
     * Redefines toString for class Person
     * returns the new toString
     * @return the new toString
     */
    public String toString()
    {
        String newToString = "Name of person: " + getFirstName() + " " + getLastName() + "\n Social security number: " + getSocialSecurityNumber();
        return newToString;
    }
}