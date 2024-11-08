package com.example.assignment1;

public class Nutrient {
    private String nutrientName;
    private double nutrientTotal;

    public Nutrient(String nutrientName, double nutrientTotal) {
        this.nutrientName = nutrientName;
        this.nutrientTotal = nutrientTotal;
    }

    public String getNutrientName() {
        return nutrientName;
    }

    public double getNutrientTotal() {
        return nutrientTotal;
    }
}
