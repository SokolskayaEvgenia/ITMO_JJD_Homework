package ru.sokolskaya.homewoks.hw14;

import java.util.*;

public class EmployeeTask {
    public static void main(String[] args) {

        // Создать список объектов List<Employee> (использовать метод employeeGenerator)
        List<Employee> employees = Employee.employeeGenerator(4);
        System.out.println(employees);

        // и сортировать по:
        // имени
        Comparator<Employee> comparator1 = new NameComparator();
        employees.sort(comparator1);
        System.out.println(employees);

        // имени и зарплате
        Comparator<Employee> comparator2 = comparator1.thenComparing(new SalaryComparator());
        employees.sort(comparator2);
        System.out.println(employees);

        // имени, зарплате, возрасту и компании
        Comparator<Employee> comparator3 = comparator2.thenComparing(new AgeComparator()).thenComparing(new CompanyComparator());
        employees.sort(comparator3);
        System.out.println(employees);





    }


}
