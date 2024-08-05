package task;
import Locators.LocatorsRecruitmentOrange;
import Locators.LocatorsValidationStatus;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

import static net.serenitybdd.screenplay.Tasks.instrumented;
public class CandidateAdd implements Task{
    private final WebDriver driver;
    private final String firstName;
    private final String middleName;
    private final String lastName;
    private final String email;
    private final String contact;
    private final String keywords;
    private final String notes;

    public CandidateAdd(String firstName,String middleName,String lastName,String fileBrowser, String email, String contact, String keywords, String notes, WebDriver driver) {
        this.driver = driver;
        this.firstName = firstName;
        this.middleName =middleName;
        this.lastName = lastName;
        this.email = email;
        this.contact = contact;
        this.keywords = keywords;
        this.notes = notes;
    }


    @Step("Add a new candidate with first name {0}, last name {1}, and email {2}")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
              new WaitClickable(LocatorsRecruitmentOrange.BUTTON_ADD,Duration.ofSeconds(10)),
                Click.on(LocatorsRecruitmentOrange.BUTTON_ADD),
              new WaitClickable(LocatorsRecruitmentOrange.INPUT_FIRSTNAME, Duration.ofSeconds(10)),
                Enter.theValue(firstName).into(LocatorsRecruitmentOrange.INPUT_FIRSTNAME),
                Enter.theValue(middleName).into(LocatorsRecruitmentOrange.INPUT_MIDDLENAME),
                Enter.theValue(lastName).into(LocatorsRecruitmentOrange.INPUT_LASTNAME),
              //  Enter.theValue(fileBrowser).into(LocatorsRecruitmentOrange.FILE_BROWSER),
                Click.on(LocatorsRecruitmentOrange.SELECT_VACANCY_DIV),
                Click.on(LocatorsRecruitmentOrange.SELECT_VACANCY),
                Enter.theValue(email).into(LocatorsRecruitmentOrange.INPUT_EMAIL),
                Enter.theValue(contact).into(LocatorsRecruitmentOrange.INPUT_CONTACT),
                Enter.theValue(keywords).into(LocatorsRecruitmentOrange.INPUT_KEYWORDS),
                Enter.theValue(notes).into(LocatorsRecruitmentOrange.TEXTAREA_NOTES),
                Click.on(LocatorsRecruitmentOrange.SPAN_CHECKBOX),
                Click.on(LocatorsRecruitmentOrange.BUTTON_SAVE)
        );
    }


    public static CandidateAdd withDetails(String firstName,String middleName, String lastName,String fileBrowser, String email, String contact,String keywords, String notes,WebDriver driver) {
        return instrumented(CandidateAdd.class, firstName, lastName,middleName,fileBrowser, email, contact,keywords,notes,driver);
    }
}
