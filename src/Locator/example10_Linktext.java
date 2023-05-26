package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example10_Linktext
{
	public static void main(String[] args) throws InterruptedException 
	{		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/sanja/OneDrive/Desktop/Study/28Th%20Jan%20Eve/linktext_partialLinktext.html");
				
		Thread.sleep(2000);
		
		//click on facebook link
		driver.findElement(By.linkText("facebook")).click();		
	}
}
