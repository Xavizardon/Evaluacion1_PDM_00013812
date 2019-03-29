package com.example.eval1by00013812;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button botonEnviar;
    private TextView txtnum1, txtnum2, txtnum3, txtnum4, txtnum5, txtnum6, txtnum7, txtnum8, txtnum9;
    private Layout layButt1, layButt2, layButt3, layButt4, layButt5, layButt6, layButt7, layButt8, layButt9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botonEnviar = findViewById(R.id.btn_enviar);
        txtnum1 = findViewById(R.id.tv_cont1);
        txtnum2 = findViewById(R.id.tv_cont2);
        txtnum3 = findViewById(R.id.tv_cont3);
        txtnum4 = findViewById(R.id.tv_cont4);
        txtnum5 = findViewById(R.id.tv_cont5);
        txtnum6 = findViewById(R.id.tv_cont6);
        txtnum7 = findViewById(R.id.tv_cont7);
        txtnum8 = findViewById(R.id.tv_cont8);
        txtnum9 = findViewById(R.id.tv_cont9);
        

        botonEnviar.setOnClickListener(this);
        txtnum1.setOnClickListener(this);
        txtnum2.setOnClickListener(this);
        txtnum3.setOnClickListener(this);
        txtnum4.setOnClickListener(this);
        txtnum5.setOnClickListener(this);
        txtnum6.setOnClickListener(this);
        txtnum7.setOnClickListener(this);
        txtnum8.setOnClickListener(this);
        txtnum9.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

    }
}
