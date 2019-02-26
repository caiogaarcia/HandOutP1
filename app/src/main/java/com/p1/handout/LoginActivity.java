package com.p1.handout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button botaoLogar = findViewById(R.id.login_botao_entrar);

        botaoLogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText usuario = findViewById(R.id.login_usuario);
                EditText senha = findViewById(R.id.login_senha);

                //String user = usuario.getText().toString();

                if (usuario.getText().toString().equals("admin") && senha.getText().toString().equals("admin")){
                    Intent vaiParaFeed = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(vaiParaFeed);
                } else {
                    Toast.makeText(LoginActivity.this, "Login ou Senha invalidos!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
