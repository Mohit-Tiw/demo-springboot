package com.mohit.demo.controller;

import com.mohit.demo.dto.response.AnimalResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/animal")
public class AnimalController {


    @GetMapping("/get")
    public AnimalResponse getAnimal(){
        AnimalResponse animalResponse = new AnimalResponse();
        animalResponse.setLegs(4);
        animalResponse.setName("tommy");
        return animalResponse;
    }

}
