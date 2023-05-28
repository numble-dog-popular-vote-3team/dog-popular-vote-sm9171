package com.numble.dogpopularvote.dog.acceptance;

import io.restassured.response.ExtractableResponse;
import io.restassured.response.Response;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("강아지 기능")
public class DogAcceptanceTest extends AcceptanceTest{

    @DisplayName("강아지 전체 조회")
    @Test
    void findAllDogs() {
        int size = 6;
        int page = 0;
        ExtractableResponse<Response> response = DogSteps.강아지_목록_조회_요청(size, page);

        assertThat(response.jsonPath().getList("content").size()).isEqualTo(5);
    }

    @DisplayName("강아지 상세 조회")
    @Test
    void findDog() {
        String dogId = "1";
        ExtractableResponse<Response> response = DogSteps.강아지_상세_조회_요청(dogId);

        assertThat(response.jsonPath().getString("id")).isEqualTo("1");
        assertThat(response.jsonPath().getString("name")).isEqualTo("두두");
    }
}
