package com.inflearn.junittest.study;

import com.inflearn.junittest.study.Study;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class StudyTest {

    @Test
    @Disabled
    void test1() {
        Study study = new Study();
        assertNotNull(study);
        System.out.println("test1");
    }

    @Test
    @Disabled
    void test2() {
        System.out.println("test2");
    }

    @Test
    @Disabled
    void test3() {
        System.out.println("test3");
    }

    @BeforeAll
    @Disabled
    static void beforeAll() {
        System.out.println("beforeAll all");
    }

    @AfterAll
    @Disabled
    static void afterAll() {
        System.out.println("after all");
    }

    @BeforeEach
    @Disabled
    void beforeEach() {
        System.out.println("before each");
    }

    @AfterEach
    @Disabled
    void afterEach() {
        System.out.println("after each");
    }
}