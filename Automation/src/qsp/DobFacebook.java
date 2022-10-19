package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DobFacebook {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/login.php");
		driver.findElement(By.linkText("Sign up for Facebook")).click();
		WebElement day = driver.findElement(By.name("birthday_day"));
		Select s =new Select(day);
		s.selectByIndex(19);
		   WebElement month = driver.findElement(By.name("birthday_month"));
		Select m=new Select(month);
		m.selectByValue("10");
		WebElement year = driver.findElement(By.name("birthday_year"));
		Select y=new Select(year);
		y.selectByVisibleText("1996");
		driver.close();
		
	} 

}
