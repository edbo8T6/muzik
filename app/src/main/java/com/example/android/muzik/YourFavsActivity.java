package com.example.android.muzik;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.android.muzik.R;

import java.util.ArrayList;

/// THIS IS WHERE ALL THE SONGS THAT ARE YOUR ALL TIME FAVORITE WILL BE STORED


public class YourFavsActivity extends AppCompatActivity {

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
        ArrayList<com.example.android.muzik.Word> words = new ArrayList<com.example.android.muzik.Word>();
        words.add(new Word("Feel Good Inc / Demon Days", "Gorillaz"));
        words.add(new Word("Seven Nation Army / Elephant", "The White Stripes"));
        words.add(new Word("Lonely Boy / El Camino", "The Black Keys"));
        words.add(new Word("Another One Bites The Dust / The Game", "Queen"));
        words.add(new Word("Role Model / The Slim Shady LP", "Eminem"));
        words.add(new Word("No Sleep Till Brooklyn / License To Ill", "Beastie Boys"));
        words.add(new Word("I Mean It / These Things Happen", "G-Easty (feat- Remo)"));
        words.add(new Word("24's / Trap Muzik", "T.I"));
        words.add(new Word("Spaceship / College Drop Out", "Kanye West (feat- GLC & Consequence)"));
        words.add(new Word("It's Okay (One Blood) / Doctor's Advocate", "The Game (feat- Junior Reid)"));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        com.example.android.muzik.WordAdapter adapter =
                new com.example.android.muzik.WordAdapter(this, words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // all_songs.xml file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}
