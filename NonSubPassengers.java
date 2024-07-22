public class NonSubPassengers extends Passenger{
    private boolean discount;

    public NonSubPassengers(String pName, String pID, Car car, boolean discount) {
        super(pName, pID, car);
        this.discount = discount;
    }

    public boolean isDiscount() {
        return discount;
    }

    public void setDiscount(boolean discount) {
        this.discount = discount;
    }

    @Override
    void displayPassengerInfo() {
        System.out.println("name: "+getpName()+"\nCar code: "+this.getCar().getCarCode()+" route price: "+this.getCar().getRoute().getTripPrice());
    }

    @Override
    void passengerCost() throws Exception {
        if (this.getCar().getMaxPassengers()<=0){
            throw new Exception("Max Passengers most be more than 0");
        }else {
            double discount=0;
            if (isDiscount()){
               discount = this.getCar().getRoute().getTripPrice()*0.1;
            }
            this.getCar().getRoute().setTripPrice(this.getCar().getRoute().getTripPrice()-discount);
            this.getCar().setMaxPassengers(getCar().getMaxPassengers()-1);
        }
    }
}
