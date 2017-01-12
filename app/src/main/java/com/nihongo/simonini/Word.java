package com.nihongo.simonini;

// Custom class Word

public class Word {
    /* A class Word is composed of:
    /* mJapanese : The word/phrase in Japanese (Hiragana, Katakana and Kanji)
       mRomanji : The same word but written in european alphabet
       mTranslation: The translation
     */
    private String mJapanese;
    private String mRomanji;
    private String mTranslation;

    public Word(String japanese, String romanji, String translation){
        mJapanese = japanese;
        mRomanji = romanji;
        mTranslation = translation;
    }

    // Get the japanese phrases
    public String getJapanese(){
        return mJapanese;
    }

    // Get the romanji phrases
    public String getRomanji(){
        return mRomanji;
    }

    // Get the translation phrases
    public String getTranslation(){
        return mTranslation;
    }

}
