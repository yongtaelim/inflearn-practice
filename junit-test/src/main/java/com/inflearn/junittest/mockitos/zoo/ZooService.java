package com.inflearn.junittest.mockitos.zoo;

import com.inflearn.junittest.mockitos.animal.AnimalNotFoundException;
import com.inflearn.junittest.mockitos.animal.AnimalService;
import com.inflearn.junittest.mockitos.domain.Animal;

import java.util.Optional;

public class ZooService {

    private final AnimalService animalService;
    private final ZooRepository zooRepository;

    public ZooService(AnimalService animalService, ZooRepository zooRepository) {
        assert animalService != null;
        assert zooRepository != null;

        this.animalService = animalService;
        this.zooRepository = zooRepository;
    }

    public Animal enterAnimal(Integer animalId) {
        Optional<Animal> optionalAnimal = animalService.findById(animalId);
        Animal animal = optionalAnimal.orElseThrow(() -> new IllegalArgumentException("animal 이 존재하지 않습니다."));

        animalService.notify(animal);

        return zooRepository.save(animal);
    }
}
