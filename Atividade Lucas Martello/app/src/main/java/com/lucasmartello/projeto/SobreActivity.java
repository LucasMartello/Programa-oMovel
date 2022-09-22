package com.lucasmartello.projeto;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class SobreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sobre);
    }

    public void botaoOnClickFtec(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ftec.com.br/portal-academico/"));
        startActivity(browserIntent);
    }

    public void botaoOnClickMain(View view) {
        Intent telaCadastro = new Intent(this, MainActivity.class);
        startActivity(telaCadastro);
    }

}
