package com.mohit.demo.service;

import com.mohit.demo.dto.request.AnimalRequest;
import com.mohit.demo.dto.response.AnimalResponse;

import java.util.List;

public interface AnimalService {

    AnimalResponse getAnimal(int id);
    List<AnimalResponse> getAllAnimal();
    AnimalResponse addAnimal(AnimalRequest animalRequest);
    boolean deleteAnimal(int id);


}
