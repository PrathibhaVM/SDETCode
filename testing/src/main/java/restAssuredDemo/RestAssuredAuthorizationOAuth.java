package restAssuredDemo;

import java.io.File;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import restAssuredPojo.TokenAuthorization;

public class RestAssuredAuthorizationOAuth {
	public class RestAssuredAuthorizatioOAuth {
		@Test
		public void main() {
			System.out.println("started");
			
			TokenAuthorization tokenauth = new TokenAuthorization();
			tokenauth.setAction("Authorization");
			tokenauth.setToken("Basic dXBza2lsbHNfcmVzdF9hZG1pbl9vYXV0aF9jbGllbnQ6dXBza2lsbHNfcmVzdF9hZG1pbl9vYXV0aF9zZWNyZXQ=");
			
			String sRemove="<b>Warning</b>: mysqli::mysqli(): Headers and client library minor version mismatch. Headers:100508 Library:100236 in <b>/home/u942925711/domains/upskills.in/public_html/rest-api/system/library/db/mysqli.php</b> on line <b>7</b>";
			Response resp=RestAssured
							//GIVEN
								.given()
									.baseUri("http://rest-api.upskills.in/api/rest_admin/oauth2/token/client_credentials")
									.accept(ContentType.JSON)
									.body(tokenauth)
									//.header("Authorization","Basic dXBza2lsbHNfcmVzdF9hZG1pbl9vYXV0aF9jbGllbnQ6dXBza2lsbHNfcmVzdF9hZG1pbl9vYXV0aF9zZWNyZXQ=")
							//WHEN
								.when()
									.post();
			String sBody=resp.body().asString();
//			resp.jsonPath().getString(sBody)
			sBody=sBody.replace(sRemove, "");
			System.out.println(sBody);
			
			
			System.out.println("ended");
		}
	}
}
