package MercadoLibre.MercadoLibre.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage {

	public class ProductsPage {
		
		public WebDriver driver;
			
			By getTooltipButtonClose = By.cssSelector(".andes-tooltip-button-close");
						
			
			public ProductsPage(WebDriver driver) {
				this.driver=driver;
			}
			
			public WebElement getTooltipButtonClose(){
				WebDriverWait wait = new WebDriverWait(driver, 20);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".andes-tooltip-button-close")));
				return driver.findElement(getTooltipButtonClose);
			}
	
	}	
}
