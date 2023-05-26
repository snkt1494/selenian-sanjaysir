package Locator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class example6_Tagname 
{
	public static void main(String[] args) 
	{		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/sanja/OneDrive/Desktop/Study/28Th%20Jan%20Eve/Tagname.html");
			
		//enter FN
		driver.findElement(By.tagName("input")).sendKeys("abc");
		
		//enter LN
		driver.findElement(By.tagName("input")).sendKeys("xyz");	
	}
}
