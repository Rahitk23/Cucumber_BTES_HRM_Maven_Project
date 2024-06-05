package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {

	WebDriver driver;

	@Given("user is already in login page")
	public void user_is_already_in_login_page() {
		// Write code here that turns the phrase above into concrete actions
		driver = new FirefoxDriver();
		driver.get("http://182.76.176.205/hrm/login.php");

	}

	@When("user enters username & Password")
	public void user_enters_username_password() {
		// Write code here that turns the phrase above into concrete actions
		WebElement username = driver.findElement(By.xpath("//*[@name=\"txtUserName\"]"));
		username.sendKeys("Rahit123");
		WebElement password = driver.findElement(By.xpath("//*[@name=\"txtPassword\"]"));
		password.sendKeys("Rahit@123");
	}

	@Then("user clicks on login button")
	public void user_clicks_on_login_button() {
		// Write code here that turns the phrase above into concrete actions
		WebElement loginBtn = driver.findElement(By.xpath("//*[@name=\"Submit\"]"));
		loginBtn.click();
	}

	@Then("user is on HomePage")
	public void user_is_on_home_page() {
		// Write code here that turns the phrase above into concrete actions
		String expectedText = "Welcome Rahit123";
		WebElement actual = driver.findElement(By.xpath("//*[text()='Welcome Rahit123']"));
		String actualText = actual.getText();
		Assert.assertEquals(actualText, expectedText);
	}

	@Then("An error message is displayed.")
	public void an_error_message_is_displayed() {
		String msg_txt = driver.switchTo().alert().getText();
		System.out.println("An error message displayed saying " + msg_txt);
	}

	@When("user enters invalid name.")
	public void user_enters_invalid_name() {
		// Write code here that turns the phrase above into concrete actions
		WebElement username = driver.findElement(By.xpath("//*[@name=\"txtUserName\"]"));
		username.sendKeys("Rahit12");
	}

	@When("user enter invalid password.")
	public void user_enter_invalid_password() {
		// Write code here that turns the phrase above into concrete actions
		WebElement password = driver.findElement(By.xpath("//*[@name=\"txtPassword\"]"));
		password.sendKeys("Rahit@12");
	}

	@When("user enters valid username")
	public void user_enters_valid_username() {
		// Write code here that turns the phrase above into concrete actions
		WebElement username = driver.findElement(By.xpath("//*[@name=\"txtUserName\"]"));
		username.sendKeys("Rahit123");
	}

	@When("user enters invalid username")
	public void user_enters_invalid_username() {
		// Write code here that turns the phrase above into concrete actions
		WebElement username = driver.findElement(By.xpath("//*[@name=\"txtUserName\"]"));
		username.sendKeys("Rahit12");
	}

	@When("user enter valid password.")
	public void user_enter_valid_password() {
		// Write code here that turns the phrase above into concrete actions
		WebElement password = driver.findElement(By.xpath("//*[@name=\"txtPassword\"]"));
		password.sendKeys("Rahit@123");
	}

	@When("user enters valid password.")
	public void user_enters_valid_password() {
		// Write code here that turns the phrase above into concrete actions
		WebElement password = driver.findElement(By.xpath("//*[@name=\"txtPassword\"]"));
		password.sendKeys("Rahit@123");

	}

	@Then("An error message is displayed saying invalid login.")
	public void an_error_message_is_displayed_saying_invalid_login() {
		// Write code here that turns the phrase above into concrete actions
		String actualText = "Invalid Login";
		WebElement invalidLogin = driver.findElement(By.xpath("//*[text()='Invalid Login']"));
		Assert.assertEquals(actualText, invalidLogin.getText());
	}

	@Then("Close the link.")
	public void close_the_link() {
		driver.quit();

	}

}
