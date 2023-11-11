package com.mohit.demo.service;

import com.mohit.demo.dto.response.AnimalResponse;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class AnimalServiceImpl implements  AnimalService {


    @Override
    public AnimalResponse getAnimal() {
        AnimalResponse animalResponse = new AnimalResponse();
        animalResponse.setLegs(4);
        animalResponse.setName("tommy");
        return animalResponse;
    }
}
