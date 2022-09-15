package com.example.assignment_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int count=0;
    public void login(View v){
        if(count>5){
            Toast.makeText(this, "You are blocked", Toast.LENGTH_LONG).show();
            return;
        }
        EditText email= (EditText) findViewById(R.id.email);
        EditText password= (EditText) findViewById(R.id.password);
        String email_val=email.getText().toString();
        String pass_val=password.getText().toString();
        if(email_val.equals("user.leb")&& pass_val.equals("123456")){
            Intent i= new Intent(getApplicationContext(),LandingActivity.class);
            i.putExtra("email",email_val);
            i.putExtra("password",pass_val);
            startActivity(i);
            Toast.makeText(this, "Logged In", Toast.LENGTH_SHORT).show();
        }else{
            count++;
            Toast.makeText(this, "Wrong Credentials", Toast.LENGTH_SHORT).show();
        }
    }

}