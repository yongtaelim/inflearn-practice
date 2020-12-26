package com.example.inflearnpractice.whiteship.threeweek;

import com.example.inflearnpractice.accounts.Account;
import org.springframework.util.ObjectUtils;

import java.util.Optional;
import java.util.function.Function;

public class Operator {
    public static void main(String[] args) {
//        산술연산자();
//        비트연산자();
//        관계연산자();
//        논리연산자();
//        instanceofTest();
//        assignmentTest();
//        lamdaTest();
        삼항연산자();
    }

    private static void 삼항연산자() {
        String a = "a";

        System.out.println("a == a -> " + (a == "a" ? true : false));
        System.out.println("a == b -> " + (a == "b" ? true : false));

        boolean c = a == "b" ? a == "c" ? false : true : false;
    }


    private static void assignmentTest() {
        int a = 8;
        int b = 3;

        System.out.println("a = b -> " + (a = b));
        System.out.println("a += b -> " + (a += b));    // a = a + b
        System.out.println("a -= b -> " + (a -= b));    // a = a - b
        System.out.println("a *= b -> " + (a *= b));    // a = a * b
        System.out.println("a /= b -> " + (a /= b));    // a = a / b
        System.out.println("a %= b -> " + (a &= b));    // a = a & b
    }

    private static void lamdaTest() {
        Test1 test1 = new Test1();
        test1.addTestInterface(new TestInterface() {
            @Override
            public void addTestListener(Object o) {
                System.out.println("add Test lister = " + o);
            }
        });
        test1.callInterface("not use lamda");


        Test1 test2 = new Test1();
        test2.addTestInterface(testLister -> {
            System.out.println("add Test lister lamda = " + testLister);
        });
        test2.callInterface("use lamda");
    }

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

    public static void 관계연산자() {
        int var1 = 1;
        int var2 = 4;
        Account a = new Account();
        System.out.println("var1 == var2");
        System.out.println(var1 == var2);
        System.out.println("var1 != var2");
        System.out.println(var1 != var2);
        System.out.println("var1 > var2");
        System.out.println(var1 > var2);
        System.out.println("var1 < var2");
        System.out.println(var1 < var2);
        System.out.println("var1 <= var2");
        System.out.println(var1 <= var2);
        System.out.println("var1 >= var2");
        System.out.println(var1 >= var2);
        System.out.println("a instanceof Account");
        System.out.println(a instanceof Account);
    }

    private static void 논리연산자() {
        boolean var1 = true;
        boolean var2 = true;
        boolean var3 = false;
        boolean var4 = false;

        System.out.println("var1 && var2");
        System.out.println(var1 && var2);
        System.out.println("var1 && var3");
        System.out.println(var1 && var3);
        System.out.println("var1 || var3");
        System.out.println(var1 || var3);
        System.out.println("var3 || var4");
        System.out.println(var3 || var4);
    }

    private static void instanceofTest() {
        Test1 test1 = new Test1();  // TestParent를 상속 받은 클래스
        TestInterfaceImpl testInterfaceImpl = new TestInterfaceImpl();  // TestInterface를 implements 받은 클래스

        System.out.println("test1 instanceof Test1");
        System.out.println(test1 instanceof Test1);
        System.out.println("test1 instanceof TestParent");
        System.out.println(test1 instanceof TestParent);
        System.out.println("testInterfaceImpl instanceof TestInterfaceImpl");
        System.out.println(testInterfaceImpl instanceof TestInterfaceImpl);
        System.out.println("TestInterfaceImpl instanceof TestInterface");
        System.out.println(testInterfaceImpl instanceof TestInterface);
    }


}
