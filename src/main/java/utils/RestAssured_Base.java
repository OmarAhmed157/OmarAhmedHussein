package utils;

import static io.restassured.RestAssured.given;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class RestAssured_Base {

	public static Response Call(String BaseURL, String EndPoint) {

		RestAssured.baseURI = BaseURL;
		Response response = given()
				.contentType(ContentType.JSON)
				.when()
				.get(EndPoint)
				.then()
				.extract().response();

		return response;
	}
}
