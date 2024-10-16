package org.example;

import org.example.app.Application;
import org.example.factories.BoatTransport;
import org.example.factories.ITransportFactory;
import org.example.factories.NineNineTransport;
import org.example.factories.UberTransport;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static Application configureApplication(){
        Application application;
        ITransportFactory factory;

        String company = "uber";
        if (company == "uber"){
            factory = new UberTransport();
        }
        if(company == "99") {
            factory = new NineNineTransport();
        }
        else{
            factory = new BoatTransport();
        }
        application = new Application(factory);
        return application;
    }

    public static void main(String[] args) {
        Application application = configureApplication();
        application.startRoute();
    }
}