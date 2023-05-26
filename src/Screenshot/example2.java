package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class example2
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		String RS = RandomString.make(2);   //c1
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(src);
				
		File dest=new File("C:\\Users\\sanja\\OneDrive\\Desktop\\Study\\28Th Jan Eve\\Screenshots\\Image"+RS+".jpg");     //
	
		FileHandler.copy(src, dest);         //className.methodname(pathOfSource, pathOfDest);					
	}
	
}
