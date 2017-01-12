package com.nihongo.simonini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        // Create a list of fake words to fill
        // words.add(new Word("", "", ""));

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("あか", "Aki", "Red", R.drawable.ic_red));
        words.add(new Word("きいろ", "Kiiro", "Yellow", R.drawable.ic_yellow));
        words.add(new Word("あお", "Ao", "Blue", R.drawable.ic_blue));
        words.add(new Word("みどり色", "Midori iro", "Green", R.drawable.ic_green));
        words.add(new Word("むらさき色", "Murasaki iro", "Purple", R.drawable.ic_purple));
        words.add(new Word("オレンジ色", "Orenji iro", "Orange", R.drawable.ic_orange));
        words.add(new Word("ピンク", "Pinku", "Pink", R.drawable.ic_pink));
        words.add(new Word("黒", "Kuro", "Black", R.drawable.ic_black));
        words.add(new Word("白", "Shiro", "White", R.drawable.ic_white));
        words.add(new Word("茶色", "Cha iro", "Brown", R.drawable.ic_brown));

        // Create a {@link : WordAdapter } whose data source is a list of Words. The
        // adapter know how to create list items for each item in the list
        WordAdapter adapter = new WordAdapter(ColorsActivity.this, words);



        // Find the ListView object in the view hierarchy of the Activity
        // There should be a ListView with the view ID called list, which is declared in the template_list.xml
        ListView listView = (ListView) findViewById(R.id.list_view_id);


        listView.setAdapter(adapter);


    }
}
