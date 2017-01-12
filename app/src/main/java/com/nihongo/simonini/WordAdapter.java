package com.nihongo.simonini;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by simon on 12/01/2017.
 */

public class WordAdapter extends ArrayAdapter<Word>{
/**
 * Create a new {@link WordAdapter} object.
 *
 * @param context is the current context (i.e. Activity) that the adapter is being created in.
 * @param words is the list of {@link Word}s to be displayed.
 */
public WordAdapter(Context context, ArrayList<Word> words) {
    super(context,0,words);
}
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.template_list, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Word currentWord = getItem(position);

        // Find the TextView in the template_item.xml and get the japanese word
        TextView japaneseTextView = (TextView) listItemView.findViewById(R.id.japanese_text_view);
        japaneseTextView.setText(currentWord.getJapanese());

        TextView romanjiTextView = (TextView) listItemView.findViewById(R.id.romanji_text_view);
        romanjiTextView.setText(currentWord.getRomanji());

        TextView translationTextView = (TextView) listItemView.findViewById(R.id.translation_text_view);
        translationTextView.setText(currentWord.getTranslation());

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}
