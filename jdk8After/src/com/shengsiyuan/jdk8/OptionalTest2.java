package com.shengsiyuan.jdk8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalTest2 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Employee employee2 = new Employee();

        employee.setName("zhangsan");
        employee2.setName("lisi");

        List<Employee> list = new ArrayList<>();
   //     list.add(employee);
   //     list.add(employee2);

        Company company = new Company();
        company.setName("company");
        company.setList(list);

        Optional<Company> optional = Optional.ofNullable(company);

        System.out.println(optional.map(company1 -> company1.getList()).orElse(new ArrayList<>()));

        List<Employee> listHA = optional.map(company1 -> company1.getList()).orElse(new ArrayList<>());

        listHA.forEach(item -> System.out.println(item.getName()));
    }
}
