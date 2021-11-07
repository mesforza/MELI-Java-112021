package MercadoLibre.MercadoLibre.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;
import org.testng.annotations.Test;
//import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     * @throws 
 
     */
    @Test
    public void shouldAnswerWithTrue() throws InterruptedException
    {
    	
    	// file properties
    	File file = new File("C:\\Users\\Usuario\\eclipse-workspace\\MercadoLibre.demo\\ReadData\\src\\dataFilesSearch.properties");
    	FileInputStream fileInput = null;
    	
    	try {
			fileInput = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties prop = new Properties();
				
		try {
			prop.load(fileInput);
		} catch (IOException es) {
			es.printStackTrace();
		}
		// end file properties
		
		// Test
    	
        assertTrue( true );
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Usuario\\Documents\\Selenium WebDriver\\Webdriver\\chromedriver-95.exe");
		WebDriver driver=new ChromeDriver();
		//JavascriptExecutor js = (JavascriptExecutor) driver; 
		driver.manage().window().maximize();
		driver.get("https://www.mercadolibre.com/");
		
		
		
		
		HomePage MeliHome = new HomePage(driver);
		MeliHome.btnCountry().click();
		MeliHome.getNavSearchInput().sendKeys(prop.getProperty("inputBusqueda"));
		MeliHome.getNavSearchButton().click();
		
		ProductsPage ProductsPage = new ProductsPage(driver);
		ProductsPage.getTooltipButtonClose().click();
		
		// validation type 1
		Boolean Display = ProductsPage.getBreadcrumbTitle().isDisplayed();
		System.out.println("Element displayed is :"+Display);
		
		// validation type 2
		String ActualTitle = ProductsPage.getBreadcrumbTitle().getText();
		String ExpectedTitle = prop.getProperty("inputBusqueda2");
		Assert.assertEquals(ExpectedTitle, ActualTitle);
		
		ProductsPage.getMinimumPrice().sendKeys(prop.getProperty("initialPrice"));
		ProductsPage.getMaximumPrice().sendKeys(prop.getProperty("topPrice"));
		ProductsPage.getSubmitPrice().click();
		Thread.sleep(3000); 
		driver.findElement(By.cssSelector("a[aria-label=\"'+location+'\"]")).click();
		//ProductsPage.
		//cy.get('a[aria-label="'+location+'"]').click()
		Thread.sleep(3000); 
		ProductsPage.getTitleOfSearchResult().click();
		
	   	

		
    }
}
