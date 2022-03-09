package com.mpokket.requests;

import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

import com.mpokket.util.EndPoints;



public class deleteEmpData {
	@Test
public void deleteEmployeesData () {
		given()
		.param("employeeid", "Emp01")
		.when()
		.delete(EndPoints.DELETE_SINGLE_EMPLOYEE.getLabel())
		.then()
		.assertThat().statusCode(200)
		
		.log().all();
}
}
