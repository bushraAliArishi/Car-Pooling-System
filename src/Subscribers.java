public class Subscribers extends Passenger{

    final private double discount=0.5;

    public Subscribers(String name, String ID, Car reserved_car, double cost) {
        super(name, ID, reserved_car, cost);

    }
    public Subscribers() {}

    @Override
    void reservCar(Car myCar) {
        if (myCar.getCar_passenger().size()<=myCar.getCapacity()){
        double trip_cost=myCar.getRout().getPrice()-(myCar.getRout().getPrice()*discount);
        setCost(trip_cost);
        //myCar.setCapacity(myCar.getCapacity()-1);
        }
        else throw new IllegalStateException("\nCar "+myCar.getCode()+" has reached its maximum capacity.\nNo more reservations allowed.");

    }

    @Override
    public String toString() {
       return super.toString()+"\ntotal cost before Discount is : "+getReserved_car().getRout().getPrice()+"\ntotal cost after Discount is : "+getCost() ;

    }
}
