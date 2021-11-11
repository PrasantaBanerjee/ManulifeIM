package com.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/com/features"}, glue = {"com/step_definitions" , "com/hooks"}, tags = "@Regression")
public class RegressionRunner {

}
