package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public HomePage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//img[@title=' Manage Pack']")
	private WebElement managePackage;

	@FindBy(xpath="//a[text()='Refresh']")
	private WebElement refreshLink;

	@FindBy(xpath="//span[@class='ldp-pack']")
	private WebElement iSymbol;

	@FindBy(xpath="//h3[text()='Primary Box']/../..//a[text()='View Details']")
	private WebElement viewDetails;
	
	@FindBy(xpath="//h2[text()='Monthly payable Amount']/../../..//i[@class='demo-icon icon-close-1']")
    private WebElement crossMark;
	
	@FindBy(xpath="//div[text()='Monthly Charges']/..//a[text()='View Details']")
	private WebElement viewDetailsLink;
	
	@FindBy(xpath="//button[text()='Modify Packs & Channels']")
	private WebElement modifyPacksChannelsButton;
	
	@FindBy(xpath="//span[text()='Modify']")
	private WebElement modifyLink;
	
	@FindBy(xpath="//a[text()='Binge Combos']")
	private WebElement bingeCombos;
	
	@FindBy(xpath = "//div[text()='Malayalam Regional TV HD Binge Netflix Premium']/../..//label[text()='Get this Combo']")
	private WebElement MalayalamRegionalTVHDBingeNetflixPremium;
	
	@FindBy(xpath = "(//Button[text()='Okay Got it'])[1]")
	private WebElement OkayGotitLink;
	
	@FindBy(xpath = "//a[text()='Okay']")
	private WebElement okayLink;
	
	@FindBy(xpath = "//a[text()='Confirm']")
	private WebElement confirmButton;
	
	@FindBy(xpath = "//button[text()='Confirm & Proceed']")
	private WebElement ConfirmProceed;
	
	@FindBy(xpath = "//button[text()='Confirm']")
	private WebElement confirmationButton;
	
	@FindBy(xpath = "//button[text()='Replace Combo & Proceed']")
	private WebElement replaceComboAndProceed;
	
	
	
	
	public WebElement getManagePackage() {
		return managePackage;
	}

	public WebElement getRefreshLink() {
		return refreshLink;
	}

	public WebElement getiSymbol() {
		return iSymbol;
	}

	public WebElement getViewDetails() {
		return viewDetails;
	}

	public WebElement getCrossMark() {
		return crossMark;
	}

	public WebElement getViewDetailsLink() {
		return viewDetailsLink;
	}

	public WebElement getModifyPacksChannelsButton() {
		return modifyPacksChannelsButton;
	}

	public WebElement getModifyLink() {
		return modifyLink;
	}

	public WebElement getBingeCombos() {
		return bingeCombos;
	}

	public WebElement getMalayalamRegionalTVHDBingeNetflixPremium() {
		return MalayalamRegionalTVHDBingeNetflixPremium;
	}

	public WebElement getOkayGotitLink() {
		return OkayGotitLink;
	}

	public WebElement getOkayLink() {
		return okayLink;
	}

	public WebElement getConfirmButton() {
		return confirmButton;
	}

	public WebElement getConfirmProceed() {
		return ConfirmProceed;
	}

	public WebElement getConfirmationButton() {
		return confirmationButton;
	}

	public WebElement getReplaceComboAndProceed() {
		return replaceComboAndProceed;
	}
	
	
	
	
	
	
	
	
	
	
}
