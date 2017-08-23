package com.foodbazar.billing;
import java.util.HashMap;
import java.util.Map;

/**
 * The class generates bill for food bazar store.
 */
public class Bill {

    final Map<String, Integer> priceMap= new HashMap<String,Integer>();
    final Map<String, Double> quantityMap= new HashMap<String,Double>();

    /**
     * getter of priceMap which can be obtained from user through scanner also.
     * Made final and hardcoded currently.
     * @return priceMap
     */
    private Map<String, Integer> getPriceMap() {
        priceMap.put("Apple",100);
        priceMap.put("Orange",80);
        priceMap.put("Banana",30);
        priceMap.put("Kiwi",120);
        return priceMap;
    }

    /**
     * getter of quantityMap which can be obtained from user through scanner also.
     * Made final and hardcoded currently.
     * @return priceMap
     * @return
     */
    private Map<String, Double> getQuantityMap() {
        quantityMap.put("Apple",2.00);
        quantityMap.put("Orange",1.50);
        quantityMap.put("Banana",0.50);
        quantityMap.put("Kiwi",0.75);
        return quantityMap;
    }

    /**
     * Function that generates bill.
     */
    public void generateBill(){
        Double total=0.00;
        System.out.println("Fruit -- Quantity -- Amount");
        for (Map.Entry<String, Double> item : getQuantityMap().entrySet()) {
            Double amount = getPriceMap().get(item.getKey().toString()) * item.getValue();
            System.out.println(item.getKey()+ "\t--"+ item.getValue() + "\t--\t" + amount);
            total = total + amount;
        }
        System.out.println("\n Total \t : "+ total);
    }

    /**
     * Main Function.
     * @param args
     */
    public static void main(String[] args) {
        Bill invoice=new Bill();
        invoice.generateBill();
    }
}
