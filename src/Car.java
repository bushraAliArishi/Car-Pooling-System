import java.util.ArrayList;

public class Car {
    private String code;
    private Rout rout;
    private ArrayList<Passenger> car_passenger;
    private int capacity;

    public Car(String code, Rout rout, ArrayList<Passenger> car_passenger, int capacity) {
        this.code = code;
        this.rout = rout;
        this.car_passenger = car_passenger;
        this.capacity = capacity;
    }
    public Car() {
        this.code = code;
        this.rout = rout;
        this.car_passenger = car_passenger;
        this.capacity = capacity;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Rout getRout() {
        return rout;
    }

    public void setRout(Rout rout) {
        this.rout = rout;
    }

    public ArrayList<Passenger> getCar_passenger() {
        return car_passenger;
    }

    public void setCar_passenger(ArrayList<Passenger> car_passenger) {
        this.car_passenger = car_passenger;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
