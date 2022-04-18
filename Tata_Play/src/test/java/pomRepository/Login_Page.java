package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibrary.UtilityMetods;

public class Login_Page extends UtilityMetods{

	public Login_Page (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className="form-control")
	private WebElement subIdTextField;

	@FindBy(xpath="//span[text()='Continue']")
	private WebElement continueButton;

	@FindBy(xpath="//span[text()='OTP']")
	private WebElement otpRadioButton;

	@FindBy(xpath="//input[@class='form-control']")
	private WebElement passwordTextField;

	public WebElement getSubIdTextField() {
		return subIdTextField;
	}

	public WebElement getContinueButton() {
		return continueButton;
	}

	public WebElement getOtpRadioButton() {
		return otpRadioButton;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}


}
