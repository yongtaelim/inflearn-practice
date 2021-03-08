package com.inflearn.junittest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class BagTest {

    @Order(2)
    @Test
    @DisplayName("두번째로 테스트 실행")
    void order2_test() {
        System.out.println(2);
    }

    @Order(3)
    @Test
    @DisplayName("세번째로 테스트 실행")
    void order3_test() {
        System.out.println(3);
    }

    @Order(1)
    @Test
    @DisplayName("첫번째로 테스트 실행")
    void order1_test() {
        System.out.println(1);
    }
}