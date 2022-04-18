package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HandleCaptcha {

	public HandleCaptcha (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h1[@class='e-f-w']/../../..//div[text()='Add to Chrome']")
	private WebElement addToChromeButton;

	public WebElement getAddToChromeButton() {
		return addToChromeButton;
	}
	




}
