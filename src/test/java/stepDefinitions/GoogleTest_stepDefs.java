package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.Config;
import utilities.Driver;

public class GoogleTest_stepDefs {
    WebDriver driver;
	@When("^user goes to google\\.com$")
	public void user_goes_to_google_com() throws Throwable {
		System.out.println("Going to google.com");
		Driver.getDriver(Config.getProperty("browser")).get(Config.getProperty("url"));
	}

	@Then("^user should get proper title$")
	public void user_should_get_proper_title() throws Throwable {
		System.out.println("Validating the title");
		String expected = "Google";
		String actual = Driver.getDriver("url").getTitle().trim();
		Assert.assertEquals(expected, actual);
		System.out.println("expected "+ expected);
		System.out.println("actual "+ actual);
		
	}

	@Then("^user types \"([^\"]*)\" in the search bar$")
	public void user_types_in_the_search_bar(String data) throws Throwable {
System.out.println("Coing data is:  "+data);
	}

	@Then("^user gets \"([^\"]*)\" related result$")
	public void user_gets_related_result(String data) throws Throwable {
 System.out.println("Coming data is 2: "+data);
	}
}
