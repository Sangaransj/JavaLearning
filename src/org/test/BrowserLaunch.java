package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\eclipse-workspace\\SeleniumDay1\\lib\\driver" );
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cricbuzz.com");
		driver.get("https://www.cricbuzz.com");
		driver.get("https://www.cricbuzz.com");
		driver.get("https://www.cricbuzz.com");
		driver.get("https://www.cricbuzz.com");
	}

}
