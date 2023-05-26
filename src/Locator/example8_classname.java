package Locator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class example8_classname
{
	public static void main(String[] args) 
	{		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/sanja/OneDrive/Desktop/Study/28Th%20Jan%20Eve/classname.html");
				
		//enter FN
		driver.findElement(By.className("abc123")).sendKeys("abc");
		
		//enter LN
		driver.findElement(By.className("abc123")).sendKeys("xyz");			
	}
}
