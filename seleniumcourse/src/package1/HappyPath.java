package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HappyPath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\automation\\chromedriver.exe");
WebDriver salesforce = new ChromeDriver();
		
		
		salesforce.get("https://login.salesforce.com/");
		
		salesforce.findElement(By.id("username")).sendKeys("Password");
		
		Thread.sleep(2000);
		
		salesforce.findElement(By.id("password")).sendKeys("12345");
		
		Thread.sleep(2000);
		
		
		salesforce.findElement(By.id("Login")).click();
		
		Thread.sleep(4000);
		
		salesforce.quit();  
		
 		
		

	}








	}

