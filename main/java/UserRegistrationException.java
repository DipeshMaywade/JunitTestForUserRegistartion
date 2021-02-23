
public class UserRegistrationException extends Exception {

    enum ExceptionType {
        NullType,EmptyType
    }

    ExceptionType type;

    public UserRegistrationException(String message,ExceptionType type) {
        super(message);
        this.type= type;
    }

}