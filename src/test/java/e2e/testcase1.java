package e2e;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;


import static utils.Selenium_Base.*;

public class testcase1 {

    By DropDown = By.xpath("");
    By TextInput = By.xpath("");
    By Site = By.xpath("");
    By Arrow = By.xpath("");
    By DownloadReport = By.xpath("");
    By Download = By.xpath("");

    @Test
    void fistTestcase() throws InterruptedException {

        //to Click
        getWebDriverWait().until(ExpectedConditions.elementToBeClickable(DropDown));
        getWebDriverWait().until(ExpectedConditions.visibilityOfElementLocated(DropDown));
        WebElement dropdown = getChromeDriver().findElement(DropDown);
        getJavascriptExecutor().executeScript("arguments[0].click();",dropdown);




        //to wait, or wait until
        Thread.sleep(500);


        //to Type
        getWebDriverWait().until(ExpectedConditions.visibilityOfElementLocated(TextInput));
        WebElement textinput = getChromeDriver().findElement(TextInput);
        textinput.sendKeys("hello");


}

}
