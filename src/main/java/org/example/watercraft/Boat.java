package org.example.watercraft;

public class Boat implements IWaterCraft{
    @Override
    public void startRoute() {
        getCargo();
        water();
        System.out.println("Iniciando a viagem...");
    }

    @Override
    public void getCargo() {
        System.out.println("Pegando a carga.");
    }

    @Override
    public void water() {
        System.out.println("Águas calmas.");
    }
}
