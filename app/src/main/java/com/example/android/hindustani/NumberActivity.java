package com.example.android.hindustani;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class NumberActivity extends AppCompatActivity {

    public NumberActivity() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("one", "ek"));
        words.add(new Word("two", "do"));
        words.add(new Word("three", "teen"));
        words.add(new Word("four", "chaar"));
        words.add(new Word("five", "paanch"));
        words.add(new Word("six", "che"));
        words.add(new Word("seven", "saat"));
        words.add(new Word("eight", "aath"));
        words.add(new Word("nine", "nau"));
        words.add(new Word("ten", "das"));

        WordAdapter itemsAdapter = new WordAdapter(this, words);

        ListView listView = findViewById(R.id.numbers_list);
        listView.setAdapter(itemsAdapter);
    }
}
