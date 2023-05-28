package com.numble.dogpopularvote.dog.api.controller;

import com.numble.dogpopularvote.dog.api.dto.DogResponse;
import com.numble.dogpopularvote.dog.api.dto.DogsResponse;
import com.numble.dogpopularvote.dog.api.service.DogService;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DogController {
    private final DogService dogService;

    @GetMapping("/dog")
    @Cacheable(cacheNames = "dogs", value = "dogs", key = "#page")
    public Page<DogsResponse> getDogs(@RequestParam("page") Integer page) {
        PageRequest pageRequest = PageRequest.of(page, 8);
        return dogService.getDogs(pageRequest);
    }

    @GetMapping("/dog/{dogId}")
    public DogResponse getDog(@PathVariable String dogId) {
        return dogService.getDog(dogId);
    }
}
