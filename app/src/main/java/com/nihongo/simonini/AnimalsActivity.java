package com.nihongo.simonini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class AnimalsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        // Create a list of fake words to fill
        //words.add(new Word("", "", ""));
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("どうぶつ", "Dou butsu", "Animals"));
        words.add(new Word("ねこ", "Neko", "Cat"));
        words.add(new Word("いぬ", "Inu", "Dog"));
        words.add(new Word("パンダ", "Panda", "Panda"));
        words.add(new Word("タヌキ", "Tanuki", "Raccoon"));
        words.add(new Word("クマ", "Kuma", "Bear"));
        words.add(new Word("フクロウ", "Fukurou", "Owl"));
        words.add(new Word("ヤギ", "Yagi", "Goat"));
        words.add(new Word("シカ", "Shika", "Deer"));
        words.add(new Word("キリン", "Kirin", "Girafe"));

        // Create a {@link : WordAdapter } whose data source is a list of Words. The
        // adapter know how to create list items for each item in the list
        WordAdapter adapter = new WordAdapter(AnimalsActivity.this, words);



        // Find the ListView object in the view hierarchy of the Activity
        // There should be a ListView with the view ID called list, which is declared in the template_list.xml
        ListView listView = (ListView) findViewById(R.id.list_view_id);


        listView.setAdapter(adapter);


    }
}
