package com.example.assignment_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class USDConverterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usdconverter);
    }
    public void convertUSD(View v){
        double lbp_final=0;
        EditText usd= (EditText) findViewById(R.id.usd);
        String usd_val=usd.getText().toString();
        double usd_final=Double.parseDouble(usd_val);
        lbp_final=usd_final*40000;
        Toast.makeText(this, "LBP: "+lbp_final, Toast.LENGTH_LONG).show();
    }
}