/* Demonstrating the use of Setters and Getters in Java */
public class Date {
    // Instance variables
    private int day, month, year; 

    // Setter method for the day
    public void setDay(int d){
        // Assign the passed value 'd' to the private variable 'day'
        day = d;
    }

    // Getter method for the day
    public int getDay(){
        // Return the current value of the private variable 'day'
        return day;
    }

    // Setter method for the month
    public void setMonth(int m){
        // Assign the passed value 'm' to the private variable 'month'
        month = m;
    }

    // Getter method for the month
    public int getMonth(){
        // Return the current value of the private variable 'month'
        return month;
    }

    // Setter method for the year
    public void setYear(int y){
        // Assign the passed value 'y' to the private variable 'year'
        year = y;
    }

    // Getter method for the year
    public int getYear(){
        // Return the current value of the private variable 'year'
        return year;
    }

    // Main method to test the Date class
    public static void main(String[] args){
        // Creating an object 'd' of the Date class
        Date d = new Date(); 
        
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
