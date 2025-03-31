package com;

class Infrastructure {
    private String type;
    private String condition;

    public Infrastructure(String type, String condition) {
        this.type = type;
        this.condition = condition;
    }

    public void displayInfrastructure() {
        System.out.println("Infrastructure: " + type + ", Condition: " + condition);
    }
}