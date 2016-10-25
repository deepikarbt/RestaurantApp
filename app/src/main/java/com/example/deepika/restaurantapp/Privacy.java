package com.example.deepika.restaurantapp;

/**
 * Created by deepika on 16-Aug-16.
 */
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Privacy extends Activity {
    Button btn;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.terms);
        btn = (Button)findViewById(R.id.button3);
        btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent im= new Intent(getApplicationContext(),MainActivity.class);
                startActivity(im);
            }
        });
    }
}