package com.example.jesusmartinez.correofragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.PriorityQueue;

/**
 * Created by jesusmartinez on 23/11/15.
 */
public class FragmentListado extends Fragment {

    private Correos [] datosArray= new Correos[] {
            new Correos("pesona1", "asunto1", "texto del correo 1"),
            new Correos("pesona2","asunto2","texto del correo 2"),
            new Correos("pesona3","asunto3","texto del correo 3"),
};

    private ListView lstListado;
    public CorreosAdapter mCorreosAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.listado_fragment, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        lstListado=(ListView) getView().findViewById(R.id.LstListado);
        lstListado.setAdapter(new CorreosAdapter(this,R.layout.row,datosArray));



    }
}
