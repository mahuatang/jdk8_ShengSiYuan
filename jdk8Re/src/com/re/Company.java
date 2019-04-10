package com.re;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;

    private List<Employee> list = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getList() {
        return list;
    }

    public void setList(List<Employee> list) {
        this.list = list;
    }
}
