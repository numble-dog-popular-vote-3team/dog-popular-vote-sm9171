package com.numble.dogpopularvote.dog.api.dto;

import com.numble.dogpopularvote.dog.domain.entity.Dog;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class DogResponse implements Serializable {
    private Long dogId;
    private String name;
    private String pictureUrl;
    private String shortDescription;
    private String detailDescription;
    private Integer voteNumber;

    public static DogResponse from(Dog dog) {
        return DogResponse.builder()
                .dogId(dog.getId())
                .name(dog.getName())
                .pictureUrl(dog.getPictureUrl())
                .shortDescription(dog.getShortDescription())
                .detailDescription(dog.getDetailDescription())
                .voteNumber(dog.getVoteNumber())
                .build();
    }
}
