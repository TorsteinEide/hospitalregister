package mappe.del1.hospital.exception;

/**
 *
 */
public class RemoveException extends Exception
{
    private static final Long serialVersionUID = 1L;

    /**
     * Constructor initializes an object of class RemoveException
     * @param exceptionMessage message for exception
     */
    public RemoveException(String exceptionMessage)
    {
        super(exceptionMessage);
    }

}
