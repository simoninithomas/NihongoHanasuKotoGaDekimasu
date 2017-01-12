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
        words.add(new Word("ちち", "Chichi", "Father", R.drawable.family_father));
        words.add(new Word("はは", "Haha", "Mother", R.drawable.family_mother));
        words.add(new Word("むすこ", "Musuko", "Son", R.drawable.family_son));
        words.add(new Word("むすめ", "Musume", "Daughter", R.drawable.family_daughter));
        words.add(new Word("おにいさん", "Onii san", "Older brother", R.drawable.family_older_brother));
        words.add(new Word("おとうとさん", "Otôto san", "Younger brother", R.drawable.family_younger_brother));
        words.add(new Word("おねえさん", "Onee san", "Older sister", R.drawable.family_older_sister));
        words.add(new Word("いもうとさん", "Imôto san", "Younger sister", R.drawable.family_younger_sister));
        words.add(new Word("おばあさん", "Obaa san", "Grandmother", R.drawable.family_grandmother));
        words.add(new Word("おじいさん", "Ojii san", "Grandfather", R.drawable.family_grandfather));

        // Create a {@link : WordAdapter } whose data source is a list of Words. The
        // adapter know how to create list items for each item in the list
        WordAdapter adapter = new WordAdapter(FamilyActivity.this, words, R.color.family);



        // Find the ListView object in the view hierarchy of the Activity
        // There should be a ListView with the view ID called list, which is declared in the template_list.xml
        ListView listView = (ListView) findViewById(R.id.list_view_id);


        listView.setAdapter(adapter);


    }
}
