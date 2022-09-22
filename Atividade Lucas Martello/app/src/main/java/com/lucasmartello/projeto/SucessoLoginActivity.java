package com.lucasmartello.projeto;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class SucessoLoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sucessologin);
    }

    public void botaoOnClickSobre(View view){
        Intent telaCadastro = new Intent(this, SobreActivity.class);
        startActivity(telaCadastro);
    }


}
