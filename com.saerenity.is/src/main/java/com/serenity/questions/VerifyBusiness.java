package com.serenity.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import org.assertj.core.api.SoftAssertions;

import static com.serenity.userinterface.Businessunit.UNIT;

public class VerifyBusiness implements Question <Boolean> {
    private final SoftAssertions validate = new SoftAssertions();
    @Override
    @Subject("Validar información")
    public Boolean answeredBy(Actor actor) {
        validate.assertThat(UNIT.resolveAllFor(actor).contains("Unidad"));
        return true;

    }
    public static Question<Boolean> veification() {
        return new VerifyBusiness();
    }
}
