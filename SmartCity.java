package com;

import java.util.ArrayList;

class SmartCity {
    private String cityName;
    private ArrayList<Citizen> citizens;
    private ArrayList<Service> services;
    private ArrayList<Infrastructure> infrastructures;

    public SmartCity(String cityName) {
        this.cityName = cityName;
        this.citizens = new ArrayList<>();
        this.services = new ArrayList<>();
        this.infrastructures = new ArrayList<>();
    }

    public void addCitizen(Citizen citizen) {
        citizens.add(citizen);
    }

    public void addService(Service service) {
        services.add(service);
    }

    public void addInfrastructure(Infrastructure infrastructure) {
        infrastructures.add(infrastructure);
    }

    public void displayCityInfo() {
        System.out.println("Smart City: " + cityName);
        
        for (Citizen c : citizens) {
            c.displayInfo();
        }
        
        for (Service s : services) {
            s.displayService();
        }
        
        for (Infrastructure i : infrastructures) {
            i.displayInfrastructure();
        }
    }
}
