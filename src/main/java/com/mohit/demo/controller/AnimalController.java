package com.mohit.demo.controller;

import com.mohit.demo.dto.request.AnimalRequest;
import com.mohit.demo.dto.response.AnimalResponse;
import com.mohit.demo.service.AnimalService;
import com.mohit.demo.service.AnimalServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/animal")
public class AnimalController {

    @Autowired
    private AnimalService animalService;


    @GetMapping("/{id}")
    public AnimalResponse getAnimal(@PathVariable int id){
        return animalService.getAnimal(id);

    }

    @PostMapping
    public AnimalResponse addAnimal(@RequestBody AnimalRequest animalRequest){
        return animalService.addAnimal(animalRequest);
    }

    @DeleteMapping("/{id}")
    public boolean deleteAnimal(@PathVariable int id){
        return animalService.deleteAnimal(id);
    }

    @GetMapping
    public List<AnimalResponse> getAll(){
         return animalService.getAllAnimal();
    }

}
