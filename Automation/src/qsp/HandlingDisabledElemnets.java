package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HandlingDisabledElemnets {
		static {
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver1.exe");
			
		}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/JAYANTH%20S%20GOWDA/Desktop/handlingdisabled.html");
		driver.findElement(By.id("D1")).sendKeys("admin");
		RemoteWebDriver r=(RemoteWebDriver) driver;
		r.executeScript("document.getElementById('D2').value='manager'");
		

	}

}
