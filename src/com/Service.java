package com;

class Service {
    private String name;
    private String status;

    public Service(String name, String status) {
        this.name = name;
        this.status = status;
    }

    public void displayService() {
        System.out.println("Service: " + name + ", Status: " + status);
    }
}