package StepDefenitions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefenition {
	WebDriver driver;
	
	@Given("^user is on Login Page \"(.*)\"$")
	public void login(String name){
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Antony\\Downloads\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.borland.com/gmopost/");
}
 
@When("^title of login page is Free CRM$")
public void title(){
	driver.getTitle();
	System.out.println(driver.getTitle());
	
}
@Then("^user clicks on Login button$")
public void click()
{
	driver.findElement(By.xpath("//input[@name='bSubmit']")).click();
}
}
