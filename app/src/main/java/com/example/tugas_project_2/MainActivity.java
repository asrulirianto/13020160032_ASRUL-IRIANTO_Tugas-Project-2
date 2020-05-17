package com.example.tugas_project_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.widget.Toolbar;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    TextInputLayout inputDiagonal1,inputDiagonal2;
    TextView hasilHitung;
    float d1,d2,hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        inputDiagonal1 = findViewById(R.id.text_input_diagonal1);
        inputDiagonal2 = findViewById(R.id.text_input_diagonal2);
        hasilHitung = findViewById(R.id.hasilHitung);
    }

    public boolean validateInput1(){
        String input = inputDiagonal1.getEditText().getText().toString().trim();
        if (input.isEmpty()){
            inputDiagonal1.setError("Field harus di isi");
            return false;
        }else{
            inputDiagonal1.setError(null);
            return true;
        }
    }

    public boolean validateInput2(){
        String input = inputDiagonal2.getEditText().getText().toString().trim();
        if (input.isEmpty()){
            inputDiagonal2.setError("Field harus di isi");
            return false;
        }else{
            inputDiagonal2.setError(null);
            return true;
        }
    }

    public void hitung(View v){
        if(!validateInput1()|!validateInput2()){
            return;
        }

        d1 = Float.parseFloat(inputDiagonal1.getEditText().getText().toString());
        d2 = Float.parseFloat(inputDiagonal2.getEditText().getText().toString());
        hasil = d1*d2/2;
        hasilHitung.setText("Luas = "+String.valueOf(hasil)+" cm");
    }
}
