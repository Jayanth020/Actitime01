package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllWindowHandles {
		static {
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver1.exe");
			
		}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://in.indeed.com/");
		//driver.findElement(by.)
		driver.findElement(By.xpath("//span[text()='Continue with Apple']")).click();
		driver.findElement(By.xpath("//span[text()='Continue with Facebook']")).click();
		Set<String> allwh = driver.getWindowHandles();
		for(String awh:allwh) {
			System.out.println(awh);
		}
		  
		driver.quit();
	}
 
}
