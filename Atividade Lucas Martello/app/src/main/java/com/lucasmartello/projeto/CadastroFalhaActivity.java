package com.lucasmartello.projeto;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CadastroFalhaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastrofalha);

        TextView fieldFalha = (TextView) findViewById(R.id.fieldFalha);
        Intent intent_get = getIntent();

        String campos = intent_get.getStringExtra("campos");

        fieldFalha.setText("Erro no Cadastro. Os campos " + campos + " devem ser preenchidos.");

    }

    public void botaoOnClickVoltar(View view){
        finish();
    }


}
