package com.example.experimento;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void cadastro(View view){
        setContentView(R.layout.cadastro);
    }
    public void salvar(View view){
        setContentView(R.layout.activity_main);
    }
    public void fazerLogin(View view){
        String email="higor.rabelo@gmail.com";
        String senha="higor";
        EditText txEmail = findViewById(R.id.txEmail);
        EditText txSenha = findViewById(R.id.txSenha);
        TextView saida2 = findViewById(R.id.saida2);
        String display="";
        if(email == txEmail.getText().toString() && senha == txSenha.getText().toString() ){
            display="Login Realizado com sucesso";
        }else{
            display="Negado";
        }
        saida2.setText(display+"\n"+txEmail.getText().toString()+"\n"+txSenha.getText().toString());
    }
}