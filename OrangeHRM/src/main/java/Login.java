import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class Login {

    WebDriver driver;

    public Login(WebDriver driver) {
        this.driver = driver;
    }

    private By userNameInput = By.xpath("//input[@name=\"username\"]");
    private By passwordInput = By.xpath("//input[@name=\"password\"]");
    private By loginButton = By.xpath("//button[@type=\"submit\"]");



    public DashboardPage performLogin(String username, String password){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        driver.findElement(userNameInput).sendKeys(username);
        driver.findElement(passwordInput).sendKeys(password);
        driver.findElement(loginButton).click();

        return new DashboardPage(driver);
        //driver.findElement(recruitmentButton).click();
    }
}
