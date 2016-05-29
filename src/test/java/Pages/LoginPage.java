package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends AbstractPage{


    public LoginPage(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }
    @Override
    public void openPage(String URL)
    {
        driver.navigate().to(URL);
    }

    public void logIn(String username, String password) {
        driver.findElement(By.linkText("Войти")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys(username);
        driver.findElement(By.id("pass")).clear();
        driver.findElement(By.id("pass")).sendKeys(password);
        driver.findElement(By.id("send2")).click();
    }
    public void logOut(String username, String password){
        driver.findElement(By.linkText("Войти")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys(username);
        driver.findElement(By.id("pass")).clear();
        driver.findElement(By.id("pass")).sendKeys(password);
        driver.findElement(By.id("send2")).click();
        driver.findElement(By.linkText("Выйти")).click();
    }
    public boolean isLogIn(){
        return driver.findElement(By.linkText("Выйти")).isDisplayed();
    }
    public boolean isLogOut(){
        return driver.findElement(By.linkText("Войти")).isDisplayed();
    }
}