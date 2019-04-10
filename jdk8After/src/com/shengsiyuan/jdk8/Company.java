package com.shengsiyuan.jdk8;

import java.util.List;

public class Company {
    private String name;
    private List<Employee> list;

    public List<Employee> getList() {
        return list;
    }

    public void setList(List<Employee> list) {
        this.list = list;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
