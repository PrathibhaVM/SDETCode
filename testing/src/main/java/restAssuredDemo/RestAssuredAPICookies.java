package restAssuredDemo;

import java.io.File;

import org.testng.annotations.Test;

import gherkin.deps.com.google.gson.JsonObject;
import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.response.Response;

public class RestAssuredAPICookies {
	@Test
	public void main() {
		System.out.println("started");
		Header acceptHeader=new Header("accept", "application/json");
		
		File jsonFile = new File(
				"C:\\Users\\PrathibhaMahadevappa\\Desktop\\SDET\\SDETCode\\testing\\src\\main\\java\\restAssuredPojo\\Payload.json");
		
		Response response = RestAssured
			.given()
				.baseUri("http://dummy.restapiexample.com/api/v1/create")
				.header(acceptHeader)
				.body(jsonFile)
			.when()
				.post();
		response.prettyPrint();
		System.out.println(response.detailedCookies());
		System.out.println(response.getCookie("PHPSESSID"));
		System.out.println("ended");
	}
}
