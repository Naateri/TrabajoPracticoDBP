package com.nateri.test2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void buttonOnClick(View view) {
        switch (view.getId()) {
            case R.id.button1:
                startActivity(new Intent("com.nateri.test2.BooActivity"));
                break;
            case R.id.button2:
                startActivity(new Intent("com.nateri.test2.BarActivity"));
                break;
            case R.id.button:
                startActivity(new Intent("com.nateri.test2.SecondActivity"));
                break;
        }
    }
}
