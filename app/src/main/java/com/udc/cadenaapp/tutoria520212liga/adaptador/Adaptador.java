package com.udc.cadenaapp.tutoria520212liga.adaptador;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.udc.cadenaapp.tutoria520212liga.R;
import com.udc.cadenaapp.tutoria520212liga.modelo.Heroe;

import java.util.List;

public class Adaptador extends BaseAdapter {

    private List<Heroe> heroes;
    private Context context;
    private LayoutInflater layoutInflater;

    public Adaptador(List<Heroe> heroes,Context context){
        this.heroes=heroes;
        this.context=context;
    }

    @Override
    public int getCount() {
        return heroes.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        TextView nomheore;
        ImageView heroeimage;
        layoutInflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View lview =  layoutInflater.inflate(R.layout.heroe_item,viewGroup,false);
        heroeimage=lview.findViewById(R.id.heroeimage);
        nomheore=lview.findViewById(R.id.nomheroe);
        heroeimage.setImageResource(heroes.get(i).getImagen());
        nomheore.setText(heroes.get(i).getNombre());
        return lview;
    }
}
