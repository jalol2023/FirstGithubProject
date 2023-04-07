package package2;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JVV {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\automation\\chromedriver.exe");
		WebDriver aliexpress = new ChromeDriver();
		aliexpress.get("https://www.aliexpress.us");
		Thread.sleep(2000);
		aliexpress.manage().window().maximize();
		Thread.sleep(3000);
		JavascriptExecutor scroll= (JavascriptExecutor) aliexpress;
		scroll.executeScript("window.scrollBy(0,350)");
		Thread.sleep(2000);
		scroll.executeScript("window.scrollBy(0,-350)");
		Thread.sleep(2000);
		scroll.executeScript("window.scrollBy(0,document.body.scrollHeight)","");
		Thread.sleep(2000);
		scroll.executeScript("window.scrollBy(0,-document.body.scrollHeight)","");
		Thread.sleep(2000);		
		aliexpress.get("https://www.temu.com");
		Thread.sleep(2000);	
		aliexpress.get("https://www.forumdaily.com");
		Thread.sleep(2000);	
		aliexpress.navigate().back();
		Thread.sleep(2000);	
		aliexpress.navigate().forward();
		Thread.sleep(2000);	
		aliexpress.navigate().forward();
		Thread.sleep(2000);	
		aliexpress.close();
		
		aliexpress.navigate().back();

	}

}
