package edu.ieu.aplicacionfragmento.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import edu.ieu.aplicacionfragmento.R;

/**
 * A simple {@link Fragment} subclass.
 *
 */
public class CountFragment extends Fragment {
    private Button button;
    private TextView text;
    private EditText edit;

    public CountFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_count, container, false);
        button = (Button) root.findViewById(R.id.main_button);
        edit = (EditText) root.findViewById(R.id.main_editText);
        text = (TextView) root.findViewById(R.id.main_textview);

        button.setOnClickListener(view -> {
            String mensaje = edit.getText().toString();
            text.setText(String.valueOf(mensaje.length()));
        });
        return root;
    }
}