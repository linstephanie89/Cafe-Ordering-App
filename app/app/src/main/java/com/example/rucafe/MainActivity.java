package com.example.rucafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

/**
 * hey
 */

public class MainActivity extends AppCompatActivity {
    private ImageButton donutButton;
    private ImageButton coffeeButton;
    private ImageButton cartButton;
    private ImageButton historyButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void donutClick(View view){
        Toast.makeText(this, "donut", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, donut_activity.class);
        startActivity(intent);
    }
    public void coffeeClick(View view){
        Toast.makeText(this, "coffee", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, activity_coffee.class);
        startActivity(intent);
    }
    public void cartClick(View view){
        Toast.makeText(this, "cart", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, activity_cart.class);
        startActivity(intent);
    }
    public void historyClick(View view){
        Toast.makeText(this, "history", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, activity_history.class);
        startActivity(intent);
    }
}