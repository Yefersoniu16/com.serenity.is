package com.serenity.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Meeting {
    public static final Target MEETING = Target.the("Meeting").
            located(By.xpath("//i[@class='s-sidebar-icon fa fa-comments premium-feature']"));
    public static final Target MEETING_TWO = Target.the("Meeting Two").
            located(By.xpath("//span[contains(text(),'Meetings')]"));
    public static final Target NEW_MEETING = Target.the("New Meeting").
            located(By.xpath("//i[@class='fa fa-plus-circle text-green']"));
    public static final Target MEETING_NAME = Target.the("Meeting Name").
            located(By.id("Serenity_Pro_Meeting_MeetingDialog10_MeetingName"));
    public static final Target BUTTON_TYPE = Target.the("Button type").
            located(By.id("s2id_Serenity_Pro_Meeting_MeetingDialog10_MeetingTypeId"));
    public static final Target SELECT_TYPE = Target.the("Select type").
            located(By.id("select2-result-label-13"));
    public static final Target MEETING_NUMBER = Target.the("Select type").
            located(By.id("Serenity_Pro_Meeting_MeetingDialog10_MeetingNumber"));
    public static final Target START_DATE = Target.the("Start Date").
            located(By.xpath("(//i[@class='fa fa-calendar'])[1]"));
    public static final Target YEAR = Target.the("Start Date").
            located(By.xpath("//option[@value='2023']"));
    public static final Target MONTH = Target.the("Start Date").
            located(By.xpath("//option[@value='7']"));
    public static final Target DAY = Target.the("Start Date").
            located(By.xpath("//a[@class='ui-state-default']"));
    public static final Target DONE = Target.the("Start Date").
            located(By.xpath("//button[@class='ui-datepicker-close ui-state-default ui-priority-primary ui-corner-all']"));
    public static final Target HOUR = Target.the("Hour").
            located(By.xpath("(//i[@class='inplace-button inplace-now'])[1]"));
    public static final Target SELECT_HOUR = Target.the("Select Hour").
            located(By.xpath("//option[@value='18:05']"));
    public static final Target END_DATE = Target.the("End Date").
            located(By.id("Serenity_Pro_Meeting_MeetingDialog10_EndDate"));
    public static final Target HOUR_END = Target.the("Hour end").
            located(By.xpath("(//i[@class='inplace-button inplace-now'])[2]"));
    public static final Target SELECT_HOUR_END = Target.the("Select Hour End").
            located(By.xpath("(//option[@value='19:00'])[2]"));
    public static final Target LOCATION = Target.the("Location").
            located(By.id("select2-chosen-7"));
    public static final Target SELECT_LOCATION = Target.the("Select Location").
            located(By.id("select2-result-label-21"));
    public static final Target UNIT_MEETING = Target.the("Unit").
            located(By.id("select2-chosen-8"));
    public static final Target SELECT_UNIT = Target.the("Select unit").
            located(By.id("s2id_autogen8_search"));
    public static final Target ORGANIZED  = Target.the("Organized").
            located(By.id("select2-chosen-9"));
    public static final Target SELECT_ORGANIZED  = Target.the("Select organize").
            located(By.xpath("(//div[contains(@id,'select2-result-label-')])[1]"));
    public static final Target REPORTER  = Target.the("Reporter").
            located(By.id("select2-chosen-10"));
    public static final Target SELECT_REPORTER  = Target.the("Select organize").
            located(By.xpath("(//div[contains(@id,'select2-result-label-')])[2]"));
    public static final Target ATTENDEE  = Target.the("Reporter").
            located(By.id("select2-chosen-12"));
    public static final Target SELECT_ATTENDEE  = Target.the("Select organize").
            located(By.xpath("(//div[contains(@id,'select2-result-label-')])[5]"));
    public static final Target SAVE_MEETING = Target.the("Meeting Two").
            located(By.xpath("//i[@class='fa fa-check-circle text-purple']"));








}
