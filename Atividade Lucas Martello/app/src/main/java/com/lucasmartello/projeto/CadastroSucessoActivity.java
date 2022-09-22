package com.lucasmartello.projeto;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CadastroSucessoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastrosucesso);

        TextView fieldBoasVindas = (TextView) findViewById(R.id.fieldBoasVindas);
        Intent intent_get = getIntent();

        String Nome = intent_get.getStringExtra("Nome");

        fieldBoasVindas.setText("Olá " + Nome + ". Cadastro realizado com sucesso");
    }

    public void botaoOnClickSobre(View view){
        Intent telaCadastro = new Intent(this, SobreActivity.class);
        startActivity(telaCadastro);
    }

}
