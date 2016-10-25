package com.example.deepika.restaurantapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends Activity {
CardView card,card1,card2,card3,card4,card5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_page);
card=(CardView) findViewById(R.id.card_view);
        card1=(CardView) findViewById(R.id.card_view1);
        card2=(CardView) findViewById(R.id.card_view2);
        card3=(CardView) findViewById(R.id.card_view33);
        card4=(CardView)findViewById(R.id.card_view4) ;
        card5=(CardView)findViewById(R.id.card_view5);

        card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(),Home.class);
                startActivity(in);
            }
        });
card1.setOnClickListener(new View.OnClickListener(){
    public void onClick(View v){
        Intent in1 = new Intent(getApplicationContext(),Receipes.class);
        startActivity(in1);
    }
});
        card2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent in2 = new Intent(getApplicationContext(), Desserts.class);
                startActivity(in2);
            }
        } );
        card3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent in3 = new Intent(getApplicationContext(),Register.class);
                startActivity(in3);
            }
        });
        card4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent in4 = new Intent(getApplicationContext(),Privacy.class);
                startActivity(in4);
            }
        });
        card5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent in5 = new Intent(getApplicationContext(),About.class);
                startActivity(in5);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id==R.id.refresh)
        {
            Intent in = new Intent(this,MainActivity.class);
            startActivity(in);
        }
        return super.onOptionsItemSelected(item);
    }
}
