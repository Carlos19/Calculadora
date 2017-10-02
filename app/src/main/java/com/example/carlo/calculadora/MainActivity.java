package com.example.carlo.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText cent, fi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.cent =(EditText) findViewById(R.id.txtCentigrados);
        this.fi=(EditText) findViewById(R.id.txtFt);

        this.cent.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {

                float faren;
                faren = (1.8f)*Float.parseFloat(cent.getText().toString())+32;
                fi.setText(""+faren);

                return false;
            }
        });

        this.fi.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                float centi;
                centi=(Float.parseFloat(fi.getText().toString())-32)/1.8f;
                cent.setText(""+centi);
                return false;
            }
        });

    }
}
