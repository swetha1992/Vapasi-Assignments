package com.foodbazar;

/**
 * The class generates bill for food bazar store.
 */
public class Bill {

    /**
     * Main Function.
     * @param args
     */
    public static void main(String[] args) {
        FoodBazarBO invoice=new FoodBazarBO();
        invoice.generateBill();
    }
}
