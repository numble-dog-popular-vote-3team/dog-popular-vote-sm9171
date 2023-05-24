package com.numble.dogpopularvote.dog.acceptance;

import io.restassured.RestAssured;
import io.restassured.response.ExtractableResponse;
import io.restassured.response.Response;

public class DogSteps {
    public static ExtractableResponse<Response> 강아지_목록_조회_요청(int size, int page) {
        return RestAssured
                .given()
                .param("size",size)
                .param("page",page).log().all()
                .when().get("/dog")
                .then().log().all().extract();
    }

    public static ExtractableResponse<Response> 강아지_상세_조회_요청(String dogId) {
        return RestAssured
                .given()
                .when().get("/dog/{dogId}", dogId)
                .then().log().all().extract();
    }
}
