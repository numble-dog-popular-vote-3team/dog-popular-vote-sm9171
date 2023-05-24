package com.numble.dogpopularvote.dog.api.service;

import com.numble.dogpopularvote.dog.api.dto.DogResponse;
import com.numble.dogpopularvote.dog.api.dto.DogsResponse;
import com.numble.dogpopularvote.dog.domain.entity.Dog;
import com.numble.dogpopularvote.dog.domain.repository.DogRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class DogService {
    private final DogRepository dogRepository;

    public Page<DogsResponse> getDogs(PageRequest pageRequest) {
        return DogsResponse.from(dogRepository.findAll(pageRequest));
    }

    public DogResponse getDog(String dogId) {
        Dog findedDog = dogRepository.findById(Long.valueOf(dogId)).orElseThrow(() -> new EntityNotFoundException());
        return DogResponse.from(findedDog);
    }
}
