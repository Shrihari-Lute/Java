public class Car {
    // Properties of the Car class
    private String model;
    private int year;

    // Default constructor with default year of 2020
    public Car() {
        this.year = 2020; // Default year
    }

    // Constructor to initialize model and year
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    // Method to display model and year of the car
    public void display() {
        System.out.println("Model: " + model + ", Year: " + year);
    }

    // Main method to test the Car class
    public static void main(String[] args) {
        // Creating a Car object using default constructor
        Car car1 = new Car();
        car1.display(); // Displays default values

        // Creating a Car object using parameterized constructor
        Car car2 = new Car("Tesla", 2023);
        car2.display(); // Displays specified model and year
    }
}