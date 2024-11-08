package com.example.assignment1;

public class CaloriesItems {
    private String name;
    private int calories;

    public CaloriesItems(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }

    public int getCalories() {
        return calories;
    }

    public String getName() {
        return name;
    }
}
