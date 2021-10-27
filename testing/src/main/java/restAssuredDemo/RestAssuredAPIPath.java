package restAssuredDemo;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.response.Response;
import restAssuredPojo.AuthRequest;

public class RestAssuredAPIPath {
	public static void main(String[] args) {
		System.out.println("started");
		
		AuthRequest authReq=new AuthRequest();
		authReq.setUsername("admin");
		authReq.setPassword("password123");
		
		Header acceptHeader=new Header("Content-Type", "application/json");
		Response response = RestAssured.given().header(acceptHeader)
				.body(authReq)
				.post("https://restful-booker.herokuapp.com/auth");
		response.body().prettyPrint();
				System.out.println("ended");
	}
}
