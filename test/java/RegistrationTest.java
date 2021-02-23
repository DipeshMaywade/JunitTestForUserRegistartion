import org.junit.Assert;
import org.junit.Test;

public class RegistrationTest{
    @Test
    public void firstNameValid_thanTrue() {
        RegistartionImplement checkname= new RegistartionImplement();
        boolean output = checkname.firstNameValid("Dipesh");
        Assert.assertEquals(true, output);
    }

    @Test
    public void secondNameValid_thanTrue() {
        RegistartionImplement checkname= new RegistartionImplement();
        boolean output = checkname.firstNameValid("Maywade");
        Assert.assertEquals(true, output);
    }

    @Test
    public void emailValid_thanTrue() {
        RegistartionImplement checkEmail= new RegistartionImplement();
        boolean output = checkEmail.emailValid("abcDipesh@bl.co.in");
        Assert.assertEquals(true, output);
    }

    @Test
    public void phoneValid_thanTrue() {
        RegistartionImplement checkPhone= new RegistartionImplement();
        boolean output = checkPhone.phoneValid("91 8269602271");
        Assert.assertEquals(true, output);
    }

    @Test
    public void passwordValid_thanTrue() {
        RegistartionImplement checkPassword= new RegistartionImplement();
        boolean output = checkPassword.passwordValid("@123Dipesh");
        Assert.assertEquals(true, output);
    }
}