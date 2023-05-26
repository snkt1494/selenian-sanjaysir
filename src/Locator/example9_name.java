package Locator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class example9_name
{
	public static void main(String[] args) 
	{		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/sanja/OneDrive/Desktop/Study/28Th%20Jan%20Eve/name.html");
				
		//enter FN
		driver.findElement(By.name("xyz123")).sendKeys("abc");
		
		//enter LN
		driver.findElement(By.name("xyz123")).sendKeys("xyz");			
	}
}
