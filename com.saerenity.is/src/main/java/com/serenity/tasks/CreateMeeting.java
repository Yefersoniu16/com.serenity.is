package com.serenity.tasks;

import com.serenity.utils.SaveData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.Keys;

import static com.serenity.userinterface.Meeting.*;
import static com.serenity.userinterface.MeetingDelete.REFRESH_MEETING;
import static com.serenity.utils.Constant.*;
import static com.serenity.utils.SaveDataPathFile.PATH_FILE_BUSINESS;
import static com.serenity.utils.SaveDataPathFile.PATH_FILE_MEETING;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CreateMeeting implements Task {
    String code = RandomStringUtils.randomAlphabetic(3);
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MEETING),
                Click.on(MEETING_TWO),
                Click.on(NEW_MEETING),
                Click.on(MEETING_NAME),
                Enter.theValue(NAME_MEETING + code).into(MEETING_NAME),
                Click.on(BUTTON_TYPE),
                Click.on(SELECT_TYPE),
                Enter.theValue(NUMBER_MEETING).into(MEETING_NUMBER),
               Click.on(START_DATE),
                Click.on(YEAR),
                Click.on(MONTH),
                Click.on(DAY),
                //Click.on(DONE),
                //Enter.theValue(START_DATE_ENTER).into(START_DATE).thenHit(Keys.ARROW_DOWN),
                Click.on(HOUR),
                Click.on(SELECT_HOUR),
                Enter.theValue(START_DATE_ENTER).into(END_DATE).thenHit(Keys.ENTER),
                Click.on(HOUR_END),
                Click.on(SELECT_HOUR_END),
                Click.on(LOCATION),
                Click.on(SELECT_LOCATION),
                Click.on(UNIT_MEETING),
                Enter.theValue(SaveData.getInstance(PATH_FILE_BUSINESS).readFile()).into(SELECT_UNIT).thenHit(Keys.ENTER),
                Click.on(ORGANIZED),
                Click.on(SELECT_ORGANIZED),
                Click.on(REPORTER),
                Click.on(SELECT_REPORTER),
                Click.on(ATTENDEE),
                Click.on(SELECT_ATTENDEE),
                Click.on(SAVE_MEETING),
                Click.on(REFRESH_MEETING)
        );
        SaveData.getInstance(PATH_FILE_MEETING).writeFile(NAME_MEETING + code);
        actor.remember("code", code);
    }
    public static CreateMeeting createNewMeeting() {
        return instrumented(CreateMeeting.class);
    }

}
