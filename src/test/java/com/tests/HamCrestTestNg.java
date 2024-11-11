package com.tests;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class HamCrestTestNg {

    @BeforeClass
    public void setup() {
        RestAssured.baseURI = "https://reqres.in/";
    }

    // Test Case 1: Validate the status code of a GET request
    @Test
    public void testStatusCode() {
        Response response = given()
            .when()
            .get("/api/users/2");

        assertThat("Status code is 200", response.getStatusCode(), equalTo(200));
    }

    // Test Case 2: Validate response content type is JSON
    @Test
    public void testContentType() {
        Response response = given()
            .when()
            .get("/api/users/2");
       // System.out.println(response.getContentType());

        assertThat("Content type contains JSON", response.getContentType(), containsString("application/json"));
       // assertThat("Content type is JSON", response.getContentType(), equalTo(ContentType.JSON.toString()));
    }
    /***
    // Test Case 3: Validate a specific field in the JSON response
    @Test
    public void testResponseBody() {
        Response response = given()
            .when()
            .get("/posts/1");

        assertThat("UserId is 1", response.jsonPath().getInt("userId"), equalTo(1));
        assertThat("Id is 1", response.jsonPath().getInt("id"), equalTo(1));
        assertThat("Title is not null", response.jsonPath().getString("title"), notNullValue());
    }

    // Test Case 4: Validate the response contains an expected list of items
    @Test
    public void testResponseListSize() {
        Response response = given()
            .when()
            .get("/posts");

        assertThat("Response list size is 100", response.jsonPath().getList("").size(), equalTo(100));
    }

    // Test Case 5: Validate a POST request with response validation
    @Test
    public void testPostRequest() {
        Response response = given()
            .contentType(ContentType.JSON)
            .body("{ \"title\": \"foo\", \"body\": \"bar\", \"userId\": 1 }")
            .when()
            .post("/posts");

        // Assert status code and body values
        assertThat("Status code is 201", response.getStatusCode(), equalTo(201));
        assertThat("Title is foo", response.jsonPath().getString("title"), equalTo("foo"));
        assertThat("Body is bar", response.jsonPath().getString("body"), equalTo("bar"));
        assertThat("UserId is 1", response.jsonPath().getInt("userId"), equalTo(1));
    }
    ***/
}
