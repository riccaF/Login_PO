package POs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginSuccessPO extends basePO {

    private By successBox = By.id("success");

    public LoginSuccessPO(WebDriver driver) {
        super(driver);
    }

    public boolean successBoxIsPresent() {
        return isIn(successBox);
    }
}
