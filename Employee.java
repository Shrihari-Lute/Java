/*Write a Java program that defines a class Employee with the following

Attributes:
empID (of type int): Represents the employee's ID.
empName (of type String): Represents the employee's name.
empSalary (of type float): Represents the employee's salary.

Methods:
initEmployee(): A method to initialize the employee details with predefined values.
displayEmployee(): A method to display the employee's details (ID, name, and salary). 
*/

public class Employee {
    private int empID;
    private String empName;
    private float empSalary;

    // Method to initialize employee details with predefined values
    public void initEmployee(){
        empID = 111;
        empName = "Shri";
        empSalary = 150000.00f;
    }

    public void displayEmployee(){
        System.out.println("Employee_ID = " + empID + " Employee_Name = " + empName + " Employee_Salary = " + empSalary);
    }

    public static void main(String[] args){
        Employee  e = new Employee();
        
        // Display the default (uninitialized)
        System.out.println(e.empID + " " + e.empName + " " + e.empSalary);

        // Call initEmployee() to initialize the employee's attributes
        e.initEmployee();

        // Call displayEmployee() to print the updated employee details
        e.displayEmployee();
    }
}