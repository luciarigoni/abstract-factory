package org.example.factories;

import org.example.aircrafts.Airplane;
import org.example.aircrafts.IAirCraft;
import org.example.landvehicles.Car;
import org.example.landvehicles.ILandVehicle;

public class UberTransport implements ITransportFactory{
    @Override
    public ILandVehicle createTransportVehicle() {
        return new Car();
    }

    @Override
    public IAirCraft createTransportAircraft() {
        return new Airplane();
    }
}
