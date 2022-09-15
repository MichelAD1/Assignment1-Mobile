package com.example.assignment_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class LandingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);
        Intent i=getIntent();
        String email=i.getStringExtra("email");
        String password=i.getStringExtra("password");
        ImageView lira=(ImageView) findViewById(R.id.lira);
        lira.setX(1000);
        lira.animate().translationX(-450).setDuration(2000);
        TextView emailR=findViewById(R.id.emailR);
        emailR.setText("Email: "+email);
    }
    public void usdToLbp(View v){
        Intent i= new Intent(getApplicationContext(),USDConverterActivity.class);
        startActivity(i);
    }
    public void lbpToUsd(View v){
        Intent i= new Intent(getApplicationContext(),LBPConverterActivity.class);
        startActivity(i);
    }
}