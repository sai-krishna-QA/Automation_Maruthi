package Demoproject.Demoproject;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
          WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println("Enterd into the url");
		
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='courses-iframe']")));
		System.out.println("entered frame method");
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//html/body/div/header/div[3]/div/div/div[2]/nav/div[2]/ul/li[4]/a")));
		Thread.sleep(2000);
		

		driver.findElement(By.xpath("//html/body/div/header/div[3]/div/div/div[2]/nav/div[2]/ul/li[4]/a")).click();
		System.out.println(driver.getTitle());
		driver.close();
	}
}
