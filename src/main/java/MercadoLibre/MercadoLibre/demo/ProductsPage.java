package MercadoLibre.MercadoLibre.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductsPage {
	
public WebDriver driver;
	
	By getTooltipButtonClose = By.cssSelector(".andes-tooltip-button-close");
	By getBreadcrumbTitle = By.cssSelector(".ui-search-breadcrumb__title");
	By getMinimumPrice = By.cssSelector("[data-testid=Minimum-price]");
	By getMaximumPrice = By.cssSelector("[data-testid=Maximum-price]");
	By getSubmitPrice = By.cssSelector("[data-testid=submit-price]");
	By getTitleOfSearchResult = By.cssSelector("h2[class=ui-search-item__title]");
	
	
	
	public ProductsPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement getTooltipButtonClose(){
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".andes-tooltip-button-close")));
		return driver.findElement(getTooltipButtonClose);
	}
	
	
	public WebElement getBreadcrumbTitle(){
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ui-search-breadcrumb__title")));
		return driver.findElement(getBreadcrumbTitle);
	}
	
	public WebElement getMinimumPrice(){
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[data-testid=Minimum-price]")));
		return driver.findElement(getMinimumPrice);
	}
	
	public WebElement getMaximumPrice(){
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[data-testid=Maximum-price]")));
		return driver.findElement(getMaximumPrice);
	}
	
	public WebElement getSubmitPrice(){
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[data-testid=Maximum-price]")));
		return driver.findElement(getSubmitPrice);
	}
	
	public WebElement getTitleOfSearchResult(){
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h2[class=ui-search-item__title]")));
		return driver.findElement(getTitleOfSearchResult);
	}
	
	 
	public WebElement getNewProducts(){
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h2[class=ui-search-item__title]")));
		return driver.findElement(getTitleOfSearchResult);
	}

	/*
	public WebElement getNewProducts(){
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h2[class=ui-search-item__title]")));
		return driver.findElement(getTitleOfSearchResult);
	}*/
	   


	
}
