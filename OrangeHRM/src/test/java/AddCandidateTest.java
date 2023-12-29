import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class AddCandidateTest extends baseTest {
    @Test
    public void checkFullName(){
        new Login(driver)
                .performLogin("Admin","admin123")
                .clickRecruitmentButton().clickAdd()
                .EnterDetails("Pranisha","P", "Shahapure","shah@gmail.com");


        Assert.assertTrue(driver.findElement(By.xpath("//h6[text()=\"Application Stage\"]")).isDisplayed());
    }

}