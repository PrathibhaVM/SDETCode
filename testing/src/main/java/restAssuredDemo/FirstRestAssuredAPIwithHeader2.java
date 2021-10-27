package restAssuredDemo;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.response.Response;

public class FirstRestAssuredAPIwithHeader2 {

	public static void main(String[] args) {
		System.out.println("started");
		Header acceptHeader = new Header("accept", "application/json");
		Response response=RestAssured.given().header(acceptHeader).get("https://restful-booker.herokuapp.com/booking/1");
		int iStatus= response.getStatusCode();
	//	System.out.println("RESPONSE STATUS CODE=" +response.getBody().asString());
		System.out.println("RESPONSE STATUS CODE=" +iStatus);
	//	System.out.println("RESPONSE STATUS From print=" +response.getBody().print());
		 String resBody=response.getBody().print();
		System.out.println("ended");

	}

}
