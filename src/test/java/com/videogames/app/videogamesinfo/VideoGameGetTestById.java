package com.videogames.app.videogamesinfo;


import com.videogames.app.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class VideoGameGetTestById extends TestBase {

    @Test
    public void getSingleProduct() {
        Response response = given()
                .pathParam("id", 12)
                .header("Accept", "application/json")
                .when()
                .get("/{id}");
        response.prettyPrint();
    }


}
