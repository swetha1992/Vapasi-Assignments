package com.foodbazar;

import java.util.HashMap;
import java.util.Map;

public class FoodBazarVO {

    final Map<String, Integer> priceMap= new HashMap<String,Integer>();
    /**
     * getter of priceMap which can be obtained from user through scanner also.
     * Made final and hardcoded currently.
     * @return priceMap
     */
     Map<String, Integer> getPriceMap() {
        priceMap.put("Apple",100);
        priceMap.put("Orange",80);
        priceMap.put("Banana",30);
        priceMap.put("Kiwi",120);
        return priceMap;
    }
}
