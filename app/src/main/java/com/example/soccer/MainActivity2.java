package com.example.soccer;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    TextView text,print;
    TextView text_integer,text_integer2;
   // EditText editTextdata;
    Button add_btn,add_btn2,btn_reset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        text_integer =(TextView) findViewById(R.id.textInteger);
        text_integer2 =(TextView) findViewById(R.id.textInteger2);
        text = (TextView)findViewById(R.id.text);
        print = (TextView)findViewById(R.id.Print);
        add_btn = (Button) findViewById(R.id.btnAdd);
        add_btn2 = (Button) findViewById(R.id.btnAdd2);
        btn_reset = (Button) findViewById(R.id.btnreset);

        Intent intent = getIntent();
        String str = intent.getStringExtra("message");
        text.setText(str);
    }


    public void btnPerform(View view) {
        if (R.id.textInteger>9){
           print.setText(getString(text));
        }
        switch (view.getId()) {

            case R.id.btnAdd:
               String value = text_integer.getText().toString();
               int finalValue = Integer.parseInt(value);
               text_integer.setText(String.valueOf(finalValue+1));
                break;

            case R.id.btnAdd2:
                String Value = text_integer2.getText().toString();
                int FinalValue = Integer.parseInt(Value);
                text_integer2.setText(String.valueOf(FinalValue+1));
                break;
        }
        btn_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_integer.setText("0");
                text_integer2.setText("0");
            }
        });
        }

    private char getString(TextView text) {
        return 0;
    }
}
