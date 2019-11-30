package com.company;

public class MotorCycle extends Taxi {


    public MotorCycle(){
        basePrice = 4000.0;
        rainyFactor = 0.8;
        trafficFactor = 2.0;
        rainAndTrafficFactor = 1.5;
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
