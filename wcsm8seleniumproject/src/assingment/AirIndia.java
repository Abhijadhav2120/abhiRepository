package assingment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AirIndia {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	
	ChromeOptions co=new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	
	WebDriver driver=new ChromeDriver(co);
	driver.manage().window().maximize();
	
	driver.get("https://www.airindia.in/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()=' Login/Enrol']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='signInName']")).sendKeys("ahooo");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("jiii");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@id='next']")).click();
	driver.close();
}
}
