package restAssuredAssignment;

import java.io.File;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.response.Response;
import restAssuredAssignmentPojo.RestAuthPOJO;
import restAssuredAssignmentPojo.responseDetailsAdmin;

public class Assignment {

	Header acceptHeader = new Header("accept", "application/json");
	String accessToken;
	Logger log;
	String sRemove;

	@Test
	public void TestCase01_getAccessToken() throws JsonParseException, JsonMappingException, IOException {

		sRemove = "<b>Warning</b>: mysqli::mysqli(): Headers and client library minor version mismatch. Headers:100508 Library:100236 in <b>/home/u942925711/domains/upskills.in/public_html/rest-api/system/library/db/mysqli.php</b> on line <b>7</b>";

		System.out.println("Test Case 01");
	
		PropertyConfigurator.configure("C:\\Users\\PrathibhaMahadevappa\\Desktop\\SDET\\SDETCode\\testing\\src\\log4j.properties");
		log = Logger.getLogger("devpinoyLogger");
		log.info("Rest Assured Project Assignment starts");

		
		Response res = RestAssured.given()
				.baseUri("http://rest-api.upskills.in/api/rest_admin/oauth2/token/client_credentials")
				.accept(ContentType.JSON)
				.header("Authorization",
						"Basic dXBza2lsbHNfcmVzdF9hZG1pbl9vYXV0aF9jbGllbnQ6dXBza2lsbHNfcmVzdF9hZG1pbl9vYXV0aF9zZWNyZXQ=")
				.when().post();
	
		String resBody = res.body().asString();
		resBody = resBody.replace(sRemove, "");
		log.info(resBody);
		ObjectMapper obj = new ObjectMapper();
		RestAuthPOJO token = obj.readValue(resBody, RestAuthPOJO.class);
		accessToken = token.getData().getAccess_token();
		log.info(accessToken);

		log.info("Test Case 01 validation completed");

	}

	@Test
	public void TestCase02_adminLogin() throws JsonParseException, JsonMappingException, IOException {

		System.out.println("Test Case 02 -Part 1");
		
		File jsonFile = new File(
				"C:\\Users\\PrathibhaMahadevappa\\Desktop\\SDET\\SDETCode\\testing\\src\\main\\java\\restAssuredAssignmentPojo\\Payload1.json");

		RestAssured.given().baseUri("http://rest-api.upskills.in/api/rest_admin/login")
				.header("Authorization", "Bearer " + accessToken).accept(ContentType.JSON).contentType(ContentType.JSON)
				.body(jsonFile).when().post()
				// Add script Assertion to validate status code and admin username
				.then().log().ifStatusCodeIsEqualTo(200);

		System.out.println("Test Case 02- Part 2");

		Response resDetails = RestAssured.given().header(acceptHeader)
				.baseUri("http://rest-api.upskills.in/api/rest_admin/user")
				.header("Authorization", "Bearer " + accessToken).accept(ContentType.JSON).contentType(ContentType.JSON)
				.body(jsonFile).when().get();

		String sBody = resDetails.body().asString();
		sBody = sBody.replace(sRemove, "");
		ObjectMapper obj = new ObjectMapper();
		responseDetailsAdmin details = obj.readValue(sBody, responseDetailsAdmin.class);
		String userName = details.getData().getUsername();
		Assert.assertEquals(userName, "upskills_admin");

		System.out.println("Test Case 02 - Part 3");

		RestAssured.given().baseUri("http://rest-api.upskills.in/api/rest_admin/logout")
				.header("Authorization", "Bearer " + accessToken).accept(ContentType.JSON).contentType(ContentType.JSON)
				.when().post()
				// Add script Assertion to validate status code and admin username
				.then().log().ifStatusCodeIsEqualTo(200);

		log.info("TC002 validation completed");

	}

	@Test
	public void TestCase03_AddNewCustomer() {

		System.out.println("Test Case 03");

		File jsonFile = new File(
				"C:\\Users\\PrathibhaMahadevappa\\Desktop\\SDET\\SDETCode\\testing\\src\\main\\java\\restAssuredAssignmentPojo\\NewCustomer.json");

		
		RestAssured.given().header(acceptHeader).baseUri("http://rest-api.upskills.in/api/rest_admin/customers")
				.header("Authorization", "Bearer " + accessToken).accept(ContentType.JSON).contentType(ContentType.JSON)
				.body(jsonFile).when().post()
				.then().log().ifStatusCodeIsEqualTo(200); //Validation

		RestAssured.given().header(acceptHeader)
				.baseUri("http://rest-api.upskills.in/api/rest_admin/customers/added_on/2017-04-30")
				.header("Authorization", "Bearer " + accessToken).accept(ContentType.JSON).contentType(ContentType.JSON)
				.body(jsonFile).when().post()
				.then().log().ifStatusCodeIsEqualTo(200); //Validation

	}
}