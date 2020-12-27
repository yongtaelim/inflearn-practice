package com.example.inflearnpractice.whiteship.forweek;

import org.springframework.util.StopWatch;

import java.util.Arrays;
import java.util.List;

public class Choice {
    public static void main(String[] args) throws Exception {
//        basic_if문();
//        ifElse();
//        이증if문();
//        if문과switch문실행속도비교();
//        switch문();
//        switch_break();
//        switch_default();
//        basic_for문();
//        break_for문();
//        break_continue();
//        while문();
//        while_break();
//        doWhile문();
        foreach문();
    }

    private static void foreach문() {
        List<Integer> intArray = Arrays.asList(1,2,3,4,5,6,7);

        for (int a : intArray) {
            System.out.println(a);
        }
    }

    private static void doWhile문() {
        int a = 0;

        while (a != 0) {
            System.out.println("while문 : " + a);
        }

        do {
            System.out.println("do while문 : " + a);
        } while(a != 0);
    }

    private static void while_break() {
        int a = 0;
        while(true) {
            if(a > 5) {
                break;
            }
            System.out.println(a);    // 0,1,2,3,4,5
            a++;
        }
    }

    private static void while문() {
        int a = 0;
        while (a < 5) {
            System.out.println(a);
            a++;
        }
    }

    private static void break_continue() {
        for (int i = 0; i < 10; i++) {
             if(i == 4) {
                 continue;
             }
            System.out.println(i);
        }
    }

    private static void break_for문() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);      // 결과값으로 0,1,2,3,4 가 출력됩니다.
             if(i == 4) {
                 break;
             }
        }
    }

    private static void basic_for문() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    private static void switch_default() throws Exception {
        int a = 9;
        switch(a) {
            case 1:
                break;
            case 2:
                break;
            default:
                throw new Exception();
        }
    }

    private static void switch_break() {
        int a = 0;
        switch (a) {
            case 0:
                System.out.println("0");
            case 1:
                System.out.println("1");
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("default");
        }
    }

    private static void switch문() {
        Integer a = 0;

        switch (a) {
            case 0:
                System.out.println("0");
                break;
            case 1:
                System.out.println("1");
                break;
            default:
                System.out.println("default");
        }
    }

    private static void if문과switch문실행속도비교() {
        StopWatch ifStopWatch = new StopWatch();
        int a = 1;

        int iterateSize = 1000000000;

        ifStopWatch.start();
        for (int i = 0; i < iterateSize; i++) {
            if( a == 1 ) {}
            else if (a == 2) {}
            else if (a == 3) {}
            else if (a == 4) {}
            else if (a == 5) {}
            else if (a == 6) {}
            else if (a == 7) {}
            else if (a == 8) {}
            else if (a == 9) {}
            else if (a == 10) {}
        }

        ifStopWatch.stop();

        System.out.println("if문 실행속도 ->" + ifStopWatch.prettyPrint());

        StopWatch switchStopWatch = new StopWatch();
        switchStopWatch.start();
        for (int i = 0; i < iterateSize; i++) {
            switch (a) {
                case 1: break;
                case 2: break;
                case 3: break;
                case 4: break;
                case 5: break;
                case 6: break;
                case 7: break;
                case 8: break;
                case 9: break;
                case 10: break;
            }
        }

        switchStopWatch.stop();
        System.out.println("switch문 실행속도 ->" + switchStopWatch.prettyPrint());
    }

    private static void basic_if문() {
        int a = 0;
        long b = 1L;
        int c = 9;
        if(a == 0) {
            System.out.println("....");
        }
    }

    private static void 이증if문() {
        int a = 0;
        int b = 1;

        if(a == 0) {
            if(b == 0) {
                System.out.println("조건은 참이다.");
            } else {
                System.out.println("조건은 거짓이다.");
            }
        }
    }

    private static void ifElse() {
        int a = 0;
        // if문
        if (a == 0) {       // 조건이 참이므로 블록 코드 실행
            System.out.println("if문은 참이다");
        }

        // if else문
        if (a == 1) {
            System.out.println("if else문은 참이다.");
        } else {            // if문의 조건이 거짓이므로 아래 코드가 실행
            System.out.println("if else문은 거짓이다.");
        }

        // if else if else 문
        if (a == 1) {
            System.out.println("if가 참이다.");
        } else if (a == 0) {   // else if문의 조건이 참이므로 아래 코드가 실행
            System.out.println("else if가 참이다.");
        } else {
            System.out.println("else가 참이다");
        }
    }
}
