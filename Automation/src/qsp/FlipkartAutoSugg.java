package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAutoSugg {
		static {
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("iphone");
		Thread.sleep(3000);
		List<WebElement> allsugg = driver.findElements(By.xpath("(//div[@class='lrtEPN _17d0yO']"));
		int count=allsugg.size();
		System.out.println(count);
		for (int i=0;i<count;i++) {
			String text = allsugg.get(i).getText();
			System.out.println(text);
			
		}
		allsugg.get(count-1).click();
		
		

	}

}

