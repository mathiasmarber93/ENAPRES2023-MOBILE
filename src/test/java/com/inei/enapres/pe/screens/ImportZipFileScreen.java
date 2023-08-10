package com.inei.enapres.pe.screens;

import com.inei.enapres.pe.base.ScreenBase;
import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;


public class ImportZipFileScreen extends ScreenBase {

    @AndroidFindBy(id = "button1")
    private WebElementFacade aceptarImportButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.View" +
            "/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ListView" +
            "/android.widget.TableLayout[9]/android.widget.TableRow")
    private WebElementFacade downloadFolder;

    @AndroidFindBy(id = "myCheckBox")
    private WebElementFacade zipFile;

    @AndroidFindBy(id = "ok")
    private WebElementFacade aceptarButton;

    @Step("Aceptar importar marco")
    public void clickAcceptImport(){
        aceptarImportButton.click();
    }

    @Step("Navegar hacia el archivo")
    public void goBackTwiceToFile() throws InterruptedException {
        pressBack();
        Thread.sleep(200);
        pressBack();
        Thread.sleep(200);
    }

    @Step("Click en Download")
    public void clickDonwloadFolder(){
        downloadFolder.click();
    }

    @Step("Seleccionar el archivo ZIP")
    public void selectZipFile(){
        zipFile.click();
    }

    @Step("Click en Aceptar")
    public void clickAceptar(){
        aceptarButton.click();
    }

}
