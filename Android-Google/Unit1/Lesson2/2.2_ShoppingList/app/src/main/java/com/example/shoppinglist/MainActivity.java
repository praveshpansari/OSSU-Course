package com.example.shoppinglist;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final int REQUEST_CODE = 1;
    private final ArrayList<TextView> SHOPPING_LIST_VIEWS = new ArrayList<>();
    public ArrayList<String> shoppingList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SHOPPING_LIST_VIEWS.add(findViewById(R.id.list_item1));
        SHOPPING_LIST_VIEWS.add(findViewById(R.id.list_item2));
        SHOPPING_LIST_VIEWS.add(findViewById(R.id.list_item3));
        SHOPPING_LIST_VIEWS.add(findViewById(R.id.list_item4));
        SHOPPING_LIST_VIEWS.add(findViewById(R.id.list_item5));
        SHOPPING_LIST_VIEWS.add(findViewById(R.id.list_item6));
        SHOPPING_LIST_VIEWS.add(findViewById(R.id.list_item7));
        SHOPPING_LIST_VIEWS.add(findViewById(R.id.list_item8));
        SHOPPING_LIST_VIEWS.add(findViewById(R.id.list_item9));
        SHOPPING_LIST_VIEWS.add(findViewById(R.id.list_item10));

        if (savedInstanceState != null) {
            shoppingList = savedInstanceState.getStringArrayList("list");
            if (shoppingList != null)
                for (int i = 0; i < SHOPPING_LIST_VIEWS.size(); i++) {
                    SHOPPING_LIST_VIEWS.get(i).setText(null);
                    if (i < shoppingList.size())
                        SHOPPING_LIST_VIEWS.get(i).setText(shoppingList.get(i));
                }
        }

    }

    public void addItem(View view) {
        Intent intent = new Intent(this, ListActivity.class);
        intent.putStringArrayListExtra(ListActivity.EXTRA_LIST, shoppingList);
        startActivityForResult(intent, REQUEST_CODE);
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        if (!shoppingList.isEmpty()) {
            outState.putStringArrayList("list", shoppingList);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK && requestCode == REQUEST_CODE) {
            if (data.hasExtra(ListActivity.EXTRA_LIST)) {
                shoppingList = data.getStringArrayListExtra(ListActivity.EXTRA_LIST);
                if (shoppingList != null)
                    for (int i = 0; i < SHOPPING_LIST_VIEWS.size(); i++) {
                        SHOPPING_LIST_VIEWS.get(i).setText(null);
                        if (i < shoppingList.size())
                            SHOPPING_LIST_VIEWS.get(i).setText(shoppingList.get(i));
                    }
            }
        }
    }
}