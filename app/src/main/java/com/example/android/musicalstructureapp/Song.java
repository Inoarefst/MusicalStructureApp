package com.example.android.musicalstructureapp;

/**
 * {@link Song} represents a list of different categories of music that the user wants to hear.
 * It contains a song name and an artist name for that each song.
 */
public class Song {

    /**
     * Song name for each song.
     */
    private String mSongName;

    /**
     * Artist name for each song
     */
    private String mArtistName;

    /**
     * Create a new song object.
     *
     * @param songName   is the name of the song.
     * @param artistName is the name of the artist that performs each song
     */
    public Song(String songName, String artistName) {
        mSongName = songName;
        mArtistName = artistName;
    }

    /**
     * Get the name of each song.
     */
    public String getSongName() {
        return mSongName;
    }

    /**
     * Get the name of each artist.
     */
    public String getArtistName() {
        return mArtistName;
    }
}


