package car.factories;

import car.car.Car;
import car.carSpecification.CarSpecification;

public interface CarFactory {
   Car createCar();
   CarSpecification createSpecification();

}