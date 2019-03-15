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
    ArrayList<Drawable> rojos = new ArrayList<>();
    ArrayList<Drawable> azules = new ArrayList<>();
    ArrayList<Drawable> verdes = new ArrayList<>();

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
        agregarColores();
        int n=randomColor();
        int viewId = v.getId();
        Log.i("id", viewId+"");
        switch (viewId){
            case R.id.boton1:
                Log.d("color", rojos.get(0)+"");
                boton1.setBackground(rojos.get(n));
                break;
            case R.id.boton2:
                Log.d("color", verdes.get(0)+"");
                boton2.setBackground(verdes.get(n));
                break;
            case R.id.boton3:
                Log.d("color", azules.get(0)+"");
                boton3.setBackground(azules.get(n));
                break;
        }
    }

    public void agregarColores(){
        azules.add(getResources().getDrawable(R.color.blue));
        azules.add(getResources().getDrawable(R.color.blue2));
        azules.add(getResources().getDrawable(R.color.blue3));
        azules.add(getResources().getDrawable(R.color.blue4));
        azules.add(getResources().getDrawable(R.color.blue5));
        azules.add(getResources().getDrawable(R.color.blue6));

        rojos.add(getResources().getDrawable(R.color.red));
        rojos.add(getResources().getDrawable(R.color.red2));
        rojos.add(getResources().getDrawable(R.color.red3));
        rojos.add(getResources().getDrawable(R.color.red4));
        rojos.add(getResources().getDrawable(R.color.red5));
        rojos.add(getResources().getDrawable(R.color.red6));

        verdes.add(getResources().getDrawable(R.color.green));
        verdes.add(getResources().getDrawable(R.color.green2));
        verdes.add(getResources().getDrawable(R.color.green3));
        verdes.add(getResources().getDrawable(R.color.green4));
        verdes.add(getResources().getDrawable(R.color.green5));
        verdes.add(getResources().getDrawable(R.color.green6));
    }

    public int randomColor(){
        int num= (int) (Math.random()*6)+1;
        return num;

    }
}
