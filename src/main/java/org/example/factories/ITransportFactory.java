package org.example.factories;

import org.example.aircrafts.IAirCraft;
import org.example.landvehicles.ILandVehicle;
import org.example.watercraft.IWaterCraft;

public interface ITransportFactory {
    ILandVehicle createTransportVehicle();
    IAirCraft createTransportAircraft();
    IWaterCraft createTransportWatercraft();
}
