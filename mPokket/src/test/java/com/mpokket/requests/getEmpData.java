package com.mpokket.requests;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class getEmpData {
	@Test
	public void getEmployeesData() {
		given()
		.param("empid", "emp01")
		.when()
		.get("https://dummy.restapiexample.com")
		.then()
		.assertThat().statusCode(200)
		.assertThat().contentType(ContentType.JSON)
		.log().all();
	}
}
