package com.example.projetorestauranteprime;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }


    public void checkLogin(View v){
        EditText usernameLogin = findViewById(R.id.userEditText);
        EditText passwordLogin = findViewById(R.id.passwordEditText);

        String getUsername = usernameLogin.getText().toString().toLowerCase();
        String getPassword = passwordLogin.getText().toString();


        if(getUsername.equals("adm") && getPassword.equals("12345")){
            login();
        }else{
            Toast.makeText(this,"Login incorreto, favor entrar em contato com o suporte.", Toast.LENGTH_LONG).show();
        }

    }

    public void login() {
        Intent i = new Intent(this, HomeActivity.class);
        startActivity(i);
    }
}