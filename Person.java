public class Person {
    // Properties of the Person class
    private String name;
    private int age;

    // Default constructor with default age of 18
    public Person() {
        this.age = 18; // Default age
    }

    // Constructor to initialize name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display name and age of the person
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Main method to test the Person class
    public static void main(String[] args) {
        // Creating a Person object using default constructor
        Person person1 = new Person();
        person1.display(); // Displays default values

        // Creating a Person object using parameterized constructor
        Person person2 = new Person("Alice", 25);
        person2.display(); // Displays specified name and age
    }
}
