package com.example.android.hindustani;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {


    WordAdapter(Context context, ArrayList<Word> word) {
        super(context, 0, word);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        TextView englishText = convertView.findViewById(R.id.text_num_english);
        TextView hindiText = convertView.findViewById(R.id.text_num_hindi);

        Word Content = getItem(position);

        if (Content != null) {
            englishText.setText(Content.getEnglishTranslation());
            hindiText.setText(Content.getHindiTranslation());
        }
        return convertView;
    }
}
