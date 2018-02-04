package com.example.android.hindustani;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Mother", "Mata"));
        words.add(new Word("Father", "Pita"));
        words.add(new Word("son", "Beta"));
        words.add(new Word("Daughter", "Beti"));
        words.add(new Word("Uncle", "Chacha"));
        words.add(new Word("Aunt", "Chachi"));
        words.add(new Word("Grand Father", "Dada"));
        words.add(new Word("Grand Mother", "Dadi"));
        words.add(new Word("Brother", "Bhai"));
        words.add(new Word("Sister", "Behen"));

        WordAdapter itemsAdapter = new WordAdapter(this, words);

        ListView listView = findViewById(R.id.family_list);
        listView.setAdapter(itemsAdapter);
    }
}
