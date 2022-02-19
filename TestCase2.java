package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./src/main/resources/Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		//to open create contact
		driver.findElement(By.partialLinkText("Contacts")).click();
		driver.findElement(By.partialLinkText("Find Contacts")).click();
		driver.findElement(By.linkText("Email")).click();
		driver.findElement(By.name("emailAddress")).sendKeys("babu@testleaf.com");
		driver.findElement(By.linkText("Find Contacts")).click();
		
	}

}
