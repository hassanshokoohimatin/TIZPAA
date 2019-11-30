package com.company;

public class Vip extends Taxi {


    public Vip(){
        basePrice = 10_000.0;
        rainyFactor = 2.0;
        trafficFactor = 2.0;
        rainAndTrafficFactor = 3.0;
    }

    @Override
    public double calculateFactor(int status) {

        double factor = 0.0;
        switch(status){
            case 1 :
                factor = basePrice;
                break;
            case 2 :
                factor = basePrice * rainyFactor;
                break;
            case 3 :
                factor = basePrice * trafficFactor;
                break;
            case 4 :
                factor = basePrice * rainAndTrafficFactor;
                break;
        }
        return factor;
    }

}
