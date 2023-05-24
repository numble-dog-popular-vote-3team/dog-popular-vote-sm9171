package com.numble.dogpopularvote.dog.api.controller;

import com.numble.dogpopularvote.dog.api.dto.DogResponse;
import com.numble.dogpopularvote.dog.api.dto.DogsResponse;
import com.numble.dogpopularvote.dog.api.service.DogService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DogController {
    private final DogService dogService;

    @GetMapping("/dog")
    public ResponseEntity<Page<DogsResponse>> getDogs(@RequestParam("page") Integer page, @RequestParam("size") Integer size){
        PageRequest pageRequest = PageRequest.of(page, size);
        return ResponseEntity.ok(dogService.getDogs(pageRequest));
    }

    @GetMapping("/dog/{dogId}")
    public ResponseEntity<DogResponse> getDog(@PathVariable String dogId){
        return ResponseEntity.ok(dogService.getDog(dogId));
    }
}
