package com.example.inflearnpractice.whiteship.fiveweek.impl;

public class EmployeeClass {
    private String employeeName;        // 변수
    private String phone;               // 변수
    private String email;               // 변수

    public EmployeeClass() {
        this("임직원 명");
    }

    public EmployeeClass(String employeeName) {
        this.employeeName = employeeName;
    }

    /**
     * 메서드
     * @return
     */
    public String getEmployeeName() {
        return employeeName;
    }

    // 그외 임직원 로직
}
