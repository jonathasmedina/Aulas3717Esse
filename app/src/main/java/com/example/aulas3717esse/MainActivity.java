package com.example.aulas3717esse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btSomar;
    TextView tv1;
    EditText edNum1;
    EditText edNum2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btSomar = findViewById(R.id.button);
        edNum1 = findViewById(R.id.editText1);
        edNum2 = findViewById(R.id.editText2);
        tv1 = findViewById(R.id.textView);

        btSomar.setOnClickListener(this);

        /*forma 1
        btSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });*/

        //forma 2
        //btSomar.setOnClickListener(mOuvinte);
    }

    @Override
    public void onClick(View view) {
        //está vazio
        if(edNum1.getText().toString().trim().equals("")){
            edNum1.setError("Preencha!");
        }
        else{
            int n1 = Integer.parseInt(edNum1.getText().toString());
            int n2 = Integer.parseInt(edNum2.getText().toString());

            int result = n1 + n2;

            tv1.setText(Integer.toString(result));
        }

    }

    //continuação forma 2
    /*View.OnClickListener mOuvinte = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int n1 = Integer.parseInt(edNum1.getText().toString());
            int n2 = Integer.parseInt(edNum2.getText().toString());
        }
    };*/

}