package com.example.inflearnpractice.whiteship.forweek;

public class Choice {
    public static void main(String[] args) {
        ifElse();
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
