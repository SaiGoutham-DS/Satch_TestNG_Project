package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClass;

public class Cart_Pojo extends BaseClass{
	

		
		public Cart_Pojo() {
		
			PageFactory.initElements(driver, this);
		}

		@FindBy(xpath="//span[text()='Luggage']")
		private WebElement luglink;
		
		@FindBy(xpath="(//span[@gtm-data-attr='button_teaser'])[1]")
		private WebElement check;
		
		@FindBy(xpath="//div[text()='Geo Storm']")
		private WebElement geo;
		
		@FindBy(xpath="//span[text()='Add to Cart']")
		private WebElement cart;
		
		@FindBy(xpath="//div[text()='Troublemaker']")
		private WebElement troublebag;
		
		@FindBy(id="addToCartBtn")
		private WebElement addcarttroubleBag;
		
		@FindBy(xpath="//a[@gtm-data-label='Cart desktop']")
		private WebElement myCart;
		
		@FindBy(xpath="(//a[@class='button'])[1]")
		private WebElement proceedCheckOut;
		
		@FindBy(xpath="//input[@placeholder='Email Address']")
		private WebElement email;
		
		
		@FindBy(id="billingAddressForm_billingAddress_salutation")
		private WebElement salutation;
		
		
		
		@FindBy(xpath="(//span[@class='label'])[2]")
		private WebElement country;
		
		
		
		@FindBy(xpath="//button[@title='Continue']")
		private WebElement continueBtn;
		
		@FindBy(xpath="//input[@placeholder='First Name']")
		private WebElement frst;
		
		public WebElement getFrst() {
			return frst;
		}

		public WebElement getLast() {
			return last;
		}

		@FindBy(xpath="//input[@placeholder='Last Name']")
		private WebElement last;

		public WebElement getTroublebag() {
			return troublebag;
		}

		public WebElement getAddcarttroubleBag() {
			return addcarttroubleBag;
		}

		public WebElement getMyCart() {
			return myCart;
		}

		public WebElement getProceedCheckOut() {
			return proceedCheckOut;
		}

		public WebElement getEmail() {
			return email;
		}

		public WebElement getSalutation() {
			return salutation;
		}

		public WebElement getCountry() {
			return country;
		}

		public WebElement getContinueBtn() {
			return continueBtn;
		}

		public WebElement getLuglink() {
			return luglink;
		}

		public WebElement getCheck() {
			return check;
		}

		public WebElement getGeo() {
			return geo;
		}

		public WebElement getCart() {
			return cart;
		}
		
		
		
		
		
	}



