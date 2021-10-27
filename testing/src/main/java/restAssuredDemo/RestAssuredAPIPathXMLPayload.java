package restAssuredDemo;

import java.io.File;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class RestAssuredAPIPathXMLPayload {


			public static void main(String[] args) {
				System.out.println("started");
				File xmlFile = new File(
						"C:\\Users\\PrathibhaMahadevappa\\Desktop\\SDET\\SDETCode\\testing\\src\\main\\java\\restAssuredPojo\\Payload.xml");

				Response response = RestAssured.given().contentType(ContentType.XML).body(xmlFile)
						.post("https://restful-booker.herokuapp.com/auth");
				response.body().prettyPrint();
				System.out.println("ended");
			}

	}

