package com.example.rucafe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

import code.*;

public class activity_cart extends AppCompatActivity {
    private Order basketOrder;
    private RecyclerView shoppingCart;
    private ArrayList<MenuItem> cartItems;
    private List<MenuItem> orderList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        shoppingCart = findViewById(R.id.shoppingCart);
        shoppingCart.setLayoutManager(new LinearLayoutManager(this));
    }



}