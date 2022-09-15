package com.example.assignment_1;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LBPConverterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lbpconverter);
    }
    public void convertLBP(View v){
        double usd_final=0;
        EditText lbp= (EditText) findViewById(R.id.lbp);
        String lbp_val=lbp.getText().toString();
        double lbp_final=Double.parseDouble(lbp_val);
        usd_final=lbp_final/40000;
        Toast.makeText(this, "USD: "+usd_final, Toast.LENGTH_LONG).show();
    }
}