package com.example.android.hindustani;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Greetings.", "Namaste"));
        words.add(new Word("Good Morning", "Suprabhat."));
        words.add(new Word("Good night", "Shubraatri."));
        words.add(new Word("How are you?", "Tum kaise ho?"));
        words.add(new Word("I am 'name'.", "Mein 'naam' hu."));
        words.add(new Word("Who are you?", "Tum kaun ho?"));
        words.add(new Word("i can not speak Hindi.", "Mein Hindi nahi bol sakta."));
        words.add(new Word("What is your name?", "Tumhara naam kya hai?"));
        words.add(new Word("Give me water please.", "Paani de dijiye."));
        words.add(new Word("Have a Nice Day.", "Aapka din shubh ho."));

        WordAdapter itemsAdapter = new WordAdapter(this, words);

        ListView listView = findViewById(R.id.phrases_list);
        listView.setAdapter(itemsAdapter);
    }
}
