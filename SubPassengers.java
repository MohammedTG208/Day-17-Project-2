import java.util.ArrayList;
public class SubPassengers extends Passenger{
    public SubPassengers(String pName, String pID, Car car) {
        super(pName, pID, car);
    }

    //    with the car code and route price .
    @Override
    void displayPassengerInfo() {
        System.out.println("Name: "+getpName()+"\nCar code: "+this.getCar().getCarCode()+" route price: "+this.getCar().getRoute().getTripPrice());
    }

    @Override
    void passengerCost() throws Exception{
        if (this.getCar().getMaxPassengers()<=0){
            throw new Exception("Max Passengers most be more than 0");
        }else {
           double discount= this.getCar().getRoute().getTripPrice()*0.5;
           this.getCar().getRoute().setTripPrice(this.getCar().getRoute().getTripPrice()-discount);
           this.getCar().setMaxPassengers(getCar().getMaxPassengers()-1);
        }
    }
}
