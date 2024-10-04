/* Create a class person with properties name and age with following features 
default age of person should be 18,
a person object can be initialised with name and age,
method to display name and age of person
*/

public class Person {
    private String name;
    private int age;

    // Static variable to hold the default age
    private static final int DEFAULT_AGE = 18; 

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
        this.age = DEFAULT_AGE;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Static method to get the default age
    public static int getDefaultAge() {
        return DEFAULT_AGE; // Return the default age
    }

    public static void main(String[] args) {
        Person person1 = new Person("Shri", 25);
        person1.display();

        Person person2 = new Person("Hari");
        person2.display();
    }
}
    
