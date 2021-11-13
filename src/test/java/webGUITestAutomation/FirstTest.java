package webGUITestAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.*;
import static utils.Selenium_Base.*;

public class FirstTest {

	@Test
	void testSearchGoogle (){

		By Searchbar = By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input");
		By SearchButton = By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[5]/center/input[1]");
		String thirdElement = null;
		String expectedContainedText = "What is Selenium Web Driver?";

		//Navigate to Google
		Selenium_Base.Selenium_config("https://www.google.com/ncr");

		//Find and Type on search bar
		getWebDriverWait().until(ExpectedConditions.visibilityOfElementLocated(Searchbar));
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(Searchbar));
		WebElement searchBar = getChromeDriver().findElement(Searchbar);
		searchBar.sendKeys("Selenium WebDriver");

		//Click on search button
		getWebDriverWait().until(ExpectedConditions.visibilityOfElementLocated(SearchButton));
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(SearchButton));
		WebElement searchButton = getChromeDriver().findElement(SearchButton);
		searchButton.click();

		//loop to get the first 3 and check that the needed text is the same of the text of the third element
		for(int i=1;i<=3;i++) {
		
			By TheThirdElement = By.xpath(String.format("//*[@class=\"g\"][%s]/div/div/div[1]/a/h3", i));
			getWebDriverWait().until(ExpectedConditions.visibilityOfElementLocated(TheThirdElement));
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(TheThirdElement));
			WebElement theThirdElement = getChromeDriver().findElement(TheThirdElement);
			thirdElement = theThirdElement.getText();
			System.out.println(thirdElement + " in Iteration " +i);
		}
		Assert.assertTrue(thirdElement.contains(expectedContainedText));
	}
}
