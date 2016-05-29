package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ChangePassword extends AbstractPage{

    public ChangePassword(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }
    @Override
    public void openPage(String URL)
    {
        driver.navigate().to(URL);
    }

    public void changePassword(String username,String password,String newPassword){
        driver.findElement(By.linkText("Войти")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys(username);
        driver.findElement(By.id("pass")).clear();
        driver.findElement(By.id("pass")).sendKeys(password);
        driver.findElement(By.id("send2")).click();

        driver.findElement(By.cssSelector("a[title=\"Личный кабинет\"]")).click();
        driver.findElement(By.linkText("Изменить пароль")).click();
        driver.findElement(By.id("current_password")).clear();
        driver.findElement(By.id("current_password")).sendKeys(password);
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys(newPassword);
        driver.findElement(By.id("confirmation")).clear();
        driver.findElement(By.id("confirmation")).sendKeys(newPassword);
        driver.findElement(By.cssSelector("div.buttons-set > button.button")).click();
    }

    public boolean isChangePassword(){
        return driver.findElement( By.className("success-msg")).getText().contains("Данные учётной записи сохранены");
    }
}