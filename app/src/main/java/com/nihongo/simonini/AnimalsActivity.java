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
        words.add(new Word("どうぶつ", "Dou butsu", "Animals", -1));
        words.add(new Word("ねこ", "Neko", "Cat", R.drawable.ic_cat));
        words.add(new Word("いぬ", "Inu", "Dog",  R.drawable.ic_dog));
        words.add(new Word("パンダ", "Panda", "Panda",  R.drawable.ic_panda));
        words.add(new Word("タヌキ", "Tanuki", "Raccoon",  R.drawable.ic_raccoon));
        words.add(new Word("クマ", "Kuma", "Bear", R.drawable.ic_bear));
        words.add(new Word("フクロウ", "Fukurou", "Owl", R.drawable.ic_owl));
        words.add(new Word("ヤギ", "Yagi", "Goat", R.drawable.ic_goat));
        words.add(new Word("シカ", "Shika", "Deer", R.drawable.ic_deer));
        words.add(new Word("キリン", "Kirin", "Giraffe", R.drawable.ic_giraffe));

        // Create a {@link : WordAdapter } whose data source is a list of Words. The
        // adapter know how to create list items for each item in the list
        WordAdapter adapter = new WordAdapter(AnimalsActivity.this, words, R.color.animals);



        // Find the ListView object in the view hierarchy of the Activity
        // There should be a ListView with the view ID called list, which is declared in the template_list.xml
        ListView listView = (ListView) findViewById(R.id.list_view_id);


        listView.setAdapter(adapter);


    }
}
