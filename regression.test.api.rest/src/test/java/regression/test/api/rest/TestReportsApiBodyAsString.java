package regression.test.api.rest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestReportsApiBodyAsString {

	@BeforeClass
	public void SetUp() {
		
		RestAssured.baseURI = "https://sandbox.api.payulatam.com";
		RestAssured.basePath = "/reports-api";
		
		//https://sandbox.api.payulatam.com/reports-api/4.0/service.cgi
	}
	
	/*@AfterClass
	public void TearDown() {
	
	}*/
	
	@Test
	public void TestReportsApiBodyAsString() {
		
	Response responseApiReports = given()
			.contentType("application/json")
			.body("{"
				+ "\"test\": false,"
				+ "\"language\": \"en\","
				+ "\"command\": \"PING\","
				+ "\"merchant\": {"
					+ "\"apiLogin\": \"pRRXKOl8ikMmt9u\","
					+ "\"apiKey\":\"4Vj8eK4rloUd272L48hsrarnUA\""
				+ "}"
			 +"}")
			.when()
				.post("/4.0/service.cgi");
				/*.then()
					.statusCode(200);*/
	
	 		System.out.println(responseApiReports.body().asString());
	
	}
}
	
