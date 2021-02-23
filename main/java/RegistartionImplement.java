import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegistartionImplement{

    public boolean firstNameValid(String name){
        String regx = "^[A-Z]{1}[a-zA-Z]{2,}";
        Pattern pattern = Pattern.compile(regx);
        Matcher matcher = pattern.matcher(name);
        if (matcher.matches()){
            System.out.println("Entered Name Valid");
            return true;
        }
        else {
            System.out.println("Entered Name is Invalid");
            return false;
        }
    }

    public boolean emailValid(String email) {
        String regx = "^abc[a-zA-Z0-9.]*@bl[.]co[.][a-z]{2,3}";
        Pattern pattern = Pattern.compile(regx);
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()){
            System.out.println("Entered Email is Valid");
            return true;
        }
        else {
            System.out.println("Entered Email is Invalid");
            return false;
        }
    }
    public boolean phoneValid(String phoneNumber) {
        String regx = "^[0-9]{2}[: :][0-9]{10}";
        Pattern pattern = Pattern.compile(regx);
        Matcher matcher = pattern.matcher(phoneNumber);
        if (matcher.matches()) {
            System.out.println("Entered MobileNo. is Valid");
            return true;
        } else {
            System.out.println("Entered MobileNo. is Invalid");
            return false;
        }
    }

    public boolean passwordValid(String password) {
        String regx = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()]).{8,}$";
        Pattern pattern = Pattern.compile(regx);
        Matcher matcher = pattern.matcher(password);
        if (matcher.matches()) {
            System.out.println("Entered Password is Valid");
            return true;
        } else {
            System.out.println("Entered Password is Invalid");
            return false;
        }
    }

    public boolean emailSampleValid(String email) {
        String regx = "^abc[a-zA-Z0-9.+-]*@[a-z0-9]*[.][a-z]{2,5}[.,a-z]{0,5}";
        Pattern pattern = Pattern.compile(regx);
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            System.out.println("Entered Email Sample is Valid");
            return true;
        } else {
            System.out.println("Entered Email Sample is Invalid");
            return false;
        }
    }
}

