public abstract class Passenger {
    private String name,ID;
    private Car reserved_car;
    private double cost;

    public Passenger(String name, String ID, Car reserved_car, double cost) {
        this.name = name;
        this.ID = ID;
        this.reserved_car = reserved_car;
        this.cost = cost;
    }
    public Passenger() {
        this.name = name;
        this.ID = ID;
        this.reserved_car = reserved_car;
        this.cost = cost;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Car getReserved_car() {
        return reserved_car;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    abstract void reservCar(Car myCar);

    @Override
    public String toString() {
        return "\ntrip summary :\nPassenger : "+getName()+"\nID : "+getID()+"\ncar code : "+getReserved_car().getCode()+"\nfrom : "
                +getReserved_car().getRout().getPickup_address()+"\nTo : "+getReserved_car().getRout().getDestination();
    }
}
