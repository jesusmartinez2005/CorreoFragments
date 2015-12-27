package com.example.jesusmartinez.correofragments;

/**
 * Created by jesusmartinez on 23/11/15.
 */
public class Correos {

    public String de;
    public String asunto;
    public String texto;

    public Correos(String de,String asunto,String texto) {
        this.de=de;
        this.asunto=asunto;
        this.texto=texto;
    }

    public String getDe() {
        return de;
    }

    public String getAsunto() {
        return asunto;
    }

    public String getTexto() {
        return texto;
    }


}
