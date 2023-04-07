package package2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LOcators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\automation\\chromedriver.exe");
		WebDriver tickets = new ChromeDriver();
		tickets.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		tickets.findElement(By.id("autosuggest")).sendKeys("Ta");
		Thread.sleep(3000);
		List<WebElement> countries = tickets.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		for (WebElement countryName : countries) {

			if (countryName.getText().equalsIgnoreCase("TAJIKISTAN")) {

				Thread.sleep(3000);

				countryName.click();

				break;
		}
		
		}
		tickets.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(3000);
		WebElement adult=tickets.findElement(By.id("hrefIncAdt"));
		Thread.sleep(3000);
		int a;
		for (a = 0; a < 4; a ++) {
			adult.click();
			
			
		}
				
		
		WebElement child=tickets.findElement(By.id("hrefIncChd"));
		Thread.sleep(3000);
		Thread.sleep(3000);
		int b;
		for (b = 0; b < 2; b ++) {
			child.click();
		
	}
		WebElement infant=tickets.findElement(By.id("hrefIncInf"));
		Thread.sleep(3000);
		Thread.sleep(3000);
		int c;
		for (c = 0; c < 2; c ++) {
			infant.click();
			
}
		tickets.findElement(By.id("btnclosepaxoption")).click();
		Thread.sleep(3000);
		WebElement currency = tickets.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Thread.sleep(3000);
		Select test = new Select(currency);
		test.selectByVisibleText("USD");
		Thread.sleep(2000);
		tickets.findElement(By.id("ctl00_mainContent_btn_FindFlights"));
		Thread.sleep(2000);
		tickets.close();
}
}