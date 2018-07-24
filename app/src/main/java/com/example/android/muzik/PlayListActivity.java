package com.example.android.muzik;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.android.muzik.R;
import com.example.android.muzik.Word;
import com.example.android.muzik.WordAdapter;

import java.util.ArrayList;

/// THIS IS WHERE ALL THE SONGS WILL BE STORED THAT ARE IN YOUR PLAY LIST


public class PlayListActivity extends AppCompatActivity {

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
        words.add(new Word("The Way I Am / The Marshal Mathers LP", "Eminem"));
        words.add(new Word("Hustlin' / Port of Miami", "Rick Ross (feat- Jay Z & Jeezy"));
        words.add(new Word("N.Y. State Of Mind / Illmatic", "nas"));
        words.add(new Word("WHY / Album", "NF"));
        words.add(new Word("Ruff Ryders Anthem / It's Dark And Hell Is Hot  ", "DMX"));
        words.add(new Word("Famous / The Life Of Pablo", "Kanye West"));
        words.add(new Word("The Chain / Rumours", "Feetwood Mac"));
        words.add(new Word("Californication / Californication", "Red Hot Chili Peppers"));
        words.add(new Word("Toss it Up / The Don Killuminati: The 7 Day Theory", "Makaveli"));
        words.add(new Word("Gimme The Loot / Ready To Die", "The Notorious B.I.G"));

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
