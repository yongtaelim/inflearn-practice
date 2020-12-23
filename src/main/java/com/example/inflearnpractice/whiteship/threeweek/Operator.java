package com.example.inflearnpractice.whiteship.threeweek;

public class Operator {
    public void expressions() {
        // primitive type 변수 선언과 초기화
        int a = 1;
        int b = 2;

        int c = a + b;
        // 연산 : 위 코드가 연산
        // 연산자 : +
        // 피연산자 : a, b
        // 연산식 : a + b
    }

    public static void 산술연산자() {
        int var1 = 1;
        int var2 = 2;

        System.out.println("var1 + var2 = " + (var1 + var2));
        System.out.println("var1 - var2 = " + (var1 - var2));
        System.out.println("var1 * var2 = " + (var1 * var2));
        System.out.println("var1 / var2 = " + (var1 / var2));
        System.out.println("var1 % var2 = " + (var1 % var2));

        double var3 = 1;
        double var4 = 2;
        System.out.println("var3 / var4 = " + (var3 / var4));
    }

    public static void 비트연산자() {
        /**
         * int 자료형은 8 Byte이므로 32비트로 표현된다.
         * 0000 0000 0000 0000
         * 연산 설명을 편의를 위해 앞의 12자리는 제외하고 실제 값이 표현되는 마지막 4자리만 표현하겠습니다.
         */
        int var1 = 3;  // 0011
        int var2 = 5;  // 0101
        System.out.println("var1 & var2 = " + (var1 & var2));
        System.out.println("var1 | var2 = " + (var1 | var2));
        System.out.println("var1 ^ var2 = " + (var1 ^ var2));
        System.out.println("var1>> = " + (var1 >> 1));
        System.out.println("var1<< = " + (var1 << 1));
    }

    public static void main(String[] args) {
//        산술연산자();
        비트연산자();
    }
}
