package Demoproject.Demoproject;




import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicSeleniumCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		//Creates a new ChromeDriver using the default server configuration.
		ChromeDriver driver = new ChromeDriver();
		
		//Loads a new web page in the current browser window. 
		driver.get("https://www.google.com");
		
		//Returns the title of the current page.
		System.out.println(driver.getTitle());
		
		//Maximizes the current window 
		driver.manage().window().maximize();
		
		//Returns the URL of the page currently loaded in the browser
		System.out.println(driver.getCurrentUrl());
		
		
		
		//Close the current window, quitting the browser if it's the last window currently open
		//driver.close();
		
		//Quits this driver, closing every associated window.
		driver.quit();
	}

}
