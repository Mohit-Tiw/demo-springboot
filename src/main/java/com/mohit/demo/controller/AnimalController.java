package com.mohit.demo.controller;

import com.mohit.demo.dto.response.AnimalResponse;
import com.mohit.demo.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/animal")
public class AnimalController {

    @Autowired
    private AnimalService animalService;


    @GetMapping("/get")
    public AnimalResponse getAnimal(){
        return animalService.getAnimal();

    }

}
