package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class emailText{
	static {
		System.setProperty("webdriver.chrome.driver","./driver.chromedriver.exe");
		
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login.");
		int X=driver.findElement(By.id("email")).getLocation().getX();
		int Y=driver.findElement(By.id("email")).getLocation().getY();
		System.out.println(X);
		System.out.println(Y);
		driver.close();
		
	}
}
