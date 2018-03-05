package com.example.android.musicalstructureapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link SongAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Song} objects.
 */
public class SongAdapter extends ArrayAdapter<Song> {
    /**
     * Create a new {@link SongAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param songs   is the list of {@link Song}s to be displayed.
     */
    public SongAdapter(Activity context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        // Get the {@link Song} object located at this position in the list
        Song currentSong = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID song_title
        TextView songTextView = listItemView.findViewById(R.id.song_title);
        // Get the song name from the current Song object and
        // set this song title TextView
        songTextView.setText(currentSong.getSongName());

        // Find the TextView in the list_item.xml layout with the ID artist_name
        TextView artistTextView = listItemView.findViewById(R.id.artist_name);
        // Get the artist name from the current Song object and
        // set this text on the artist name TextView
        artistTextView.setText(currentSong.getArtistName());

        return listItemView;
    }
}
