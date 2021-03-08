package com.inflearn.junittest.mockitos.zoo;

import com.inflearn.junittest.mockitos.animal.AnimalService;
import com.inflearn.junittest.mockitos.domain.Animal;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
class ZooServiceTest {

    @Mock
    AnimalService animalService;

    @Mock
    ZooRepository zooRepository;

    @Test
    @DisplayName("ZooService 인스턴스 생성자로 생성")
    void createZooService1() {
//        AnimalService animalService = animalId -> Optional.empty();
//        ZooRepository zooRepository = animal -> null;
//
//        ZooService zooService = new ZooService(animalService, zooRepository);
//        assertNotNull(zooService);
    }

    @Test
    @DisplayName("ZooService 인스턴스를 Mock을 사용하여 생성")
    void createZooService2() {
        AnimalService animalService = mock(AnimalService.class);
        ZooRepository zooRepository = mock(ZooRepository.class);

        ZooService zooService = new ZooService(animalService, zooRepository);
        assertNotNull(zooService);
    }

    @Test
    @DisplayName("ZooService 인스턴스를 Annotation Mock을 사용하여 생성")
    void createZooService3() {
        ZooService zooService = new ZooService(animalService, zooRepository);
        assertNotNull(zooService);
    }

    @Test
    @DisplayName("ZooService 인스턴스 변수에 Annotation Mock을 사용하여 생성")
    void createZooService4(@Mock AnimalService animalService, @Mock ZooRepository zooRepository) {
        ZooService zooService = new ZooService(animalService, zooRepository);
        assertNotNull(zooService);
    }

    @Test
    @DisplayName("동물원 서비스에서 조회")
    void animalService_findById_test() {
        ZooService zooService = new ZooService(animalService, zooRepository);
        assertNotNull(zooService);

        Animal animal = new Animal();
        animal.setId(1);
        animal.setName("호랑이");

        when(animalService.findById(1))
                .thenReturn(Optional.of(animal));

        when(zooRepository.save(animal))
                .thenReturn(animal);

        Animal resultAnimal = zooService.enterAnimal(1);
        assertEquals(animal, resultAnimal);

        verify(animalService, times(1)).notify(animal);
        verify(animalService, never()).validate(animal);

        InOrder inOrder = inOrder(animalService);
        inOrder.verify(animalService).findById(any());
        inOrder.verify(animalService).notify(any());

        // 더이상 animaService를 호출하지 않겠다.
        verifyNoInteractions(animalService);
    }
}