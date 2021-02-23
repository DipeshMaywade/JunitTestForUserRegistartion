import java.util.Scanner;

public class UserRegistration {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        RegistartionImplement check = new RegistartionImplement();

       while (true){
           System.out.println("Enter Your First Name: ");
           String firstName = scan.nextLine();
           check.firstNameValid(firstName);

           System.out.println("Enter Your Last Name");
           String lastName = scan.nextLine();
           check.firstNameValid(lastName);

           System.out.println("Enter Your EmailID");
           String email = scan.nextLine();
           check.emailValid(email);

           System.out.println("Enter Your MobileNumber");
           String number = scan.nextLine();
           check.phoneValid(number);

           System.out.println("Enter Your Password ");
           String pass = scan.nextLine();
           check.passwordValid(pass);

           System.out.println("Check Following Email Sample is valid or Invalid");
           check.emailSampleValid("abc@yahoo.com");
           check.emailSampleValid("abc-100@yahoo.com");
           check.emailSampleValid("abc.100@yahoo.com");
           check.emailSampleValid("abc111@abc.com");
           check.emailSampleValid("abc-100@abc.net");
           check.emailSampleValid("abc.100@abc.com.au");
           check.emailSampleValid("abc@1.com");
           check.emailSampleValid("abc@gmail.com.com");
           check.emailSampleValid("abc+100@gamil.com");
       }
    }
}
