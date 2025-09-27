package runners;

import org.junit.platform.suite.api.*;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
//what type of test you running junit or cucumber
@SelectClasspathResource("features")
//in which folder in resources you have your feature files
@ConfigurationParameter(key = GLUE_PROPERTY_NAME,value="steps")
@ExcludeTags("IGNORE")
@IncludeTags({"smoke","payments"})

public class SmokeRunner {

}
