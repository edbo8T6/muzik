package com.example.android.muzik;

/**
 * {@link Word} represents the songs info
 * It contains the song name/ album and artist name
 */
public class Word {

    /** Default translation for the word */
    private String mSongInfo;

    /** Miwok translation for the word */
    private String mArtistInfo;

    /**
     * Create a new Word object.
     *
     * @param songInfo is the name of the song and album name
     * @param artistInfo is the name of the artist
     */
    public Word(String songInfo, String artistInfo) {
        mSongInfo = songInfo;
        mArtistInfo = artistInfo;
    }

    /**
     * Get the Songs name and album
     */
    public String getSongInfo() {
        return mSongInfo;
    }

    /**
     * Get the Artist Name
     */
    public String getArtistInfo() {
        return mArtistInfo;
    }

}
