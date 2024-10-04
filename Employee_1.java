/* Demonstrating the use of the 'this' pointer and static variables in Java */

public class Employee_1 {
    // Static variables shared by all instances
    private static int empCount = 0; // Tracks total number of employees
    private static double totalSalary = 0; // Tracks total salary of all employees

    // Instance variables
    private int empNo; // Employee number
    private double salary; // Employee salary

    // Constructor to initialize employee
    public Employee_1(double salary) {
        empCount++; // Increment employee count
        this.empNo = empCount; // Assign employee number
        this.salary = salary; // Set employee salary
        totalSalary += salary; // Add salary to total
    }

    // Static method to display total employee count and salary
    public static void displayTotalInfo() {
        System.out.println("Total Employees: " + empCount);
        System.out.println("Total Salary: " + totalSalary);
    }

    // Main method
    public static void main(String[] args) {
        // Creating Employee objects
        Employee_1 emp1 = new Employee_1(50000);
        Employee_1 emp2 = new Employee_1(60000);
        Employee_1 emp3 = new Employee_1(70000);

        // Display total employees and salary
        Employee_1.displayTotalInfo();
    }
}
