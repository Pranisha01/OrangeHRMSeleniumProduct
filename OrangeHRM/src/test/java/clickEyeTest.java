import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class clickEyeTest extends baseTest{

    @Test
    public void SearchCandidate(){
        new Login(driver)
                .performLogin("Admin","admin123")
                .clickRecruitmentButton().clickAdd()
                .EnterDetails("Pranisha","P",
                        "Shahapure","shah@gmail.com").searchCandidate("Pranisha P Shahapure").clickEyeButton();

        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[1]/form")).isDisplayed());
    }



}
