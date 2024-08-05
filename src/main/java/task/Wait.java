package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class Wait implements Task{
    private final long milliseconds;

    public Wait(long milliseconds) {
        this.milliseconds = milliseconds;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static Wait milliseconds(long milliseconds) {
        return new Wait(milliseconds);
    }
}
