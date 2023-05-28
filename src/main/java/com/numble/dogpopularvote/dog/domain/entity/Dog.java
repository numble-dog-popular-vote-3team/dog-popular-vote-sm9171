package com.numble.dogpopularvote.dog.domain.entity;

import com.numble.dogpopularvote.common.domain.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "dog")
public class Dog extends BaseEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String pictureUrl;
    private String shortDescription;
    private String detailDescription;
    private Integer voteNumber;
}
