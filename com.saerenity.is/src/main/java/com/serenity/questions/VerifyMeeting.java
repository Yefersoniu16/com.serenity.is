package com.serenity.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import org.assertj.core.api.SoftAssertions;

import static com.serenity.userinterface.Businessunit.UNIT;
import static com.serenity.userinterface.MeetingDelete.MEETING_SCHEDULED;

public class VerifyMeeting implements Question {
    private final SoftAssertions validate = new SoftAssertions();
    @Override
    @Subject("Validar información")
    public Boolean answeredBy(Actor actor) {
        validate.assertThat(MEETING_SCHEDULED.resolveAllFor(actor).contains("Meeting_Yeferson"));
        return true;
    }
    public static Question<Boolean> veificationMeeting() {
        return new VerifyMeeting();
    }
}
