package com.serenity.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"src/test/resources/features/business_unit.feature"},
        glue = {"com.serenity.stepdefinitions"},
        //tags = "@CreateMeeting",
        snippets = SnippetType.CAMELCASE)
public class BusinessAndMeeting {
}
