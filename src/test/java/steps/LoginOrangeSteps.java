package steps;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import task.CandidateAdd;
import task.Login;
import task.NavigateRecruitment;

public class LoginOrangeSteps {
    @Managed
    WebDriver driver;

    Actor user;
    String firstName = "Harold";
     String middleName="David";
     String lastName= "Betancourt";
    String email="haroldavid2006@gmail.com";
     String contact="3026645439";
     String keywords;
     String notes;

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        OnStage.setTheStage(new OnlineCast());
        user = OnStage.theActorCalled("user");
        user.can(BrowseTheWeb.with(driver));
        user.attemptsTo(Open.url("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"));
    }

    @When("the user logs in with valid credentials")
    public void the_user_logs_in_with_valid_credentials() {
        user.attemptsTo(Login.withCredentials("Admin", "admin123"));
    }

    @Then("the user navigates to Recruitment page")
    public void the_user_navigates_to_Recruitment_page() {
        user.attemptsTo(NavigateRecruitment.page());
    }

    @And("the user adds a new candidate")
    public void the_user_adds_a_new_candidate() {
       user.attemptsTo(CandidateAdd.withDetails("Harold", "David","Betancourt", "C:\\Users\\harol\\Documents\\Prueba.txt","haroldavid2006@gmail.com","3026645439","Automatizacion - Serenity - Selenium", "Todo transcurre muy bien"));
    }

    @Then("the user should see the candidate is hired")
    public void the_user_should_see_the_candidate_is_hired() {


    }
}

