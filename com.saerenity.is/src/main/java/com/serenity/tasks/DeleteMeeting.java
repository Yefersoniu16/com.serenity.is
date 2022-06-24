package com.serenity.tasks;

import com.serenity.utils.SaveData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static com.serenity.userinterface.Businessunit.*;
import static com.serenity.userinterface.Meeting.*;
import static com.serenity.userinterface.MeetingDelete.*;
import static com.serenity.utils.Constant.NAME_UNIT;
import static com.serenity.utils.SaveDataPathFile.PATH_FILE_BUSINESS;
import static com.serenity.utils.SaveDataPathFile.PATH_FILE_MEETING;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DeleteMeeting implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //Click.on(MEETING),
                //Click.on(MEETING_TWO),
                Enter.theValue(SaveData.getInstance(PATH_FILE_MEETING).readFile()).into(SEARCH_MEETING).thenHit(Keys.ENTER),
                Click.on(REFRESH_MEETING),
                Click.on(MEETING_SCHEDULED),
                Click.on(BUTTON_DELETE),
                Click.on(YES_DELETE)

                );

    }
    public  static DeleteMeeting deleteMeeting() {
        return instrumented(DeleteMeeting.class);
    }
}
