package es.davidcampos.appmockup;

import android.content.Context;

import java.util.Random;

/**
 * Created by David on 16/07/2015.
 */
public class PrediccionAleatoria {
    private Context contexto;

    private String[] mPredicciones;

    PrediccionAleatoria(Context contexto){
        this.contexto = contexto;
        mPredicciones = contexto.getResources().getStringArray(R.array.predicciones);
    }

    public String obtenerPrediccion() {
        Random random = new Random();
        int prediccion = random.nextInt(mPredicciones.length);
        return mPredicciones[prediccion];
    }

}
