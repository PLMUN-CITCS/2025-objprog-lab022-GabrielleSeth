class Car {
    // Attributes of the Car class
    String make;
    String model;
    int year;

    // Method to display car information
    public void displayInfo() {
        System.out.println("Car: " + year + " " + make + " " + model);
    }
}

public class CarDemo {
    public static void main(String[] args) {
        // Creating an object of the Car class
        Car myCar = new Car();
        
        // Assigning values to the object's attributes
        myCar.make = "Toyota";
        myCar.model = "Corolla";
        myCar.year = 2020;
        
        // Calling the displayInfo method
        myCar.displayInfo();
    }
}
