package com.example.assignment_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class USDConverterActivity extends AppCompatActivity {
    TextView lbp_f_amount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usdconverter);
        lbp_f_amount=(TextView) findViewById(R.id.lbp_amount);
    }
    public void convertUSD(View v){
        double lbp_final=0;
        EditText usd= (EditText) findViewById(R.id.usd);
        String usd_val=usd.getText().toString();
        double usd_final=Double.parseDouble(usd_val);
        lbp_final=usd_final*40000;
        lbp_f_amount.setText("LBP: "+lbp_final);

    }
}