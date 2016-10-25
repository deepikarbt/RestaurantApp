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



public class Receipes extends AppCompatActivity {
  //  ListView listview;
Context context;
    RecyclerView recycle;
    RelativeLayout out;
    RecyclerView.Adapter recycleadapt;
    RecyclerView.LayoutManager recycleoutmng;
    String[] my_Items = {"Starters", "Vegetarian", "Sea Food","Fish","Prawns","Egg","Chettinad varities","Chicken","Rice & Noodels","Tandoori special"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // requestWindowFeature(Window.FEATURE_ACTION_BAR);
        setContentView(R.layout.receipes);
        context=getApplicationContext();
        out = (RelativeLayout) findViewById(R.id.relativelayout1);
        recycle = (RecyclerView) findViewById(R.id.recyclerview1);
        recycle.addItemDecoration(new SimpleDivider(getResources()));
recycle.addOnItemTouchListener(new RecyclerItemClickListener(context,recycle,new RecyclerItemClickListener.OnItemClickListener(){
public void onItemClick(View view,int position){
    if(position==0){
        Intent in = new Intent(getApplicationContext(),Starters.class);
        startActivity(in);
    }
    else if(position==1){
        Intent out= new Intent(getApplicationContext(),Vegetarian.class);
        startActivity(out);
    }
    else if(position==2){
        Intent out= new Intent(getApplicationContext(),Sea.class);
        startActivity(out);

    }
    else if(position==3){
        Intent out= new Intent(getApplicationContext(),Fish.class);
        startActivity(out);

    }
    else if(position==4){
        Intent out= new Intent(getApplicationContext(),Prawn.class);
        startActivity(out);

    }
    else if(position==5){
        Intent out= new Intent(getApplicationContext(),Egg.class);
        startActivity(out);

    }
    else if(position==6){
        Intent out= new Intent(getApplicationContext(),Chettinad.class);
        startActivity(out);

    }
    else if(position==7){
        Intent out= new Intent(getApplicationContext(),Chicken.class);
        startActivity(out);

    }

    else if(position==8){
        Intent out= new Intent(getApplicationContext(),Noodles.class);
        startActivity(out);

    }
    else if(position==9){
        Intent out= new Intent(getApplicationContext(),Tandoori.class);
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
        recycleoutmng = new LinearLayoutManager(context);

        recycle.setLayoutManager(recycleoutmng);

        recycleadapt = new RecyclerViewAdapter(context, my_Items);

        recycle.setAdapter(recycleadapt);

    }
}