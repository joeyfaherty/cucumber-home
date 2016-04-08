package cucumber.spring.steps;

import static org.junit.Assert.assertNotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import cucumber.api.java.en.Then;
import cucumber.spring.beans.Belly;
import cucumber.spring.beans.BellyBean;

@ContextConfiguration("classpath:cucumber.xml")
public class BellySteps {

    @Autowired
    private Belly belly;

    @Autowired
    private BellyBean bellyBean;

    public BellyBean getBellyBean() {
        return bellyBean;
    }

    @Then("^I have belly$")
    public void I_have_belly() throws Throwable {
        assertNotNull(belly);
    }

    @Then("^I have belly bean$")
    public void I_have_belly_bean() throws Throwable {
        assertNotNull(bellyBean);
    }
}
