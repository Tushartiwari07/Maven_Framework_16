package com.qsp.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePageDemoWebShop {
	public WelcomePageDemoWebShop(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	@FindBy(linkText = "Log in")
	private WebElement loginLink;

	@FindBy(xpath = "//span[text()='Shopping cart']")
	private WebElement cartLink;

	@FindBy(xpath = "//span[text()='Wishlist']")
	private WebElement wishlistLink;

	@FindBy(linkText = "Log out")
	private WebElement logoutLink;

	@FindBy(id = "small-searchterms")
	private WebElement searchTextField;

	@FindBy(xpath = "//input[@value='Search']")
	private WebElement searchButton;

	@FindBy(partialLinkText = "Books")
	private WebElement booksLink;

	@FindBy(partialLinkText = "COMPUTERS")
	private WebElement computerLink;

	@FindBy(partialLinkText = "Apparel & Shoes")
	private WebElement shoesLink;

	@FindBy(partialLinkText = "Digital downloads")
	private WebElement digitalDownloadsLink;

	@FindBy(partialLinkText = "Jewelry")
	private WebElement jewelryLink;

	@FindBy(partialLinkText = "Gift Cards")
	private WebElement giftCardsLink;

	@FindBy(xpath = "(//a[@class='account'])[1]")
	private WebElement accountLink;

	@FindBy(id = "pollanswers-1")
	private WebElement excellentRadioutton;

	@FindBy(id = "pollanswers-2")
	private WebElement goodRadioButton;

	@FindBy(id = "pollanswers-3")
	private WebElement poorRadioButton;

	@FindBy(id = "pollanswers-4")
	private WebElement veryBadRadioButton;

	@FindBy(id = "vote-poll-1")
	private WebElement voteButton;

	public WebElement getLoginLink() {
		return loginLink;
	}

	public WebElement getCartLink() {
		return cartLink;
	}

	public WebElement getWishlistLink() {
		return wishlistLink;
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}

	public WebElement getSearchTextField() {
		return searchTextField;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public WebElement getBooksLink() {
		return booksLink;
	}

	public WebElement getComputerLink() {
		return computerLink;
	}

	public WebElement getShoesLink() {
		return shoesLink;
	}

	public WebElement getDigitalDownloadsLink() {
		return digitalDownloadsLink;
	}

	public WebElement getJewelryLink() {
		return jewelryLink;
	}

	public WebElement getGiftCardsLink() {
		return giftCardsLink;
	}

	public WebElement getAccountLink() {
		return accountLink;
	}

	public WebElement getExcellentRadioutton() {
		return excellentRadioutton;
	}

	public WebElement getGoodRadioButton() {
		return goodRadioButton;
	}

	public WebElement getPoorRadioButton() {
		return poorRadioButton;
	}

	public WebElement getVeryBadRadioButton() {
		return veryBadRadioButton;
	}

	public WebElement getVoteButton() {
		return voteButton;
	}

}
