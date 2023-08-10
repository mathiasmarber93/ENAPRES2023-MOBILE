package com.inei.enapres.pe.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;

public class NavigationScreen extends PageObject {

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.View/" +
            "android.widget.FrameLayout[2]/android.widget.LinearLayout/android.view.View/" +
            "android.widget.ListView/android.widget.RelativeLayout[8]/android.widget.TextView")
    private WebElementFacade cargarInformacionOption;

    @Step("Click en la opcion cargar informacion")
    public void clickCargarInformacion(){
        cargarInformacionOption.click();
    }

}
