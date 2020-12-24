package com.example.inflearnpractice.whiteship.threeweek;

public class TestInterfaceImpl implements TestInterface {
    @Override
    public void addTestListener(Object o) {
        System.out.println("add lister" + o);
    }
}
