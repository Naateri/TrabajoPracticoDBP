package com.nateri.test2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class BarActivity extends Activity {
    private TextView textout;
    private EditText message;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar);
    }
    public void buttonOnClick(View view){
        Button button = (Button) view;
        message = (EditText) findViewById(R.id.editText);
        textout = (TextView) findViewById(R.id.txtOutput2);
        textout.setText(message.getText());
    }
}
