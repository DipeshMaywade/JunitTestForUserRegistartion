import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegistartionImplement {

    public boolean firstNameValid(String name) throws UserRegistrationException {
        try {
            if (name.isEmpty()){
                throw new UserRegistrationException("Entered value is empty", UserRegistrationException.ExceptionType.EmptyType);
            }
            String regx = "^[A-Z][a-zA-Z]{3,}";
            Pattern pattern = Pattern.compile(regx);
            Matcher matcher = pattern.matcher(name);
            return matcher.matches();
        } catch (NullPointerException e) {
            throw new UserRegistrationException("entered null", UserRegistrationException.ExceptionType.NullType);
        }
    }

    public boolean emailValid(String email) throws UserRegistrationException {
        try {
            if (email.isEmpty()){
                throw new UserRegistrationException("Entered value is empty", UserRegistrationException.ExceptionType.EmptyType);
            }
            String regx = "^abc[a-zA-Z0-9.]*@bl[.]co[.][a-z]{2,3}";
            Pattern pattern = Pattern.compile(regx);
            Matcher matcher = pattern.matcher(email);
            return matcher.matches();
        } catch (NullPointerException e) {
            throw new UserRegistrationException("entered null", UserRegistrationException.ExceptionType.NullType);
        }
    }

    public boolean phoneValid(String phoneNumber) throws UserRegistrationException {
        try {
            if (phoneNumber.isEmpty()){
                throw new UserRegistrationException("Entered value is empty", UserRegistrationException.ExceptionType.EmptyType);
            }
            String regx = "^[0-9]{2}[: :][0-9]{10}";
            Pattern pattern = Pattern.compile(regx);
            Matcher matcher = pattern.matcher(phoneNumber);
            return matcher.matches();
        } catch (NullPointerException e) {
            throw new UserRegistrationException("entered null", UserRegistrationException.ExceptionType.NullType);
        }
    }

    public boolean passwordValid(String password) throws UserRegistrationException {
        try {
            if (password.isEmpty()){
                throw new UserRegistrationException("Entered value is empty", UserRegistrationException.ExceptionType.EmptyType);
            }
            String regx = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()]).{8,}$";
            Pattern pattern = Pattern.compile(regx);
            Matcher matcher = pattern.matcher(password);
            return matcher.matches();
        } catch (NullPointerException e) {
            throw new UserRegistrationException("entered null", UserRegistrationException.ExceptionType.NullType);
        }
    }
}
