package com.lucasmartello.projeto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class LoginActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
    }



    public void buttonLoginOnClickLogin(View view) {

        EditText ImputEmail = (EditText) findViewById(R.id.eMail);
        EditText ImputSenha = (EditText) findViewById(R.id.senha);

        String eMail = ImputEmail.getText().toString();
        String senha = ImputSenha.getText().toString();

        String eMailValido = "lucas.martello@acad.ftec.com.br";
        String senhaValida = "123456";

        if (eMail == eMailValido && senha == senhaValida) {
            sucessoLogin();
        }else{
            falhaLogin();

        }
    }

    private void sucessoLogin() {
        Intent telaLogin = new Intent(this,SucessoLoginActivity.class);
        startActivity(telaLogin);
    }

    private void falhaLogin() {
        Intent telaLogin = new Intent(this,FalhaLoginActivity.class);
        startActivity(telaLogin);
    }
}
