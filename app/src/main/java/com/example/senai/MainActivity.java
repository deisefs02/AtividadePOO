package com.example.senai;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickBtnMostrar(View v){
        EditText editText = findViewById(R.id.et_texto);
        EditText editText2 = findViewById(R.id.et_texto2);

        String Texto1 = editText.getText().toString();
        String Texto2 = editText2.getText().toString();
        String completo = Texto1 + " " + Texto2;

        Toast.makeText(MainActivity.this, completo, Toast.LENGTH_LONG).show();
    }

    public void onClickBtnLimpar(View v){
        EditText editText = findViewById(R.id.et_texto);
        EditText editText2 = findViewById(R.id.et_texto2);

        editText.getText().clear();
        editText2.getText().clear();
    }
    }
