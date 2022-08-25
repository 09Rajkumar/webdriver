package selenium.webdriver.basictest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//https://github.com/mozilla/geckodriver/releases/--> path to donwload firefox driver
		System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		//FirefoxDriver driver = new FirefoxDriver(); //Invoke browser
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.guru99.com/test/newtours/");//open URL in browser
		driver.findElement(By.name("userName")).sendKeys("mercury");//Enter username
		driver.findElement(By.name("password")).sendKeys("mercury"); //Enter password
		driver.findElement(By.name("submit")).click(); //click on submit button
		String exptitle = "Login: Mercury Tours";
		String acttitle=driver.getTitle();//return title of page
		System.out.println(acttitle);
		if(exptitle.equals(acttitle))
			System.out.println("Test is passed");
		else
			System.out.println("Test is fail");
		
		
			driver.close();
			
		// JavaTCoding--for upload project on github
		
	}

}
