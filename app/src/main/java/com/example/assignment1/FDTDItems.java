package com.example.assignment1;

import java.util.List;

public class FDTDItems {
    private String foodName;
    private List<CaloriesDataAndNames> foodCalories;

    public FDTDItems(String foodName, List<CaloriesDataAndNames> foodCalories) {
        this.foodName = foodName;
        this.foodCalories = foodCalories;
    }

    public String getFoodName() {
        return foodName;
    }

    public List<CaloriesDataAndNames> getFoodCalories() {
        return foodCalories;
    }
}
