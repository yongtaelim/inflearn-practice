package com.example.inflearnpractice.whiteship.fiveweek.impl;

public class StoreClass {
    private String storeName;       // 변수
    private String address;         // 변수

    public StoreClass() {
        EmployeeClass employeeClass = new EmployeeClass("");  // heap 메모리 할당

        String employeeName = employeeClass.getEmployeeName();
    }

    /**
     * 메서드
     * @return
     */
    public String getStoreName() {
        getClass();
        hashCode();
        return this.storeName;
    }

    // 그 외에 스토어 관련 로직
}
