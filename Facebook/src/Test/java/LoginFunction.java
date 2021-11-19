import base.CommonAPI;
import org.testng.annotations.Test;

public class LoginFunction extends CommonAPI {

    @Test
    public void validUP() {
        alisendkey("//input[@name='email']", "ali546@gmail.com");
        typeAndEnter("//input[@name='pass']", "lsdjflsdfkjds");
        waitFor(3);
    }

    @Test
    public void validUinvalidP() {
        alisendkey("//input[@name='email']", "ali546@gmail.com");
        typeAndEnter("//input[@name='pass']", "lsdjflsdfkjds");
        waitFor(3);
    }

    @Test
    public void invalidUvalidP() {
        alisendkey("//input[@name='email']", "ali546@gmail.com");
        typeAndEnter("//input[@name='pass']", "lsdjflsdfkjds");
        waitFor(3);
    }

    @Test
    public void invalidUinvalidP() {
        alisendkey("//input[@name='email']", "ali546@gmail.com");
        typeAndEnter("//input[@name='pass']", "lsdjflsdfkjds");
        waitFor(3);

        afterMethod();
    }
}
