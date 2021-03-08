package com.inflearn.junittest.mockitos.animal;

import com.inflearn.junittest.mockitos.domain.Animal;

import java.util.Optional;

public interface AnimalService {
    Optional<Animal> findById(Integer animalId);

    void notify(Animal animal);

    void validate(Animal animal);
}
