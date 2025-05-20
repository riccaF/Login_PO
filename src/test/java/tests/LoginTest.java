package tests;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import POs.LoginFormPO;
import POs.LoginSuccessPO;

/**
 * Unit test for simple App.
 */
public class LoginTest extends DriverLifeCycleSetting {

    private LoginFormPO loginForm;
    private LoginSuccessPO loginSuccess;

    @Test
    public void testLoginOk() {
        loginForm = new LoginFormPO(driver);
        
        loginSuccess = (LoginSuccessPO) loginForm.with("user", "user");
        assertTrue(loginSuccess.successBoxIsPresent());
    }

    @Test
    public void testLoginNotOk() {
        loginForm = new LoginFormPO(driver);
        loginForm.with("user", "error");
        assertTrue(loginForm.invalidBoxIsPresent());
    }

    @Test
    public void testLoginVoid() {
        loginForm = new LoginFormPO(driver);
        loginForm.with("", "");
        assertTrue(loginForm.invalidBoxIsPresent());
    }
}

