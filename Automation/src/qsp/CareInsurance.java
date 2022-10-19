package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CareInsurance {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.id("policynumber")).sendKeys("123");
		driver.findElement(By.id("dob")).click();
		WebElement monthlistbox = driver.findElement(By.className("ui-datepicker-month"));
		Select s=new Select(monthlistbox);
		s.selectByValue("9");
		WebElement yearlistbox = driver.findElement(By.className("ui-datepicker-year"));
		Select y=new Select(yearlistbox);
		y.selectByValue("1996");
		driver.findElement(By.xpath("(//a[text()='20'])")).click();
		driver.findElement(By.id("alternative_number")).sendKeys("8792693158");
		driver.findElement(By.id("renew_policy_submit")).click();
		String errormessage = driver.findElement(By.id("policynumberError")).getText();
		String text = "Please enter valid Policy No.";
		if (errormessage.equals(text)) {
			System.out.println("message is displayed and pass");
		}
		else {


			System.out.println("message is not dispalyed and fail");
		}
	}

}	






