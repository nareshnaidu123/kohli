package genericutilities;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class WebDriverUtility {
	
	public void maximizeBrowserWindow(WebDriver driver) {
		driver.manage().window().maximize();
		
	}
	
	public void minimizeBrowserWindow(WebDriver driver) {
		driver.manage().window().minimize();
	}
	
	public void waitforPageload(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	//Select Class
	
	public void handleDropDrown(WebElement element,int index) {
		Select s =new Select(element);
		s.selectByIndex(index);
	}
	public void handleDropDrown(WebElement element,String value) {
		Select s =new Select(element);
		s.selectByValue(value);
	
}
	public void handleDropDrown(String visibletext,WebElement element) {
		Select s =new Select(element);
		s.selectByVisibleText(visibletext);
}
	
	//Action Class
	
	public void mouseovertoele(WebDriver driver ,WebElement element) {
		Actions a =new Actions(driver);
		a.moveToElement(element).perform();
}
	public void rightClick(WebDriver driver ,WebElement element) {
		Actions a =new Actions(driver);
		a.contextClick(element).perform();
}
	public void doubleClick(WebDriver driver ,WebElement element) {
		Actions a =new Actions(driver);
		a.doubleClick(element).perform();
}

	public void dragAndDrop(WebDriver driver ,WebElement srelement,WebElement destelement) {
		Actions a =new Actions(driver);
		a.dragAndDrop(srelement,destelement).perform();
		
}
	
	//Screenshot
	
	
	public void getScreenshot(WebDriver driver,String screnshotname) {
		TakesScreenshot ts =(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Madhu\\eclipse-workspace\\newm1\\SCRENSHLOTS\\"+ screnshotname+".png");
		try {
			Files.copy(src,dest);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
	
																									
	}
}
