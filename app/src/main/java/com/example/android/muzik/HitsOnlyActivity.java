package com.example.android.muzik;

import android.content.Intent;
import android.provider.UserDictionary;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.android.muzik.R;
import com.example.android.muzik.Word;
import com.example.android.muzik.WordAdapter;

import java.util.ArrayList;
import java.util.FormatFlagsConversionMismatchException;


/// THIS IS WHERE ALL THE SONGS WILL BE STORED THAT ARE HITS IN 2018

public class HitsOnlyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.all_songs);

        // set image for background
        ImageView ivbackground = (ImageView) findViewById(R.id.background_all_songs);
        ivbackground.setImageResource(R.drawable.music_note);

        // set image for repeat button
        ImageView ivRepeat = (ImageView) findViewById(R.id.repeat);
        ivRepeat.setImageResource(R.drawable.repeat);


        // set image for forward button
        ImageView ivForward = (ImageView) findViewById(R.id.forward);
        ivForward.setImageResource(R.drawable.forward);


        // set image for play button
        ImageView ivPlay = (ImageView) findViewById(R.id.play);
        ivPlay.setImageResource(R.drawable.play);

        // set image for backward button
        ImageView ivBackward = (ImageView) findViewById(R.id.backward);
        ivBackward.setImageResource(R.drawable.backward);

        // set image for shuffle button
        ImageView ivShuffle = (ImageView) findViewById(R.id.shuffle);
        ivShuffle.setImageResource(R.drawable.shuffle);



        // Create a list of songs and song info
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("In My Feelings / Scorpion", "Drake"));
        words.add(new Word("This is America / This is America", "Childish Gambino"));
        words.add(new Word("I Like It / Invatison Of Privacy", "Cardi B"));
        words.add(new Word("God is a Woman / God is a Woman", "Ariana Grande"));
        words.add(new Word("Rise / Rise", "Jonas Blue, Jack & Jack"));
        words.add(new Word("Taste / Taste", "Tyga, (feat- Offset)"));
        words.add(new Word("Summertime Magic / Summer Pack", "Childish Gambino"));
        words.add(new Word("Lie / Perception", "NF"));
        words.add(new Word("Don't Mater To Me / Scorpion", "Drake"));
        words.add(new Word("APESHIT / Everything is Love", "The Carters"));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter =
                new WordAdapter(this, words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // all_songs.xml file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}