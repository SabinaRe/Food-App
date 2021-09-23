package com.example.tab;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FoodDetailActivity extends AppCompatActivity {
    ImageView back, food_img;
    TextView food_name;
    TextView food_price;
    TextView food_cart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food_detail_activity);

        back=findViewById(R.id.food_back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        Intent intent = getIntent();

        food_img=findViewById(R.id.food_img);
        food_name=findViewById(R.id.food_name);
        food_price=findViewById(R.id.food_price);

        food_name.setText(intent.getStringExtra("food_name"));
        food_price.setText(intent.getStringExtra("food_price"));
        food_img.setImageResource(intent.getIntExtra("food_img", R.drawable.r_view));

        food_cart=findViewById(R.id.food_cart);
        food_cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoodDetailActivity.this, CartDetailActivity.class);
                startActivity(intent);
            }
        });

    }

}
