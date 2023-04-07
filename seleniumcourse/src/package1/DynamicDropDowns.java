package package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicDropDowns {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.manage().window().maximize();

		WebElement countryTextBox = driver.findElement(By.id("autosuggest"));

		countryTextBox.sendKeys("Ta");

		Thread.sleep(3000);

		List<WebElement> countries = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

		for (WebElement countryName : countries) {

			if (countryName.getText().equalsIgnoreCase("TAJIKISTAN")) {

				Thread.sleep(3000);

				countryName.click();

				break;

			}

		}

		WebElement pesengers = driver.findElement(By.id("divpaxinfo"));

		pesengers.click();

		Thread.sleep(3000);

		WebElement adult = driver.findElement(By.id("hrefIncAdt"));

		Thread.sleep(2000);

		int i;

		for (i = 0; i < 2; i++) { // 0 , 1, 2, 3

			adult.click();

			Thread.sleep(2000);

		}

		WebElement child = driver.findElement(By.id("hrefIncChd"));

		Thread.sleep(2000);

		int y;

		for (y = 0; y < 2; y++) { // 0,1,2 hrefIncInf

			child.click();

			Thread.sleep(2000);

		}

		WebElement infant = driver.findElement(By.id("hrefIncInf"));

		Thread.sleep(2000);

		int x;

		for (x = 0; x < 2; x++) {

			infant.click();

			Thread.sleep(2000);

		}

		driver.findElement(By.id("btnclosepaxoption")).click();

		Thread.sleep(3000);

		// This is where we are dealing with Static dropdown

		Thread.sleep(3000);

		WebElement currency = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

		Thread.sleep(3000);

		Select test = new Select(currency);

		Thread.sleep(2000);

		//test.selectByVisibleText("AED");
		
		test.selectByIndex(3);

		Thread.sleep(2000);

		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

		driver.close();

	}

}
