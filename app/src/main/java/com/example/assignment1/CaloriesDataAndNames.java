package com.example.assignment1;

import java.util.ArrayList;

public class CaloriesDataAndNames {
    private String caloriesName;
    private double caloriesTotal;

    public CaloriesDataAndNames(String caloriesName, double caloriesTotal) {
        this.caloriesName = caloriesName;
        this.caloriesTotal = caloriesTotal;
    }

    public String getCaloriesName() {
        return caloriesName;
    }

    public double getCaloriesTotal() {
        return caloriesTotal;
    }

    public ArrayList<CaloriesDataAndNames> getArray(){
        return new ArrayList<>();
    }
}
