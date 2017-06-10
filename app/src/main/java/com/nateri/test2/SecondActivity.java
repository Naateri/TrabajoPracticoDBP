package com.nateri.test2;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends Activity {
    private TextView textout;
    private EditText message;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
    public void buttonOnClick(View view){
        Button button = (Button) view;
        message = (EditText) findViewById(R.id.editText2);
        textout = (TextView) findViewById(R.id.txtOutput);
        textout.setText(message.getText());
    }
}
