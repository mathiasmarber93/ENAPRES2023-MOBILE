package com.inei.enapres.pe.steps;

import com.inei.enapres.pe.commons.Validation;
import com.inei.enapres.pe.screens.ImportZipFileScreen;
import com.inei.enapres.pe.screens.LoginScreen;
import com.inei.enapres.pe.screens.NavigationScreen;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

import static com.inei.enapres.pe.commons.Validation.*;

public class steps {

    @Steps(shared = true)
    LoginScreen login;

    @Steps(shared = true)
    NavigationScreen navigate;

    @Steps(shared = true)
    ImportZipFileScreen importFile;

    @Steps(shared = true)
    Validation validate;

    @Given("el usuario ingresa credenciales validas")
    public void userValidLogin(){
        login.typeUsername("SIS");
        login.typePassword("123");
        login.pressLoginButton();
    }

    @Then("la app deberia mostrar un mensaje de bienvenida")
    public void appShowValidMessage(){
        Assert.assertEquals(validate.messageIsDisplayed(), validLogin);
        login.clickAcceptLogin();
    }

    @Given("el usuario ingresa credenciales invalidas")
    public void userInvalidLogin(){
        login.typeUsername("SIS");
        login.typePassword("123456");
        login.pressLoginButton();
    }

    @Then("la app deberia mostrar un mensaje de error")
    public void appShowInvalidMessage(){
        Assert.assertEquals(validate.messageIsDisplayed(), invalidLogin);
        login.clickAcceptLogin();
    }

    @When("navega al modulo cargar configuracion")
    public void userNavigateModule(){
        Assert.assertEquals(validate.messageIsDisplayed(), validLogin);
        login.clickAcceptLogin();
        navigate.clickCargarInformacion();
    }

    @And("selecciona el archivo .zip")
    public void userSelectFile() throws InterruptedException {
        importFile.clickAcceptImport();
        importFile.goBackTwiceToFile();
        importFile.clickDonwloadFolder();
        importFile.selectZipFile();
        importFile.clickAceptar();
    }

    @Then("la app deberia mostrar un mensaje de importacion exitosa")
    public void appShowMessageFile(){
        Assert.assertEquals(validate.messageIsDisplayed(), importSuccessful);
    }


}
