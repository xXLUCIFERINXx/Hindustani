package com.example.android.hindustani;

class Word {

    private String mEnglishTranslation;

    private String mHindiTranslation;

    Word(String defaultTranslation, String hindiTranslation) {
        mEnglishTranslation = defaultTranslation;
        mHindiTranslation = hindiTranslation;
    }

    String getEnglishTranslation() {
        return mEnglishTranslation;
    }

    String getHindiTranslation() {
        return mHindiTranslation;
    }

}
