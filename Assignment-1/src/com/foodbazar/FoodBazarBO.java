package com.foodbazar;
import java.util.Map;

public class FoodBazarBO {
    /**
     * Function that generates bill.
     */
    FoodBazarVO foodBazarVO = new FoodBazarVO();
    CustomerVO customerVO = new CustomerVO();

    public void generateBill(){
        Double total=0.00;
        System.out.println("Fruit -- Quantity -- Amount");
        for (Map.Entry<String, Double> item : customerVO.getQuantityMap().entrySet()) {
            Double amount = foodBazarVO.getPriceMap().get(item.getKey().toString()) * item.getValue();
            System.out.println(item.getKey()+ "\t--"+ item.getValue() + "\t--\t" + amount);
            total = total + amount;
        }
        System.out.println("\n Total \t : "+ total);
    }
}
