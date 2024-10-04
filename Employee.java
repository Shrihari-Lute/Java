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