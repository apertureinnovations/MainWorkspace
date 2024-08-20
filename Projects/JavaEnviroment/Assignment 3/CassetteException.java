public class CassetteException extends RuntimeException {

    /**
     * @param e is an error for the cassette - gets sent to user as a runtime exception
     */
    public CassetteException(String e) {
        super(e);
    }
}