package com.numble.dogpopularvote.dog.api.dto;

import com.numble.dogpopularvote.dog.domain.entity.Dog;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.domain.Page;

import java.io.Serializable;

@Data
@Builder
public class DogsResponse implements Serializable {
    private Long dogId;
    private String name;
    private String pictureUrl;
    private String shortDescription;
    private Integer voteNumber;

    public static Page<DogsResponse> from(Page<Dog> dogs) {
        Page<DogsResponse> dogResponse = dogs.map(dog ->
                DogsResponse.builder()
                        .dogId(dog.getId())
                        .name(dog.getName())
                        .pictureUrl(dog.getPictureUrl())
                        .shortDescription(dog.getShortDescription())
                        .voteNumber(dog.getVoteNumber())
                        .build());
        return dogResponse;
    }
}
