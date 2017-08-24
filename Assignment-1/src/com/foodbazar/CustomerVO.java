package com.foodbazar;

import java.util.HashMap;
import java.util.Map;

public class CustomerVO {

    final Map<String, Double> quantityMap= new HashMap<String,Double>();

    /**
     * getter of quantityMap which can be obtained from user through scanner also.
     * Made final and hardcoded currently.
     * @return priceMap
     * @return
     */
     Map<String, Double> getQuantityMap() {
        quantityMap.put("Apple",2.00);
        quantityMap.put("Orange",1.50);
        quantityMap.put("Banana",0.50);
        quantityMap.put("Kiwi",0.75);
        return quantityMap;
    }
}
