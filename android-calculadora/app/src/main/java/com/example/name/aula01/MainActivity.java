package com.example.name.aula01;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private TextInputLayout tilValor1;
    private TextInputLayout tilValor2;
    private EditText etResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tilValor1 = (TextInputLayout) findViewById(R.id.tilValor1);
        tilValor2 = (TextInputLayout) findViewById(R.id.tilValor2);
        etResultado = (EditText) findViewById(R.id.etResultado);

    }

    public void somar(View v) {

        Double valor1 = Double.parseDouble(tilValor1.getEditText().getText().toString());
        Double valor2 = Double.parseDouble(tilValor2.getEditText().getText().toString());

        etResultado.setText(String.valueOf(valor1 + valor2));

    }

    public void subtrair(View v) {
        Double valor1 = Double.parseDouble(tilValor1.getEditText().getText().toString());
        Double valor2 = Double.parseDouble(tilValor2.getEditText().getText().toString());

        etResultado.setText(String.valueOf(valor1 - valor2));
    }

    public void multiplicar(View v) {
        Double valor1 = Double.parseDouble(tilValor1.getEditText().getText().toString());
        Double valor2 = Double.parseDouble(tilValor2.getEditText().getText().toString());

        etResultado.setText(String.valueOf(valor1 * valor2));
    }

    public void dividir(View v) {
        Double valor1 = Double.parseDouble(tilValor1.getEditText().getText().toString());
        Double valor2 = Double.parseDouble(tilValor2.getEditText().getText().toString());

        etResultado.setText(String.valueOf(valor1 / valor2));
    }

}
