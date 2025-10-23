package car.factories;

import car.car.Car;
import car.carSpecification.CarSpecification;
import car.carSpecification.EuropeSpecification;
import car.car.Hatchback;

public class EuropeCarFactory implements CarFactory {

    @Override
    public Car createCar() {
        return new Hatchback();
    }

    @Override
    public CarSpecification createSpecification() {
        return new EuropeSpecification();
    }
}
