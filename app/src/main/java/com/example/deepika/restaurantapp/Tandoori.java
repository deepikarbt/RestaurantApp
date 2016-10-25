package com.example.deepika.restaurantapp;

/**
 * Created by deepika on 16-Aug-16.
 */
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Tandoori extends AppCompatActivity {
    ImageView im,im1,im2,im3,im4,im5,im6,im7,im8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tand);
        ImageView im = (ImageView) findViewById(R.id.img);
        ImageView im1 = (ImageView) findViewById(R.id.img1);
        ImageView im2 = (ImageView) findViewById(R.id.img2);
        ImageView im3 = (ImageView) findViewById(R.id.img3);
        ImageView im4 = (ImageView) findViewById(R.id.img4);
        ImageView im5 = (ImageView) findViewById(R.id.img5);
        ImageView im6 = (ImageView) findViewById(R.id.img6);
        ImageView im7 = (ImageView) findViewById(R.id.img7);
        ImageView im8 = (ImageView) findViewById(R.id.img8);
        ImageView im9 = (ImageView) findViewById(R.id.img9);
        im.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(),Tandmush.class);
                startActivity(in);            }
        });
        im1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(),Paratha.class);
                startActivity(in);            }
        });
        im2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(),Tavachana.class);
                startActivity(in);            }
        });
        im3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(),Friedmush.class);
                startActivity(in);            }
        });
        im4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(),Dahimurga.class);
                startActivity(in);            }
        });
        im5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(),Panpapdi.class);
                startActivity(in);            }
        });
        im6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(),Babypako.class);
                startActivity(in);            }
        });
        im7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(),Rajma.class);
                startActivity(in);            }
        });
        im8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(),Marinated.class);
                startActivity(in);            }
        });


    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main,menu);
        return super.onCreateOptionsMenu(menu);

    }
    public boolean onOptionsItemSelected(MenuItem item)
    {

        int id=item.getItemId();
        if(id==R.id.refresh)
        {
            Intent in= new Intent(this,MainActivity.class);
            startActivity(in);
            return  true;
        }
        return super.onOptionsItemSelected(item);
    }
}
