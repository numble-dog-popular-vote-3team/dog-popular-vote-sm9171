package com.numble.dogpopularvote.dog.utils;

import com.numble.dogpopularvote.dog.domain.entity.Dog;
import com.numble.dogpopularvote.dog.domain.repository.DogRepository;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("test")
@Component
public class DataLoader {
    private DogRepository dogRepository;

    public DataLoader(DogRepository dogRepository) {
        this.dogRepository = dogRepository;
    }

    public void loadData() {
        dogRepository.save(new Dog(1L, "후추", "url", "잘생김","애교가 많음",0));
        dogRepository.save(new Dog(2L, "배리", "url", "귀여움","말을 잘들음",0));
        dogRepository.save(new Dog(3L, "샌디", "url", "사랑스러움","사람을 잘 따름",0));
        dogRepository.save(new Dog(4L, "두두", "url", "엉뚱함","엄청 활발적임",0));
        dogRepository.save(new Dog(5L, "버거", "url", "똑똑함","성격이 좋음",0));
    }
}