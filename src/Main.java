import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Rout route1 = new Rout("Riyadh", "Dammam", 150.0);
        Rout route2 = new Rout("Jeddah", "Mecca", 100.0);
        Rout route3 = new Rout("Abha", "Jizan", 80.0);
        ArrayList<Passenger> passengers1 = new ArrayList<>();
        Car car1 = new Car("A123", route1, passengers1, 2);
        ArrayList<Passenger> passengers2 = new ArrayList<>();
        Car car2 = new Car("B456", route2, passengers2, 2);
        ArrayList<Passenger> passengers3 = new ArrayList<>();
        Car car3 = new Car("C789", route3, passengers3, 0);
        try {
            Subscribers subscriber1 = new Subscribers("Ali", "S001", car1, 0.0);

            subscriber1.reservCar(car1);
            System.out.println(subscriber1);
            Subscribers subscriber2 = new Subscribers("Ahmed", "S002", car2, 0.0);
            subscriber2.reservCar(car2);
            System.out.println(subscriber2);
            NonSubscribers nonSubscriber1 = new NonSubscribers("Maha", "N001", car1, 0.0, true);
            nonSubscriber1.reservCar(car1);
            System.out.println(nonSubscriber1);
            NonSubscribers nonSubscriber2 = new NonSubscribers("Sara", "N002", car2, 0.0, false);
            nonSubscriber2.reservCar(car2);
            System.out.println(nonSubscriber2);
            NonSubscribers nonSubscriber3 = new NonSubscribers("Salem", "N003", car3, 0.0, true);
            nonSubscriber3.reservCar(car3);
            System.out.println(nonSubscriber3);
            Subscribers subscriber3 = new Subscribers("Noura", "S003", car3, 0.0);
            subscriber3.reservCar(car3);
            System.out.println(subscriber3);
            NonSubscribers nonSubscriber4 = new NonSubscribers("Omar", "N004", car3, 0.0, true);
            nonSubscriber4.reservCar(car3);
            System.out.println(nonSubscriber4);
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}
