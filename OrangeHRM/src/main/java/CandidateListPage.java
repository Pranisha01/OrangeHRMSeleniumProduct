import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CandidateListPage {
    WebDriver driver;

    public CandidateListPage(WebDriver driver) {
        this.driver = driver;
    }

    public EditCandidatePage clickEyeButton(){
        By EyeClick = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div/div[6]/div/div/div[1]/div[2]/div/div/button[1]");
        driver.findElement(EyeClick).click();

        return new EditCandidatePage(driver);


    }

}
