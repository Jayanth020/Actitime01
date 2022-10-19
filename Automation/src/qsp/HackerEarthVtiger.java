package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HackerEarthVtiger {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver1.exe");
}
	public static void main(String[] args) {
      WebDriver driver=new ChromeDriver();
      driver.get("https://www.vtiger.com/");
      
	}
 
}
