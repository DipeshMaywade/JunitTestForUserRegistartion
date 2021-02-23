import org.junit.rules.ExpectedException;
import org.junit.Assert;
import org.junit.Test;


public class RegistrationTest {

    @Test
    public void givenNameAsNullReturnException(){
        RegistartionImplement checkName = new RegistartionImplement();
        try {
            boolean name = checkName.firstNameValid(null);
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(UserRegistrationException.class);
            Assert.assertEquals(true, name);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.NullType, e.type);
        }
    }

    @Test
    public void givenNameAsEmptyReturnException() {
        RegistartionImplement checkName = new RegistartionImplement();
        try {
            boolean name = checkName.firstNameValid("");
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(UserRegistrationException.class);
            Assert.assertEquals(true, name);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.EmptyType, e.type);
        }
    }

    @Test
    public void givenEmailAsNullReturnException(){
        RegistartionImplement checkEmail = new RegistartionImplement();
        try {
            boolean email = checkEmail.emailValid(null);
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(UserRegistrationException.class);
            Assert.assertEquals(true, email);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.NullType, e.type);
        }
    }

    @Test
    public void givenEmailAsEmptyReturnException(){
        try {
            RegistartionImplement checkEmail = new RegistartionImplement();
            boolean email = checkEmail.emailValid("");
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(UserRegistrationException.class);
            Assert.assertEquals(true, email);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.EmptyType, e.type);
        }
    }

    @Test
    public void givenNumberAsNullReturnException(){
        RegistartionImplement checkPhone = new RegistartionImplement();
        try {
            boolean phone = checkPhone.phoneValid(null);
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
            boolean phone = checkPhone.phoneValid("");
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(UserRegistrationException.class);
            Assert.assertEquals(true, phone);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.EmptyType, e.type);
        }
    }

    @Test
    public void givenPasswordAsNullReturnException(){
        RegistartionImplement checkPassword = new RegistartionImplement();
        try {
            boolean password = checkPassword.passwordValid(null);
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
            boolean password = checkPassword.passwordValid("");
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(UserRegistrationException.class);
            Assert.assertEquals(true, password);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.EmptyType, e.type);
        }
    }
}