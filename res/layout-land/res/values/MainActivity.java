package com.example.miapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edtCampo1, edtCampo2;
    private Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtCampo1 = findViewById(R.id.edtCampo1);
        edtCampo2 = findViewById(R.id.edtCampo2);
        btnEnviar = findViewById(R.id.btnEnviar);

        btnEnviar.setOnClickListener(view -> {
            String user = edtCampo1.getText().toString();
            String pass = edtCampo2.getText().toString();

            Toast.makeText(this, "Usuario: " + user, Toast.LENGTH_SHORT).show();
        });
    }
}
