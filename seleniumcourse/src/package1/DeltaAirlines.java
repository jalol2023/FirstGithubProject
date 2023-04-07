package package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeltaAirlines {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\automation\\chromedriver.exe");
		WebDriver delta = new ChromeDriver();
		delta.get("https://www.delta.com/");
		delta.manage().window().maximize();
		Thread.sleep(3000);
		delta.findElement(By.id("fromAirportName")).click();
		delta.findElement(By.id("search_input")).sendKeys("JFK");
		Thread.sleep(3000);
		List<WebElement> countries = delta.findElements(By.cssSelector("a[class='airportLookup-list'] span"));
		

		for (WebElement airports: countries) {
			if (airports.getText().equalsIgnoreCase("JFK")) {
				Thread.sleep(3000);
				airports.click();
			}
			delta.findElement(By.id("toAirportName")).click();
			delta.findElement(By.id("search_input")).sendKeys("Mia");
			Thread.sleep(3000);
			List<WebElement> country = delta.findElements(By.cssSelector("a[class='airportLookup-list'] span"));
			
			for (WebElement airport: country) {
				if (airport.getText().equalsIgnoreCase("MIA")) {
					Thread.sleep(3000);
					airport.click();
				}
				delta.findElement(By.id("selectTripType-val")).click();
				Thread.sleep(3000);
				delta.findElement(By.id("ui-list-selectTripType1")).click();
				Thread.sleep(2000);
				delta.findElement(By.id("input_departureDate_1")).click();
				Thread.sleep(2000);
				delta.findElement(By.xpath("/html/body/app-root/app-home/ngc-global-nav/header/div/div[1]/ngc-book/div[6]/div/form/div[1]/div/div[1]/div[1]/div[3]/date-selection-view/div/div/div/div/div[4]/div/div[2]/div[1]/div[2]/table/tbody/tr[5]/td[4]/a")).click();
				Thread.sleep(2000);
				delta.findElement(By.id("btn-book-submit"));
				Thread.sleep(6000);
				delta.close();
			}
			
			
			
			
			

			}
		}

	}


