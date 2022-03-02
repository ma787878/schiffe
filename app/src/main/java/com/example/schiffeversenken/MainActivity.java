package com.example.schiffeversenken;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.strictmode.WebViewMethodCalledOnWrongThreadViolation;
import android.view.View;
import android.widget.EditText;
import android.content.*;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void starteSpiel(View v) {
        EditText name = (EditText)findViewById(R.id.aktiverSpieler);
        Intent newGameIntent = new Intent(this, SpielstartActivity.class);
        newGameIntent.putExtra("MainActivity",name.getText().toString());
        startActivity(newGameIntent);

    }
    public void beendeSpiel(View v) {
        finish();
        System.exit(0);
    }

}

