package com.example.android.muzik;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.android.muzik.R;

import java.util.ArrayList;

/**
 * Created by edbo on 7/18/18.
 */

public class WordAdapter extends ArrayAdapter<com.example.android.muzik.Word> {

    public WordAdapter(Activity context, ArrayList<com.example.android.muzik.Word> words) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_items, parent, false);
        }

        // Get the {@link Songs Info} object located at this position in the list
        com.example.android.muzik.Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView songTextView = (TextView) listItemView.findViewById(R.id.music_text_view);
        // Get the version name from the current Song Name  and
        // set this text on the name TextView
        songTextView.setText(currentWord.getSongInfo());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView artistTextView = (TextView) listItemView.findViewById(R.id.artist_text_view);
        // Get the version number from the current Song Info and
        // set this text on the number TextView
        artistTextView.setText(currentWord.getArtistInfo());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}