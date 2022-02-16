package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

import io.github.bonigarcia.wdm.WebDriverManager;

public class w2d3assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https:/acme-test.uipath.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("leaf@12");
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		driver.findElement(By.xpath("//div[@class='main-container']"));
		  String title1="main-container";
		  String title=driver.getTitle();
		  System.out.println("The title is:"+title);
		  if(title.equals(title1))
		  {
			  System.out.println("the page is displayed");
		  }else
			  System.out.println("the page is not displayed");
		  driver.findElement(By.xpath("//a[@href='https://acme-test.uipath.com/logout']")).click();
		  Thread.sleep(2000);
		  driver.close();

	}

}
