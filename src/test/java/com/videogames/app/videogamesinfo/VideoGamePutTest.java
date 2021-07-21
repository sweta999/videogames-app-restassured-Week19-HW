package com.videogames.app.videogamesinfo;



import com.videogames.app.VideoGamesPojo;
import com.videogames.app.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class VideoGamePutTest extends TestBase {


    @Test
    public void updateVideoGameWithPut() {

        VideoGamesPojo videoGamesPojo = new VideoGamesPojo();
        videoGamesPojo.setId(13);
        videoGamesPojo.setName("Pacman3");
        videoGamesPojo.setReleaseDate("1985-08-20T11:08:09.573Z");
        videoGamesPojo.setReviewScore(1545);
        videoGamesPojo.setCategory("Maze");
        videoGamesPojo.setRating("2");


        Response response = given()
                .pathParam("id",13 )
                .header("Accept", "application/json")
                .body(videoGamesPojo)
                .when()
                .put("/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }

}
