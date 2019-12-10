package ObjectPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjects  extends Basepage {

	
	// @FindBy(xpath="//*[@id=\'block_top_menu\']/ul/li[1]/a")
	//private WebElement womenTag;
	// private WebElement dresstag;
	// private WebElement Tshirts;
	
//	public Homepage() //constructor
	//{
		//PageFactory.initElements(driver, this);
//	}
	
	// public WebElement getWomentag() {
	//	return womenTag;
//	}
//	public WebElement getDressTag()
	//{
		// return dresstag;
	// }
	// public WebElement Tshirts()
	// {
	//	return Tshirts;
	// }
// }  
	@FindBy(xpath = "//*[@id='block_top_menu']/ul/li[1]/a")
	private WebElement women;
	
	@FindBy(xpath = "//div/ul/li/a[text()='Dresses']")
	private WebElement dresses;
	
	@FindBy(xpath = "//div[@id='block_top_menu']/ul/li[3]/a")
	private WebElement tshirts;
	
	@FindBy(id = "newsletter-input")
	private WebElement txtBoxNewsLetter;
	
	@FindBy(name = "submitNewsletter")
	private WebElement btnSubmitNewsLetter;
	
	@FindBy(xpath = "//*[@class='alert alert-success']")
	private WebElement txtSubscription;
	
	
	
	public HomePageObjects () //constructor
	{
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getWomen()
	{
		return women;
		
	}
	
	public WebElement getDresses()
	{
		return dresses;
	}
	
	public WebElement gettshirts()
	{
		return tshirts;
	}
	
	public void clickWomen()
	{
		women.click();
	}
	
	public String getTitleWomen()
	{
		return women.getText();
	}
	
	public void clickDresses()
	{
		dresses.click();
	}
	
	public String getTitleDresses()
	{
		return dresses.getText();
	}
	
	public void clickTshirts()
	{
		tshirts.click();
	}
	
	public String getTitleTshirts()
	{
		return tshirts.getText();
	}
	
	public void setNewsLetter(String email)
	{
		setText(txtBoxNewsLetter,email);
		btnSubmitNewsLetter.click();
	}
	
	public String getTxtNewsletterMessage()
	{
		return txtSubscription.getText();
	}

}




