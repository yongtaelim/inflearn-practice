package com.inflearn.junittest.study;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class StudyNameTest {

    @Test
    @Disabled
    @DisplayName("테스트 성공")
    void test_success() {
        System.out.println("test success");
    }

    @Test
    @Disabled
    void test_fail() {
        System.out.println("test fail");
    }
}
