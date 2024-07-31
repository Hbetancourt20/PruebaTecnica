package Locators;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LocatorsLoginOrange {
    public static final By USER_NAME = By.xpath("//input[@name='username']");
    public static final By PASSWORD = By.xpath("//input[@name='password']");
    public static final By BUTTON_LOGIN = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']");
}
