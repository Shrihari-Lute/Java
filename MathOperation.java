/* Create a class MathOperation with two data member X & Y to store the operand and third data member R to store result of operation. Create Method members :
init to input X & Y from user,
add for addition of X & Y,
mul to multiply X & Y,
power,
diaplay to display result R
*/

import java.util.Scanner;

class MathOperation {
    // Data members
    private double X;
    private double Y;
    private double R;

    void init() {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the first operand (X): ");
        X = scn.nextDouble();

        System.out.print("Enter the second operand (Y): ");
        Y = scn.nextDouble();
    }

    void add() {
        R = X + Y; 
    }

    void mul() {
        R = X * Y;
    }

    void power() {
        R = 1;
        for (int i = 0; i < Y; i++) {
            R = R * X; 
        }
    }
    
    void display() {
        System.out.println("The result (R) is: " + R);
    }

    public static void main(String[] args) {
        MathOperation operation = new MathOperation();

        // Initialize X and Y
        operation.init(); 

        // Perform addition and display result
        operation.add();
        operation.display();

        // Perform multiplication and display result
        operation.mul();
        operation.display();

        // Calculate power and display result
        operation.power();
        operation.display();
    }
}
