package com.prestashop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.prestashop.utilities.Driver;

public class HomePage {
	public HomePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(id = "js-link-box-en")
	public WebElement EnglishLan;
	
	@FindBy(id = "js-link-box-es")
	public WebElement EspanyolLan;

	@FindBy(id = "js-link-box-ru")
	public WebElement RusskiyLan;
	
	@FindBy(id = "js-link-box-it")
	public WebElement ItalianoLan;
	
	@FindBy(id = "js-link-box-pt")
	public WebElement PortuguesLan;

	@FindBy(id = "js-link-box-ja")
	public WebElement NigongoLan;

	@FindBy(id = "js-link-box-de")
	public WebElement DeutschLan;
	
	@FindBy(id = "js-link-box-fr")
	public WebElement FrançaisLan;
	
	@FindBy(id = "js-link-box-zh")
	public WebElement ZhongwenLan;
	
	@FindBy(id = "js-link-box-pl")
	public WebElement PolskiLan;

	@FindBy (id = "searchInput")
	public WebElement SearchItem;
	
	
	@FindBy(xpath = "//*[@class='pure-button pure-button-primary-progressive']")
	public WebElement ClickSeacrh;
	
	
}







