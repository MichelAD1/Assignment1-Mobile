package com.example.assignment_1;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LBPConverterActivity extends AppCompatActivity {
    TextView usd_f_amount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lbpconverter);
        usd_f_amount=(TextView) findViewById(R.id.usd_amount);
    }
    public void convertLBP(View v){
        double usd_final=0;
        EditText lbp= (EditText) findViewById(R.id.lbp);
        String lbp_val=lbp.getText().toString();
        double lbp_final=Double.parseDouble(lbp_val);
        usd_final=lbp_final/40000;
        usd_f_amount.setText("USD: "+usd_final);
    }
}