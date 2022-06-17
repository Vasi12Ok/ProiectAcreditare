package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.LoginPage;

public class LoginSteps extends ScenarioSteps {

    private HomePage homePage;
    private LoginPage loginPage;
    @Step
    public void navigateToHomePage(){
        homePage.open();
    }
   @Step
    public void navigateToLogin(){
        homePage.clickAccountLink();
        homePage.clickLoginLink();
   }
   @Step
    public void setCredentials(String email, String password){
        loginPage.setEmailField(email);
        loginPage.setPasswordField(password);

   }
   @Step
    public void clickLogin(){
        loginPage.clickLoginButton();
   }
}
