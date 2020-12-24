package com.example.inflearnpractice.whiteship.threeweek;

public class Test1 extends TestParent {
    TestInterface testInterface;
    public void addTestInterface(TestInterface testInterface) {
        this.testInterface = testInterface;
    }

    public void callInterface(Object o) {
        testInterface.addTestListener(o);
    }
}
