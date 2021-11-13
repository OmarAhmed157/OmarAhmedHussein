package apiTestAutomation;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.response.Response;
import utils.RestAssured_Base;

public class CatFactsAPI {

	@Test
	public void CheckTextIsNotNull() {

		String baseURL = "https://cat-fact.herokuapp.com/facts";
		String endPoint = "/random";

		//Call the needed API
		Response response = RestAssured_Base.Call(baseURL, endPoint);

		//Get text value
		int responseCode = response.getStatusCode();
		String responseNeeded = response.jsonPath().getString("text");
		System.out.println(responseNeeded);

		//Assert that Status code = 200 and text is not null
		Assert.assertEquals(responseCode, 200);
		Assert.assertNotNull(responseNeeded);
	}
}
