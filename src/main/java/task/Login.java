package task;
import Locators.LocatorsLoginOrange;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;
public class Login implements Task{
    private final String username;
    private final String password;

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Step("Login with username {0} and password {1}")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(username).into(LocatorsLoginOrange.USER_NAME),
                Enter.theValue(password).into(LocatorsLoginOrange.PASSWORD),
                Click.on(LocatorsLoginOrange.BUTTON_LOGIN)
        );
    }

    public static Login withCredentials(String username, String password) {
        return instrumented(Login.class, username, password);
    }
}
