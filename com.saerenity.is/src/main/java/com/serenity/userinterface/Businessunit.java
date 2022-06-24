package com.serenity.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Businessunit {
    public static final Target ORGANIZATIONS = Target.the("Organizations").
            located(By.xpath("//i[@class='s-sidebar-icon fa fa-sitemap premium-feature']"));
    public static final Target BUSINESS_UNIT = Target.the("Business Unit").
            located(By.xpath("//i[@class='s-sidebar-icon fa fa-sitemap']"));
    public static final Target NEW_BUSINESS_UNIT = Target.the("New Business").
            located(By.xpath("//div[@class='tool-button add-button icon-tool-button']"));
    public static final Target NAME = Target.the("NAME").
            located(By.xpath("//input[@id='Serenity_Pro_Organization_BusinessUnitDialog3_Name']"));
    public static final Target SAVE = Target.the("SAVE").
            located(By.xpath("//div[@class='tool-button save-and-close-button icon-tool-button']"));
    public static final Target SEARCH_UNIT = Target.the("Search Unit").
            located(By.xpath("//input[@class='s-Serenity-QuickSearchInput s-QuickSearchInput']"));
    public static final Target UNIT = Target.the("Unit").
            located(By.xpath("(//A[@class='s-EditLink s-Pro-Organization-BusinessUnitLink'])[2]"));
    public static final Target REFRESH = Target.the("REFRESH").
            located(By.xpath("//div[@class='tool-button refresh-button icon-tool-button']"));
    public static final Target SAVE_TWO = Target.the("Save two").
            located(By.xpath("(//i[@class='fa fa-clipboard-check text-purple'])"));
}
