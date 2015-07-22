package es.davidcampos.appmockup;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class MainActivity extends Activity {

    private final static String TAG =  MainActivity.class.getSimpleName();

    private PrediccionAleatoria prediccionAleatoria;
    private ColorAleatorio colorAleatorio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        prediccionAleatoria = new PrediccionAleatoria(this);
        colorAleatorio = new ColorAleatorio(this);
    }

    public void haceClic(View view){
        Log.d(TAG,"boton pulsado");
        try {
            TextView txtPrediccion = (TextView) findViewById(R.id.textoPrediccion);
            txtPrediccion.setText(prediccionAleatoria.obtenerPrediccion());
            Button boton = (Button) findViewById(R.id.boton);
            int color = colorAleatorio.obtenerColor();
            boton.setTextColor(color);
            RelativeLayout fondo = (RelativeLayout) findViewById(R.id.RLmockup);
            fondo.setBackgroundColor(color);
        }
        catch (Exception e){
            Log.e(TAG,"ha ocurrido una excepción en haceClic",e);
        }
    }
}
