package org.cucumber.step_defination;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class GoogleSearch {
	ChromeDriver driver = null;

	@Given("^:navigates to the google page$")
	public void navigates_to_the_google_page() throws Throwable {
		System.setProperty("WebDriver.chrome.driver", "src/chromedriver");
		driver = new ChromeDriver();
		driver.get("google.com");
		throw new PendingException();
	}

	@When("^: user enters  data \"([^\"]*)\"in search box$")
	public void user_enters_data_in_search_box(DataTable data) throws Throwable {
		List<List<String>> searchData = data.raw();
		for (int j = 0; j < 10; j++) {
			WebElement element = driver.findElement(By.id("input"));
			element.sendKeys(searchData.get(0).get(j));
			element.submit();
			driver.get("google.com");
		}
		throw new PendingException();
	}

}
