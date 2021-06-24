package com.example.myapplication;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView text;

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Nnnn222n","onPause()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Nnnnn","onStart()");
    }

    @Override
    protected void onCreate(@Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.MytextView);
        Button button1 = findViewById(R.id.button);
        Button button2 = findViewById(R.id.button2);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button :

                String var = text.getText().toString();
                int variable = Integer.valueOf(var);
                variable++;
                text.setText(String.valueOf(variable+123));
                break;
            case R.id.button2 :

               var = text.getText().toString();
               variable = Integer.valueOf(var);
               variable *= variable;
                text.setText(String.valueOf(variable));
                break;
        }
    }
}
