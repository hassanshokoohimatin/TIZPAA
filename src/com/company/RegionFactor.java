package com.company;

import java.util.HashMap;
import java.util.Map;

public class RegionFactor {


    public static Map<String,Integer> regionFactor = new HashMap<>();

    public static void setRegionFactor() {

        regionFactor.put("00",1);
        regionFactor.put("01",2);
        regionFactor.put("02",2);
        regionFactor.put("03",4);
        regionFactor.put("04",3);

        regionFactor.put("10",2);
        regionFactor.put("11",1);
        regionFactor.put("12",4);
        regionFactor.put("13",2);
        regionFactor.put("14",3);

        regionFactor.put("20",3);
        regionFactor.put("21",5);
        regionFactor.put("22",1);
        regionFactor.put("23",3);
        regionFactor.put("24",2);

        regionFactor.put("30",4);
        regionFactor.put("31",3);
        regionFactor.put("32",3);
        regionFactor.put("33",1);
        regionFactor.put("34",2);

        regionFactor.put("40",3);
        regionFactor.put("41",3);
        regionFactor.put("42",2);
        regionFactor.put("43",2);
        regionFactor.put("44",1);
    }

    public static Map<String, Integer> getRegionFactor() {

        return regionFactor;
    }

}
