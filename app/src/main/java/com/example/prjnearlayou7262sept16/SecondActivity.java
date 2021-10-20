package com.example.prjnearlayou7262sept16;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {
    TextView tvName,tvSport;
    Button btnReturn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initialize();
    }
    private void initialize(){
        tvName = findViewById(R.id.tvName);
        tvSport = findViewById(R.id.tvSport);
        btnReturn = findViewById(R.id.btnReturn);
        btnReturn.setOnClickListener(this);
        String name = getIntent().getStringExtra("name");
        tvName.setText(name);
        int sp = getIntent().getIntExtra("sport", -100);
        String sport = "";
        if(sp==R.id.rbSoccer) sport = "Scoccer";
        if(sp==R.id.rbHandBall) sport = "Handball";
        if(sp==R.id.rbHockey) sport = "Hockey";
        tvSport.setText(sport);


    }


    @Override
    public void onClick(View view) {
        finish();

    }
}