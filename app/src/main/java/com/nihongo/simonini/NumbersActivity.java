package com.nihongo.simonini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        // Create a list of fake words to fill
        // words.add(new Word("", "", ""));

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("ゼロ", "Zero", "0"));
        words.add(new Word("一", "Ichi", "1"));
        words.add(new Word("二", "Ni", "2"));
        words.add(new Word("三", "San", "3"));
        words.add(new Word("四", "Yon", "4"));
        words.add(new Word("五", "Go", "5"));
        words.add(new Word("六", "Roku", "6"));
        words.add(new Word("七", "Nana", "7"));
        words.add(new Word("八", "Hachi", "8"));
        words.add(new Word("九", "Kyû", "9"));
        words.add(new Word("十", "Jû", "10"));
        // Create a {@link : WordAdapter } whose data source is a list of Words. The
        // adapter know how to create list items for each item in the list
        WordAdapter adapter = new WordAdapter(NumbersActivity.this, words);



        // Find the ListView object in the view hierarchy of the Activity
        // There should be a ListView with the view ID called list, which is declared in the template_list.xml
        ListView listView = (ListView) findViewById(R.id.list_view_id);


        listView.setAdapter(adapter);


    }
}
