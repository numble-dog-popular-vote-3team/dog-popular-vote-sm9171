package com.numble.dogpopularvote.dog.domain;

import com.numble.dogpopularvote.dog.domain.entity.Dog;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
public class DogTest {

    @Test
    void createDog() {
        Dog dog = Dog.builder()
                .id(1L)
                .voteNumber(1)
                .name("비숑")
                .pictureUrl("www.naver.com")
                .shortDescription("귀엽다")
                .detailDescription("솜사탕같다")
                .build();

        assertThat(dog.getName()).isEqualTo("비숑");
    }
}
