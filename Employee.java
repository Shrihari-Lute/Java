public class Employee {
    // Properties of the Employee class
    private static int empCount = 0; // Static variable to keep track of the number of employees
    private static double totalSalary = 0; // Static variable to hold the total salary of all employees

    private int empNo; // Employee number
    private double salary; // Employee salary

    // Parameterized constructor
    public Employee(double salary) {
        empCount++; // Increment employee count
        this.empNo = empCount; // Assign employee number
        this.salary = salary; // Set employee salary
        totalSalary += salary; // Update total salary
    }

    // Method to display total employees and total salary
    public static void displayTotalInfo() {
        System.out.println("Total Employees: " + empCount);
        System.out.println("Total Salary: " + totalSalary);
    }

    // Main method to test the Employee class
    public static void main(String[] args) {
        // Creating Employee objects
        Employee emp1 = new Employee(50000);
        Employee emp2 = new Employee(60000);
        Employee emp3 = new Employee(70000);

        // Display total employee count and total salary
        Employee.displayTotalInfo();
    }
}