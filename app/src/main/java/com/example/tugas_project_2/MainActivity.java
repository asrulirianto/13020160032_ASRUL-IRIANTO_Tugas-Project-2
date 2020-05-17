package com.example.tugas_project_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.widget.Toolbar;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    TextInputLayout inputDiameter1,inputDiameter2;
    TextView hasilHitung;
    float d1,d2,hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        inputDiameter1 = findViewById(R.id.text_input_diameter1);
        inputDiameter2 = findViewById(R.id.text_input_diameter2);
        hasilHitung = findViewById(R.id.hasilHitung);
    }

    public boolean validateInput1(){
        String input = inputDiameter1.getEditText().getText().toString().trim();
        if (input.isEmpty()){
            inputDiameter1.setError("Field harus di isi");
            return false;
        }else{
            inputDiameter1.setError(null);
            return true;
        }
    }

    public boolean validateInput2(){
        String input = inputDiameter2.getEditText().getText().toString().trim();
        if (input.isEmpty()){
            inputDiameter2.setError("Field harus di isi");
            return false;
        }else{
            inputDiameter2.setError(null);
            return true;
        }
    }

    public void hitung(View v){
        if(!validateInput1()|!validateInput2()){
            return;
        }

        d1 = Float.parseFloat(inputDiameter1.getEditText().getText().toString());
        d2 = Float.parseFloat(inputDiameter2.getEditText().getText().toString());
        hasil = d1*d2/2;
        hasilHitung.setText("Luas = "+String.valueOf(hasil)+" cm");
    }
}
