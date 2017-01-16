package com.nihongo.simonini;

// Custom class Word

import android.media.Image;

public class Word {
    /* A class Word is composed of:
    /* mJapanese : The word/phrase in Japanese (Hiragana, Katakana and Kanji)
       mRomanji : The same word but written in european alphabet
       mTranslation: The translation
       mImageRessourceId : The image ressource id
     */
    private String mJapanese;
    private String mRomanji;
    private String mTranslation;
    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private int mSoundResourceId;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String japanese, String romanji, String translation, int imageResourceId, int soundResourceId){
        mJapanese = japanese;
        mRomanji = romanji;
        mTranslation = translation;
        mImageResourceId = imageResourceId;
        mSoundResourceId = soundResourceId;
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

    // Get the image resource id
    public int getImageResourceId() { return mImageResourceId;}

    // Get the sound resource id
    public int getSoundResourceId() { return mSoundResourceId;}


    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }


}
