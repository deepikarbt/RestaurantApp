package com.example.deepika.restaurantapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * Created by deepika on 12-Sep-16.
 */
public class Apple extends Activity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.apple);
    private void submitOrder() {
        //  int quantit= 3;
        display(quantity);
        displayPrice(quantity*4);

    }

    private void displayPrice(int num) {
        TextView txtt = (TextView)findViewById(R.id.textView19);
        txtt.setText(NumberFormat.getCurrencyInstance().format(num));

    }

    private void decrement() {
        quantity = quantity -1;
        display(quantity);

    }

    private void increment() {
        quantity = quantity +1 ;
        display(quantity);

    }

    private void display(int num) {
        TextView txt = (TextView)findViewById(R.id.textView17);
        txt.setText("" +num);

    }
}}
