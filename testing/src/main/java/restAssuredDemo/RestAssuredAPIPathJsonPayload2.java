package restAssuredDemo;

import java.io.File;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class RestAssuredAPIPathJsonPayload2 {

		public static void main(String[] args) {
			System.out.println("started");
			File jsonFile = new File(
					"C:\\Users\\PrathibhaMahadevappa\\Desktop\\SDET\\SDETCode\\testing\\src\\main\\java\\restAssuredPojo\\Payload.json");
			Response response = RestAssured.given().contentType(ContentType.JSON).body(jsonFile)
					.post("https://restful-booker.herokuapp.com/auth");
			response.body().prettyPrint();
			System.out.println("ended");
		}


	}

