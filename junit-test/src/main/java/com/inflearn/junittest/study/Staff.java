package com.inflearn.junittest.study;

public class Staff {

    private final String name;
    private final Integer age;

    public Staff(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
