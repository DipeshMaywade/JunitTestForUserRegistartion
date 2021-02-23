
public class MoodAnalyserException extends Exception {
    enum ExceptionType {
        NullType,EmptyType
    }
    ExceptionType type;
    public MoodAnalyserException(String message,ExceptionType type) {
        super(message);
        this.type= type;
    }
}