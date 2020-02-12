package com.sidchiku9.calctrytwo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2;
    TextView t1;
    String s1,s2;
    float num1,num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public boolean getNumbers(){
        e1 = (EditText)findViewById(R.id.firstNum);
        e2 = (EditText)findViewById(R.id.secNum);
        t1 = (TextView)findViewById(R.id.res);
        s1 = e1.getText().toString();
        s2 = e2.getText().toString();

        if((s1.equals(null) && s2.equals(null)) || (s1.equals("") && s2.equals(""))){
            String result = "Please enter a value";
            t1.setText(result);
            return false;
        }
        else{
            num1 = Float.parseFloat(e1.getText().toString());
            num2 = Float.parseFloat(e2.getText().toString());
        }
        return true;
    }

    public void sum(View v){
         if(getNumbers()){
             float sum = num1+num2;
             t1.setText(Float.toString(sum));
         }
    }

    public void subb(View v){
        if(getNumbers()){
            float sub = num1-num2;
            t1.setText(Float.toString(sub));
        }
    }

    public void mul(View v){
        if(getNumbers()){
            float mul = num1*num2;
            t1.setText(Float.toString(mul));
        }
    }

    public void div(View v){
        if(getNumbers()){
            float div = num1/num2;
            t1.setText(Float.toString(div));
        }
    }

    public void clr(View v){
        t1.setText("");
        e1.setText("");
        e2.setText("");
    }

    public void dec(View v){
        t1.setText(t1.getText() + ".");
    }
}
