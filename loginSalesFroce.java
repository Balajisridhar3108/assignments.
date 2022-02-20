package week2.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginSalesFroce {

	public static void main(String[] args) {
		
		
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://qeagle-dev-ed.my.salesforce.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hari.radhakrishnan@qeagle.com");
		 
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Password@123");
		
		  driver.findElement(By.xpath("//input[@id='Login']")).click();
		  
		/*driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		  
		  driver.findElement(By.xpath("(//button[@type='button'])[49]")).click();
		  
		  
		  driver.findElement(By.xpath("(//p[@class='slds-truncate'])[7]")).click();
		  driver.findElement(By.xpath("(//one-app-nav-bar-item-root[@data-assistive-id='operationId'])[2]")).click();
		  
		  driver.findElement(By.xpath("//div[@title='New']")).click();
		  driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("Salesfore Automation by sowmiya");
		driver.findElement(By.xpath("//input[@name='CloseDate']")).sendKeys("02/20/2022");
		driver.findElement(By.xpath("//button[@aria-haspopup='listbox']")).click();
		driver.findElement(By.xpath("//lightning-base-combobox-item[@data-item-id='combobox-button-214-3']")).click();
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();*/
      
		
		  
		}


	}


