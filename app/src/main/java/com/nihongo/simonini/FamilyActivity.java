package com.nihongo.simonini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        // Create a list of fake words to fill
        // words.add(new Word("", "", ""));

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("ちち", "Chichi", "Father"));
        words.add(new Word("はは", "Haha", "Mother"));
        words.add(new Word("むすこ", "Musuko", "Son"));
        words.add(new Word("むすめ", "Musume", "Daughter"));
        words.add(new Word("おにいさん", "Onii san", "Older brother"));
        words.add(new Word("おとうとさん", "Otôto san", "Younger brother"));
        words.add(new Word("おねえさん", "Onee san", "Older sister"));
        words.add(new Word("いもうとさん", "Imôto san", "Younger sister"));
        words.add(new Word("おばあさん", "Obaa san", "Grandmother"));
        words.add(new Word("おじいさん", "Ojii san", "Grandfather"));

        // Create a {@link : WordAdapter } whose data source is a list of Words. The
        // adapter know how to create list items for each item in the list
        WordAdapter adapter = new WordAdapter(FamilyActivity.this, words);



        // Find the ListView object in the view hierarchy of the Activity
        // There should be a ListView with the view ID called list, which is declared in the template_list.xml
        ListView listView = (ListView) findViewById(R.id.list_view_id);


        listView.setAdapter(adapter);


    }
}
