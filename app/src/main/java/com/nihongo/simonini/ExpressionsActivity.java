package com.nihongo.simonini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class ExpressionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        // Create a list of fake words to fill
        // words.add(new Word("", "", ""));

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("今日は", "Konichiwa", "Hello", -1));
        words.add(new Word("今晩は", "Konbanwa", "Good evening", -1));
        words.add(new Word("おやすみなさい ", "Oyasumi nasai", "Good night", -1));
        words.add(new Word("ありがとう", "Arigatô", "Thanks", -1));
        words.add(new Word("私は　[YOUR NAME]です　宜しくお願いたします。", "Watashi wa [YOUR NAME]desu yoroshiku onegaitashimasu", "My name is [YOUR NAME] nice to meet you.", -1));
        words.add(new Word("私は　フランス人です。", "Watashi wa furansujin desu", "I'm French.", -1));
        words.add(new Word("私は日本語を勉強します。", "Watashi wa nihongo o benkyô shimasu", "I'm learning Japanese", -1));
        words.add(new Word("乾杯", "Kanpai", "Cheers", -1));
        words.add(new Word("いただきます", "Itadakimasu", "Bon appetit", -1));
        words.add(new Word("いってきます", "Itte kimasu", "See you", -1));
        // Create a {@link : WordAdapter } whose data source is a list of Words. The
        // adapter know how to create list items for each item in the list
        WordAdapter adapter = new WordAdapter(ExpressionsActivity.this, words);



        // Find the ListView object in the view hierarchy of the Activity
        // There should be a ListView with the view ID called list, which is declared in the template_list.xml
        ListView listView = (ListView) findViewById(R.id.list_view_id);


        listView.setAdapter(adapter);


    }
}
