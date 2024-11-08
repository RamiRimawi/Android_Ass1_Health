package com.example.assignment1;

import java.util.List;

public class Foods {
    private String foodName;
    private List<Nutrient> foodItems;

    public Foods(String foodName,List<Nutrient> foodItems) {
        this.foodName = foodName;
        this.foodItems = foodItems;
    }

    public String getFoodName() {
        return foodName;
    }

    public List<Nutrient> getFoodItems() {
        return foodItems;
    }
}
