package genericutilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import expclass.LoginPage;

public class Baseclass {
	
	public PropertyFileUtility pu=new PropertyFileUtility();
	public ExcelFileUtility eu=new ExcelFileUtility();
	public WebDriverUtility wu=new WebDriverUtility();
	public JavaUtility ju=new JavaUtility();
	public WebDriver wd=null;
	
	@BeforeSuite
	 
	public void beforeSuiteConfig()  {
		System.out.println("====Db Connection====");
	}

	@AfterSuite
	
	public void afterSuiteConfig() {
		System.out.println("====Db disconnected====");
	}
	
	@BeforeClass
	  public void beforeClassConfig() throws Throwable {
		String Browser=pu.readDataFromPropertyfile("browser");
		String Url=pu.readDataFromPropertyfile("url");
		if(Browser.equalsIgnoreCase("edge")) {
			wd=new EdgeDriver();
			System.out.println("Edge driver is launched");
			
		}else if(Browser.equalsIgnoreCase("chrome")) {
			wd=new ChromeDriver();
			System.out.println("Chrome browser is launched"); 
			
			}else {
				System.out.println("Invalid browser name");
		}
		wd.get(Url);
		wu.maximizeBrowserWindow(wd);
		wu.waitforPageload(wd);
		wu.getScreenshot(wd, "login");
	}
	
	@AfterClass
	
	public void afterClassConfig() {
		wd.quit();
	}
	@BeforeMethod 
	public void beforeMethodConfig() throws Throwable {
		
	String UN=pu.readDataFromPropertyfile("un");
	String PWD=pu.readDataFromPropertyfile("pwd");
	LoginPage Lp=new LoginPage(wd);
	Lp.loginToApp(UN,PWD);
	wu.getScreenshot(wd, "home");
	}
	 @AfterMethod
	 
	 public void afterMethodConfig() {
		 System.out.println("log out from application");
		 
	 }
	
	
	
		
		
		
		
		}
		

	

