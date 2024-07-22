public abstract class Passenger {
    private String pName;
    private String pID;
    private Car car;


    public Passenger(String pName, String pID,Car car) {
        this.pName = pName;
        this.pID = pID;
        this.car=car;
    }
    public static int setCounter(int count){
        return count--;
    }
    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getpID() {
        return pID;
    }

    public void setpID(String pID) {
        this.pID = pID;
    }

    public Car getCar() {
        return car;
    }

    abstract void displayPassengerInfo();
    abstract void passengerCost()throws Exception;
}
