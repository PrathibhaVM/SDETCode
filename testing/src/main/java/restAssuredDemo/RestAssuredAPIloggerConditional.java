package restAssuredDemo;

import java.io.File;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class RestAssuredAPIloggerConditional {
	@Test
	public void main() {
		System.out.println("started");
		File jsonFile = new File(
				"C:\\Users\\PrathibhaMahadevappa\\Desktop\\SDET\\SDETCode\\testing\\src\\main\\java\\restAssuredPojo\\Payload.json");
		RestAssured
				//GIVEN
					.given()
						.baseUri("https://restful-booker.herokuapp.com/auth")
						.contentType(ContentType.JSON)
						.body(jsonFile)
				//WHEN
					.when()
					.log()
					//.all()
					.body()
						.post()
				//THEN
					.then()
					.log()
				    .ifValidationFails() //to print log only when it fails
				    .statusCode(202);
					
		System.out.println("ended");
	}
}
