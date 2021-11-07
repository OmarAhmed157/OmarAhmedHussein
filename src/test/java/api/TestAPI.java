package api;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.apache.poi.EncryptedDocumentException;

import applicationProperties.properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.*;

import static utils.Selenium_Base.*;


public class TestAPI {

	@Test
	void testSearchGoogle (){
		By Searchbar = By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input");
		By SearchButton = By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]");
		By Text =  By.xpath("//*[@class=\"LC20lb DKV0Md\"][1]");

			//Open Google website
			Selenium_Base.Selenium_config("https://www.google.com/ncr");

			//Find and Type on search bar
			getWebDriverWait().until(ExpectedConditions.visibilityOfElementLocated(Searchbar));
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(Searchbar));
			WebElement searchBar = getChromeDriver().findElement(Searchbar);
			searchBar.sendKeys("Selenium WebDriver");

			//Click on search button
			getWebDriverWait().until(ExpectedConditions.visibilityOfElementLocated(SearchButton));
			WebElement searchButton = getChromeDriver().findElement(SearchButton);
			getJavascriptExecutor().executeScript("arguments[0].click();",searchButton);

			//Assert that the text is found
			getWebDriverWait().until(ExpectedConditions.visibilityOfElementLocated(Text));
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(Text));
			//TODO
			WebElement text = getChromeDriver().findElement(Text);
			String gettingText = text.getText();
			System.out.println(gettingText);

		Assert.assertEquals(gettingText, "Selenium Webdriver Tutorial with Examples | BrowserStack");
		Assert.assertEquals(gettingText, "Selenium Webdriver Tutorial with Examples | BrowserStack");


		}

	@Test
	void testGoogle (){
		By Searchbar = By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input");
		By SearchButton = By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]");
		By Text =  By.xpath("//*[@class=\"LC20lb DKV0Md\"][1]");

		//Open Google website
		Selenium_Base.Selenium_config("https://www.google.com/ncr");

		//Find and Type on search bar
		getWebDriverWait().until(ExpectedConditions.visibilityOfElementLocated(Searchbar));
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(Searchbar));
		WebElement searchBar = getChromeDriver().findElement(Searchbar);
		searchBar.sendKeys("Selenium WebDriver");

		//Click on search button
		getWebDriverWait().until(ExpectedConditions.visibilityOfElementLocated(SearchButton));
		WebElement searchButton = getChromeDriver().findElement(SearchButton);
		getJavascriptExecutor().executeScript("arguments[0].click();",searchButton);

		//Assert that the text is found
		getWebDriverWait().until(ExpectedConditions.visibilityOfElementLocated(Text));
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(Text));
		//TODO
		WebElement text = getChromeDriver().findElement(Text);
		String gettingText = text.getText();
		System.out.println(gettingText);

		Assert.assertEquals(gettingText, "Selenium Webdriver Tutorial with Examples | BrowserStack");
		Assert.assertEquals(gettingText, "Selenium Webdriver Tutorial with Examples | BrowserStack");


	}

		


}
