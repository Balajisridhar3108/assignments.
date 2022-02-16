package week2.day3;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class createLeads {

	public static void main(String[] args)
	{
	  WebDriverManager.chromedriver().setup();
	  ChromeDriver driver=new ChromeDriver();
	  driver.get("http://www.leafground.com/pages/Button.html");
	  driver.manage().window().maximize();
	  
	  driver.findElement(By.id("home")).click();
	  String title1="TestLeaf - Selenium Playground";
	  String title=driver.getTitle();
	  System.out.println("The title is:"+title);
	  if(title.equals(title1))
	  {
		  System.out.println("the page is displayed");
	  }else
		  System.out.println("the page is not displayed");
	     driver.findElement(By.linkText("Button")).click();
	  
	  Point location = driver.findElement(By.id("position")).getLocation();
	        int x = location.getX();
	        System.out.println("The x value is:"+x);
	        int y = location.getY();
	        System.out.println("The location of y:"+y);
	System.out.println(driver.findElement(By.id("color")).getCssValue("background-color"));
	 
	 WebElement size=driver.findElement(By.id("size"));
	 Dimension sizes=size.getSize();
	 System.out.println(sizes);
	 driver.close();
	
	}

}