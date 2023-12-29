import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class loginTest extends baseTest{

    @Test
    public void validLogin(){

        new Login(driver).performLogin("Admin", "admin123");
        Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
    }


}
