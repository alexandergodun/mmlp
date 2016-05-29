package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Recall extends AbstractPage{

    public Recall(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }
    @Override
    public void openPage(String URL)
    {
        driver.navigate().to(URL);
    }

    public void recall(String username,String password) {
        driver.findElement(By.linkText("Войти")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys(username);
        driver.findElement(By.id("pass")).clear();
        driver.findElement(By.id("pass")).sendKeys(password);
        driver.findElement(By.id("send2")).click();

        driver.findElement(By.cssSelector("a.level-top > span")).click();
        driver.findElement(By.cssSelector("button.button.btn-cart")).click();
        driver.findElement(By.cssSelector("#tab-tabreviews > a")).click();
        driver.findElement(By.id("nickname_field")).clear();
        driver.findElement(By.id("nickname_field")).sendKeys("-");
        driver.findElement(By.id("Оценка (Рейтинг):_5")).click();
        driver.findElement(By.id("summary_field")).clear();
        driver.findElement(By.id("summary_field")).sendKeys("-");
        driver.findElement(By.id("review_field")).clear();
        driver.findElement(By.id("review_field")).sendKeys("-");
        driver.findElement(By.cssSelector("div.buttons-set > button.button")).click();
    }
    public boolean isRecall(){
        return driver.findElement(By.className("page-title title-buttons")).getText().contains("Отзыв оставлен");
    }


}
