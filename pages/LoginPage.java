package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.ElementHelper;

public class LoginPage {
    By loginPageBut = By.cssSelector(".user-wrapper .dropdown-label");
    By RadioBut = By.cssSelector(".login-form__radio-buttons--first-label > input[name='loginType']");
    By emailTB = By.name("email");
    By PassTB = By.name("password");
    By LoginBut =By.className(".login-form__button login-form__button--bg-blue");
    By Myaccount = By.cssSelector(".header-dropdown-toggle.striped-button > .dropdown-label");
    By PhoneRadioBut = By.cssSelector(".login-form__radio-buttons--second-label [type]");
    By PhoneText = By.id("phone");


    WebDriver driver;

    ElementHelper helper;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.helper = new ElementHelper(driver);
    }

    public void  LoginPageButton(){
        helper.click(loginPageBut);
    }

    public void RadioButCheck(){
        helper.click(RadioBut);
    }
    public void emailtextbox(String emailtext){
        helper.sendKey(emailTB, emailtext);
    }

    public void passtextbox(String passtext){
        helper.sendKey(PassTB, passtext);
    }

    public void clickloginbut(){
        helper.click(LoginBut);
    }

    public void checkMyaccount(String Hesabım){
        helper.checkElementText(Myaccount, Hesabım);
    }

    public void PhoneRadioBut(){
        helper.click(PhoneRadioBut);
    }

    public void Phonetext(String Phonenum){
        helper.sendKey(PhoneText,Phonenum);
    }


}
