package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class WaitClickable implements Task {
    private final By elementLocator;
    private final Duration time;

    public WaitClickable(By elementLocator, Duration time) {
        this.elementLocator = elementLocator;
        this.time = time;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.elementToBeClickable(elementLocator));
    }
    public static WaitClickable untilClickable(By locator, Duration time) {
        return new WaitClickable(locator,  time);
    }
}
