package com.re;

import java.util.*;
import java.util.stream.Collectors;

public class OptionalTest2 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("zhangsan");
        Employee employee2 = new Employee();
        employee2.setName("lisi");

        Company company = new Company();
        company.setName("companyNameeeee");
        List<Employee> list = Arrays.asList(employee, employee2);
    //    company.setList(list);

        Optional<Company> optional = Optional.ofNullable(company);

     //   optional.ifPresent(item -> System.out.println(item.getList()));

        System.out.println(optional.map(item -> item.getList()).orElse(Collections.emptyList()));
    }
}
