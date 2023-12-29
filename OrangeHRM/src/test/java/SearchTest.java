import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTest extends baseTest{

    @Test
    public void SearchCandidate(){
        new Login(driver)
                .performLogin("Admin","admin123")
                .clickRecruitmentButton().clickAdd()
                .EnterDetails("Pranisha","P",
                        "Shahapure","shah@gmail.com").searchCandidate("Pranisha P Shahapure");


        //Assert.assertTrue(driver.findElement(By.xpath("//span[text()=\"(1) Record Found\"]")).isDisplayed());
    }

}