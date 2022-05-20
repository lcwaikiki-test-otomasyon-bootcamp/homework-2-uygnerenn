package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.LoginPage;
import util.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class LoginPageSteps {

    WebDriver driver = DriverFactory.getDriver();
    LoginPage loginPage = new LoginPage(driver);

   
    @Given("Click Login Button")
    public void clickLoginButton() {
        loginPage.LoginPageButton();
    }

    @When("E-Posta Radio Button has been chosen")
    public void ePostaRadioButtonHasBeenChosen() {
        loginPage.RadioButCheck();
    }

    @And("nd  e-mail is entered {string}")
    public void ndEMailIsEntered(String emailtext) {
        loginPage.emailtextbox(emailtext );

    }

    @And("password is entered {string}")
    public void passwordIsEntered(String passtext) {
        loginPage.passtextbox(passtext);
    }

    @And("Click the login button")
    public void clickTheLoginButton() {
        loginPage.clickloginbut();
    }


    @Then("User see the My Account Button {string}")
    public void userSeeTheMyAccountButton(String Hesabım) {
        loginPage.checkMyaccount(Hesabım);
    }

    @And("Click the Phone Radio Button")
    public void clickThePhoneRadioButton() {
        loginPage.PhoneRadioBut();
    }

    @And("phone number is entered {string}")
    public void phoneNumberIsEntered(String Phonenum) {
        loginPage.Phonetext(Phonenum);
    }
}
