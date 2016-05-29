package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class DeleteBasket extends AbstractPage{


    public DeleteBasket(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }
    @Override
    public void openPage(String URL)
    {
        driver.navigate().to(URL);
    }

    public void deleteBasket() throws InterruptedException {
        driver.findElement(By.cssSelector("a.level-top > span")).click();
        driver.findElement(By.cssSelector("button.button.btn-cart")).click();
        driver.findElement(By.name("super_group[11986]")).clear();
        driver.findElement(By.name("super_group[11986]")).sendKeys("1");
        driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();

        driver.findElement(By.xpath("//div[@id='mini-cart']/a/span/span")).click();
        driver.findElement(By.cssSelector("button.button.btn-inline")).click();
        driver.findElement(By.cssSelector("a.btn-remove.btn-remove2")).click();
    }
    public boolean isDeleteBasket(){
        return driver.findElement(By.className("page-title")).getText().contains("Корзина пуста");
    }
}
