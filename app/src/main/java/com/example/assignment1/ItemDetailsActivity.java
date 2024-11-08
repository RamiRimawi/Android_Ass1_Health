package com.example.assignment1;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ItemDetailsActivity extends AppCompatActivity {

    private TextView txtActivity4ItemName, txtActivity4ItemDetails;
    private ImageView imgItemLogo;
    private WebView vdItemDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_details);

        txtActivity4ItemName = findViewById(R.id.txtActivity4ItemName);
        txtActivity4ItemDetails = findViewById(R.id.txtActivity4ItemDetails);
        imgItemLogo = findViewById(R.id.imgItemLogo);
        vdItemDetails = findViewById(R.id.vdItemDetails);

        Intent intent = getIntent();
        String itemName = intent.getStringExtra("ITEM_NAME");
        txtActivity4ItemName.setText(itemName);

        visibleVideo();
        insertDataFromFood(txtActivity4ItemName.getText().toString());
    }


    private void insertDataFromFood(String name) {
        switch (name) {
            case "Hot Coffee":
                txtActivity4ItemDetails.setText("Calories: 2\nHot coffee is a low-calorie drink, simply brew your preferred beans with hot water.");
                imgItemLogo.setImageResource(R.drawable.coffee);
                break;

            case "Hot Chocolate":
                txtActivity4ItemDetails.setText("Calories: 200\nHot chocolate is made with milk and cocoa powder, add sugar to taste.");
                imgItemLogo.setImageResource(R.drawable.hotchoclatedrink);
                break;

            case "Hot Tea":
                txtActivity4ItemDetails.setText("Calories: 0\nTea is a healthy drink, you can choose green tea, black tea, or herbal tea.");
                imgItemLogo.setImageResource(R.drawable.tea);
                break;

            case "Health Drink":
                txtActivity4ItemDetails.setText("Calories: 120\nHealth drinks often contain nutrients like vitamins and minerals, mix them with water or juice.");
                imgItemLogo.setImageResource(R.drawable.healthhotdrink);
                break;

            case "Water":
                txtActivity4ItemDetails.setText("Calories: 0\nWater is essential for life and keeps you hydrated.");
                imgItemLogo.setImageResource(R.drawable.water);
                break;

            case "Cucumber Mint":
                txtActivity4ItemDetails.setText("Calories: 50\nA refreshing drink made from cucumber and mint, perfect for hot days.");
                imgItemLogo.setImageResource(R.drawable.cucumber_mint_cooler);
                break;

            case "Green Tea":
                txtActivity4ItemDetails.setText("Calories: 30\nA healthy, refreshing drink combining green tea with the tang of lemon.");
                imgItemLogo.setImageResource(R.drawable.green_tea_lemonade);
                break;

            case "WaterMelon Lime":
                txtActivity4ItemDetails.setText("Calories: 120\nA cool, fruity drink made from watermelon and lime, perfect for summer.");
                imgItemLogo.setImageResource(R.drawable.watermelon_lime_slushie);
                break;

            case "Green Power":
                txtActivity4ItemDetails.setText("Calories: 200\nA nutrient-packed smoothie made with green vegetables and fruits, great for a morning boost.");
                imgItemLogo.setImageResource(R.drawable.green_power_smoothie);
                break;

            case "Mango":
                txtActivity4ItemDetails.setText("Calories: 150\nA tropical smoothie with the sweetness of mango and the smoothness of yogurt or milk.");
                imgItemLogo.setImageResource(R.drawable.mango_smoothie);
                break;

            case "Banana":
                txtActivity4ItemDetails.setText("Calories: 120\nA simple, creamy smoothie made with bananas. It’s a quick energy booster.");
                imgItemLogo.setImageResource(R.drawable.banana_smoothie);
                break;

            case "Berry":
                txtActivity4ItemDetails.setText("Calories: 180\nA delicious smoothie made with mixed berries, offering antioxidants and a burst of flavor.");
                imgItemLogo.setImageResource(R.drawable.berry_smoothie);
                break;

            case "Eggs":
                txtActivity4ItemDetails.setText("Calories: 155\nEggs are high in protein and easy to cook. They are versatile and can be fried, boiled, or scrambled.");
                imgItemLogo.setImageResource(R.drawable.eggs);
                break;

            case "Avocado":
                txtActivity4ItemDetails.setText("Calories: 160\nAvocados are rich in healthy fats, fiber, and vitamins. They're creamy and can be used in salads, as a spread on toast, or added to smoothies.");
                imgItemLogo.setImageResource(R.drawable.avogado);
                break;

            case "Homus":
                txtActivity4ItemDetails.setText("Calories: 170\nHummus is a chickpea-based dip, popular in Mediterranean cuisine. It's rich in protein and perfect as a snack or spread.");
                imgItemLogo.setImageResource(R.drawable.homus);
                break;

            case "Shofan":
                txtActivity4ItemDetails.setText("Calories: 220\nShofan is a traditional Middle Eastern dish, made with fried dough and sometimes drizzled with honey or sugar.");
                imgItemLogo.setImageResource(R.drawable.shofan);
                break;

            case "Soup":
                txtActivity4ItemDetails.setText("Calories: 100\nSoup can be made from a variety of vegetables or meats. It’s a light, healthy meal and easy to digest.");
                imgItemLogo.setImageResource(R.drawable.soup);
                break;

            case "TonaSalad":
                txtActivity4ItemDetails.setText("Calories: 200\nA refreshing salad with tuna, veggies, and a light dressing.");
                imgItemLogo.setImageResource(R.drawable.tonasalad);
                break;

            case "Sandwich":
                txtActivity4ItemDetails.setText("Calories: 250\nSandwiches can be filled with a variety of ingredients like meat, cheese, and vegetables.");
                imgItemLogo.setImageResource(R.drawable.sanduish);
                break;

            case "Rice & Chicken":
                txtActivity4ItemDetails.setText("Calories: 350\nA hearty dish with rice and grilled or roasted chicken, often served with veggies.");
                imgItemLogo.setImageResource(R.drawable.riceandchicken);
                break;

            case "Salads":
                txtActivity4ItemDetails.setText("Calories: 100\nA healthy dish made with fresh vegetables, perfect as a light meal or side.");
                imgItemLogo.setImageResource(R.drawable.desert);
                break;

            case "Kufta":
                txtActivity4ItemDetails.setText("Calories: 250\nKufta is a traditional dish made from minced meat, often grilled or fried.");
                imgItemLogo.setImageResource(R.drawable.kufta);
                break;

            case "Eggs & Avocado":
                txtActivity4ItemDetails.setText("Calories: 220\nA combination of eggs and avocado, a protein-packed, healthy dish.");
                imgItemLogo.setImageResource(R.drawable.eggsandavocado);
                break;

            case "Salmon":
                txtActivity4ItemDetails.setText("Calories: 350\nSalmon is a nutritious fish, rich in omega-3 fatty acids, often grilled or baked.");
                imgItemLogo.setImageResource(R.drawable.salmon);
                break;

            case "Shofan Biscuit":
                txtActivity4ItemDetails.setText("Calories: 150\nA sweet, crispy biscuit made from fried dough, perfect as a snack.");
                imgItemLogo.setImageResource(R.drawable.shofanbiscuit);
                break;

            case "Ice Cream":
                txtActivity4ItemDetails.setText("Calories: 200\nA frozen dessert made from milk and sugar, often flavored with fruit, chocolate, or vanilla.");
                imgItemLogo.setImageResource(R.drawable.icecream);
                break;

            case "Zabadi Tot":
                txtActivity4ItemDetails.setText("Calories: 120\nA delicious Middle Eastern treat made with yogurt and fresh fruits.");
                imgItemLogo.setImageResource(R.drawable.totandzabazy);
                break;

            case "Dark Chocolate":
                txtActivity4ItemDetails.setText("Calories: 170\nDark chocolate is rich in antioxidants and has a distinct bittersweet flavor.");
                imgItemLogo.setImageResource(R.drawable.darkchocolate);
                break;

            case "Weight":
                txtActivity4ItemDetails.setText("Calories Burned (30 minutes): 180-250 Cal \nWeight training involves lifting weights to build muscle strength.");
                imgItemLogo.setImageResource(R.drawable.weight_training);

                String video1 = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/RocudKlpQeI?si=R6awyTpVKHLCCJNj\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>";
                vdItemDetails.loadData(video1, "text/html", "utf-8");
                vdItemDetails.getSettings().setJavaScriptEnabled(true);
                vdItemDetails.setWebChromeClient(new WebChromeClient());
                break;

            case "HIIT":
                txtActivity4ItemDetails.setText("Calories Burned (30 minutes): 400-600 Cal \nHigh-intensity interval training involves short bursts of intense exercise followed by rest.");
                imgItemLogo.setImageResource(R.drawable.hiit);

                String video2 = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/EqRXqO-29gg?si=lRReKMEUhkICF_iZ\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>";
                vdItemDetails.loadData(video2, "text/html", "utf-8");
                vdItemDetails.getSettings().setJavaScriptEnabled(true);
                vdItemDetails.setWebChromeClient(new WebChromeClient());
                break;

            case "Cycling":
                txtActivity4ItemDetails.setText("Calories Burned (30 minutes): 250-400 Cal \nCycling is a great cardiovascular workout that strengthens the legs and improves endurance.");
                imgItemLogo.setImageResource(R.drawable.cycling);

                String video3 = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/oMcSAyzyQX4?si=KBj070gmOWEum7as\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>";
                vdItemDetails.loadData(video3, "text/html", "utf-8");
                vdItemDetails.getSettings().setJavaScriptEnabled(true);
                vdItemDetails.setWebChromeClient(new WebChromeClient());
                break;

            case "Rowing":
                txtActivity4ItemDetails.setText("Calories Burned (30 minutes): 250-300 Cal \nRowing is a full-body workout that engages multiple muscle groups while improving cardiovascular health.");
                imgItemLogo.setImageResource(R.drawable.rowing);

                String video4 = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/M2qFfwwWsIo?si=R7AMklaCUddU38uR\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>";
                vdItemDetails.loadData(video4, "text/html", "utf-8");
                vdItemDetails.getSettings().setJavaScriptEnabled(true);
                vdItemDetails.setWebChromeClient(new WebChromeClient());
                break;

            case "Yoga":
                txtActivity4ItemDetails.setText("Calories Burned (30 minutes): 150-250 Cal \nYoga involves postures and breathing exercises that promote flexibility, strength, and mental clarity.");
                imgItemLogo.setImageResource(R.drawable.yoga);

                String video5 = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/PFqs_pb52Kk?si=k4VTIhincFUCejeB\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>";
                vdItemDetails.loadData(video5, "text/html", "utf-8");
                vdItemDetails.getSettings().setJavaScriptEnabled(true);
                vdItemDetails.setWebChromeClient(new WebChromeClient());
                break;

            case "Bodyweight":
                txtActivity4ItemDetails.setText("Calories Burned (30 minutes): 200-300 Cal \nBodyweight exercises use your own body as resistance, such as push-ups, squats, and lunges.");
                imgItemLogo.setImageResource(R.drawable.bodyweight_exercises);

                String video6 = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/TQxVf1uh2i4?si=YGHOS2kl31AJKXZl\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>";
                vdItemDetails.loadData(video6, "text/html", "utf-8");
                vdItemDetails.getSettings().setJavaScriptEnabled(true);
                vdItemDetails.setWebChromeClient(new WebChromeClient());
                break;

            case "Jump Rope":
                txtActivity4ItemDetails.setText("Calories Burned (30 minutes): 350-450 Cal \nJump rope is a great cardio exercise that improves coordination, endurance, and heart health.");
                imgItemLogo.setImageResource(R.drawable.jump_rope);

                String video7 = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/MxH3i8YIhBg?si=6ysuFwvApLXvl0CY\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>";
                vdItemDetails.loadData(video7, "text/html", "utf-8");
                vdItemDetails.getSettings().setJavaScriptEnabled(true);
                vdItemDetails.setWebChromeClient(new WebChromeClient());
                break;

            case "Pilates":
                txtActivity4ItemDetails.setText("Calories Burned (30 minutes): 175-250 Cal \nPilates is a form of low-impact exercise that improves posture, flexibility, and strength.");
                imgItemLogo.setImageResource(R.drawable.pilates);

                String video8 = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/T78iS7zwWJc?si=g0hs8H9LG_GUGXIx\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>";
                vdItemDetails.loadData(video8, "text/html", "utf-8");
                vdItemDetails.getSettings().setJavaScriptEnabled(true);
                vdItemDetails.setWebChromeClient(new WebChromeClient());
                break;

            default:
                break;
        }
    }

    private void visibleVideo() {
        String itemName = txtActivity4ItemName.getText().toString();
        if (itemName.equals("Weight") || itemName.equals("Cycling")
                || itemName.equals("HIIT") || itemName.equals("Rowing")
                || itemName.equals("Yoga") || itemName.equals("Bodyweight") ||
                itemName.equals("Jump Rope") || itemName.equals("Pilates")) {
            vdItemDetails.setVisibility(View.VISIBLE);
        } else
            vdItemDetails.setVisibility(View.INVISIBLE);

    }
}
