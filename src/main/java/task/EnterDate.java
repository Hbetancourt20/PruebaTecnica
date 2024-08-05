package task;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.By;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class EnterDate implements Task {
    private final By fieldLocator;
    private final DateTimeFormatter formatter;

    public EnterDate(By fieldLocator, String dateFormat) {
        this.fieldLocator = fieldLocator;
        this.formatter = DateTimeFormatter.ofPattern(dateFormat);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        LocalDate currentDate = LocalDate.now();
        String formattedDate = currentDate.format(formatter);
        actor.attemptsTo(
                Enter.theValue(formattedDate).into(fieldLocator)
        );
    }

    public static EnterDate intoField(By fieldLocator, String dateFormat) {
        return new EnterDate(fieldLocator, dateFormat);
    }
}
