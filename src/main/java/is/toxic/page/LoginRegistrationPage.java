package is.toxic.page;

import lombok.Builder;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static is.toxic.common.Common.clickLinkOrButton;
import static is.toxic.common.Common.setDataToInput;

public class LoginRegistrationPage {

    private final WebDriverWait wait;

    @Getter
    private final MainPage mainPage;

    //Login form

    @FindBy(css = "div.form-group:nth-child(2) > input:nth-child(1)")
    private WebElement loginInputLoginForm;

    @FindBy(css = "#root > div.container > div > div:nth-child(1) > div > div.card-body > form > div:nth-child(3) > input")
    private WebElement passwordInputLoginForm;

    @FindBy(css = ".mr-3")
    private WebElement loginButton;

    @FindBy(css = "div.col-sm-12:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > a:nth-child(2)")
    private WebElement forgetLink;

    //Registration form

    @FindBy(css = "div.col-sm-12:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > input:nth-child(1)")
    private WebElement loginInputRegistrationForm;

    @FindBy(css = "div.form-group:nth-child(4) > input:nth-child(1)")
    private WebElement passwordInputRegistrationForm;

    @FindBy(css = "div.form-group:nth-child(5) > input:nth-child(1)")
    private WebElement confirmPasswordInput;

    @FindBy(css = "div.col-sm-12:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > button:nth-child(1)")
    private WebElement registrationButton;

    @Builder
    public LoginRegistrationPage(WebDriver driver) {
        this.wait = new WebDriverWait(driver, 120);
        mainPage =  MainPage.builder().driver(driver).build();
        mainPage.clickLoginRegistrationLink();
        PageFactory.initElements(driver, this);
        wait.until(ExpectedConditions.elementToBeClickable(mainPage.getHomeLink()));
    }

    public void clickLoginButton(){
        clickLinkOrButton(loginButton, wait);
    }

    public void clickForgetPassLink(){
        clickLinkOrButton(forgetLink, wait);
    }

    public void clickRegistrationButton(){
        clickLinkOrButton(registrationButton, wait);
    }

    public void setLoginForLogin(String login){
        setDataToInput(loginInputLoginForm, wait, login);
    }

    public void setPasswordForLogin(String password){
        setDataToInput(passwordInputLoginForm, wait, password);
    }

    public void setLoginForRegistration(String login){
        setDataToInput(loginInputRegistrationForm, wait, login);
    }

    public void setPasswordForRegistration(String password){
        setDataToInput(passwordInputRegistrationForm, wait, password);
    }

    public void setConfirmPassword(String password){
        setDataToInput(confirmPasswordInput, wait, password);
    }

    public void registerUser(String login, String password){
        setLoginForRegistration(login);
        setPasswordForRegistration(password);
        setConfirmPassword(password);
        clickRegistrationButton();
        wait.until(ExpectedConditions.urlContains("profile"));
    }

    public void loginUser(String login, String password){
        setLoginForLogin(login);
        setPasswordForLogin(password);
        clickLoginButton();
        wait.until(ExpectedConditions.urlContains("profile"));
    }
}
