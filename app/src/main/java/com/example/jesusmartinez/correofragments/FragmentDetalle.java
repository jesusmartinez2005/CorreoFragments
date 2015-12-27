package com.example.jesusmartinez.correofragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by jesusmartinez on 23/11/15.
 */
public class FragmentDetalle extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.detalle_fragment,container,false);
    }

    public void mostrardetalle (String texto) {
        TextView textdetalle=(TextView) getView().findViewById(R.id.textdetalle);
        textdetalle.setText(texto);
    }
}
