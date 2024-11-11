public class NonSubscribers extends Passenger{
    final private double discount=0.1;
    private boolean coupon;

    public NonSubscribers(String name, String ID, Car reserved_car, double cost,boolean coupon) {
        super(name, ID, reserved_car, cost);
        this.coupon=coupon;
    }

    public boolean isCoupon() {
        return coupon;
    }

    @Override
    void reservCar(Car myCar) {
         if(myCar.getCar_passenger().size()<=myCar.getCapacity()){
             if(isCoupon()){
                 double trip_cost=myCar.getRout().getPrice()-(myCar.getRout().getPrice()*discount);
                 setCost(trip_cost);
                 myCar.setCapacity(myCar.getCapacity()-1);
                 }
             else setCost(myCar.getRout().getPrice());
         }
         else throw new IllegalStateException("\nCar "+myCar.getCode()+"has reached its maximum capacity.\nNo more reservations allowed.");
    }
    @Override
    public String toString() {
        if (isCoupon())
        {
        return super.toString()+"\ntotal cost before Discount is : "+getReserved_car().getRout().getPrice()+"\ntotal cost after Discount is : "+getCost() ;
        }
        else {return  super.toString()+"\ntotal cost  : "+getCost() ;}


    }
}
