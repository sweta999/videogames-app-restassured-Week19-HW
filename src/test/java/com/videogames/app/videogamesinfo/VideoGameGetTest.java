package com.videogames.app.videogamesinfo;


import com.videogames.app.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class VideoGameGetTest extends TestBase {

    @Test
    public void getAllVideoGamesList() {
        Response response =
                given()
                        .header("Accept","application/json")
                        .when()
                        .get("");
        response.then().statusCode(200);
        response.prettyPrint();
    }


    @Test
    public void getSingleVideoGame() {
        Response response = given()
                .header("Accept","application/json")
                .pathParam("id", 2)
                .when()
                .get("/{id}");
        response.prettyPrint();
    }


}
