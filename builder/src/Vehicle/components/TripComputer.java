package Vehicle.components;

import Vehicle.cars.Car;

public class TripComputer {
    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    public void showFuelLevel(){
        System.out.println("Livello di carburante: "+ car.getFuel());
    }

    public void showStatus(){
        if (this.car.getEngine().isStarted()){
            System.out.println("Macchina avviata");
        }else {
            System.out.println("Macchina non avviata");
        }
    }
}
