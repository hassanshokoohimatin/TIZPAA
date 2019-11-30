package com.company;

public abstract class Taxi {
    protected double basePrice;
    protected double rainyFactor;
    protected double trafficFactor;
    protected double rainAndTrafficFactor;

    public abstract double calculateFactor(int status);

    //  status is related to air,traffic or both
    //status 1: normal_situation    2: rainy    3: traffic      4: traffic and rainy
}
