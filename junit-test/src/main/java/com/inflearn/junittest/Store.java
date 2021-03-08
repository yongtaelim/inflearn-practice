package com.inflearn.junittest;

public class Store {

    private final String name;

    public Store(String name) {
        if (name == null) {
            throw new IllegalArgumentException("사업장 이름은 필수입니다!!");
        }

        this.name = name;
    }

    public void sell() {
        try {
            Thread.sleep(5000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public StoreStatus open() {
        return StoreStatus.OPEN;
    }

    public StoreStatus close() {
        return StoreStatus.CLOSE;
    }

    public String getName() {
        return name;
    }
}
