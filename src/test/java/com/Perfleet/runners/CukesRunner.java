package com.Perfleet.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {"json:target/cucumber.json",
                "html:target/default-html-reports",
                "rerun:target/rerun.txt",
                "pretty"},
        features = "src/test/resources/features",
        glue = "com/Perfleet/step_definitions",
        dryRun = true,
        tags = ""
        //optional
)
public class CukesRunner {

}
