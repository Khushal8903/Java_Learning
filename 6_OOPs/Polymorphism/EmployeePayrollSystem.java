/*
Q2. Employee Payroll System – Multiple Child Classes
Create:
Parent class: Employee
Fields: id, name, baseSalary
 Method: calculateSalary()
Child classes:
Manager:
Allowance = 40% of baseSalary
Bonus = ₹10,000 if teamSize > 10

Developer:
Allowance = 30%
Extra pay = ₹2000 × numberOfProjects

Intern:
Stipend = 50% of baseSalary

Task:
Create an array of 10 employees (mix of all types).
Implement salary calculation using overrides.

Display:
Employee with maximum salary
Count how many employees earn above 60,000.

Concepts Used
Inheritance + overriding
Polymorphism with reference array
Logical operations for filtering and counting
*/

import java.util.*;

class Employee {
    private int id;
    private String name;
    private int baseSalary;

    Employee(int id, String name, int baseSalary) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getBasesalary() { return baseSalary; }

    public double calculateSalary() {
        return baseSalary;
    }

    public String toString() {
        return id + "  " + name + "  " + baseSalary;
    }
}

class Manager extends Employee {

    private int teamSize;

    Manager(int teamSize, int id, String name, int baseSalary) {
        super(id, name, baseSalary);
        this.teamSize = teamSize;
    }

    @Override
    public double calculateSalary() {
        double salary = getBasesalary() + (0.40 * getBasesalary());
        if (teamSize > 10) salary += 10000;
        return salary;
    }
}

class Developer extends Employee {

    private int numberOfProjects;

    Developer(int numberOfProjects, int id, String name, int baseSalary) {
        super(id, name, baseSalary);
        this.numberOfProjects = numberOfProjects;
    }

    @Override
    public double calculateSalary() {
        return getBasesalary() + (0.30 * getBasesalary()) + (2000 * numberOfProjects);
    }
}

class Intern extends Employee {

    Intern(int id, String name, int baseSalary) {
        super(id, name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return 0.50 * getBasesalary();
    }
}

public class EmployeePayrollSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee[] e = new Employee[10];

        for (int i = 0; i < e.length; i++) {

            System.out.println("\nEnter Employee Type: 1.Manager  2.Developer  3.Intern");
            int type = sc.nextInt();

            System.out.println("Enter ID, Name, BaseSalary:");
            int id = sc.nextInt();
            String name = sc.next();
            int baseSalary = sc.nextInt();

            if (type == 1) {
                System.out.println("Enter Manager Team Size:");
                int team = sc.nextInt();
                e[i] = new Manager(team, id, name, baseSalary);

            } else if (type == 2) {
                System.out.println("Enter Developer Number of Projects:");
                int p = sc.nextInt();
                e[i] = new Developer(p, id, name, baseSalary);

            } else {
                e[i] = new Intern(id, name, baseSalary);
            }
        }

        // Find max salary + count above 60k
        Employee emp = e[0];
        double maxSalary = e[0].calculateSalary();
        int count = 0;

        for (int i = 0; i < e.length; i++) {
            double sal = e[i].calculateSalary();

            if (sal > 60000) count++;

            if (sal > maxSalary) {
                maxSalary = sal;
                emp = e[i];
            }
        }

        System.out.println("\n-------------------------------------------");
        System.out.println("Highest Salary Employee: " + emp + "  Salary: " + maxSalary);
        System.out.println("Total employees earning above 60k: " + count);
    }
}
