package restAssuredDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.response.Response;

public class RestAssuredAPIDeSerialization {
    @Test
	public  void main() {
    	System.out.println("started");
        Header acceptHeader=new Header("accept", "application/json");
        Response response = RestAssured.given().header(acceptHeader).get("https://restful-booker.herokuapp.com/booking/1");
        response.body().prettyPrint();
        BookingResponse bookingResponse =response.as(BookingResponse.class);
		System.out.println("FNAME="+bookingResponse.getFirstname());
		System.out.println("LNAME="+bookingResponse.getLastname());
		System.out.println("Total Price="+bookingResponse.getTotalprice());
		System.out.println("depositpaid="+bookingResponse.isDepositpaid());
        BookingDates bookingdates = bookingResponse.getBookingdates();
		System.out.println("checkin="+bookingdates.getCheckin());
        System.out.println("checkout="+bookingdates.getCheckout());
        
		System.out.println("ended");
    }

	}