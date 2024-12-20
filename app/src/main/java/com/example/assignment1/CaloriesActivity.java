package com.example.assignment1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class CaloriesActivity extends AppCompatActivity {

    private TextView txtCaloriesTitleCalActivity;
    private Spinner spnCaloriesList;
    private Button btnShowCalories;
    private ListView lstCaloriesLists;

    private List<FDTDItems> calories;
    private ArrayAdapter<String> caloriesAdapter;
    private List<CaloriesDataAndNames> caloriesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calories);

        spnCaloriesList = findViewById(R.id.spnCaloriesList);
        btnShowCalories = findViewById(R.id.btnShowCalories);
        lstCaloriesLists = findViewById(R.id.lstCaloriesLists);
        txtCaloriesTitleCalActivity = findViewById(R.id.txtCaloriesTitleCalActivity);

        Intent intent = getIntent();
        String titleCal = intent.getStringExtra("CALORIES_TITLE");
        txtCaloriesTitleCalActivity.setText(titleCal);

        initializeCategories();

        // Get the C for the Spinner
        List<String> caloName = new ArrayList<>();
        for (FDTDItems calo : calories) {
            caloName.add(calo.getFoodName());
        }

        // Set up the ArrayAdapter for the Spinner
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, caloName);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnCaloriesList.setAdapter(adapter);

        // Set up button click listener
        btnShowCalories.setOnClickListener(v -> {
            // selected category
            String selectedCategory = spnCaloriesList.getSelectedItem().toString();
            // Find corresponding calories data
            caloriesList = getCaloriesForCategory(selectedCategory);
            // Display calories data in the ListView
            List<String> calorieInfo = new ArrayList<>();
            for (CaloriesDataAndNames item : caloriesList) {
                calorieInfo.add(item.getCaloriesName() + ": " + item.getCaloriesTotal() + " Cal");
            }
            // Update the ListView with calorie data
            caloriesAdapter = new ArrayAdapter<>(CaloriesActivity.this, android.R.layout.simple_list_item_1, calorieInfo);
            lstCaloriesLists.setAdapter(caloriesAdapter);
        });
    }

    private void initializeCategories() {
        calories = new ArrayList<>();
        calories.add(new FDTDItems("Fruit", List.of(
                new CaloriesDataAndNames("Apple", 95),
                new CaloriesDataAndNames("Banana", 105),
                new CaloriesDataAndNames("Orange", 60),
                new CaloriesDataAndNames("Strawberries", 50),
                new CaloriesDataAndNames("Grapes", 65),
                new CaloriesDataAndNames("Watermelon", 46),
                new CaloriesDataAndNames("Cantaloupe", 54),
                new CaloriesDataAndNames("Kiwi", 42),
                new CaloriesDataAndNames("Pineapple", 82),
                new CaloriesDataAndNames("Mango", 150),
                new CaloriesDataAndNames("Avocado", 160),
                new CaloriesDataAndNames("Blueberries", 85),
                new CaloriesDataAndNames("Peach", 60),
                new CaloriesDataAndNames("Pear", 100),
                new CaloriesDataAndNames("Pomegranate", 230),
                new CaloriesDataAndNames("Dates", 23),
                new CaloriesDataAndNames("Cherries", 87),
                new CaloriesDataAndNames("Plum", 30),
                new CaloriesDataAndNames("Papaya", 59),
                new CaloriesDataAndNames("Dragon Fruit", 60)
        )));
        calories.add(new FDTDItems("Vegetables", List.of(
                new CaloriesDataAndNames("Lettuce", 5),
                new CaloriesDataAndNames("Cucumber", 13),
                new CaloriesDataAndNames("Tomato", 22),
                new CaloriesDataAndNames("Carrot", 25),
                new CaloriesDataAndNames("Cooked Broccoli", 55),
                new CaloriesDataAndNames("Spinach", 7),
                new CaloriesDataAndNames("Bell Pepper", 33),
                new CaloriesDataAndNames("Boiled Potato", 110),
                new CaloriesDataAndNames("Zucchini", 33),
                new CaloriesDataAndNames("Onion", 45),
                new CaloriesDataAndNames("Cooked Cauliflower", 25),
                new CaloriesDataAndNames("Green Beans", 35),
                new CaloriesDataAndNames("Green Peas", 120),
                new CaloriesDataAndNames("Boiled Corn", 130),
                new CaloriesDataAndNames("Baked Sweet Potato", 112),
                new CaloriesDataAndNames("Kale", 33),
                new CaloriesDataAndNames("Beetroot", 35)
        )));
    }

    private List<CaloriesDataAndNames> getCaloriesForCategory(String categoryName) {
        for (FDTDItems calo : calories) {
            if (calo.getFoodName().equals(categoryName)) {
                return calo.getFoodCalories();
            }
        }
        return new ArrayList<>();
    }
}