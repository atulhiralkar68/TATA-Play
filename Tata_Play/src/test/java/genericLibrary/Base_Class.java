package genericLibrary;
import java.awt.Robot;
import java.awt.AWTException;	

import java.awt.event.KeyEvent;	

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;


import io.github.bonigarcia.wdm.WebDriverManager;
import pomRepository.HandleCaptcha;
import pomRepository.Login_Page;

public class Base_Class implements FrameworkConstant {

	public WebDriverUTils wlib= new WebDriverUTils();
	public ExcelUtility elib = new ExcelUtility();
	public FileUtility fLib = new FileUtility();
	public UtilityMetods uLib = new UtilityMetods();
	
	public static WebDriver driver;


	@Parameters("browser")
	@BeforeClass
	public void openApplication(@Optional("chrome")String browserName) throws Throwable , AWTException {

		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			/*
			 * System.setProperty(CHROME_KEY,CHROME_PATH); driver=new ChromeDriver();
			 * Reporter.log("Successfully Launched Chrome Browser",true);
			 */
		}else if(browserName.equalsIgnoreCase("firefox")) {

			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			/*
			 * System.setProperty(FIREFOX_KEY,FIREFOX_PATH); driver=new FirefoxDriver();
			 * Reporter.log("Successfully Launched Firefox Browser",true);
			 */
		}else {
			Reporter.log("Enter valid Browser name");
		}
		driver.manage().window().maximize();
		Reporter.log("Browser window is maximized successfully",true);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebDriverWait explicitWait = new WebDriverWait(driver, 10);

		String URL=fLib.getPropertyKeyValue("url");
		driver.get(URL);
	}

	@BeforeMethod
	public void cofigBeforeMtd() throws Throwable {
		/*step 1 : login to app*/
		Login_Page login_Page = new Login_Page(driver);
		
		//String orgNAme = elib.getExcelData("Contact", "tc_01", "OrgName")+JavaUtils.getRanDomData() ;
		String subId = elib.getExcelData("LoginData", "tc_01", "Ids");

		HandleCaptcha handleCaptcha = new HandleCaptcha(driver);
		login_Page.getSubIdTextField().clear();
		login_Page.getSubIdTextField().sendKeys(subId);//3001529910
		login_Page.getContinueButton().click();

		String CaptchaUrl=fLib.getPropertyKeyValue("captcha_url");
		driver.get(CaptchaUrl);
		handleCaptcha.getAddToChromeButton().click();
		//Thread.sleep(20000);

		Thread.sleep(9000);
		Robot robot = new Robot();
		// Keep Attention Robot Class Release Key Immediately
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(5000);
		driver.navigate().back();
		login_Page.getOtpRadioButton().click();
		login_Page.getPasswordTextField().clear();
		login_Page.getPasswordTextField().sendKeys("123456");
		login_Page.getContinueButton().click();	
		Thread.sleep(20000);
		Reporter.log("=======login Successfuly======");
	}

	@AfterClass(alwaysRun=true)
	public void CloseApp() { 
		//driver.quit(); 
	}

}

