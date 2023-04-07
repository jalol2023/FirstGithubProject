package package1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnScrolling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\automation\\chromedriver.exe");
		WebDriver apple= new ChromeDriver();
		apple.get("https://www.apple.com");
		Thread.sleep(2000);
		apple.manage().window().maximize();
		
		JavascriptExecutor scroll = (JavascriptExecutor) apple ;
		scroll.executeScript("window.scrollBy(0,250)");
		Thread.sleep(2000);
		scroll.executeScript("window.scrollBy(0,-250)");
		Thread.sleep(2000);
		scroll.executeScript("window.scrollBy(0,document.body.scrollHeight)","");
		Thread.sleep(2000);
		scroll.executeScript("window.scrollBy(0,-document.body.scrollHeight)","");
		apple.get("https://samsung.com");

	}

}
