package org.example.app;

import org.example.aircrafts.IAirCraft;
import org.example.factories.ITransportFactory;
import org.example.landvehicles.ILandVehicle;

public class Application {
    private ILandVehicle vehicle;
    private IAirCraft airCraft;

    public Application(ITransportFactory factory){
        vehicle = factory.createTransportVehicle();
        airCraft = factory.createTransportAircraft();
    }

    public void startRoute() {
        vehicle.startRoute();
        airCraft.startRoute();
    }
}
