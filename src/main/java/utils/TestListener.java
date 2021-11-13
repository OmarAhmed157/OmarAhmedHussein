package utils;

import static utils.Selenium_Base.close;
import java.io.IOException;
import org.openqa.selenium.NoSuchSessionException;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.TestListenerAdapter;

public class TestListener extends TestListenerAdapter {

	@Override
	public void onTestFailure(ITestResult tr) {
		Reporter.log("The test "+tr.getName()+ " is Failed "+tr.getStatus());
		String methodName = tr.getName();
		try {
			Selenium_Base.takeScreenShot(methodName);
			
			//Close the browser
			close();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		catch (NoSuchSessionException e) {
			System.out.println("No session, no UI for screenshot");
		}
	}

	@Override
	public void onTestSkipped(ITestResult tr) {
	}

	@Override
	public void onTestSuccess(ITestResult tr) {
		Reporter.log("The test "+tr.getName()+ " is succeeded "+tr.getStatus());
		String methodName = tr.getName();
		
		try {
			Selenium_Base.takeScreenShot(methodName);
			
			//Close the browser
			close();
		} 
		catch (IOException e) {
			e.printStackTrace();
		} 
		catch (NoSuchSessionException e) {
			System.out.println("No session, no UI for screenshot");
		}
		
	}

}


