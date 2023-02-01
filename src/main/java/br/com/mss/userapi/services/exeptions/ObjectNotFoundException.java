package br.com.mss.userapi.services.exeptions;

/**
 * The type Object not found exception.
 */
public class ObjectNotFoundException extends RuntimeException {

    /**
     * Instantiates a new Object not found exception.
     *
     * @param message the message
     */
    public ObjectNotFoundException(String message) {
        super(message);
    }
}
