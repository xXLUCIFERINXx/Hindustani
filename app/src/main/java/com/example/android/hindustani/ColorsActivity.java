package com.example.android.hindustani;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Red", "laal"));
        words.add(new Word("Yellow", "Peela"));
        words.add(new Word("Orange", "Naarangi"));
        words.add(new Word("Green", "Harra"));
        words.add(new Word("Blue", "Neela"));
        words.add(new Word("Black", "Kaala"));
        words.add(new Word("Purple", "Jamuni"));
        words.add(new Word("White", "Safed"));
        words.add(new Word("Brown", "Bhoora"));
        words.add(new Word("Pink", "Gulabi"));

        WordAdapter itemsAdapter = new WordAdapter(this, words);

        ListView listView = findViewById(R.id.colors_list);
        listView.setAdapter(itemsAdapter);
    }
}
