package ru.sokolskaya.homewoks.hw14;

import java.util.*;

public class EmployeeTask {
    public static void main(String[] args) {

        // Создать список объектов List<Employee> (использовать метод employeeGenerator)
        List<Employee> employees = Employee.employeeGenerator(4);
        System.out.println(employees);
        Comparator<Employee> byName = new NameComparator();
        Comparator<Employee> bySalary = new SalaryComparator();
        Comparator<Employee> byAge = new AgeComparator();
        Comparator<Employee> byCompany = new CompanyComparator();

        // и сортировать по:
        // имени
        employees.sort(byName);
        System.out.println(employees);

        // имени и зарплате
        employees.sort(byName.thenComparing(bySalary));
        System.out.println(employees);

        // имени, зарплате, возрасту и компании
        employees.sort(byName.thenComparing(bySalary).thenComparing(byAge).thenComparing(byCompany));
        System.out.println(employees);





    }


}
