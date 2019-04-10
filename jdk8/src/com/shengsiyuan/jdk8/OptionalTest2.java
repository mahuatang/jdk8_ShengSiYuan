package com.shengsiyuan.jdk8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * Created by YURUIThink on 2017/2/9.
 */
public class OptionalTest2 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("zhangsan");

        Employee employee2 = new Employee();
        employee.setName("zhangsan");

        Company company = new Company();
        company.setName("company1");

        List<Employee> employees = Arrays.asList(employee, employee2);
        company.setEmployeeList(employees);

        List<Employee> list = company.getEmployeeList();

        Optional<Company> optional = Optional.ofNullable(company);
        System.out.println(optional.map(theCompany -> theCompany.getEmployeeList()).orElse
                (Collections.emptyList()));//经典代码

//        if(null != list) {
//            return list;
//        }else {
//            return new ArrayList<Employee>();
//        }传统的
    }
}
