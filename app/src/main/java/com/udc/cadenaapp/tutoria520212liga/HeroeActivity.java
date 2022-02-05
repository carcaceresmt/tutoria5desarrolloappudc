package com.udc.cadenaapp.tutoria520212liga;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.LabeledIntent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

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

    /**
     * metodo para visualizar el menu en la actividad
     */

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu1,menu);

        return super.onCreateOptionsMenu(menu);
    }

    /**
     * seleccionar los elementos del menu
     */

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch(item.getItemId()){

            case R.id.macerca:
               Intent intent=new Intent(this,AcercaActivity.class);
               finish();
               startActivity(intent);
                break;
            case R.id.msalir:
                Toast.makeText(this,"Adios Vuelve Pronto",
                        Toast.LENGTH_LONG).show();
                finish();
                System.exit(0);
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}