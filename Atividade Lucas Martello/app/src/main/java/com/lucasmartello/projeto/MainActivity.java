package com.lucasmartello.projeto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void botaoOnClickLogin(View view){
        Intent telaLogin = new Intent(this,LoginActivity.class);
        startActivity(telaLogin);
    }

    public void botaoOnClickCadastro(View view) {
        Intent telaCadastro = new Intent(this, CadastroActivity.class);
        startActivity(telaCadastro);
    }

    public void botaoOnClickSobre(View view){
        Intent telaCadastro = new Intent(this, SobreActivity.class);
        startActivity(telaCadastro);
    }

}