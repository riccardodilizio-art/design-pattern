package Vehicle;

import Vehicle.builder.CarBuilder;
import Vehicle.builder.CarManualBuilder;
import Vehicle.cars.Car;
import Vehicle.cars.Manual;
import Vehicle.director.Director;

public class Demo {
    public static void main(String[] args) {

        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();
        director.constructSportCar(carBuilder);

        Car car = carBuilder.getResult();

        System.out.println("Car built:\n" + car.getCarType());

        CarManualBuilder carManualBuilder = new CarManualBuilder();

        director.constructSportCar(carManualBuilder);
        Manual  manual = carManualBuilder.getResult();
        System.out.println("\nCar Manual Builder:\n" + manual.print());
    }
}
