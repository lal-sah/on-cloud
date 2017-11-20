package com.lal.demo.java8;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public class Application {

    private static final Logger LOGGER = Logger.getLogger(Application.class.getName());


    public static void main(String[] args) {

        LOGGER.info("Hello World!");

        final List<Employee> employees = Arrays.asList(
                createEmployee("Mandy", "Smith", 35, 87000.0),
                createEmployee("John", "Doe", 32, 97000.0),
                createEmployee("Larry", "Page", 25, 77000.0),
                createEmployee("Lal", "Sah", 37, 83000.0)
        );

        employees.stream()
                .filter(e -> e.getAge() > 30)
                .forEach(System.out::println);
    }

    private static Employee createEmployee(String firstName, String lastName, int age, double salary) {
        return new Employee(firstName, lastName, age, salary);
    }

    private static class Employee {
        private String firstName;
        private String lastName;
        private int age;
        private double salary;

        Employee(String firstName, String lastName, int age, double salary) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.salary = salary;
        }

        String getFirstName() {
            return firstName;
        }

        void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        String getLastName() {
            return lastName;
        }

        void setLastName(String lastName) {
            this.lastName = lastName;
        }

        int getAge() {
            return age;
        }

        void setAge(int age) {
            this.age = age;
        }

        double getSalary() {
            return salary;
        }

        void setSalary(double salary) {
            this.salary = salary;
        }

        @Override
        public String toString() {
            return getFirstName() + " " + getLastName() + " " + getAge() + " " + getSalary();
        }
    }
}
