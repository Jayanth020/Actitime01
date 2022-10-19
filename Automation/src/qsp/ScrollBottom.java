package qsp;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBottom {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver1.exe");
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.bbc.com/");
	JavascriptExecutor j=(JavascriptExecutor) driver;
	j.executeScript("window.scrollTo(0,document.body.scrollHeight)");  //scroll to bottom
	Thread.sleep(4000);
	j.executeScript("window.scrollTo(0,0)");
	
	}

}
 