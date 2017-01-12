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
        words.add(new Word("ゼロ", "Zero", "0", R.drawable.ic_zero));
        words.add(new Word("一", "Ichi", "1", R.drawable.ic_one));
        words.add(new Word("二", "Ni", "2", R.drawable.ic_two));
        words.add(new Word("三", "San", "3", R.drawable.ic_three));
        words.add(new Word("四", "Yon", "4", R.drawable.ic_four));
        words.add(new Word("五", "Go", "5", R.drawable.ic_five));
        words.add(new Word("六", "Roku", "6", R.drawable.ic_six));
        words.add(new Word("七", "Nana", "7", R.drawable.ic_seven));
        words.add(new Word("八", "Hachi", "8", R.drawable.ic_eight));
        words.add(new Word("九", "Kyû", "9", R.drawable.ic_nine));
        words.add(new Word("十", "Jû", "10", R.drawable.ic_ten));
        // Create a {@link : WordAdapter } whose data source is a list of Words. The
        // adapter know how to create list items for each item in the list
        WordAdapter adapter = new WordAdapter(NumbersActivity.this, words, R.color.numbers);



        // Find the ListView object in the view hierarchy of the Activity
        // There should be a ListView with the view ID called list, which is declared in the template_list.xml
        ListView listView = (ListView) findViewById(R.id.list_view_id);


        listView.setAdapter(adapter);


    }
}
