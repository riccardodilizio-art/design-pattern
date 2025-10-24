package vehicleType;

public class Application {
private static MotorVehicleFactory motorVehicleFactory;

    public static void main(String[] args) {
        configure(args);
        run();
    }

    static void configure(String [] args) {
        String type = "car";
        if (args.length > 0) {
            type = args[0].toLowerCase();
        }
        switch (type){
            case "motorcycle":
                motorVehicleFactory = new MotorcycleFactory();
                break;
            case "car":
                motorVehicleFactory = new CarFactory();
                break;
                default:
                    System.err.println("Unknown vehicle type: " + type);
                    System.err.println("Using car or motorcycle");
                    System.exit(1);

        }
    }

    static void run(){
        MotorVehicle motorVehicle = motorVehicleFactory.create();
    }
}
