package bns.Com;
//make class

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bns_resgistrationTest {
//how to  declare browser method 
	WebDriver driver;
	
	@BeforeTest
	public void openbrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();//
	}
    @Test
    public void RegistrationFrom() throws Exception {
    	
	driver.get("https://bnscorporation.com/bns-login/");
	// get the url threw method
	
	//how to get the find elements
	driver.findElement(By.id("LN")).sendKeys("Roy");
	
	driver.findElement(By.name("Email")).sendKeys("Roy@gmail.com");
	driver.findElement(By.xpath("//*[@id=\"PW\"]")).sendKeys("12345");
	driver.findElement(By.id("PH")).sendKeys("121923012");
   //How to get drop down mennu
	//it is  select method
	
	Select monthSelect=new Select(driver.findElement(By.id("MN")));
	monthSelect.selectByVisibleText("Jun");
	
	
	Select daySelect=new Select(driver.findElement(By.id("DY")));
	daySelect.selectByVisibleText("10");
	
	Select yearSelect=new Select(driver.findElement(By.id("YR")));
	yearSelect.selectByVisibleText("1997");
    
	driver.findElement(By.xpath("//*[@id=\"content\"]/article/div/div/div/div/section[1]/div/div/div/div/div/div/div/div/div[2]/input[7]")).click();
	driver.findElement(By.name("SSN")).click();
	
}
    // close the browser
   @AfterTest
   public void CloseBrowser() {
	   driver.close();
   }
}
