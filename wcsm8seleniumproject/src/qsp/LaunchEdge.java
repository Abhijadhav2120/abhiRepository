package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdge {
public static void main(String[] args) {
	
	System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe")
    
	WebDriver driver=new EdgeDriver();
	
	
	driver.manage().window().maximize();
	
	Thread.sleep(2000);
	
	
	driver.close();



}
}
