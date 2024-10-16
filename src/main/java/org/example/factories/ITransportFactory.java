package org.example.factories;

import org.example.aircrafts.IAirCraft;
import org.example.landvehicles.ILandVehicle;

public interface ITransportFactory {
    ILandVehicle createTransportVehicle();
    IAirCraft createTransportAircraft();
}
