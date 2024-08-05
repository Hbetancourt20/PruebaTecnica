package task;

import Locators.LocatorsRecruitmentOrange;
import Locators.LocatorsValidationStatus;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.thucydides.core.annotations.Step;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AgendInterview implements Task {
    private final WebDriver driver;
    private final String tittleEntrevista;
    private final String textInterviewer;

    public AgendInterview(WebDriver driver, String tittleEntrevista, String textInterviewer) {
        this.driver = driver;
        this.tittleEntrevista = tittleEntrevista;
        this.textInterviewer = textInterviewer;
    }

    @Step("Add a new candidate with first name {0}, last name {1}, and email {2}")
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                new WaitClickable(LocatorsValidationStatus.BUTTON_SHORLIST, Duration.ofSeconds(10)),
                Click.on(LocatorsValidationStatus.BUTTON_SHORLIST),
                new WaitClickable(LocatorsValidationStatus.BUTTON_SAVE, Duration.ofSeconds(10)),
                Click.on(LocatorsValidationStatus.BUTTON_SAVE),
                new WaitClickable(LocatorsValidationStatus.BUTTON_ENTREVISTA, Duration.ofSeconds(10)),
                Click.on(LocatorsValidationStatus.BUTTON_ENTREVISTA),
                new WaitClickable(LocatorsValidationStatus.INPUT_TITULO_ENTREVISTA, Duration.ofSeconds(10)),
                Enter.theValue(tittleEntrevista).into(LocatorsValidationStatus.INPUT_TITULO_ENTREVISTA),
                new WaitClickable(LocatorsValidationStatus.INPUT_INTERVIEW, Duration.ofSeconds(10)),
                Enter.theValue(textInterviewer).into(LocatorsValidationStatus.INPUT_INTERVIEW),
                Wait.milliseconds(5000),
                new WaitClickable(LocatorsValidationStatus.DIV_INTERVIEW, Duration.ofSeconds(20)),
                Click.on(LocatorsValidationStatus.DIV_INTERVIEW),
                new WaitClickable(LocatorsValidationStatus.INPUT_FECHA, Duration.ofSeconds(10)),
                EnterDate.intoField(LocatorsValidationStatus.INPUT_FECHA, "yyyy-MM-dd"),
                new WaitClickable(LocatorsValidationStatus.INPUT_TIEMPO, Duration.ofSeconds(10)),
                Click.on(LocatorsValidationStatus.INPUT_TIEMPO),
                Scroll.to(LocatorsValidationStatus.BUTTON_SAVE_SCHEDULE),
                new WaitClickable(LocatorsValidationStatus.BUTTON_SAVE_SCHEDULE, Duration.ofSeconds(10)),
                Click.on(LocatorsValidationStatus.BUTTON_SAVE_SCHEDULE),
                new WaitClickable(LocatorsValidationStatus.BUTTON_PASSED, Duration.ofSeconds(10)),
                Click.on(LocatorsValidationStatus.BUTTON_PASSED),
                new WaitClickable(LocatorsValidationStatus.BUTTON_SAVE_INTERVIEW, Duration.ofSeconds(10)),
                Click.on(LocatorsValidationStatus.BUTTON_SAVE_INTERVIEW),
                new WaitClickable(LocatorsValidationStatus.BUTTON_OFFER_JOB, Duration.ofSeconds(10)),
                Click.on(LocatorsValidationStatus.BUTTON_OFFER_JOB),
                new WaitClickable(LocatorsValidationStatus.BUTTON_SAVE_JOB, Duration.ofSeconds(10)),
                Click.on(LocatorsValidationStatus.BUTTON_SAVE_JOB),
                new WaitClickable(LocatorsValidationStatus.BUTTON_HIRE, Duration.ofSeconds(10)),
                Click.on(LocatorsValidationStatus.BUTTON_HIRE),
                new WaitClickable(LocatorsValidationStatus.BUTTON_SAVE_HIRE, Duration.ofSeconds(10)),
                Click.on(LocatorsValidationStatus.BUTTON_SAVE_HIRE),
                Wait.milliseconds(5000)

        );

    }

    public static AgendInterview page(WebDriver driver, String tittleEntrevista, String textInterviewer) {
        return instrumented(AgendInterview.class, driver, tittleEntrevista, textInterviewer);
    }
}
