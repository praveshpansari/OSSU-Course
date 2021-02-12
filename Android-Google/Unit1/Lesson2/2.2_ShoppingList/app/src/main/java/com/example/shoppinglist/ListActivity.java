package com.example.shoppinglist;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    public static final String EXTRA_LIST = "com.android.shoppinglist.extra.LIST";
    public ArrayList<String> SHOPPING_LIST = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
    }


    public void listEntry(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        String listItem = ((Button) view).getText().toString();
        if (SHOPPING_LIST.contains(listItem)) {
            SHOPPING_LIST.remove(listItem);
        } else {
            SHOPPING_LIST.add(listItem);
        }
        intent.putStringArrayListExtra(EXTRA_LIST, SHOPPING_LIST);
        setResult(RESULT_OK, intent);
        finish();
    }
}