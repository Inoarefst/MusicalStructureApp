package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class PartyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        //Create a list of party songs.
        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song(getString(R.string.party_song1), getString(R.string.party_artist1)));
        songs.add(new Song(getString(R.string.party_song2), getString(R.string.party_artist2)));
        songs.add(new Song(getString(R.string.party_song3), getString(R.string.party_artist3)));

        // Create an {@link SongAdapter}, whose data source is a list of {@link Song). The
        // adapter knows how to create list items for each item in the list.
        SongAdapter adapter = new SongAdapter(this, songs);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // song_list.xml layout file.
        ListView listView = findViewById(R.id.list_view_layout);

        // Make the {@link ListView} use the {@link SongAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Song} in the list.
        listView.setAdapter(adapter);

        //Create new text view
        TextView returnToMenu = new TextView(this);
        returnToMenu.setText(R.string.returnToMain);
        returnToMenu.setTextAppearance(this, android.R.style.TextAppearance_Large);

        //Set OnClickListener on the returnToLibrary text view
        returnToMenu.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main = new Intent(PartyActivity.this, MainActivity.class);
                startActivity(main);
            }
        });

        //Set the returnToMenu text view to be a footer view
        listView.addFooterView(returnToMenu);
        listView.setAdapter(adapter);
    }
}


