package com.mpokket.requests;


import org.testng.annotations.Test;

import com.mokket.pojos.CreateEmployeePOJO;
import com.mpokket.util.EndPoints;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.mapper.ObjectMapperType;
import io.restassured.response.Response;

public class createEmpData {
	@Test
	public void create() {
		
		   CreateEmployeePOJO createEmpPOJO = new CreateEmployeePOJO("Hritik", "12000", "25");
			Response createEmpResponse = RestAssured.given()
		   	.contentType(ContentType.JSON)
		   	.body(createEmpPOJO, ObjectMapperType.JACKSON_1)
		   .when()
		    .post(EndPoints.CREATE_EMPLOYEE.getLabel());
		    createEmpResponse.then()
		   	.assertThat().contentType(ContentType.JSON)
		   	 .statusCode(200)
		   	 .log().all();
	}


	}

