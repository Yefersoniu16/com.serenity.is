package com.serenity.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Login {
    public static final Target USER = Target.the("User").
            located(By.id("StartSharp_Membership_LoginPanel0_Username"));
    public static final Target PASSWORD = Target.the("Password").
            located(By.id("StartSharp_Membership_LoginPanel0_Password"));
    public static final Target SIGN_IN = Target.the("Sign in").
            located(By.id("StartSharp_Membership_LoginPanel0_LoginButton"));
}
