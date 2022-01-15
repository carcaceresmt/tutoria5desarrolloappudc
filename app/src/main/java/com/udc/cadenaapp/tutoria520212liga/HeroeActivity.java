package com.udc.cadenaapp.tutoria520212liga;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.LabeledIntent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListView;

import com.udc.cadenaapp.tutoria520212liga.adaptador.Adaptador;
import com.udc.cadenaapp.tutoria520212liga.modelo.Heroe;
import com.udc.cadenaapp.tutoria520212liga.modelo.Liga;

import java.util.List;

public class HeroeActivity extends AppCompatActivity {

    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heroe);
        listView=findViewById(R.id.listview);
        Liga liga=new Liga();
        List<Heroe> heroes=liga.ligaJusticia();
        View header = LayoutInflater.from(this).inflate(R.layout.header,null);
        View footer = LayoutInflater.from(this).inflate(R.layout.footer,null);
        Adaptador adaptador=new Adaptador(heroes,this);
        listView.setAdapter(adaptador);
        listView.addHeaderView(header);
        listView.addFooterView(footer);
    }
}