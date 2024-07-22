public class Main {
    public static void main(String[] args) {

//            Create 2 routes and assign each of them to a different Car object. Note that one
//             of those cars should have a maximum capacity equal to zero .
            Route route1=new Route("Jeddah","Makkah",1250);
            Route route2=new Route("Makkah","Jeddah",3350);
            Route route3=new Route("Taif", "Jeddah", 1500);
            Car car1=new Car(3,"232", route1);
            Car car2=new Car(2,"707", route2);
            Car car3=new Car(0,"432", route3);
//            Create an array of Passengers containing 1 Subscriber and 1 non-Subscriber.
            Passenger[] passengers=new Passenger[3];
//          Assign a different car object to each passenger and then display their information.
            passengers[0]=new SubPassengers("Mohammed", "111", car2);
            passengers[1]=new NonSubPassengers("Tariq", "3323", car2, true);
            passengers[2]=new NonSubPassengers("Abdullah", "2021", car2,false);
            for (Passenger passenger : passengers) {
                try {
                passenger.passengerCost();
                passenger.displayPassengerInfo();
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }
            }
    }
}