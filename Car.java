public class Car {
    //     a code, a fixed route, a maximum capacity of passengers per trip.
    private int maxPassengers;
    private String carCode;
    private Route route;

    public Car(int maxPassengers, String carCode, Route route) {
        this.maxPassengers = maxPassengers;
        this.carCode = carCode;
        this.route = route;
    }


    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;

    }

    public String getCarCode() {
        return carCode;
    }

    public void setCarCode(String carCode) {
        this.carCode = carCode;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }
}

