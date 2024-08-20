public class InvalidPasswordException extends RuntimeException {

    /**
     * @param e is an error for passsword - gets sent to user as a runtime exception
     */
    public InvalidPasswordException(String e) {
        super(e);
        
    }
}