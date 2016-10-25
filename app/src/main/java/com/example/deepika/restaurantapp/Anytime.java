package com.example.deepika.restaurantapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * Created by deepika on 12-Sep-16.
 */
public class Anytime extends Activity {
int quantity = 0;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.anytime);
        Button b1 = (Button)findViewById(R.id.button6);
        Button b2 = (Button)findViewById(R.id.button7);
        Button b3 = (Button)findViewById(R.id.button5);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                increment();
            }
        });
        b2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v){
                decrement();
            }
        });
        b3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                submitOrder();
            }
        });
    }

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
}
