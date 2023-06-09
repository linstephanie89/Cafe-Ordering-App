package com.example.rucafe;
import code.*;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;

import code.Order;

/**
 * hey
 */

public class MainActivity extends AppCompatActivity {
    private ImageButton donutButton;
    private ImageButton coffeeButton;
    private ImageButton cartButton;
    private ImageButton historyButton;
    private Order order = orderSingle.getInstance().getOrder();
    //private ArrayList<Order> orderList  = new ArrayList<>();

    /**
     * setter method that assigns the passed in Order to the order variable.
     * @param Order representing the current order basket.
     */
    public void setOrder(Order Order) {
        this.order = Order;
    }
//    public void setOrderList(ArrayList<Order> orderlist) {
//        orderList = orderlist;
//    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void donutClick(View view){
        Toast.makeText(this, "donut", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, donut_activity.class);
        intent.putExtra("order", orderSingle.getInstance().getOrder());
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