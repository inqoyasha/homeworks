package org.azamat.homeworks.OOP.employee;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1,"Petr", "Ivanov", 200);
        Employee employee2 = new Employee(2,"Ivan", "Petrov", 450);
        Employee employee3 = new Employee(3,"Fedor", "Smirnov", 300);
        Employee employee4 = new Employee(4,"Nikola", "Tesla", 999);

        System.out.println(employee1.toString());
        System.out.println("employee 1 receives a 10 percent pay raise");
        employee1.raiseSalary(10);
        System.out.println(employee1.toString());

        System.out.println("annual salary for employee2 is equals: "+employee2.getAnnualSalary());

        System.out.println("employee3 name: "+employee3.getName());
    }
}
