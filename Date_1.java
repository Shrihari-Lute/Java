/* Demonstrating the use of Setters and Getters in Java using 'this' */

public class Date_1 {
    // Instance variables
    private int day, month, year;

    // Setter method for the day
    public void setDay(int day){
        this.day = day;
    }

    // Getter method for the day
    public int getDay(){
        return this.day;
    }

    // Setter method for the month
    public void setMonth(int month){
        this.month = month;
    }

    // Getter method for the month
    public int getMonth(){
        return this.month;
    }

    // Setter method for the year
    public void setYear(int year){
        this.year = year;
    }

    // Getter method for the year
    public int getYear(){
        return this.year;
    }

    public static void main(String[] args){
        Date_1 d = new Date_1();

        // Setting the day, month, and year using the setter methods
        d.setDay(15);
        d.setMonth(10);
        d.setYear(2024);

        // Retrieving the day, month, and year using the getter methods
        int day = d.getDay();
        int month = d.getMonth();
        int year = d.getYear();

        // Displaying the complete date
        System.out.println("Date = " + day + "/" + month + "/" + year);
    }
}
