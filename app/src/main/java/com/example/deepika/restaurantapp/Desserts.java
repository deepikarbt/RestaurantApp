package com.example.deepika.restaurantapp;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RelativeLayout;

import static com.example.deepika.restaurantapp.R.*;


public class Desserts extends AppCompatActivity {
    //  ListView listview;
    Context context;
    RecyclerView recycle;
    RelativeLayout out;
    RecyclerView.Adapter recycleadapt;
    RecyclerView.LayoutManager recycleoutmng;
    String[] my_Items = {"Fresh juices", "Milk shake","Cakes & Bakes","Icecream","Falooda"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // requestWindowFeature(Window.FEATURE_ACTION_BAR);
        setContentView(R.layout.desserts);
        context=getApplicationContext();
        out = (RelativeLayout) findViewById(id.relativelayout1);
        recycle = (RecyclerView) findViewById(id.recyclerview1);
        recycle.addOnItemTouchListener(new RecyclerItemClickListener(context,recycle,new RecyclerItemClickListener.OnItemClickListener(){
                    public void onItemClick(View view,int position) {
                        if (position == 0) {
                            Intent in = new Intent(getApplicationContext(), Fresh.class);
                            startActivity(in);
                        } else if (position == 1) {
                            Intent out = new Intent(getApplicationContext(), Milk.class);
                            startActivity(out);
                        } else if (position == 2) {
                            Intent out = new Intent(getApplicationContext(), Cakes.class);
                            startActivity(out);

                        } else if (position == 3) {
                            Intent out = new Intent(getApplicationContext(), Ice.class);
                            startActivity(out);

                        } else if (position == 4) {
                            Intent out = new Intent(getApplicationContext(), Falooda.class);
                            startActivity(out);

                        }
                    }
                    public void onLongItemClick(View view,int position){
                        if(position==0){
                            Intent am = new Intent(getApplicationContext(),Starters.class);
                            startActivity(am);
                        }
                        else if(position==1){
                            Intent pin = new Intent(getApplicationContext(),Receipes.class);
                            startActivity(pin);

                        }
                    }
                })
        );

        recycle.addItemDecoration(new SimpleDivider(getResources()));

        recycleoutmng = new LinearLayoutManager(context);

        recycle.setLayoutManager(recycleoutmng);

        recycleadapt = new RecyclerViewAdapter(context, my_Items);

        recycle.setAdapter(recycleadapt);

    }
}