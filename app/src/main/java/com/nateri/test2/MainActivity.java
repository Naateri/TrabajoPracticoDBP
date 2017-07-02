package com.nateri.test2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.nateri.test2.R.id.button1;

public class MainActivity extends AppCompatActivity {
    private TextView textout;
    private EditText message;
    String hola;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonOnClick(View view) {
        switch (view.getId()) {
            case button1:
                startActivity(new Intent("com.nateri.test2.BooActivity"));
                break;
            case R.id.button2:
                startActivity(new Intent("com.nateri.test2.BarActivity"));
                break;
            case R.id.button: //foo
                startActivity(new Intent("com.nateri.test2.SecondActivity"));
                break;
            case R.id.toggleButton:
                Button but = (Button) findViewById(R.id.button1);
                but.setVisibility(View.GONE);
                but = (Button) findViewById(R.id.toggleButton);
                but.setVisibility(View.GONE);
                but = (Button) findViewById(R.id.button8);
                but.setVisibility(View.GONE);
                break;
            case R.id.toggleButton2:
                Button but2 = (Button) findViewById(R.id.button2);
                but2.setVisibility(View.GONE);
                but2 = (Button) findViewById(R.id.toggleButton2);
                but2.setVisibility(View.GONE);
                but2 = (Button) findViewById(R.id.button7);
                but2.setVisibility(View.GONE);
                break;
            case R.id.toggleButton3:
                Button but3 = (Button) findViewById(R.id.button);
                but3.setVisibility(View.GONE);
                but3 = (Button) findViewById(R.id.toggleButton3);
                but3.setVisibility(View.GONE);
                but3 = (Button) findViewById(R.id.button6);
                but3.setVisibility(View.GONE);
                break;
            case R.id.button6:
                message = (EditText) findViewById(R.id.textView2);
                Button test = (Button) findViewById(R.id.button1);
                test.setText(message.getText());
                break;
            case R.id.button7:
                message = (EditText) findViewById(R.id.textView4);
                Button test2 = (Button) findViewById(R.id.button2);
                test2.setText(message.getText());
                break;
            case R.id.button8:
                message = (EditText) findViewById(R.id.textView3);
                Button test3 = (Button) findViewById(R.id.button);
                test3.setText(message.getText());
                break;

        }
    }

}
