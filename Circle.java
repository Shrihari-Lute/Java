/* Create a class to calculate area of circle with one data member to store radius and another to store area value. Create method members : 
init to calculate radius from user, 
calc to calculate area, 
display to display area.
*/

import java.util.Scanner;

class Circle {
    // Data members
    double radius; 
    double area;   

    // Method to initialize the radius from user input
    void init() {
        Scanner scn = new Scanner(System.in); 
        System.out.print("Enter the radius of the circle: "); 
        radius = scn.nextDouble(); 
        scn.close();
    }

    // Method to calculate the area of the circle
    void calc() {
        area = 3.14 * radius * radius; 
    }

    // Method to display the area of the circle
    void display() {
        System.out.println("The area of the circle with radius " + radius + " is: " + area); // Print the area
    }

    // Main method to test the Circle class
    public static void main(String[] args) {
        Circle c = new Circle(); 

        c.init(); // Call the init method to get radius from user
        c.calc(); // Call the calc method to calculate the area
        c.display(); // Call the display method to show the area
    }
}
