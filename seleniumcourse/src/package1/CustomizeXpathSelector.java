package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomizeXpathSelector {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\automation\\chromedriver.exe");
		
		WebDriver customize = new ChromeDriver();
		
		customize.get("https://login.salesforce.com/");
		
		customize.findElement(By.xpath("//*[@type='email']")).sendKeys("xpath validation");
		
		customize.findElement(By.cssSelector("[id*='password']")).sendKeys("xpath validation");
		
		customize.findElement(By.cssSelector("input#Login")).click();
		
		Thread.sleep(2000);
		
		customize.close();
		

	}

}
