package org.example.app;

import org.example.aircrafts.IAirCraft;
import org.example.factories.ITransportFactory;
import org.example.landvehicles.ILandVehicle;
import org.example.watercraft.IWaterCraft;

public class Application {
    private ILandVehicle vehicle;
    private IAirCraft airCraft;
    private IWaterCraft waterCraft;

    public Application(ITransportFactory factory){
        vehicle = factory.createTransportVehicle();
        airCraft = factory.createTransportAircraft();
        waterCraft = factory.createTransportWatercraft();
    }

    public void startRoute() {
        vehicle.startRoute();
        airCraft.startRoute();
        waterCraft.startRoute();
    }
}
