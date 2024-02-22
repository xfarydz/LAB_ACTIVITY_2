package com.example.labactivity2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //1st declare component
    Button add,reset;
    EditText no1,no2;
    TextView output;
    int total,no1Val,no2Val; //to store variable

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //2nd bind
       add=findViewById(R.id.btnAdd);
       reset=findViewById(R.id.btnReset);
       no1=(EditText)findViewById(R.id.etNo1);
       no2=findViewById(R.id.etNo2);
       output=findViewById(R.id.tvOutput);

        //3rd reg listener
        add.setOnClickListener(new View.OnClickListener() {
            @Override
        public void onClick(View view) {
                no1Val=Integer.parseInt(no1.getText().toString());
            //convert string to integer
            no2Val=Integer.parseInt(no2.getText().toString());
            //total
             total=no1Val+no2Val;
            //display total to TextView
            //total is int - have to convert back to String
        output.setText(String.valueOf(total));

        }
        });

            //btn reset
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { no1.setText("");
                no2.setText(""); output.setText("0");
            }
        });

    }
}
