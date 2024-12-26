package cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//cucumber->  TestNG, junit

@CucumberOptions(features="src/test/java/cucumber",glue="rahulshettyacademy.stepDefinitions",
monochrome=true, tags = "@Regression", plugin= {"html:target/cucumber.html"})
public class TestNGTestRunner extends AbstractTestNGCucumberTests {

}

// Helper attributes:
// features="src/test/java/cucumber": run all feature files present in this package.
// glue="rahulshettyacademy.stepDefinitions": mapped step definition file.
// monochrome=true: print the results in readable format.
// plugin= {"html:target/cucumber.html"}: generate the report of HTML plugin. 
// tags = "@Regression": will run feature file with tag @Regression.

// Cucumber donot have power of scanning Testng code. So, "extends AbstractTestNGCucumberTests" to get all the capabilities that class provides.
// AbstractTestNGCucumberTests: contains lot of wrapper where cucumber can understand and run testng code.

// Using Testng just for running feature file, cannot use all the functionalities of Testng in cucumber.
