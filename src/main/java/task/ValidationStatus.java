package task;

import Locators.LocatorsValidationStatus;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ValidationStatus implements Task {
    private final WebDriver driver;
    private final String firstName;
    private final String middleName;
    private final String lastName;
    private  String textoCandidate;
    private String textoCandidateForms;



    public ValidationStatus(WebDriver driver,String firstName,String middleName,String lastName) {
        this.driver = driver;
        this.firstName = firstName;
        this.middleName =middleName;
        this.lastName = lastName;

    }

    @Step("Validate the data entered")
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                new WaitClickable(LocatorsValidationStatus.LOCATOR_CANDIDATES, Duration.ofSeconds(10)),
                Click.on(LocatorsValidationStatus.LOCATOR_CANDIDATES),
                new WaitClickable(LocatorsValidationStatus.VALIDATION_CANDIDATE, Duration.ofSeconds(15))

        );
        WebDriver driver1 = BrowseTheWeb.as(actor).getDriver();
        WebElement element1 = driver1.findElement(LocatorsValidationStatus.VALIDATION_CANDIDATE);
        textoCandidate = element1.getText();
        System.out.println(textoCandidate);
        textoCandidateForms = firstName + " " + middleName + " " + lastName;
        WebElement element2 = driver1.findElement(LocatorsValidationStatus.VALIDATION_STATUS);
        String textoStatus = element2.getText();
        System.out.println(textoStatus);

        if(textoCandidate.equals(textoCandidateForms)&&textoStatus.equals("Hired")){
            System.out.println("Los Datos Coinciden ");
        }else{
            System.out.println("Los Datos No Coinciden");
        }

    }

    public static ValidationStatus page( WebDriver driver,String firstName , String middleName, String lastName  ) {
        return instrumented(ValidationStatus.class,driver, firstName, middleName, lastName);
    }
}
