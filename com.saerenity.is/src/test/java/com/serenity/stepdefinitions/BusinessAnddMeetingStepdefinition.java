package com.serenity.stepdefinitions;

import com.serenity.questions.VerifyBusiness;
import com.serenity.questions.VerifyMeeting;
import com.serenity.tasks.CreateBusinessUnit;
import com.serenity.tasks.CreateMeeting;
import com.serenity.tasks.DeleteMeeting;
import com.serenity.tasks.LoginPage;
import com.serenity.userinterface.MeetingDelete;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class BusinessAnddMeetingStepdefinition {

    @Before
    public void setThetago() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Yeferson");
    }
    @Given("^login in to page serenity$")
    public void login_in_to_page_serenity() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://serenity.is/demo/"));
        theActorInTheSpotlight().attemptsTo(LoginPage.startSection());

    }

    @When("^inter the component organizations and create a new business unit$")
    public void inter_the_component_organizations_and_create_a_new_business_unit() {
        theActorInTheSpotlight().attemptsTo(CreateBusinessUnit.createNewBusiness());

    }

    @Then("^business create success full$")
    public void business_create_success_full() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyBusiness.veification()));

    }

    @When("^enter the component meeting and create a nue meeting$")
    public void enter_the_component_meeting_and_create_a_nue_meeting() {
       theActorInTheSpotlight().attemptsTo(CreateMeeting.createNewMeeting());




    }

    @Then("^meeting create success full$")
    public void meeting_create_success_full() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyMeeting.veificationMeeting()));
        theActorInTheSpotlight().attemptsTo(DeleteMeeting.deleteMeeting());
    }

}
