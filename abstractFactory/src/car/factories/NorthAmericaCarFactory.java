package car.factories;

import car.car.Car;
import car.carSpecification.CarSpecification;
import car.carSpecification.NorthAmericaSpecification;
import car.car.Sedan;

public class NorthAmericaCarFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Sedan();
    }

    @Override
    public CarSpecification createSpecification() {
        return new NorthAmericaSpecification();
    }
}