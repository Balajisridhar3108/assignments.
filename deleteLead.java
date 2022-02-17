package week2.day3;import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class deleteLead {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.name("USERNAME")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		String title=driver.getTitle();
		System.out.println(title);
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		//Thread.sleep(2000);
		driver.findElement(By.linkText("Phone")).click();
		driver.findElement(By.name("phoneCountryCode")).clear();
		driver.findElement(By.name("phoneCountryCode")).sendKeys("+91");
		//driver.findElement(By.name("phoneAreaCode")).sendKeys("20");
		driver.findElement(By.name("phoneNumber")).sendKeys("6380397708");
		driver.findElement(By.linkText("Find Leads")).click();
		Thread.sleep(2000);
		WebElement Ele = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a"));
		String t = Ele.getText();
		System.out.println(t);
		
		Ele.click();
		driver.findElement(By.linkText("Delete")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.name("id")).sendKeys(t);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String text2 = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
		System.out.println(text2);
		driver.close();
		}


}
