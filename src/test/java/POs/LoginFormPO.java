package POs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginFormPO extends basePO {

    private By usernameInput = By.id("username");
    private By passwordInput = By.id("password");
    private By submitButton = By.tagName("button");
    private By invalidBox = By.id("invalid");

    public LoginFormPO(WebDriver driver) {
        super(driver);
        visit("https://bonigarcia.dev/selenium-webdriver-java/login-form.html");
    }

    public basePO with(String username, String pwd){
        type(usernameInput, username);
        type(passwordInput, pwd);
        click(submitButton);
        System.out.println(getUrl());
        if (getUrl().contains("login-form")) return this;
        else return new LoginSuccessPO(driver);
    }

    public boolean invalidBoxIsPresent(){
        return isIn(invalidBox);
    }
}
