package org.example.aircrafts;

public class Helicopter implements IAirCraft{
    @Override
    public void startRoute() {
        getCargo();
        wind();
        System.out.println("Iniciando a decolagem.");
    }

    @Override
    public void getCargo() {
        System.out.println("Passageiros ok, ligando hélices.");
    }

    @Override
    public void wind() {
        System.out.println("Ventos a 25km/h sudeste.");
    }
}
