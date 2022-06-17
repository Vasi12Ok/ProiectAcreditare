package org.fasttrackit.pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class LoginPage extends PageObject {
    @FindBy(id = "username")
    private WebElementFacade emailField;
    @FindBy(css = "#password")
    private WebElementFacade passwordField;
    @FindBy(id = "send2")
    private WebElementFacade logginButton;
//    @FindBy(css =)
    public void setEmailField(String email){
        typeInto(emailField, email);
    }
    public void setPasswordField(String password){
       typeInto(passwordField,password);
    }
    public void clickLoginButton(){
    clickOn(logginButton);
    }
}
