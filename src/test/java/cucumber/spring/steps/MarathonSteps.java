package cucumber.spring.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.spring.Course;

import static org.junit.Assert.assertTrue;

public class MarathonSteps {
  
  private Course course;
  
  @Given("^I have a (\\d+) mile course$")
  public void createCourse(int miles) throws Throwable {
    course = new Course(miles);
  }

  @When("^I run (\\d+) miles$")
  public void run(int miles) throws Throwable {
    course.run(miles);
  }

  @Then("^I will have ran a marathon$")
  public void isMarathonComplete() throws Throwable {
    assertTrue(course.isCourseComplete());
  }

}
