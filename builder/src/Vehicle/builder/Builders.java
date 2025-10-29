package Vehicle.builder;

import Vehicle.cars.CarType;
import Vehicle.components.Engine;
import Vehicle.components.GPSNavigator;
import Vehicle.components.Transmission;
import Vehicle.components.TripComputer;

public interface Builders {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
