package qsp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertPopup {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://demo.automationtesting.in/Alerts.html");
		 driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();	
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
			WebDriverWait wait=new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.alertIsPresent());
		Alert a = driver.switchTo().alert();
		String text = a.getText();
	  //  a.accept();
	    a.dismiss();
		System.out.println(text);
		WebElement message = driver.findElement(By.id("demo"));
		String print = message.getText();
		System.out.println(print);
			driver.close();

	}

}
