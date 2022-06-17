package org.fasttrackit.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.PageObject;
import org.fasttrackit.steps.serenity.LoginSteps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LoginTests {

    @Managed(uniqueSession = true)
    public WebDriver webDriver;
    @Steps
    private LoginSteps loginSteps;

    @Test
    public void LoginWithValidCredentialsTest() {
        loginSteps.navigateToHomePage();
        loginSteps.navigateToLogin();
        loginSteps.setCredentials("vasi23@gmail.com", "good32A1re");
        loginSteps.clickLogin();
    }

    @Test
    public void LoginWithInvalidCredentialsTest() {
        loginSteps.navigateToHomePage();
        loginSteps.navigateToLogin();
        loginSteps.setCredentials("vasi2345@gmail.com", "go12od32A1re");
        loginSteps.clickLogin();
    }

    @Test
    public void LoginWithSpecialCaracter() {
        loginSteps.navigateToHomePage();
        loginSteps.navigateToLogin();
        loginSteps.setCredentials("vasi2345@gmail.com", "good32A1re!@");
        loginSteps.clickLogin();
    }
}
