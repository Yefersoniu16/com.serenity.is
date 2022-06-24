package com.serenity.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.serenity.userinterface.Login.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginPage implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
       actor.attemptsTo(
               Click.on(SIGN_IN)
               //Click.on(USER),
               //Click.on(PASSWORD)
       );
    }
    public static LoginPage startSection(){
        return instrumented(LoginPage.class);
    }
}
