package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PointFirstSelOPtion {
		static {
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			
		}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/JAYANTH%20S%20GOWDA/Desktop/hotel.html");
		WebElement cplistbox = driver.findElement(By.id("cp"));
		  Select S = new Select(cplistbox);
		  WebElement fsOption = S.getFirstSelectedOption();
		  String text = fsOption.getText();
		  System.out.println(text);
		  driver.close();
		  
		  
		


	}
	
	

}
