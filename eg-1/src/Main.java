public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Range Rover Autobiography");
        Car car2 = new Car("Land Cruiser 76");

        Garage garage = new Garage();
        garage.park(car1);
        garage.park(car2);
    }
}