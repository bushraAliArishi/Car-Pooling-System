public class Rout {
    private String pickup_address,destination;
    private double price;

    public Rout(String pickup_address, String destination, double price) {
        this.pickup_address = pickup_address;
        this.destination = destination;
        this.price = price;
    }

    public Rout() {

    }

    public String getPickup_address() {
        return pickup_address;
    }

    public void setPickup_address(String pickup_address) {
        this.pickup_address = pickup_address;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
