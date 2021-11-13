package webGUITestAutomation;

import static utils.Selenium_Base.getChromeDriver;
import static utils.Selenium_Base.getWebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Selenium_Base;

public class ThirdTest {
	
	@Test
	void testHerokuDynamicLoading (){

		By DynamicLoading = By.xpath("//*[@id=\"content\"]/ul/li[14]/a");
		By Example2 = By.xpath("/html/body/div[2]/div/div/a[2]");
		By Start = By.xpath("/html/body/div[2]/div/div/div/button");
		By HelloWorldText = By.xpath("/html/body/div[2]/div/div/div[1]/h4");
		String ExpectedHelloWorldText = "Hello World!";

		//Navigate to Heroku
		Selenium_Base.Selenium_config("https://the-internet.herokuapp.com/");

		//Click on Dynamic Loading 
		getWebDriverWait().until(ExpectedConditions.visibilityOfElementLocated(DynamicLoading));
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(DynamicLoading));
		WebElement dynamicLoading = getChromeDriver().findElement(DynamicLoading);
		dynamicLoading.click();

		//Click on Example 2
		getWebDriverWait().until(ExpectedConditions.visibilityOfElementLocated(Example2));
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(Example2));
		WebElement example2 = getChromeDriver().findElement(Example2);
		example2.click();

		//Click on Start button
		getWebDriverWait().until(ExpectedConditions.visibilityOfElementLocated(Start));
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(Start));
		WebElement start = getChromeDriver().findElement(Start);
		start.click();

		//Wait until Hello World text appears
		getWebDriverWait().until(ExpectedConditions.visibilityOfElementLocated(HelloWorldText));
		WebElement helloWorldText = getChromeDriver().findElement(HelloWorldText);
		String ActualhelloWorldText = helloWorldText.getText();

		//Check that the text Hello World appears successfully
		Assert.assertEquals(ActualhelloWorldText, ExpectedHelloWorldText);
	}

}
