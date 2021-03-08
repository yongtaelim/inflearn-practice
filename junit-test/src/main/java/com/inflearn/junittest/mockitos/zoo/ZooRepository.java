package com.inflearn.junittest.mockitos.zoo;

import com.inflearn.junittest.mockitos.domain.Animal;

public interface ZooRepository {
    Animal save(Animal animal);
}
