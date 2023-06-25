package org.tms.page;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
@Log4j2
public class LoginPage extends Page{

    @FindBy(xpath = "//input[@id = 'user-name']")
    private WebElement usernameField;

    @FindBy(xpath = "//input[@id = 'password']")
    private WebElement passwordField;

    @FindBy(xpath = "//input[@id = 'login-button']")
    private WebElement loginButton;

    public LoginPage openPage(String url){
        log.info("open login page");
        driver.get(url);
        return this;
    }


    public LoginPage fillInUsername(String userName){
        log.info("enter login page");
        waitVisibilityOf(usernameField).sendKeys(userName);
        return this;
    }

    public LoginPage fillInPassword(String keyPassword){
        log.info("open password page");
        waitVisibilityOf(passwordField).sendKeys(keyPassword);
        return this;
    }

    public void clickLoginButton(){
        log.info("click on the login button");
        waitElementToBeClickable(loginButton).click();
    }

}
