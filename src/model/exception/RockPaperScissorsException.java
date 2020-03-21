package model.exception;

public class RockPaperScissorsException extends RuntimeException {

    public RockPaperScissorsException() {
        super();
    }

    public RockPaperScissorsException(String message) {
        super(message);
    }

    public RockPaperScissorsException(String message, Throwable cause) {
        super(message, cause);
    }

    public RockPaperScissorsException(Throwable cause) {
        super(cause);
    }

    protected RockPaperScissorsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
