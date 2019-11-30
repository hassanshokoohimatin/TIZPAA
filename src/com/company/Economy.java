package com.company;

public class Economy extends Taxi {


    public Economy(){
        basePrice = 5000.0;
        rainyFactor = 1.2;
        trafficFactor = 1.2;
        rainAndTrafficFactor = 1.4;
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
