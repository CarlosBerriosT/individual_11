package com.example.actividad111;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class FragmentoRadio extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmento_radio, container, false);

        RadioGroup radioGroup = view.findViewById(R.id.radioGroup);
        TextView textView = view.findViewById(R.id.textViewQuestion);

        radioGroup.setOnCheckedChangeListener((group, checkedId) -> {
            RadioButton selectedRadioButton = view.findViewById(checkedId);
            String selectedText = (selectedRadioButton != null) ? selectedRadioButton.getText() + " seleccionada" : "Ninguna opción seleccionada";
            textView.setText(selectedText);
        });

        return view;
    }
}
