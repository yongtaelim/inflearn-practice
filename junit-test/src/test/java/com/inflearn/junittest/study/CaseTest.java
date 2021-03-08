package com.inflearn.junittest.study;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(FindCaseTestExtension1.class)
public class CaseTest {

    @Case1
    void case1_temp1_test() {
        System.out.println("case1 temp1");
    }

    @Case1
    void case1_temp2_test() {
        System.out.println("case1 temp2");
    }

    @Test
    void case1_temp3_test() {
        System.out.println("case1 temp3");
    }

    @Test
    void case1_temp4_test() {
        System.out.println("case1 temp4");
    }
}
