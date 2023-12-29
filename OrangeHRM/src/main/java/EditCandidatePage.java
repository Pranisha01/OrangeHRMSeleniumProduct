import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditCandidatePage {

    WebDriver driver;

    public EditCandidatePage(WebDriver driver) {
        this.driver = driver;
    }


    public void editCandidate(){
        By EditSwitch= By.xpath("//span[@class=\"oxd-switch-input oxd-switch-input--active --label-left\"]");
        driver.findElement(EditSwitch).click();


        By EditNotes = By.xpath("//textarea[@placeholder=\"Type here\"]");
        driver.findElement(EditNotes).sendKeys("Hello my name is Pranisha");

        By clickSave = By.xpath("//button[@class=\"oxd-icon-button oxd-main-menu-button\"]");
        driver.findElement(clickSave).click();
    }
}
