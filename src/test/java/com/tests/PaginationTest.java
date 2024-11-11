package com.tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;
import java.util.stream.Collectors;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class PaginationTest {
    public static void main(String[] args) throws Exception {
        RestAssured.baseURI = "https://reqres.in/api"; // Replace with your actual API URL
  

        // Fetch items from page 1
        Response responsePage1 = given()
            .queryParam("page", 1)
            .when()
            .get("/resource") // Replace with your actual endpoint
            .then()
            .statusCode(200)
            .extract().response();
        
      ResponseBody response=  responsePage1.getBody();
      
      
        /***
        // Parse JSON and get items as a list
        JsonNode itemsPage1 = objectMapper.readTree(responsePage1.asString()).get("items");
        List<String> page1Items = itemsPage1.findValues("id").stream()
            .map(JsonNode::asText)
            .collect(Collectors.toList());
        
        

        // Fetch items from page 2
        Response responsePage2 = given()
            .queryParam("page", 2)
            .queryParam("size", 20)
            .when()
            .get("/items")
            .then()
            .statusCode(200)
            .extract().response();

        // Parse JSON and get items as a list
        JsonNode itemsPage2 = objectMapper.readTree(responsePage2.asString()).get("items");
        List<String> page2Items = itemsPage2.findValues("id").stream()
            .map(JsonNode::asText)
            .collect(Collectors.toList());

        // Check that each page contains 20 items
        assertThat("Page 1 should have 20 items", page1Items.size(), equalTo(20));
        assertThat("Page 2 should have 20 items", page2Items.size(), equalTo(20));

        // Check that items from page 1 and page 2 are not duplicated
        List<String> combinedItems = List.copyOf(page1Items);
        combinedItems.addAll(page2Items);
        assertThat("Items from page 1 and page 2 should not be duplicated",
                combinedItems.size(), equalTo(page1Items.size() + page2Items.size()));
        
        // Check that items are in order
        List<String> sortedCombinedItems = combinedItems.stream().sorted().collect(Collectors.toList());
        assertThat("Items should be in order across pages", combinedItems, equalTo(sortedCombinedItems));
        ***/
    }
}
