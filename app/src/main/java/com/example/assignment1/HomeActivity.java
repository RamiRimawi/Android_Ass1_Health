package com.example.assignment1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

public class HomeActivity extends AppCompatActivity {

    String CALORIES_TITLE = "Calories";
    String FOOD_TITLE = "Food";
    String DRINKS_TITLE = "Drinks";
    String TRAINING_TITLE = "Sports";
    private TextView txtFoodTitle, txtDrinksTitle,
            txtCaloriesTitle, txtSportTitle;
    private CardView CrdCaloriesHomeActivity, CrdFoodHomeActivity,
            CrdDrinksHomeActivity, CrdSportHomeActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        txtFoodTitle = findViewById(R.id.txtFoodTitle);
        txtDrinksTitle = findViewById(R.id.txtDrinksTitle);
        txtCaloriesTitle = findViewById(R.id.txtCaloriesTitle);
        txtSportTitle = findViewById(R.id.txtSportTitle);
        CrdDrinksHomeActivity = findViewById(R.id.CrdDrinksHomeActivity);
        CrdFoodHomeActivity = findViewById(R.id.CrdFoodHomeActivity);
        CrdSportHomeActivity = findViewById(R.id.CrdSportHomeActivity);
        CrdCaloriesHomeActivity = findViewById(R.id.CrdCaloriesHomeActivity);

        txtFoodTitle.setText(FOOD_TITLE);
        txtDrinksTitle.setText(DRINKS_TITLE);
        txtSportTitle.setText(TRAINING_TITLE);
        txtCaloriesTitle.setText(CALORIES_TITLE);

        CrdCaloriesHomeActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, CaloriesActivity.class);
                intent.putExtra("CALORIES_TITLE",txtCaloriesTitle.getText());
                startActivity(intent);
            }
        });

        CrdFoodHomeActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, ItemsActivity.class);
                intent.putExtra("FOOD_TITLE",txtFoodTitle.getText());
                startActivity(intent);
            }
        });

        CrdDrinksHomeActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, ItemsActivity.class);
                intent.putExtra("DRINKS_TITLE",txtDrinksTitle.getText());
                startActivity(intent);
            }
        });

        CrdSportHomeActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, ItemsActivity.class);
                intent.putExtra("TRAINING_TITLE",txtSportTitle.getText());
                startActivity(intent);
            }
        });


    }
}