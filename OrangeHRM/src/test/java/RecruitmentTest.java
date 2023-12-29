import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RecruitmentTest extends baseTest {
    @Test
    public void ClickAdd(){
        new Login(driver)
                .performLogin("Admin","admin123")
                .clickRecruitmentButton()
                .clickAdd();

        Assert.assertTrue(driver.findElement(By.xpath("//h6[text()=\"Add Candidate\"]")).isDisplayed());
    }



}