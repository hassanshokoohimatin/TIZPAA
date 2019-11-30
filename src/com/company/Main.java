package com.company;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        RegionFactor.setRegionFactor();
        int status = 1 + rand.nextInt(4);
        //status 1: normal_situation    2: rainy    3: traffic      4: traffic and rainy

        System.out.println("Which type of taxi whould you like?\n1:Economy\n2:Motorcycle\n3:VIP");

        int type = in.nextInt();
        switch (type){
            case 1 :
                Economy economy = new Economy();
                calculatePrice(economy,status);
                break;
            case 2 :
                MotorCycle motorCycle = new MotorCycle();
                calculatePrice(motorCycle,status);
                break;
            case 3 :
                Vip vip = new Vip();
                calculatePrice(vip,status);
                break;
            default:
                System.out.println("wrong choice...");
                break;
        }

    }
    public static void calculatePrice(Taxi taxi, int status){
        Scanner in = new Scanner(System.in);
        System.out.println("===========================================");
        System.out.println("Enter your start point...((0 to 4))");
        String start = in.nextLine();
        System.out.println("Enter your end point...((0 to 4))");
        String end = in.nextLine();
        String key = start+end;
        double price = taxi.calculateFactor(status)*RegionFactor.getRegionFactor().get(key);
        System.out.printf("%n%s\t%.0f\n","the price of your trip is : ",price);
        switch(status){
            case 1 :
                System.out.println("in normal situation");
                break;
            case 2 :
                System.out.println("in rainy situation");
                break;
            case 3 :
                System.out.println("in traffic");
                break;
            case 4 :
                System.out.println("in traffic and rainy");
                break;
        }
        System.out.println("===========================================");
    }
}
