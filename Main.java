package com;

import java.util.*;

//Main.java (Entry point with console input)
public class Main {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     SmartCity city = new SmartCity("NeoCity");
     
     System.out.print("Enter number of citizens: ");
     int numCitizens = scanner.nextInt();
     scanner.nextLine();
     for (int i = 0; i < numCitizens; i++) {
         System.out.print("Enter citizen name: ");
         String name = scanner.nextLine();
         System.out.print("Enter citizen age: ");
         int age = scanner.nextInt();
         scanner.nextLine();
         city.addCitizen(new Citizen(name, age));
     }
     
     System.out.print("Enter number of services: ");
     int numServices = scanner.nextInt();
     scanner.nextLine();
     for (int i = 0; i < numServices; i++) {
         System.out.print("Enter service name: ");
         String serviceName = scanner.nextLine();
         System.out.print("Enter service status: ");
         String status = scanner.nextLine();
         city.addService(new Service(serviceName, status));
     }
     
     System.out.print("Enter number of infrastructures: ");
     int numInfra = scanner.nextInt();
     scanner.nextLine();
     for (int i = 0; i < numInfra; i++) {
         System.out.print("Enter infrastructure type: ");
         String type = scanner.nextLine();
         System.out.print("Enter infrastructure condition: ");
         String condition = scanner.nextLine();
         city.addInfrastructure(new Infrastructure(type, condition));
     }
     
     city.displayCityInfo();
     scanner.close();
 }
}