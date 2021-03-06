package Test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Steps.Steps;

public class AutoTests {
    private Steps steps;
    private final String SEACHWORLD = "������";
    private final String SEACHWORLD2 = "�������";
    public final String USERNAME = "robin4-v@mail.ru";
    public final String PASSWORD = "1042380qwasqw";
    public final String NEW_PASSWORD = "1042380qwasqw";

    @BeforeMethod(description = "Init Browser")
    public void setUp(){
        steps=new Steps();
        steps.initBrowser();
    }
    //1 ���� http://www.myfish.by
    @Test(description = "Login to myfish.by")
    public void logInMyFish() {
        steps.logInMyFish(USERNAME, PASSWORD);
        Assert.assertTrue(steps.isLoggedIn());
    }
    //2 �����
    @Test(description = "LogOut to myfish.by")
    public void logOutMyFish() {
        steps.logOutMyFish(USERNAME, PASSWORD);
        Assert.assertTrue(steps.isLoggedOut());
    }
    //3 ��������� ������
    @Test(description = "changePassword myfish.by")
    public void changePassword() {
        steps.changePassword(USERNAME, PASSWORD, NEW_PASSWORD);
        Assert.assertTrue(steps.isChangePassword());
    }
    //4 �����������/����������
    @Test(description = "subscribe myfish.by")
    public void subscribe() {
        steps.subscribe(USERNAME, PASSWORD);
        Assert.assertTrue(steps.isSubscribe());
    }
    //5 �����
    @Test(description = "search myfish.by")
    public void search() {
        steps.search(SEACHWORLD);
        Assert.assertTrue(steps.isSearched());
    }
    public void search2() {
        steps.search(SEACHWORLD2);
        Assert.assertTrue(steps.isSearched());
    }
/*
    //6 �������� � �������
    @Test(description = "enterBasket myfish.by")
    public void enterBasket() throws InterruptedException {
        steps.enterBasket();
        Assert.assertTrue(steps.isEnterBasket());
    }
    //7 ������� �� �������
    @Test(description = "deleteBasket myfish.by")
    public void deleteBasket() throws InterruptedException {
        steps.deleteBasket();
        Assert.assertTrue(steps.isDeleteBasket());
    }
    //8 ��������� �������
    @Test(description = "compare myfish.by")
    public void compare() throws InterruptedException {
        steps.compare();
        Assert.assertTrue(steps.isCompare());
    }
    //9 �������� � ���������
    @Test(description = "createTheme myfish.by")
    public void liked() {
        steps.liked();
        Assert.assertTrue(steps.isLiked());
    }
    //10 �����
    @Test(description = "recall myfish.by")
    public void recall() {
        steps.recall(username, password);
        Assert.assertTrue(steps.isRecall());
    }
    //��������� ���������
    @Test(description = "Comparison 1k.by")
    public void Comparison(){
        steps.Comparison();
        Assert.assertTrue(steps.isComparison());
        System.out.println("Comparison 1k.by");
    }
*/
}
