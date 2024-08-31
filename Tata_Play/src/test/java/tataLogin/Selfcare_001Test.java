package tataLogin;
import org.testng.annotations.Test;
import genericLibrary.Base_Class;
import pomRepository.HomePage;
import tataPlay.BaseClass;
	
public class Selfcare_001Test extends Base_Class {
	@Test
	public void sampleTest() throws Throwable {
		HomePage homePage = new HomePage(driver);
//		WebElement okGotIt = homePage.getOkayGotitLink();
//		wlib.waitForElemnetToBeClickable(driver, okGotIt);
		Thread.sleep(30000);
		homePage.getOkayGotitLink().click();
		BaseClass.baseclass(driver);
		homePage.getManagePackage().click();
		Thread.sleep(5000);
		homePage.getRefreshLink().click();
		Thread.sleep(10000);
		BaseClass.baseclass(driver);
		homePage.getiSymbol().click();
		Thread.sleep(2000);
		homePage.getViewDetails().click();
		BaseClass.baseclass(driver);
		homePage.getCrossMark().click();
		homePage.getViewDetailsLink().click();
		Thread.sleep(3000);
		BaseClass.baseclass(driver);
		homePage.getModifyPacksChannelsButton().click();
		Thread.sleep(3000);
		homePage.getModifyLink().click();
		Thread.sleep(4000);
	
		homePage.getOkayLink().click();
		Thread.sleep(4000);
		BaseClass.baseclass(driver);
		homePage.getBingeCombos().click();
		
		homePage.getMalayalamRegionalTVHDBingeNetflixPremium().click();
		//Thread.sleep(4000);
		BaseClass.baseclass(driver);
		
		homePage.getConfirmButton().click();
		Thread.sleep(2000);
		BaseClass.baseclass(driver);
	
		Thread.sleep(2000);
		homePage.getConfirmProceed().click();
		Thread.sleep(2000);
		BaseClass.baseclass(driver);
		
		homePage.getConfirmationButton().click();
		Thread.sleep(3000);
		BaseClass.baseclass(driver);
	}
}

