package com.example.android.muzik;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.muzik.PlayListActivity;
import com.example.android.muzik.R;
import com.example.android.muzik.YourFavsActivity;

public class MainActivity extends AppCompatActivity {

    /// THIS IS YOUR HOME SCREEN


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);
// Find the View that shows the PlayList Text
        TextView playList = (TextView) findViewById(R.id.playlist);

// Set a click listener on that View
        playList.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the PlayList View is clicked on.
            @Override
            public void onClick(View view) {
                Intent playListIntent = new Intent(MainActivity.this, PlayListActivity.class);
                startActivity(playListIntent);
            }
        });


// Find the View that shows the Your Favs Text
        TextView favs = (TextView) findViewById(R.id.fav_songs);

// Set a click listener on that View
        favs.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Your Favs View is clicked on.
            @Override
            public void onClick(View view) {
                Intent favIntent = new Intent(MainActivity.this, YourFavsActivity.class);
                startActivity(favIntent);
            }
        });


// Find the View that shows the Hits Only Text
        TextView hits = (TextView) findViewById(R.id.top_songs);

// Set a click listener on that View
        hits.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Hits Only View is clicked on.
            @Override
            public void onClick(View view) {
                Intent hitsIntent = new Intent(MainActivity.this, HitsOnlyActivity.class);
                startActivity(hitsIntent);
            }
        });



        // set image for playlist cover art Marshal Mathers LP
        ImageView ivEminem = (ImageView) findViewById(R.id.eminem);
        ivEminem.setImageResource(R.drawable.slim_shady);

        // Set a click listener on that ImageView
        ivEminem.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Marshal Mathers LP ImageView is clicked on.
            @Override
            public void onClick(View view) {
                Intent playListIntent = new Intent(MainActivity.this, PlayListActivity.class);
                startActivity(playListIntent);
            }
        });

        // set image for playlist cover art Port of Miami
        ImageView ivRoss = (ImageView) findViewById(R.id.ross);
        ivRoss.setImageResource(R.drawable.rick_ross);

        // Set a click listener on that ImageView
        ivRoss.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Port of Miami ImageView is clicked on.
            @Override
            public void onClick(View view) {
                Intent playListIntent = new Intent(MainActivity.this, PlayListActivity.class);
                startActivity(playListIntent);
            }
        });

        // set image for playlist cover art Illmatic
        ImageView ivNas = (ImageView) findViewById(R.id.nas);
        ivNas.setImageResource(R.drawable.nas);

        // Set a click listener on that ImageView
        ivNas.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Illmatic ImageView is clicked on.
            @Override
            public void onClick(View view) {
                Intent playListIntent = new Intent(MainActivity.this, PlayListActivity.class);
                startActivity(playListIntent);
            }
        });

        // set image for Hits Only Scorpion
        ImageView ivDrakeS = (ImageView) findViewById(R.id.drake_one);
        ivDrakeS.setImageResource(R.drawable.drake);

        // Set a click listener on that ImageView
        ivDrakeS.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Scorpion ImageView is clicked on.
            @Override
            public void onClick(View view) {
                Intent playListIntent = new Intent(MainActivity.this, HitsOnlyActivity.class);
                startActivity(playListIntent);
            }
        });

        // set image for Hits Only This Is America
        ImageView ivChildish = (ImageView) findViewById(R.id.gambino);
        ivChildish.setImageResource(R.drawable.childish_gambino);

        // Set a click listener on that ImageView
        ivChildish.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the This Is America ImageView is clicked on.
            @Override
            public void onClick(View view) {
                Intent playListIntent = new Intent(MainActivity.this, HitsOnlyActivity.class);
                startActivity(playListIntent);
            }
        });

        // set image for Hits Only CardiB
        ImageView ivCardi = (ImageView) findViewById(R.id.cardi);
        ivCardi.setImageResource(R.drawable.cardi_b);

        // Set a click listener on that ImageView
        ivCardi.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the CarbiB ImageView is clicked on.
            @Override
            public void onClick(View view) {
                Intent playListIntent = new Intent(MainActivity.this, HitsOnlyActivity.class);
                startActivity(playListIntent);
            }
        });

        // set image for Your Favs gorillaz
        ImageView ivGorillaz = (ImageView) findViewById(R.id.gorillaz_h);
        ivGorillaz.setImageResource(R.drawable.gorillaz);

        // Set a click listener on that ImageView
        ivGorillaz.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the gorillaz ImageView is clicked on.
            @Override
            public void onClick(View view) {
                Intent playListIntent = new Intent(MainActivity.this, YourFavsActivity.class);
                startActivity(playListIntent);
            }
        });

        // set image for Your Favs White Stripes
        ImageView ivStripes = (ImageView) findViewById(R.id.stripes);
        ivStripes.setImageResource(R.drawable.white_strips);

        // Set a click listener on that ImageView
        ivStripes.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the White Stripes ImageView is clicked on.
            @Override
            public void onClick(View view) {
                Intent playListIntent = new Intent(MainActivity.this, YourFavsActivity.class);
                startActivity(playListIntent);
            }
        });


        // set image for Your Favs Black Keyes
        ImageView ivKeyes = (ImageView) findViewById(R.id.keyes);
        ivKeyes.setImageResource(R.drawable.black_keyes);

        // Set a click listener on that ImageView
        ivKeyes.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Black Keyes ImageView is clicked on.
            @Override
            public void onClick(View view) {
                Intent playListIntent = new Intent(MainActivity.this, YourFavsActivity.class);
                startActivity(playListIntent);
            }
        });



        // set image for background
        ImageView ivBackground = (ImageView) findViewById(R.id.background);
        ivBackground.setImageResource(R.drawable.music_note);

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


    }
}