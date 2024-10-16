package org.example.factories;

import org.example.aircrafts.Helicopter;
import org.example.aircrafts.IAirCraft;
import org.example.landvehicles.ILandVehicle;
import org.example.landvehicles.Motorcycle;

public class NineNineTransport implements ITransportFactory{
    @Override
    public ILandVehicle createTransportVehicle() {
        return new Motorcycle();
    }

    @Override
    public IAirCraft createTransportAircraft() {
        return new Helicopter();
    }
}
