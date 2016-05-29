package Steps;
import Pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;




public class Steps {
    public static final String HTTP_WWW_MYFISH_BY = "http://www.myfish.by";
    private WebDriver driver;
    public void initBrowser()
    {
        driver = new FirefoxDriver();
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }


    public void closeDriver()
    {
        driver.close();
    }
    
    public boolean isLoggedIn()
    {
        LoginPage loginPage = new LoginPage(driver);
        return (loginPage.isLogIn());
    }
    public void logInMyFish(String username, String password) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openPage(HTTP_WWW_MYFISH_BY);
        loginPage.logIn(username, password);
    }
    public void logOutMyFish(String username, String password){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openPage("http://www.myfish.by");
        loginPage.logOut(username,password);
    }
    public boolean isLoggedOut() {
        LoginPage loginPage = new LoginPage(driver);
        return (loginPage.isLogOut());
    }
    public void changePassword(String username,String password,String newPassword){
        ChangePassword changePassword = new ChangePassword(driver);
        changePassword.openPage("http://www.myfish.by");
        changePassword.changePassword(username,password,newPassword);
    }
    public boolean isChangePassword() {
        ChangePassword isChangePassword = new ChangePassword(driver);
        return (isChangePassword.isChangePassword());
    }
    public void search(String searcword){
        Search search = new Search(driver);
        search.openPage("http://www.myfish.by");
        search.search(searcword);
    }
    public boolean isSearched() {
        Search search = new Search(driver);
        return (search.isSearch());
    }
    public void subscribe(String username,String password){
        Subscribe subscribe = new Subscribe(driver);
        subscribe.openPage("http://www.myfish.by");
        subscribe.subscribe(username,password);
    }
    public boolean isSubscribe() {
        Subscribe isSubscribe1 = new Subscribe(driver);
        return (isSubscribe1.isSubscribe());
    }
    public void enterBasket() throws InterruptedException {
        EnterBasket enterbasket = new EnterBasket(driver);
        enterbasket.openPage("http://www.myfish.by");
        enterbasket.enterBasket();
    }
    public boolean isEnterBasket() {
        EnterBasket enterbasket = new EnterBasket(driver);
        return (enterbasket.isEnterBasket());
    }
    public void deleteBasket() throws InterruptedException {
        DeleteBasket deletebasket = new DeleteBasket(driver);
        deletebasket.openPage("http://www.myfish.by");
        deletebasket.deleteBasket();
    }
    public boolean isDeleteBasket() {
        DeleteBasket isDeletebasket = new DeleteBasket(driver);
        return (isDeletebasket.isDeleteBasket());
    }
    public void recall(String username,String password){
        Recall recall = new Recall(driver);
        recall.openPage("http://www.myfish.by");
        recall.recall(username,password);
    }
    public boolean isRecall() {
        Recall recall = new Recall(driver);
        return (recall.isRecall());
    }
    /*
    public void logOutSecond(String username, String password){
        LoginPage2 loginPage = new LoginPage2(driver);
        loginPage.openPage("http://1k.by");
        loginPage.logOut(username,password);
    }
    public boolean isLoggedOut()
    {
        LoginPage2 loginPage = new LoginPage2(driver);
        return (loginPage.isLogOut());
    }
    public void changePassorwd(String username, String password)
    {
        LoginPage2 loginPage = new LoginPage2(driver);
        loginPage.openPage("http://1k.by");
        loginPage.changePassorwd(username, password);
    }
    public boolean ischangePassorwd()
    {
        LoginPage2 loginPage = new LoginPage2(driver);
        return (loginPage.ischangePassorwd());
    }
    public void SearchSecond(String searcword){
        Search search = new Search(driver);
        search.openPage("http://1k.by");
        search.Search(searcword);
    }
    public boolean isSearched()
    {
        Search search = new Search(driver);
        return (search.isSearch());
    }
    public void SearchProduct(){
        SearchProduct search = new SearchProduct(driver);
        search.openPage("http://1k.by");
        search.SearchProduct();
    }
    public boolean isSearchProduct()
    {
        SearchProduct search = new SearchProduct(driver);
        return (search.isSearchProduct());
    }
    public void ChangeSettings(){
        ChangeSettings change = new ChangeSettings(driver);
        change.openPage("http://1k.by/users/setgeo");
        change.ChangeSettings();
    }
    public boolean isChangeSettings()
    {
        ChangeSettings change = new ChangeSettings(driver);
        return (change.isChangeSettings());
    }

    public void Comparison(){
        Comparison comparison = new Comparison(driver);
        comparison.openPage("http://1k.by");
        comparison.Comparison();
    }
    public boolean isComparison()
    {
        Comparison comparison = new Comparison(driver);
        return (comparison.isComparison());
    }
*/
}


