package com.example.andre.frasedodia;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view){

        String [] frases = {
                "Minha frase um",
                "Esta é a frase dois",
                "Temos aqui a frase três",
                "Chegamos à frase quatro"
        };

        int numero = new Random().nextInt( frases.length );

        TextView texto = (TextView) findViewById(R.id.text_resultado);

        texto.setText( frases[numero] );
    }

}
