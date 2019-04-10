package com.re2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class OptionalTest2 {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setName("zhangsan");
        Employee employee2 = new Employee();
        employee2.setName("lisi");

        List<Employee> employeeList = Arrays.asList(employee1, employee2);

        Company company = new Company();
        company.setName("company");

        company.setList(employeeList);

        Optional<Company> optional = Optional.ofNullable(company);
        System.out.println(optional.map(item -> item.getList()).orElse(Collections.emptyList()));

    }
}
