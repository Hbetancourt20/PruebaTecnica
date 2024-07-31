package task;
import Locators.LocatorsRecruitmentOrange;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;
public class NavigateRecruitment implements Task {
    @Step("Navigate to Recruitment page")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LocatorsRecruitmentOrange.LOCATOR_RECRUITMENT)
        );
    }

    public static NavigateRecruitment page() {
        return instrumented(NavigateRecruitment.class);
    }
}
