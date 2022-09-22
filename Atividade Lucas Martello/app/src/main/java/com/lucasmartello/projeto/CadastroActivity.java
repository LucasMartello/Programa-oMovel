package com.lucasmartello.projeto;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class CadastroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro);
    }

    public void buttonCadastroOnClickCadastrar(View view){

        int naoPreenchido = 0;
        String campos = "";

        EditText ImputNome = (EditText) findViewById(R.id.fieldNome);
        EditText ImputEndereco = (EditText) findViewById(R.id.fieldEndereco);
        EditText ImputNumero = (EditText) findViewById(R.id.fieldNumero);
        EditText ImputCEP = (EditText) findViewById(R.id.fieldCEP);
        EditText ImputComplemento = (EditText) findViewById(R.id.fieldComplemento);
        EditText ImputEmail = (EditText) findViewById(R.id.fieldEmail);

        String Nome = ImputNome.getText().toString();
        String Endereco = ImputEndereco.getText().toString();
        String Numero = ImputNumero.getText().toString();
        String CEP = ImputCEP.getText().toString();
        String Complemento = ImputComplemento.getText().toString();
        String Email = ImputEmail.getText().toString();

        if (Nome.isEmpty()){
            naoPreenchido++;
            campos = campos + "Nome; ";
        }
        if (Endereco.isEmpty()){
            naoPreenchido++;
            campos = campos + "Endereco; ";
        }
        if (Numero.isEmpty()){
            naoPreenchido++;
            campos = campos + "Numero; ";
        }
        if (CEP.isEmpty()){
            naoPreenchido++;
            campos = campos + "CEP; ";
        }
        if (Complemento.isEmpty()){
            naoPreenchido++;
            campos = campos + "Complemento; ";
        }
        if (Email.isEmpty()){
            naoPreenchido++;
            campos = campos + "Email; ";
        }

        if (naoPreenchido == 0){
            sucessoCadastro(Nome);
        }else{
            falhaCadastro(campos);
        }

    }

    private void sucessoCadastro(String Nome){
        Intent sucessoTela = new Intent(this,CadastroSucessoActivity.class);
        sucessoTela.putExtra("Nome",Nome);
        startActivity(sucessoTela);
    }

    private void falhaCadastro(String campos){
        Intent falhaTela = new Intent(this,CadastroFalhaActivity.class);
        falhaTela.putExtra("campos",campos);
        startActivity(falhaTela);
    }

}
