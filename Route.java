public class Route {
    private String address;
    private String destinationAddress;
    private double tripPrice;


    public Route(String address, String destinationAddress, double tripPrice) {
        this.address = address;
        this.destinationAddress = destinationAddress;
        this.tripPrice = tripPrice;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDestinationAddress() {
        return destinationAddress;
    }

    public void setDestinationAddress(String destinationAddress) {
        this.destinationAddress = destinationAddress;
    }

    public double getTripPrice() {
        return tripPrice;
    }

    public void setTripPrice(double tripPrice) {
        this.tripPrice = tripPrice;
    }


}
