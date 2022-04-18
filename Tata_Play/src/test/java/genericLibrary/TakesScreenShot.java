package genericLibrary;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakesScreenShot {

	public static void baseclass(WebDriver driver) throws Throwable {

		ExcelUtility elib = new ExcelUtility();
		String subId = elib.getExcelData("LoginData", "tc_01", "Ids");
		
		TakesScreenshot ts=(TakesScreenshot)driver; 
		File tempScreenshot =ts.getScreenshotAs(OutputType.FILE); 
		//File screenshot = new File("C:\\Screenshots\\.png "+System.currentTimeMillis()); 
		File screenshot = new File("C:\\Screenshots\\.png "+subId);
		FileUtils.copyFile(tempScreenshot, screenshot);
		
	}

}
