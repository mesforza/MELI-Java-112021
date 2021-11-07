package MercadoLibre.MercadoLibre.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	public WebDriver driver;
	
	By pickCountry = By.id("AR");
	By getNavSearchInput = By.cssSelector(".nav-search-input");
	By getNavSearchButton = By.cssSelector(".nav-icon-search");
	
	
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement btnCountry(){
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("AR")));
		return driver.findElement(pickCountry);
	}
	
	public WebElement getNavSearchInput(){
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".nav-search-input")));
		return driver.findElement(getNavSearchInput);
	}
	
	public WebElement getNavSearchButton(){
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".nav-icon-search")));
		return driver.findElement(getNavSearchButton);
	}
	
	
}
