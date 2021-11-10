package edu.ieu.aplicacionfragmento;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.Button;

import edu.ieu.aplicacionfragmento.fragment.CountFragment;

public class MainActivity extends AppCompatActivity {
    private Button botonAgregar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        botonAgregar = findViewById(R.id.boton_agregar);
        botonAgregar.setOnClickListener( view -> {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            CountFragment countFragment = new CountFragment();
            transaction.add(R.id.main_activity, countFragment);
            transaction.commit();
        });
    }
}