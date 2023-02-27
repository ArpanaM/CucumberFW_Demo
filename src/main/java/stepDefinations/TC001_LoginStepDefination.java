package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC001_LoginStepDefination {
	WebDriver driver;
	@Given("user navigates to login page")
	public void user_navigates_to_login_page() {
		System.setProperty("webdriver.chrome.driver","G:\\Selenium1\\Sel@5.30PM\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Sign in")).click();
	}
	@When("user enters correct user name and password")
	public void user_enters_correct_user_name_and_password() {
	   System.out.println("User enters valid user name and valid password");
	   driver.findElement(By.id("login1")).sendKeys("m.arpana1234");
	   driver.findElement(By.id("password")).sendKeys("arpana123");
	   driver.findElement(By.name("remember")).click();
	   
	}
	@Then("user is directed to the home page")
	public void user_is_directed_to_the_home_page() {
	   System.out.println("user is connected to home page");
	   
	}
	@When("user is on Home page diplay a message as Login Successful")
	public void user_is_on_home_page_diplay_a_message_as_login_successful() {
	   System.out.println("Login successful");
	}
	@Then("Logout")
	public void logout() {
	   System.out.println("Exit from the application");
	   driver.quit();
	}
	@When("user enters incorrect user name or incorrect password")
	public void user_enters_incorrect_user_name_or_incorrect_password() {
		System.out.println("User enters invalid user name and invalid password");
	}
	@Then("user error message is displayed")
	public void user_error_message_is_displayed() {
	  System.out.println("error message");
	}




}
