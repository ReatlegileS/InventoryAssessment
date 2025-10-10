package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginPage {
    WebDriver driver;

    @FindBy(id = "login-heading")
    WebElement loginPageTitle_id;
    @FindBy(id = "login-email")
    WebElement emailField;
    @FindBy(id = "login-password")
    WebElement passwordField;
    @FindBy(id = "login-button")
    WebElement loginButton;

    public void verifyLoginPageIsDisplayed() {
        loginPageTitle_id.isDisplayed();
    }

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterEmailAddress(String email) {
        emailField.sendKeys(email);

    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);

    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public void invalidCredentialsLogin() {
 emailField.sendKeys("Reas@gmail.com");
 passwordField.sendKeys("Password123");
 loginButton.click();
 if (errorisDisplayed()) {
     System.out.println("Error message is displayed for invalid credentials");
 } else {
     System.out.println("Error message is not displayed for invalid credentials");
 }
    }

    private boolean errorisDisplayed() {
        return driver.findElement(By.id("login-error")).isDisplayed();
    }


    public void validCredentialsLogin() {
        emailField.sendKeys("Reas@gmail.com");
        passwordField.sendKeys("Password1#");
        loginButton.click();

    }






}
