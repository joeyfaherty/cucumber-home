package cucumber.spring;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(glue = {"cucumber.spring.beans", "cucumber.spring"}, strict = true, // Treat
                                                                                     // undefined
                                                                                     // and pending
                                                                                     // steps as
                                                                                     // errors.
    snippets = SnippetType.CAMELCASE, // Cucumber helpfully prints out any undefined step
                                      // definitions as a code snippet suggestion
    tags = {"@fast"}, // use tags to run only the scenario's/features you want eg. @sanity_tests,
                      // @full_test, @benchmarking.
                      // Use mvn clean test -Dcucumber.options="--tags @functional --tags ~@slow
                      // --tags @fast" when using maven or jenkins.
    features = {"src/test/resources/features/"}) // specify features you want to run, can
                                                          // be as specific as line number per
                                                          // feaure, where it will only run the
                                                          // scenario on the line number specified.
public class RunCukesTest {
}
