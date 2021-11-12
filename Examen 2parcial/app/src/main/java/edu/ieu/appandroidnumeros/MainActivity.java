package edu.ieu.appandroidnumeros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton = findViewById(R.id.roll_button);
        Button rollButton2 = findViewById(R.id.roll_button2);
        rollButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                Random rand = new Random();
                int randNumber = rand.nextInt(6)+1;
                int randNumber2 = rand.nextInt(6)+1;

                TextView resultText = (TextView)findViewById(R.id.result_text);
                TextView resultText2 = (TextView)findViewById(R.id.result_text2);

                resultText.setText(String.valueOf(randNumber));
                resultText2.setText(String.valueOf(randNumber2));
            }
        });





        rollButton2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                TextView textResultado = findViewById(R.id.textViewResultado);

                TextView numero1 = findViewById(R.id.result_text);
                TextView numero2 = findViewById(R.id.result_text2);

                EditText resultado = findViewById(R.id.etResultado);

                String primero = numero1.getText().toString();
                String segundo = numero2.getText().toString();
                String r = resultado.getText().toString();

                int valor1 = Integer.parseInt(primero);
                int valor2 = Integer.parseInt(segundo);
                int sumafinal = Integer.parseInt((r));

                int respuesta = valor1 + valor2;




                if( respuesta == sumafinal ){
                    textResultado.setTextColor(Color.GREEN);
                    textResultado.setText("SUMA CORRECTA, INTENTA OTRA SUMA :)");

                }
                else {
                    textResultado.setTextColor(Color.RED);
                    textResultado.setText("SUMA INCORRECTA, INTENTALO DE NUEVO");
                }


            }
        });


    }


}