package com.example.shoppinglist;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    public static final String EXTRA_LIST = "com.android.shoppinglist.extra.LIST";
    private ArrayList<String> shoppingList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        Intent intent = getIntent();
        shoppingList = intent.getStringArrayListExtra(EXTRA_LIST);
        if (shoppingList != null)
            for (String s : shoppingList)
                Log.d("INtent", s);
    }


    public void listEntry(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        String listItem = ((Button) view).getText().toString();
        if (shoppingList.contains(listItem)) {
            shoppingList.remove(listItem);
        } else {
            shoppingList.add(listItem);
        }
        intent.putStringArrayListExtra(EXTRA_LIST, shoppingList);
        setResult(RESULT_OK, intent);
        finish();
    }
}