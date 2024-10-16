package org.example.factories;

import org.example.aircrafts.Airplane;
import org.example.aircrafts.IAirCraft;
import org.example.landvehicles.Car;
import org.example.landvehicles.ILandVehicle;
import org.example.watercraft.Boat;
import org.example.watercraft.IWaterCraft;

public class BoatTransport implements ITransportFactory {

    @Override
    public ILandVehicle createTransportVehicle() {
        return new Car();
    }

    @Override
    public IAirCraft createTransportAircraft() {
        return new Airplane();
    }

    @Override
    public IWaterCraft createTransportWatercraft() {
        return new Boat();}
}
