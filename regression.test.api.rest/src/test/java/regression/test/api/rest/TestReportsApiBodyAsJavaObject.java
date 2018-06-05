package regression.test.api.rest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import model.ReportsApiModel;

public class TestReportsApiBodyAsJavaObject {

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
	public void TestReportsApiBodyAsJavaObjectJson() {
	
	Map<String, String> merchant = new HashMap<String, String>();
	
	merchant.put("apiLogin","pRRXKOl8ikMmt9u");
	merchant.put("apiKey","4Vj8eK4rloUd272L48hsrarnUA");
	
	ReportsApiModel request = new ReportsApiModel();
	
	request.setCommand("PING");
	request.setLanguage("en");
	request.setMerchant(merchant);
	request.setTest(false);
	
	Response responseApiReports = given()
			.contentType("application/json")
			.body(request)
			.when()
				.post("/4.0/service.cgi");
				/*.then()
					.statusCode(200);*/
	
	System.out.println(responseApiReports.body().asString());
	
	}
	
	@Test
	public void TestReportsApiBodyAsJavaObjectXml() {
	
	Map<String, String> merchant = new HashMap<String, String>();
	
	merchant.put("apiLogin","pRRXKOl8ikMmt9u");
	merchant.put("apiKey","4Vj8eK4rloUd272L48hsrarnUA");
	
	ReportsApiModel request = new ReportsApiModel();
	
	request.setCommand("PING");
	request.setLanguage("en");
	request.setMerchant(merchant);
	request.setTest(false);
	
	Response responseApiReports = given()
			.contentType("application/xml")
			.body(request)
			.when()
				.post("/4.0/service.cgi");
				/*.then()
					.statusCode(200);*/
	
	System.out.println(responseApiReports);
	
	}

	
}
	
