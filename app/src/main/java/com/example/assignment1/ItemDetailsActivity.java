package com.example.assignment1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ItemDetailsActivity extends AppCompatActivity {

    private TextView txtActivity4ItemName, txtActivity4ItemTime
            , txtActivity4ItemTotalCal, txtHowToMake, txtFromWhatIt;
    private ImageView imgItemLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_details);

        txtActivity4ItemName = findViewById(R.id.txtActivity4ItemName);
        txtActivity4ItemTime = findViewById(R.id.txtActivity4ItemTime);
        imgItemLogo = findViewById(R.id.imgItemLogo);
        txtActivity4ItemTotalCal = findViewById(R.id.txtActivity4ItemTotalCal);
        txtFromWhatIt = findViewById(R.id.txtFromWhatIt);
        txtHowToMake = findViewById(R.id.txtHowToMake);

        Intent intent = getIntent();
        String itemName = intent.getStringExtra("ITEM_NAME");
        txtActivity4ItemName.setText(itemName);
        insertDataFromFood(txtActivity4ItemName.getText().toString());
    }


    private void insertDataFromFood(String name) {
        switch (name) {
            case "Hot Coffee":
                txtActivity4ItemTime.setText("Calories: 2\nHot coffee is a low-calorie drink, simply brew your preferred beans with hot water.");
                txtActivity4ItemTotalCal.setText("110 Cal");
                imgItemLogo.setImageResource(R.drawable.coffee);
                break;

            case "Hot Chocolate":
                txtActivity4ItemTime.setText("Calories: 200\nHot chocolate is made with milk and cocoa powder, add sugar to taste.");
                imgItemLogo.setImageResource(R.drawable.hotchoclatedrink);
                break;

            case "Hot Tea":
                txtActivity4ItemTime.setText("Calories: 0\nTea is a healthy drink, you can choose green tea, black tea, or herbal tea.");
                imgItemLogo.setImageResource(R.drawable.tea);
                break;

            case "Health Drink":
                txtActivity4ItemTime.setText("Calories: 120\nHealth drinks often contain nutrients like vitamins and minerals, mix them with water or juice.");
                imgItemLogo.setImageResource(R.drawable.healthhotdrink);
                break;

            case "Water":
                txtActivity4ItemTime.setText("Calories: 0\nWater is essential for life and keeps you hydrated.");
                imgItemLogo.setImageResource(R.drawable.water);
                break;

            case "Cucumber Mint":
                txtActivity4ItemTime.setText("Calories: 50\nA refreshing drink made from cucumber and mint, perfect for hot days.");
                imgItemLogo.setImageResource(R.drawable.cucumber_mint_cooler);
                break;

            case "Green Tea":
                txtActivity4ItemTime.setText("Calories: 30\nA healthy, refreshing drink combining green tea with the tang of lemon.");
                imgItemLogo.setImageResource(R.drawable.green_tea_lemonade);
                break;

            case "WaterMelon Lime":
                txtActivity4ItemTime.setText("Calories: 120\nA cool, fruity drink made from watermelon and lime, perfect for summer.");
                imgItemLogo.setImageResource(R.drawable.watermelon_lime_slushie);
                break;

            case "Green Power":
                txtActivity4ItemTime.setText("Calories: 200\nA nutrient-packed smoothie made with green vegetables and fruits, great for a morning boost.");
                imgItemLogo.setImageResource(R.drawable.green_power_smoothie);
                break;

            case "Mango":
                txtActivity4ItemTime.setText("Calories: 150\nA tropical smoothie with the sweetness of mango and the smoothness of yogurt or milk.");
                imgItemLogo.setImageResource(R.drawable.mango_smoothie);
                break;

            case "Banana":
                txtActivity4ItemTime.setText("Calories: 120\nA simple, creamy smoothie made with bananas. It’s a quick energy booster.");
                imgItemLogo.setImageResource(R.drawable.banana_smoothie);
                break;

            case "Berry":
                txtActivity4ItemTime.setText("Calories: 180\nA delicious smoothie made with mixed berries, offering antioxidants and a burst of flavor.");
                imgItemLogo.setImageResource(R.drawable.berry_smoothie);
                break;

            case "Avocado Toast with PoachedEgg":
                txtActivity4ItemTime.setText("10 Min");
                txtActivity4ItemTotalCal.setText("150 Cal");
                txtFromWhatIt.setText("Ingredients: Avocado, Bread, Poached Egg, Salt, Pepper");
                txtHowToMake.setText("Toast bread, spread mashed avocado on top, and add a poached egg. Sprinkle with salt and pepper.");
                imgItemLogo.setImageResource(R.drawable.eggsandavogado);
                break;

            case "Oatmeal with Banana and Almonds":
                txtActivity4ItemTime.setText("5 Min");
                txtActivity4ItemTotalCal.setText("200 Cal");
                txtFromWhatIt.setText("Ingredients: Oats, Banana, Almonds, Milk, Honey");
                txtHowToMake.setText("Cook oats in milk, then top with banana slices, almonds, and a drizzle of honey.");
                imgItemLogo.setImageResource(R.drawable.milkshofan);
                break;

            case "Greek Yogurt Parfait":
                txtActivity4ItemTime.setText("5 Min");
                txtActivity4ItemTotalCal.setText("180 Cal");
                txtFromWhatIt.setText("Ingredients: Greek Yogurt, Granola, Berries, Honey");
                txtHowToMake.setText("Layer Greek yogurt, granola, and berries in a bowl or glass. Drizzle with honey.");
                imgItemLogo.setImageResource(R.drawable.ugert);
                break;

            case "Vegetable and Cheese Omelette":
                txtActivity4ItemTime.setText("15 Min");
                txtActivity4ItemTotalCal.setText("220 Cal");
                txtFromWhatIt.setText("Ingredients: Eggs, Cheese, Bell Peppers, Onions, Spinach, Salt, Pepper");
                txtHowToMake.setText("Whisk eggs, then pour into a heated pan. Add chopped vegetables and cheese, cook until eggs are set.");
                imgItemLogo.setImageResource(R.drawable.eggspizza);
                break;

            case "Soup":
                txtActivity4ItemTime.setText("Calories: 100\nSoup can be made from a variety of vegetables or meats. It’s a light, healthy meal and easy to digest.");
                imgItemLogo.setImageResource(R.drawable.soup);
                break;

            case "TonaSalad":
                txtActivity4ItemTime.setText("Calories: 200\nA refreshing salad with tuna, veggies, and a light dressing.");
                imgItemLogo.setImageResource(R.drawable.tonasalad);
                break;

            case "Sandwich":
                txtActivity4ItemTime.setText("Calories: 250\nSandwiches can be filled with a variety of ingredients like meat, cheese, and vegetables.");
                imgItemLogo.setImageResource(R.drawable.sanduish);
                break;

            case "Rice & Chicken":
                txtActivity4ItemTime.setText("Calories: 350\nA hearty dish with rice and grilled or roasted chicken, often served with veggies.");
                imgItemLogo.setImageResource(R.drawable.riceandchicken);
                break;

            case "Salads":
                txtActivity4ItemTime.setText("Calories: 100\nA healthy dish made with fresh vegetables, perfect as a light meal or side.");
                imgItemLogo.setImageResource(R.drawable.desert);
                break;

            case "Kufta":
                txtActivity4ItemTime.setText("Calories: 250\nKufta is a traditional dish made from minced meat, often grilled or fried.");
                imgItemLogo.setImageResource(R.drawable.kufta);
                break;

            case "Eggs & Avocado":
                txtActivity4ItemTime.setText("Calories: 220\nA combination of eggs and avocado, a protein-packed, healthy dish.");
                imgItemLogo.setImageResource(R.drawable.eggsandavocado);
                break;

            case "Salmon":
                txtActivity4ItemTime.setText("Calories: 350\nSalmon is a nutritious fish, rich in omega-3 fatty acids, often grilled or baked.");
                imgItemLogo.setImageResource(R.drawable.salmon);
                break;

            case "Shofan Biscuit":
                txtActivity4ItemTime.setText("Calories: 150\nA sweet, crispy biscuit made from fried dough, perfect as a snack.");
                imgItemLogo.setImageResource(R.drawable.shofanbiscuit);
                break;

            case "Ice Cream":
                txtActivity4ItemTime.setText("Calories: 200\nA frozen dessert made from milk and sugar, often flavored with fruit, chocolate, or vanilla.");
                imgItemLogo.setImageResource(R.drawable.icecream);
                break;

            case "Zabadi Tot":
                txtActivity4ItemTime.setText("Calories: 120\nA delicious Middle Eastern treat made with yogurt and fresh fruits.");
                imgItemLogo.setImageResource(R.drawable.totandzabazy);
                break;

            case "Dark Chocolate":
                txtActivity4ItemTime.setText("Calories: 170\nDark chocolate is rich in antioxidants and has a distinct bittersweet flavor.");
                imgItemLogo.setImageResource(R.drawable.darkchocolate);
                break;

            case "Weight":
                txtActivity4ItemTime.setText("Calories Burned (30 minutes): 180-250 Cal \nWeight training involves lifting weights to build muscle strength.");
                imgItemLogo.setImageResource(R.drawable.weight_training);
                break;

            case "HIIT":
                txtActivity4ItemTime.setText("Calories Burned (30 minutes): 400-600 Cal \nHigh-intensity interval training involves short bursts of intense exercise followed by rest.");
                imgItemLogo.setImageResource(R.drawable.hiit);
                break;

            case "Cycling":
                txtActivity4ItemTime.setText("Calories Burned (30 minutes): 250-400 Cal \nCycling is a great cardiovascular workout that strengthens the legs and improves endurance.");
                imgItemLogo.setImageResource(R.drawable.cycling);
                break;

            case "Rowing":
                txtActivity4ItemTime.setText("Calories Burned (30 minutes): 250-300 Cal \nRowing is a full-body workout that engages multiple muscle groups while improving cardiovascular health.");
                imgItemLogo.setImageResource(R.drawable.rowing);
                break;

            case "Yoga":
                txtActivity4ItemTime.setText("Calories Burned (30 minutes): 150-250 Cal \nYoga involves postures and breathing exercises that promote flexibility, strength, and mental clarity.");
                imgItemLogo.setImageResource(R.drawable.yoga);
                break;

            case "Bodyweight":
                txtActivity4ItemTime.setText("Calories Burned (30 minutes): 200-300 Cal \nBodyweight exercises use your own body as resistance, such as push-ups, squats, and lunges.");
                imgItemLogo.setImageResource(R.drawable.bodyweight_exercises);
                break;

            case "Jump Rope":
                txtActivity4ItemTime.setText("Calories Burned (30 minutes): 350-450 Cal \nJump rope is a great cardio exercise that improves coordination, endurance, and heart health.");
                imgItemLogo.setImageResource(R.drawable.jump_rope);
                break;

            case "Pilates":
                txtActivity4ItemTime.setText("Calories Burned (30 minutes): 175-250 Cal \nPilates is a form of low-impact exercise that improves posture, flexibility, and strength.");
                imgItemLogo.setImageResource(R.drawable.pilates);
                break;

            default:
                break;
        }
    }
}
