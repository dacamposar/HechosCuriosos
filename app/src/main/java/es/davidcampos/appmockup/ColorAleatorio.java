package es.davidcampos.appmockup;

import android.content.Context;
import android.graphics.Color;

import java.util.Random;

/**
 * Created by David on 19/07/2015.
 */
public class ColorAleatorio {
    private Context contexto;

   // private String[] nombreColor = {"light-blue","dark-blue","mauve","red","orange","lavender","purple","aqua","green","mustard","dark-gray","pink","light-gray"};
    private int[] mColores;

    ColorAleatorio(Context contexto){
        this.contexto = contexto;

        String[] allColors = contexto.getResources().getStringArray(R.array.colors);
        mColores = new int[allColors.length];

        for(int i=0;i<allColors.length;i++){
            mColores[i] = Color.parseColor(allColors[i]);
        }

    }

    public int obtenerColor() {
        Random random = new Random();
        int color = random.nextInt(mColores.length);
        return mColores[color];
    }
}
