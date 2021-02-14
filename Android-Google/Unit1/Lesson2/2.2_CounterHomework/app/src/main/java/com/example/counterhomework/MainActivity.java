package com.example.counterhomework;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int count = 0;
    private TextView countText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countText = (TextView) findViewById(R.id.counter);
        if (savedInstanceState != null) {
            count = savedInstanceState.getInt("count");
            countText.setText(Integer.toString(count));
        }
    }


    public void countUp(View view) {
        countText.setText(Integer.toString(++count));
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        if (count != 0)
            outState.putInt("count", count);
    }
}