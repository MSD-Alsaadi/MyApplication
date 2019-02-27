package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button button;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    EditText editText, editText2;
    TextView lblResult;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);
        button = (Button) findViewById(R.id.button);
        lblResult = (TextView) findViewById(R.id.result);
        button2 = (Button) findViewById(R.id.button);
        button3 = (Button) findViewById(R.id.button);
        button4 = (Button) findViewById(R.id.button);
        button5 = (Button) findViewById(R.id.button);


    }


    public void add(View v) {
        int n1 = Integer.parseInt(editText.getText().toString());
        int n2 = Integer.parseInt(editText2.getText().toString());
        int res = n1 + n2;
        lblResult.setText(res + "");

    }

    public void sub(View v) {
        int n1 = Integer.parseInt(editText.getText().toString());
        int n2 = Integer.parseInt(editText2.getText().toString());
        int res = n1 - n2;
        lblResult.setText(res + "");
    }

    public void Clear(View c) {
        editText.setText("");
        editText2.setText("");
        lblResult.setText("");
    }

    public void mlt(View v) {
        int n1 = Integer.parseInt(editText.getText().toString());
        int n2 = Integer.parseInt(editText2.getText().toString());
        int res = n1 * n2;
        lblResult.setText(res + "");
    }
    public void div(View v) {
        Float n1 = Float.parseFloat(editText.getText().toString());
        Float n2 = Float.parseFloat(editText2.getText().toString());
        Float res = n1 / n2;
        lblResult.setText(res + "");
    }

}
