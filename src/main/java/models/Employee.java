package models;

import java.math.BigDecimal;

public class Employee {
    private final String firstName;
    private final String surname;
    private int age;
    private BigDecimal baseSalary;
    private BigDecimal bonus;

    public Employee(String firstName, String surname) {
        this.firstName = firstName;
        this.surname = surname;
    }

    public Employee(String firstName, String surname, int age) {
        this(firstName, surname);
        this.age = age;
    }

    public Employee(String firstName, String surname, int age, BigDecimal baseSalary) {
        this(firstName, surname, age);
        this.baseSalary = baseSalary;
    }

    public Employee(String firstName, String surname, int age, BigDecimal baseSalary, BigDecimal bonus) {
        this(firstName, surname, age, baseSalary);
        this.bonus = bonus;
    }

    public String getName() {
        return "Employee name : " + firstName + " " + surname;
    }

    public String getEmployeeDetails() {
        return "Employee details : " + firstName + " " + surname + " is " + age;
    }

    public BigDecimal getTotalSalary() {
        return baseSalary.add(bonus);
    }

    public BigDecimal getBaseSalary() {
        return baseSalary;
    }

    public BigDecimal getBonus() {
        return bonus;
    }
}
