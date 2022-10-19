package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllSelected {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/JAYANTH%20S%20GOWDA/Desktop/hotel.html");
		WebElement cplistbox = driver.findElement(By.id("cp"));
		Select s =new Select(cplistbox);
		List<WebElement> allsOption = s.getAllSelectedOptions();
		int count = allsOption.size();
		for(int i=0;i<count;i++) {
			String text = allsOption.get(i).getText();
			System.out.println(text);
			
		}
		
	}

}
