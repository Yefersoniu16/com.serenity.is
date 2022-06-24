package com.serenity.tasks;

import com.serenity.utils.SaveData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.Keys;

import static com.serenity.userinterface.Businessunit.*;
import static com.serenity.utils.Constant.NAME_UNIT;
import static com.serenity.utils.SaveDataPathFile.PATH_FILE_BUSINESS;
import static com.serenity.utils.SaveDataPathFile.PATH_FILE_MEETING;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CreateBusinessUnit implements Task {
    String code = RandomStringUtils.randomAlphabetic(3);
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ORGANIZATIONS),
                Click.on(BUSINESS_UNIT),
                Click.on(NEW_BUSINESS_UNIT),
                Enter.theValue(NAME_UNIT + code).into(NAME),
                Click.on(SAVE),
                Enter.theValue(NAME_UNIT + code).into(SEARCH_UNIT).thenHit(Keys.ENTER),
                Click.on(REFRESH)
                //Click.on(UNIT),
                //Click.on(SAVE_TWO)

        );
        SaveData.getInstance(PATH_FILE_BUSINESS).writeFile(NAME_UNIT + code);
        actor.remember("code", code);

    }
    public static CreateBusinessUnit createNewBusiness(){
        return instrumented(CreateBusinessUnit.class);
    }
}
