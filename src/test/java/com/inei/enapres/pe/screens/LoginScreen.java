package com.inei.enapres.pe.screens;

import com.inei.enapres.pe.base.ScreenBase;
import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginScreen extends ScreenBase {

    @AndroidFindBy(id = "txtUSUARIO")
    private WebElementFacade usernameInput;

    @AndroidFindBy(id = "txtCLAVE")
    private WebElementFacade passwordInput;

    @AndroidFindBy(id = "btnLOGIN")
    private WebElementFacade loginButton;

    @AndroidFindBy(id = "button3")
    private WebElementFacade acceptLoginButton;

    @Step("Ingresar usuario")
    public void typeUsername(String username){
        usernameInput.sendKeys(username);
    }

    @Step("Ingresar contraseña")
    public void typePassword(String password){
        passwordInput.sendKeys(password);
    }

    @Step("Presionar el boton login")
    public void pressLoginButton(){
        loginButton.click();
    }

    @Step("Click en boton Aceptar")
    public void clickAcceptLogin(){
        acceptLoginButton.click();
    }

}
