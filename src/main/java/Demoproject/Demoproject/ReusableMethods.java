package Demoproject.Demoproject;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ReusableMethods {

	public ChromeDriver driver;
	public static final String RADIOBUTTON1 = "//input[@value='radio1']";
	public static final String RADIOBUTTON2 = "//input[@value='radio2']";
	public static final String Nametextbox = "//input[@id='name' and @name='enter-name']";
	public static final String FOOTER = "//div[@id='gf-BIG']/table/tbody/tr/td/ul/li";
	public static final String foot = "//div[@id='gf-BIG']/table/tbody/tr/td/ul/li";
	public static final String staticdropdown = "//select[@id='dropdown-class-example']";
	public static final String ALERTBUTTON = "//input[@id='alertbtn']";
	public static final String Dynamicdropdown = "//input[@placeholder='Type to Select Countries']";
	public static final String option = "//*[@id='ui-id-1']";
	public static final String checkbox = "//*[@id='checkBoxOption1']";
	public static final String Alertpopup = "//input[@id='alertbtn']";
	public static final String Alert2 = "//*[@id='confirmbtn']";
	public static final String iFramepath = "//iframe[@id='courses-iframe']";
	public static final String iFrameelemnt = "//div[@class='login-btn'][1]/a";
	public static final String windowbutton = "//button[@id='openwindow']";

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ReusableMethods RM = new ReusableMethods();
		RM.launchbrowser();
		RM.navigateTOBaseURL("https://rahulshettyacademy.com/AutomationPractice/");

		  RM.getCurrenturl();
		  RM.click(By.xpath(RADIOBUTTON1), "Firs radio button"); 
		  RM.click(RADIOBUTTON2,  "Second Radio button"); 
		  RM.setText(Nametextbox, "saikrishna", "Namefield");
		  RM.pause(3000L); 
		  RM.clearText(Nametextbox, "namefield text box");
		  RM.typeInField(Nametextbox, "Automation testing", "Name field");
		  RM.findelements(FOOTER);
		  RM.testingfooter(foot); 
		  RM.getTitle();
		  RM.noOfElementsPresent(FOOTER); 
		  RM.getRandomString(); 
		  RM.getRandomString(5);
		  RM.generateRandomDigits(5); 
		  RM.getCurrentDate();
		  RM.highlightElement(Nametextbox);
		  RM.selectDropdownValueByIndex(staticdropdown, 2); 
		  RM.pause(3000l);
		  RM.selectDropdownValueByValue(staticdropdown, "option2"); 
		  RM.pause(3000l);
		  RM.selectDropdownValueByVisibleText(staticdropdown, "Option1"); //
		  // RM.deleteFiles(System.getProperty("user.dir")+ "/src/test/resources/downloads"); 
		  RM.scrollToWebElement(Nametextbox);
		  RM.manageSimpleAlert(ALERTBUTTON); 
		  RM.sendkeys(Dynamicdropdown, "IND","Dynamic dropdown"); 
		  RM.Checkboxes(checkbox, "slected", "1st checkbox");
		  RM.frames(iFramepath, iFrameelemnt); 
		  RM.windowhandles(windowbutton);
		  RM.closebrowser();
		 
	}
	@Test
	public void launchbrowser() {
		WebDriverManager.chromedriver().setup();
		// ChromeDriver driver = new ChromeDriver();
		// System.setProperty("webdriver.chrome.driver","C:\\Space\\chromedriver_win32.exe");
		// WebDriver driver = new ChromeDriver();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}
	@Test
	public void navigateTOBaseURL(String url) {
		driver.get(url);
		System.out.println("Navigated to the URL:- " + url);

	}
	
	public void getCurrenturl() {
		String currenturl = driver.getCurrentUrl();
		System.out.println("Current URL:- " + currenturl);
	}
	
	public void click(By by, String elementName) {
		driver.findElement(by).click();
		System.out.println("Clicked on:- " + elementName);
	}
	
	public void click(String xpath, String elementName) {
		driver.findElement(By.xpath(xpath)).click();
		System.out.println("Clicked on:- " + elementName);
	}
	
	public void setText(String xpath, String text, String elementName) {

		driver.findElement(By.xpath(xpath)).sendKeys(text);
		System.out.println("Entered the text" + "  " + text + " in " + elementName);

	}
	
	public void pause(long l) {
		try {
			Thread.sleep(l);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void clearText(String xpath, String elementName) {

		driver.findElement(By.xpath(xpath)).clear();
		System.out.println("Cleared the text in the " + elementName);
	}
	
	public void typeInField(String xpath, String value, String elementName) {
		String val = value;
		clearText(xpath, elementName);
		for (int i = 0; i < val.length(); i++) {
			char c = val.charAt(i);
			pause(100);
			String s = new StringBuilder().append(c).toString();
			driver.findElement(By.xpath(xpath)).sendKeys(s);
		}
		System.out.println("Entered " + value + " character by character in the " + elementName);
	}
	
	public void findelements(String xpath) {
		int noOfLinks = driver.findElements(By.xpath(xpath)).size();
		List<WebElement> elements = driver.findElements(By.xpath(xpath));
		for (int i = 0; i < noOfLinks; i++) {
			String text = elements.get(i).getText();
			System.out.println("Element " + (i + 1) + " in the footer is:- " + text);
		}
	}
	
	public void testingfooter(String xpath) {

		int foot = driver.findElements(By.xpath(xpath)).size();
		System.out.println("number of links in the footer" + " " + foot);

	}
	
	public String getTitle() {
		System.out.println("Title of the page is:- " + driver.getTitle());
		return driver.getTitle();

	}
	
	public int noOfElementsPresent(String xpath) {
		int noOfElements = driver.findElements(By.xpath(xpath)).size();
		System.out.println("No. of elements present are:- " + noOfElements);
		return noOfElements;

	}
	
	public Boolean waitForElementToBeDisplayed(WebElement element, int specifiedTimeout) {

		WebDriverWait wait = new WebDriverWait(driver, specifiedTimeout);
		ExpectedCondition<Boolean> elementIsDisplayed = arg0 -> element.isDisplayed();
		return wait.until(elementIsDisplayed);
	}
	
	public String getRandomString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
		LocalDateTime now = LocalDateTime.now();
		String randomString = dtf.format(now);
		System.out.println("Random String generated is:- " + randomString);
		return randomString;
	}
	
	public String getRandomString(int n) {

		// choose a Character random from this String
		String alphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";

		// create StringBuffer size of AlphaNumericString
		StringBuilder sb = new StringBuilder(n);

		for (int i = 0; i < n; i++) {

			// generate a random number between
			// 0 to AlphaNumericString variable length
			int index = (int) (alphaNumericString.length() * Math.random());

			// add Character one by one in end of sb
			sb.append(alphaNumericString.charAt(index));
		}
		String randomString = sb.toString();
		System.out.println("Random String that is generated:- " + randomString);
		return randomString;
	}
	
	public int generateRandomDigits(int n) {
		int m = (int) Math.pow(10, n - 1);
		int digit = m + new Random().nextInt(9 * m);
		System.out.println("Generated random digit:- " + digit);
		return digit;
	}
	
	public String getCurrentDate() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDateTime now = LocalDateTime.now();
		String date = dtf.format(now);
		System.out.println("Current Date:- " + date);
		return date;
	}
	
	public void highlightElement(String xpath) {
		WebElement ele = driver.findElement(By.xpath(xpath));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", ele);

	}

	/*
	 * public void deleteFiles(String path) { System.out.println("path:- "+path);
	 * File directory = new File(path); File[] files = directory.listFiles(); for
	 * (File file : files) { System.out.println("Deleting the file:- "+
	 * file.getName()); file.delete();
	 */
	
	public void selectDropdownValueByIndex(String xpath, int index) {
		Select se = new Select(driver.findElement(By.xpath(xpath)));
		se.selectByIndex(index);
		System.out.println("Selected dropdown value which has index:- " + index);

	}
	public void selectDropdownValueByValue(String xpath, String value) {
		Select se = new Select(driver.findElement(By.xpath(xpath)));
		se.selectByValue(value);
		System.out.println("Selected dropdown value which has value:- " + value);

	}
	
	public void selectDropdownValueByVisibleText(String xpath, String text) {
		Select se = new Select(driver.findElement(By.xpath(xpath)));
		se.selectByVisibleText(text);
		System.out.println("Selected dropdown with visible text:- " + text);
	}
	
	public void scrollToWebElement(String xpath) {
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath(xpath)));
		pause(1000L);
	}
	
	public void implicitWait(int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	
	public void explicitwait(String xpath, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));

	}

	// Fluentwait
	
	public void manageSimpleAlert(String xpath) {
		driver.findElement(By.xpath(xpath)).click();
		String text = driver.switchTo().alert().getText();
		System.out.println("Text on the alert is:- " + text);
		driver.switchTo().alert().accept();
	}
	
	public void sendkeys(String xpath, String Enteredtext, String elementname) {

		driver.findElement(By.xpath(xpath)).sendKeys(Enteredtext);
		System.out.println("Entered the following country name : - " + " " + Enteredtext + "  " + elementname);

		pause(2000l);
		List<WebElement> options = driver.findElements(By.xpath(option));
		for (int i = 0; i < options.size(); i++) {
			if (options.get(i).getText().equalsIgnoreCase("India")) {
				options.get(i).click();
				break;
			}
		}
	}
	
	public void Checkboxes(String xpath, String checkbox, String elementname) {

		if (!driver.findElement(By.xpath(xpath)).isSelected()) {

			driver.findElement(By.xpath(xpath)).click();
			System.out.println("selected the checkbox ");

		}
	}
	
	public void alerthandles(String xpath1) {

		/*
		 * WebElement alert = driver.findElement(By.xpath(xpath1)); alert.click();
		 * System.out.println(driver.switchTo().alert().getText());
		 * driver.switchTo().alert().accept(); pause(3000l);
		 * System.out.println(driver.switchTo().alert().getText()); pause(3000l);
		 */

		WebElement alert2 = driver.findElement(By.xpath(xpath1));
		alert2.click();
		pause(2000l);
		System.out.println(driver.switchTo().alert().getText());
		pause(2000l);
		driver.switchTo().alert().dismiss();
		pause(2000l);

	}

	public void frames(String frame, String frameElement) throws InterruptedException {
		System.out.println("entered frame method");
		WebElement framepath = driver.findElement(By.xpath(frame));
		driver.switchTo().frame(framepath);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath(frameElement)));
		String text = driver.findElement(By.xpath(frameElement)).getText();
		System.out.println("Text in frame " + text);
		driver.findElement(By.xpath("//div[@class='header-upper']//li/a[text()='Courses']")).click();
		pause(2000l);
		boolean flag = driver.findElement(By.xpath("//input[@placeholder='Find a product']")).isDisplayed();
		System.out.println("flag " + flag);
//		driver.switchTo().frame(frameleft);
//		pause(3000l);
//        System.out.println("text inside frame "+driver.findElement(By.xpath("//section[@class='page-title']//h1")).getText());
//		WebElement FE = driver.findElement(By.xpath(frameElement));
//		FE.click();
//		System.out.println(driver.getTitle());

	}
    
	public void windowhandles(String xpath) {

		WebElement windowbutton = driver.findElement(By.xpath(xpath));
		windowbutton.click();

		// String parent = driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();

		// iterate using iterator

		Iterator<String> it = windows.iterator();

		String parentid = it.next();
		String Childid = it.next();

		driver.switchTo().window(Childid);
		pause(3000l);
		System.out.println(
				driver.findElement(By.xpath("//*[@id=\"header-part\"]/div[2]/div/div/div[2]/div/div[2]/a")).getText());

		driver.switchTo().window(parentid);
		System.out.println("enterd into parent window");

	} 
    
	public void closebrowser() {
		driver.close();
	}

}
