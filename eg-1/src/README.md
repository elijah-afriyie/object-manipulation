# Car Parking in Garage

This Java program demonstrates the use of classes and objects to simulate parking cars in a garage. It involves creating a `Car` class, a `Garage` class, and a `Main` class to test the functionality.

## Description

The program consists of three classes:
1. `Car`: Represents a car with a `name` attribute.
2. `Garage`: Contains a method to park a car and print a message.
3. `Main`: Creates instances of the `Car` class and uses the `Garage` class to park them.

## Code

```java
public class Car {
    String name;

    Car(String name) {
        this.name = name;
    }
}

public class Garage {
    void park(Car car) {
        System.out.println("My brand new " + car.name + " is parked in the garage.");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Range Rover Autobiography");
        Car car2 = new Car("Land Cruiser 76");

        Garage garage = new Garage();
        garage.park(car1);
        garage.park(car2);
    }
}
```

## Operations

1. **Creating the `Car` Class**:
   ```java
   public class Car {
       String name;

       Car(String name) {
           this.name = name;
       }
   }
   ```
   The `Car` class has a single attribute `name` and a constructor to initialize it.

2. **Creating the `Garage` Class**:
   ```java
   public class Garage {
       void park(Car car) {
           System.out.println("My brand new " + car.name + " is parked in the garage.");
       }
   }
   ```
   The `Garage` class contains a method `park` that takes a `Car` object as a parameter and prints a message indicating the car is parked.

3. **Creating and Running the `Main` Class**:
   ```java
   public class Main {
       public static void main(String[] args) {
           Car car1 = new Car("Range Rover Autobiography");
           Car car2 = new Car("Land Cruiser 76");

           Garage garage = new Garage();
           garage.park(car1);
           garage.park(car2);
       }
   }
   ```
   The `Main` class creates two `Car` objects and uses a `Garage` object to park these cars and print the corresponding messages.

## Output

When the program is executed, it will output:
```
My brand new Range Rover Autobiography is parked in the garage.
My brand new Land Cruiser 76 is parked in the garage.
```

## Usage

To run this program, copy the code into a Java file (e.g., `Main.java`), then compile and run it using a Java compiler.

```sh
javac Main.java
java Main
```

This program serves as an example of how to use classes and objects in Java to simulate a real-world scenario of parking cars in a garage.
