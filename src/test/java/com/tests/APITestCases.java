package com.tests;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class APITestCases {

    // Set base URI for the API
    static {
        RestAssured.baseURI = "https://reqres.in/";
    }

    // Test Case 1: Validate the status code of a GET request
    @Test
    public void testStatusCode() {
        given()
            .when()
            .get("/api/users/2")
            .then()
            .statusCode(200); // Verify that the status code is 200
    }
/***
    // Test Case 2: Validate response content type is JSON
    @Test
    public void testContentType() {
        given()
            .when()
            .get("/posts/1")
            .then()
            .contentType(ContentType.JSON); // Verify that the content type is JSON
    }

    // Test Case 3: Validate a specific field in the JSON response
    @Test
    public void testResponseBody() {
        given()
            .when()
            .get("/posts/1")
            .then()
            .body("userId", equalTo(1)) // Verify that userId is 1
            .body("id", equalTo(1)) // Verify that id is 1
            .body("title", notNullValue()); // Verify that title is not null
    }

    // Test Case 4: Validate the response contains an expected list of items
    @Test
    public void testResponseListSize() {
        given()
            .when()
            .get("/posts")
            .then()
            .body("size()", equalTo(100)); // Verify that there are 100 posts in the response list
    }

    // Test Case 5: Validate a POST request with response validation
    @Test
    public void testPostRequest() {
        Response response = given()
            .contentType(ContentType.JSON)
            .body("{ \"title\": \"foo\", \"body\": \"bar\", \"userId\": 1 }")
            .when()
            .post("/posts")
            .then()
            .statusCode(201) // Verify that the status code is 201 (Created)
            .extract().response();
        
        // Additional validations on the response data
        Assert.assertEquals(201, response.getStatusCode());
        Assert.assertEquals("foo", response.jsonPath().getString("title"));
    }
    ***/
}
