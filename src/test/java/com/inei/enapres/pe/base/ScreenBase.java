package com.inei.enapres.pe.base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.webdriver.WebDriverFacade;

public class ScreenBase extends PageObject {

    @Step("Presionar enter")
    public void pressEnter() {
        ((AndroidDriver) ((WebDriverFacade) getDriver())
                .getProxiedDriver())
                .pressKey(new KeyEvent(AndroidKey.ENTER));
    }

    @Step("Presionar atras")
    public void pressBack(){
        ((AndroidDriver) ((WebDriverFacade) getDriver())
                .getProxiedDriver())
                .pressKey(new KeyEvent(AndroidKey.BACK));
    }
}
