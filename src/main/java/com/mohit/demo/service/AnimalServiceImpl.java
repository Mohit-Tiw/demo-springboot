package com.mohit.demo.service;

import com.mohit.demo.dto.request.AnimalRequest;
import com.mohit.demo.dto.response.AnimalResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AnimalServiceImpl implements AnimalService {

    int counter = 1;

    private List<AnimalResponse> animalResponseList = new ArrayList<>();


    @Override
    public AnimalResponse getAnimal(int id) {
       Optional<AnimalResponse> animalResponseOptional = animalResponseList.stream()
                .filter(animal -> {
                    return animal.getId() == id;
                })
                .findFirst();
        if(animalResponseOptional.isPresent()) {
            return animalResponseOptional.get();
        }else{
            return null;
        }

    }

    @Override
    public List<AnimalResponse> getAllAnimal() {
        List<AnimalResponse> animalResponses = new ArrayList<>();
        for (AnimalResponse s : animalResponseList) {
            animalResponses.add(s);
        }
        return animalResponses;

    }

    @Override
    public AnimalResponse addAnimal(AnimalRequest animalRequest) {
        AnimalResponse animalResponse = new AnimalResponse();
        animalResponse.setId(counter++);
        animalResponse.setName(animalRequest.getName());
        animalResponse.setLegs(animalRequest.getLegs());
        animalResponseList.add(animalResponse);
        return animalResponse;
    }

    @Override
    public boolean deleteAnimal(int id) {
        for(AnimalResponse animalResponse1 : animalResponseList){
            if(animalResponse1.getId() == id) {
                animalResponseList.remove(animalResponse1);
                return true;
            }

        }
        return false;
    }
}
