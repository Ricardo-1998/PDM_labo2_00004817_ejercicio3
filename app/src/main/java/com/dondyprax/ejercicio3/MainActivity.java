package com.dondyprax.ejercicio3;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.dondyprax.ejercicio3.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button boton1;
    Button boton2;
    Button boton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton1 = findViewById(R.id.boton1);
        boton2 = findViewById(R.id.boton2);
        boton3 = findViewById(R.id.boton3);

        boton1.setOnClickListener(this);
        boton2.setOnClickListener(this);
        boton3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        ArrayList<Integer> rojos = new ArrayList<>();
        ArrayList<Integer> azules = new ArrayList<>();
        ArrayList<Integer> verdes = new ArrayList<>();

        azules.add(getResources().getColor(R.color.blue));
        azules.add(getResources().getColor(R.color.blue2));
        azules.add(getResources().getColor(R.color.blue3));
        azules.add(getResources().getColor(R.color.blue4));
        azules.add(getResources().getColor(R.color.blue5));
        azules.add(getResources().getColor(R.color.blue6));

        int viewId = v.getId();
        Log.i("id", viewId+"");
        switch (viewId){
            case R.id.boton1:
                Log.d("color", azules.get(0)+"");
                boton1.setBackground(getResources().getColor(azules.get(0)));
                break;
            case R.id.boton2:
                boton2.setBackground(getResources().getDrawable(azules.get(1)));
                break;
            case R.id.boton3:
                boton3.setBackground(getResources().getDrawable(azules.get(1)));
                break;
        }
    }
}
