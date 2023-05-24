package com.numble.dogpopularvote.dog.domain.repository;

import com.numble.dogpopularvote.dog.domain.entity.Dog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DogRepository extends JpaRepository<Dog, Long> {

}
