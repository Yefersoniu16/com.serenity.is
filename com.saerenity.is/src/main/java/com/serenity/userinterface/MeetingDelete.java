package com.serenity.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MeetingDelete {
    public static final Target SEARCH_MEETING = Target.the("Meeting Two").
            located(By.xpath("(//input[@class='s-Serenity-QuickSearchInput s-QuickSearchInput'])"));
    public static final Target REFRESH_MEETING = Target.the("Meeting Scheduled").
            located(By.xpath("(//i[@class='fa fa-refresh text-blue'])"));
    public static final Target MEETING_SCHEDULED = Target.the("Meeting Scheduled").
            located(By.xpath("(//a[@class='s-EditLink s-Pro-Meeting-MeetingLink'])[2]"));
    public static final Target BUTTON_DELETE = Target.the("Meeting Scheduled").
            located(By.xpath("(//i[@class='fa fa-trash-o text-red'])"));
    public static final Target YES_DELETE = Target.the("Meeting Scheduled").
            located(By.xpath("(//button[@class='btn btn-primary'])"));
}
