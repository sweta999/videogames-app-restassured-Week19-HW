package com.videogames.app.videogamesinfo;

import com.videogames.app.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class VideoGameDeleteTest extends TestBase {


    @Test
    public void getDeleteVideoGameByID() {
        Response response = given()
                .pathParam("id", 12 )
                .when()
                .delete("/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
