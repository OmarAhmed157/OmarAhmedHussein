package webGUITestAutomation;

import static utils.Selenium_Base.getChromeDriver;
import static utils.Selenium_Base.getWebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Selenium_Base;

public class SecondTest {

	@Test
	void testHerokuFileUpload (){

		By FileUpload = By.xpath("//*[@id=\"content\"]/ul/li[18]/a");
		By ChooseFile = By.xpath("//*[@id=\"file-upload\"]");
		By Upload = By.xpath("//*[@id=\"file-submit\"]");
		String ImagePath = System.getProperty("user.dir") +"/src/test/resources/ImageUsedInSecondTask/Terkwaz.jpg";
		String ExpectedFile = "Terkwaz.jpg";
		By FileUploadedSuccessfully = By.xpath("//*[@id=\"uploaded-files\"]");


		//Navigate to Heroku
		Selenium_Base.Selenium_config("https://the-internet.herokuapp.com/");

		//Click on File Upload 
		getWebDriverWait().until(ExpectedConditions.visibilityOfElementLocated(FileUpload));
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(FileUpload));
		WebElement fileUpload = getChromeDriver().findElement(FileUpload);
		fileUpload.click();

		//add the image that will be uploaded
		getWebDriverWait().until(ExpectedConditions.visibilityOfElementLocated(ChooseFile));
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(ChooseFile));
		WebElement chooseFile = getChromeDriver().findElement(ChooseFile);
		chooseFile.sendKeys(ImagePath);

		//Click on Upload button
		getWebDriverWait().until(ExpectedConditions.visibilityOfElementLocated(Upload));
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(Upload));
		WebElement upload = getChromeDriver().findElement(Upload);
		upload.click();

		//Wait until uploading the image successfully
		getWebDriverWait().until(ExpectedConditions.visibilityOfElementLocated(FileUploadedSuccessfully));
		WebElement fileUploadedSuccessfully = getChromeDriver().findElement(FileUploadedSuccessfully);
		String ActualFile = fileUploadedSuccessfully.getText();

		//Assert that the image uploaded successfully
		Assert.assertEquals(ActualFile, ExpectedFile);
	}
}
