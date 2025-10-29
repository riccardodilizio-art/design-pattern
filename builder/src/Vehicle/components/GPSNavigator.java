package Vehicle.components;

public class GPSNavigator {
    private String route;

    public  GPSNavigator(String route) {
        this.route = route;
    }

    public GPSNavigator(){
        this.route = "221A, Marco Polo Street, London Street, Paris";
    }

    public String getRoute() {
        return route;
    }
}
