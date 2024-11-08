package com.example.assignment1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;
import java.util.Objects;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class ItemsActivity extends AppCompatActivity {

    String itemName = "ITEM_NAME";
    private TextView txtNameItem;
    private TextView txtItem1Name, txtItem2Name, txtItem3Name, txtItem4Name;
    private TextView txtHorItem1, txtHorItem2, txtHorItem3, txtHorItem4;
    private ImageView imgItem1Image, imgItem2Image, imgItem3Image, imgItem4Image;
    private ImageView imgHorItem1, imgHorItem2, imgHorItem3, imgHorItem4;
    private CardView crdHorItem1, crdHorItem2, crdHorItem3, crdHorItem4;
    private CardView crdVerItem1, crdVerItem2, crdVerItem3, crdVerItem4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items);

        txtNameItem = findViewById(R.id.txtNameItem);
        txtItem1Name = findViewById(R.id.txtItem1Name);
        txtItem2Name = findViewById(R.id.txtItem2Name);
        txtItem3Name = findViewById(R.id.txtItem3Name);
        txtItem4Name = findViewById(R.id.txtItem4Name);
        imgItem1Image = findViewById(R.id.imgItem1Image);
        imgItem2Image = findViewById(R.id.imgItem2Image);
        imgItem3Image = findViewById(R.id.imgItem3Image);
        imgItem4Image = findViewById(R.id.imgItem4Image);
        crdHorItem1 = findViewById(R.id.crdHorItem1);
        crdHorItem2 = findViewById(R.id.crdHorItem2);
        crdHorItem3 = findViewById(R.id.crdHorItem3);
        crdHorItem4 = findViewById(R.id.crdHorItem4);
        crdVerItem1 = findViewById(R.id.crdVerItem1);
        crdVerItem2 = findViewById(R.id.crdVerItem2);
        crdVerItem3 = findViewById(R.id.crdVerItem3);
        crdVerItem4 = findViewById(R.id.crdVerItem4);
        txtHorItem1 = findViewById(R.id.txtHorItem1);
        txtHorItem2 = findViewById(R.id.txtHorItem2);
        txtHorItem3 = findViewById(R.id.txtHorItem3);
        txtHorItem4 = findViewById(R.id.txtHorItem4);
        imgHorItem1 = findViewById(R.id.imgHorItem1);
        imgHorItem2 = findViewById(R.id.imgHorItem2);
        imgHorItem3 = findViewById(R.id.imgHorItem3);
        imgHorItem4 = findViewById(R.id.imgHorItem4);

        Intent intent = getIntent();
        String titleName = intent.getStringExtra("FOOD_TITLE");
        String drinksTitle = intent.getStringExtra("DRINKS_TITLE");
        String trainingTitle = intent.getStringExtra("TRAINING_TITLE");

        if (titleName != null) {
            txtNameItem.setText(titleName);
        } else if (drinksTitle != null) {
            txtNameItem.setText(drinksTitle);
        } else if (trainingTitle != null)
            txtNameItem.setText(trainingTitle);

        if ("Food".equals(txtNameItem.getText().toString())) {
            setUpFood();
        } else if ("Drinks".equals(txtNameItem.getText().toString())) {
            setUpDrinks();
        } else if ("Sports".equals(txtNameItem.getText().toString())) {
            setUpSports();
        }

        crdHorItem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtHorItem1.getText().toString().equals("BreakFast")) {
                    updateVerticalCards("BreakFast");
                } else if (txtHorItem1.getText().toString().equals("Hot")) {
                    updateVerticalCards("Hot");
                } else if (txtHorItem1.getText().toString().equals("Home")) {
                    updateVerticalCards("Home");
                }
            }
        });

        crdHorItem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtHorItem2.getText().toString().equals("Lunch")) {
                    updateVerticalCards("Lunch");
                } else if (txtHorItem2.getText().toString().equals("Cold")) {
                    updateVerticalCards("Cold");
                } else if (txtHorItem2.getText().toString().equals("GYM")) {
                    updateVerticalCards("GYM");
                }
            }
        });

        crdHorItem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtHorItem3.getText().toString().equals("Dessert")) {
                    updateVerticalCards("Dessert");
                } else if (txtHorItem3.getText().toString().equals("Smoothie")) {
                    updateVerticalCards("Smoothie");
                }
            }
        });

        crdHorItem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtHorItem4.getText().toString().equals("Snack")) {
                    updateVerticalCards("Snack");
                }
            }
        });


        crdVerItem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendTextToItemDetails(txtItem1Name.getText().toString());
            }
        });

        crdVerItem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendTextToItemDetails(txtItem2Name.getText().toString());
            }
        });

        crdVerItem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendTextToItemDetails(txtItem3Name.getText().toString());
            }
        });

        crdVerItem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendTextToItemDetails(txtItem4Name.getText().toString());
            }
        });
    }

    private void setUpFood() {
        txtHorItem1.setText("BreakFast");
        imgHorItem1.setImageResource(R.drawable.breakfast);
        txtHorItem2.setText("Lunch");
        imgHorItem2.setImageResource(R.drawable.lunch);
        txtHorItem3.setText("Dessert");
        imgHorItem3.setImageResource(R.drawable.desert);
        txtHorItem4.setText("Snack");
        imgHorItem4.setImageResource(R.drawable.fruit);

        imgItem1Image.setImageResource(R.drawable.eggsandavogado);
        txtItem1Name.setText("Avocado Toast with PoachedEgg");

        imgItem2Image.setImageResource(R.drawable.milkshofan);
        txtItem2Name.setText("Oatmeal with Banana and Almonds");

        imgItem3Image.setImageResource(R.drawable.ugert);
        txtItem3Name.setText("Greek Yogurt Parfait");

        imgItem4Image.setImageResource(R.drawable.eggspizza);
        txtItem4Name.setText("Vegetable and Cheese Omelette");
    }

    private void setUpDrinks() {
        txtHorItem1.setText("Hot");
        imgHorItem1.setImageResource(R.drawable.hotdrink);
        txtHorItem2.setText("Cold");
        imgHorItem2.setImageResource(R.drawable.colddrinks);
        txtHorItem3.setText("Smoothie");
        imgHorItem3.setImageResource(R.drawable.smoothie);
        crdHorItem4.setVisibility(View.GONE);

        imgItem1Image.setImageResource(R.drawable.coffee);
        txtItem1Name.setText("Hot Coffee");

        imgItem2Image.setImageResource(R.drawable.hotchoclatedrink);
        txtItem2Name.setText("Hot Chocolate");

        imgItem3Image.setImageResource(R.drawable.tea);
        txtItem3Name.setText("Hot Tea");

        imgItem4Image.setImageResource(R.drawable.healthhotdrink);
        txtItem4Name.setText("Health Drink");
    }

    private void setUpSports() {
        txtHorItem1.setText("Home");
        imgHorItem1.setImageResource(R.drawable.homegym);
        txtHorItem2.setText("GYM");
        imgHorItem2.setImageResource(R.drawable.gym);
        crdHorItem3.setVisibility(View.GONE);
        crdHorItem4.setVisibility(View.GONE);

        imgItem1Image.setImageResource(R.drawable.yoga);
        txtItem1Name.setText("Yoga");
        imgItem2Image.setImageResource(R.drawable.bodyweight_exercises);
        txtItem2Name.setText("Bodyweight");
        imgItem3Image.setImageResource(R.drawable.jump_rope);
        txtItem3Name.setText("Jump Rope");
        imgItem4Image.setImageResource(R.drawable.pilates);
        txtItem4Name.setText("Pilates");

    }

    private void updateVerticalCards(String food) {
        switch (food) {
            case "BreakFast":
                imgItem1Image.setImageResource(R.drawable.eggsandavogado);
                txtItem1Name.setText("Avocado Toast with PoachedEgg");

                imgItem2Image.setImageResource(R.drawable.milkshofan);
                txtItem2Name.setText("Oatmeal with Banana and Almonds");

                imgItem3Image.setImageResource(R.drawable.ugert);
                txtItem3Name.setText("Greek Yogurt Parfait");

                imgItem4Image.setImageResource(R.drawable.eggspizza);
                txtItem4Name.setText("Vegetable and Cheese Omelette");
                break;

            case "Lunch":
                imgItem1Image.setImageResource(R.drawable.soup);
                txtItem1Name.setText("Soup");

                imgItem2Image.setImageResource(R.drawable.tonasalad);
                txtItem2Name.setText("TonaSalad");

                imgItem3Image.setImageResource(R.drawable.sanduish);
                txtItem3Name.setText("Sandwich");

                imgItem4Image.setImageResource(R.drawable.riceandchicken);
                txtItem4Name.setText("Rice & Chicken");
                break;

            case "Dessert":
                imgItem1Image.setImageResource(R.drawable.desert);
                txtItem1Name.setText("Salads");

                imgItem2Image.setImageResource(R.drawable.kufta);
                txtItem2Name.setText("Kufta");

                imgItem3Image.setImageResource(R.drawable.eggsandavocado);
                txtItem3Name.setText("Eggs & Avocado");

                imgItem4Image.setImageResource(R.drawable.salmon);
                txtItem4Name.setText("Salmon");
                break;

            case "Snack":
                imgItem1Image.setImageResource(R.drawable.shofanbiscuit);
                txtItem1Name.setText("Shofan Biscuit");

                imgItem2Image.setImageResource(R.drawable.icecream);
                txtItem2Name.setText("Ice Cream");

                imgItem3Image.setImageResource(R.drawable.totandzabazy);
                txtItem3Name.setText("Zabadi Tot");

                imgItem4Image.setImageResource(R.drawable.darkchocolate);
                txtItem4Name.setText("Dark Chocolate");
                break;

            case "Hot":
                imgItem1Image.setImageResource(R.drawable.coffee);
                txtItem1Name.setText("Hot Coffee");

                imgItem2Image.setImageResource(R.drawable.hotchoclatedrink);
                txtItem2Name.setText("Hot Chocolate");

                imgItem3Image.setImageResource(R.drawable.tea);
                txtItem3Name.setText("Hot Tea");

                imgItem4Image.setImageResource(R.drawable.healthhotdrink);
                txtItem4Name.setText("Health Drink");
                break;

            case "Cold":
                imgItem1Image.setImageResource(R.drawable.water);
                txtItem1Name.setText("Water");

                imgItem2Image.setImageResource(R.drawable.cucumber_mint_cooler);
                txtItem2Name.setText("Cucumber Mint");

                imgItem3Image.setImageResource(R.drawable.green_tea_lemonade);
                txtItem3Name.setText("Green Tea");

                imgItem4Image.setImageResource(R.drawable.watermelon_lime_slushie);
                txtItem4Name.setText("WaterMelon Lime");
                break;

            case "Smoothie":
                imgItem1Image.setImageResource(R.drawable.green_power_smoothie);
                txtItem1Name.setText("Green Power");

                imgItem2Image.setImageResource(R.drawable.mango_smoothie);
                txtItem2Name.setText("Mango");

                imgItem3Image.setImageResource(R.drawable.banana_smoothie);
                txtItem3Name.setText("Banana");

                imgItem4Image.setImageResource(R.drawable.berry_smoothie);
                txtItem4Name.setText("Berry");
                break;

            case "GYM":
                imgItem1Image.setImageResource(R.drawable.weight_training);
                txtItem1Name.setText("Weight");

                imgItem2Image.setImageResource(R.drawable.hiit);
                txtItem2Name.setText("HIIT");

                imgItem3Image.setImageResource(R.drawable.cycling);
                txtItem3Name.setText("Cycling");

                imgItem4Image.setImageResource(R.drawable.rowing);
                txtItem4Name.setText("Rowing");
                break;

            case "Home":
                imgItem1Image.setImageResource(R.drawable.yoga);
                txtItem1Name.setText("Yoga");

                imgItem2Image.setImageResource(R.drawable.bodyweight_exercises);
                txtItem2Name.setText("Bodyweight");

                imgItem3Image.setImageResource(R.drawable.jump_rope);
                txtItem3Name.setText("Jump Rope");

                imgItem4Image.setImageResource(R.drawable.pilates);
                txtItem4Name.setText("Pilates");
                break;

            default:
                Toast.makeText(ItemsActivity.this, "Unknown category", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    private void sendTextToItemDetails(String itemName) {
        Intent intent = new Intent(ItemsActivity.this, ItemDetailsActivity.class);
        intent.putExtra("ITEM_NAME", itemName);
        startActivity(intent);
    }

}