
import org.junit.rules.ExpectedException;
import org.junit.Assert;
import org.junit.Test;


public class RegistrationTest {

    @Test
    public void checkNameValidationReturnTrue() {
        RegistartionImplement checkName = new RegistartionImplement();
        try {
            Assert.assertEquals(true, checkName.nameValidation("Dipesh"));
        } catch (Exception e) {
            System.out.println("Invalid with exception " + e);
        }
    }

    @Test
    public void givenNameAsNullReturnException(){
        RegistartionImplement checkName = new RegistartionImplement();
        try {
            boolean name = checkName.nameValidation(null);
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(UserRegistrationException.class);
            Assert.assertEquals(true, name);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.NullType, e.type);
        }
    }

    @Test
    public void givenNameAsEmptyReturnException(){
        RegistartionImplement checkName = new RegistartionImplement();
        try {
            boolean name = checkName.nameValidation("");
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(UserRegistrationException.class);
            Assert.assertEquals(true, name);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.EmptyType, e.type);
        }
    }

    @Test
    public void checkEmailValidationReturnTrue() {
        RegistartionImplement checkEmail = new RegistartionImplement();
        try {
            Assert.assertEquals(true, checkEmail.emailValidation("abcDipesh@bl.co.in"));
        } catch (Exception e) {
            System.out.println("Invalid with exception " + e);
        }
    }

    @Test
    public void givenEmailAsNullReturnException(){
        RegistartionImplement checkEmail = new RegistartionImplement();
        try {
            boolean email = checkEmail.emailValidation(null);
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(UserRegistrationException.class);
            Assert.assertEquals(true, email);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.NullType, e.type);
        }
    }

    @Test
    public void givenEmailAsEmptyReturnException() {
        try {
            RegistartionImplement checkEmail = new RegistartionImplement();
            boolean email = checkEmail.emailValidation("");
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(UserRegistrationException.class);
            Assert.assertEquals(true, email);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.EmptyType, e.type);
        }
    }

    @Test
    public void checkPhoneValidationReturnTrue() {
        RegistartionImplement checkPhone = new RegistartionImplement();
        try {
            Assert.assertEquals(true, checkPhone.phoneValidation("91 1478523698"));
        } catch (Exception e) {
            System.out.println("Invalid with exception " + e);
        }
    }

    @Test
    public void givenNumberAsNullReturnException(){
        RegistartionImplement checkPhone = new RegistartionImplement();
        try {
            boolean phone = checkPhone.phoneValidation(null);
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(UserRegistrationException.class);
            Assert.assertEquals(true, phone);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.NullType, e.type);
        }
    }

    @Test
    public void givenNumberEmpty_shouldThrowException(){
        RegistartionImplement checkPhone = new RegistartionImplement();
        try {
            boolean phone = checkPhone.phoneValidation("");
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(UserRegistrationException.class);
            Assert.assertEquals(true, phone);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.EmptyType, e.type);
        }
    }

    @Test
    public void checkPasswordValidationReturnTrue(){
        RegistartionImplement checkPassword = new RegistartionImplement();
        try {
            Assert.assertEquals(true, checkPassword.passwordValidation("Abc@12435"));
        } catch (Exception e) {
            System.out.println("Invalid with exception " + e);
        }
    }

    @Test
    public void givenPasswordAsNullReturnException(){
        RegistartionImplement checkPassword = new RegistartionImplement();
        try {
            boolean password = checkPassword.passwordValidation(null);
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(UserRegistrationException.class);
            Assert.assertEquals(true, password);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.NullType, e.type);
        }
    }

    @Test
    public void givenPasswordEmpty_shouldThrowException(){
        RegistartionImplement checkPassword = new RegistartionImplement();
        try {
            boolean password = checkPassword.passwordValidation("");
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(UserRegistrationException.class);
            Assert.assertEquals(true, password);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.EmptyType, e.type);
        }
    }
}