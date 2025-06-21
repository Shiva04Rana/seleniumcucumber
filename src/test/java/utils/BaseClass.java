package utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	WebDriver driver;
	
	public BaseClass(WebDriver driver) {
		this.driver = driver;
	}
	

	
	public void switchWindowToChild() {
		Set<String>  s1 = driver.getWindowHandles();
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		for(String temp : s1) {
			System.out.println(temp);
			if(!temp.equals(parentWindow)) {
				System.out.println("enter" +temp);
				driver.switchTo().window(temp);
				break;
			}
		}
	}
	
	public String getTodaysDateyyyymmdd() {
       LocalDate today = LocalDate.now();
       
       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        
        return today.format(formatter);
	}
	

}
