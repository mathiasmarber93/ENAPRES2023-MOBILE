package com.inei.enapres.pe.commons;

import com.inei.enapres.pe.base.ScreenBase;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Validation extends ScreenBase {

    public static String validLogin = "Bienvenido SIS.";
    public static String invalidLogin = "Usuario o clave no existe.";
    public static String importSuccessful = "Importación completada correctamente.";

    @Step("Se despliega el mensaje")
    public String messageIsDisplayed(){
        String expectedMessage = "message";
        WebElement message = getDriver().findElement(By.id(expectedMessage));
        return message.getText();
    }
}
