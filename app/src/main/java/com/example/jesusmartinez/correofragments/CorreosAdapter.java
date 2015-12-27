package com.example.jesusmartinez.correofragments;

import android.app.Fragment;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


/**
 * Created by jesusmartinez on 23/11/15.
 */
public class CorreosAdapter extends ArrayAdapter<Correos> {

    Context mContext;
    int mResource;
    Correos [] mdata= null;

    public CorreosAdapter(Fragment context, int resource, Correos[] data) {


        super(context.getActivity(), resource, data);
        this.mContext=context.getActivity();
        this.mResource=resource;
        this.mdata=data;

    }

    @Override
    public Correos getItem(int position) {
        return super.getItem(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //inflater
        LayoutInflater inflater=LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource,parent,false);

        // referenciamos los views
        TextView deView=(TextView) convertView.findViewById(R.id.de);
        TextView asuntoView=(TextView) convertView.findViewById(R.id.asunto);
      //  TextView textoView=(TextView) convertView.findViewById(R.id.texto);

        //obtenemos datos del array
        Correos uncorreo=mdata[position];

        //hacemos que el view refleje los datos
        deView.setText(uncorreo.de);
        asuntoView.setText(uncorreo.asunto);
    //    textoView.setText(uncorreo.texto);

        //devolvemos la fila

        return convertView;



    }
}


