package com.shengsiyuan.jdk8;

import java.util.List;

public class Company {
    private String name;

    private List<Employee> employeeList;

    public String getName() {
        return name;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
