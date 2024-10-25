package com.musicstreaming.playlistgenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class PlaylistGenerator {

	private List<Song> songLibrary;

    public PlaylistGenerator(List<Song> songLibrary) {
        this.songLibrary = songLibrary;
    }

    public List<Song> generatePlaylist(UserPreferences preferences) {
        List<Song> playlist = new ArrayList<>();

        for (Song song : songLibrary) {
            if (preferences.getPreferredGenres().contains(song.getGenre()) &&
                preferences.getPreferredMoods().contains(song.getMood()) &&
                song.getTempo() >= preferences.getMinTempo() &&
                song.getTempo() <= preferences.getMaxTempo()) {
                playlist.add(song);
            }
        }

        return playlist;
    }
}
