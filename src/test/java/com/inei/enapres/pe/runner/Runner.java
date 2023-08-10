package com.inei.enapres.pe.runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features={"src/test/resources/features"},
        glue={"com.inei.enapres.pe.steps"},
        tags = "@enapres")
public class Runner {
}
