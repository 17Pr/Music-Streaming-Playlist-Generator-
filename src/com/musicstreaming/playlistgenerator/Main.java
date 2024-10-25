package com.musicstreaming.playlistgenerator;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		List<Song> songLibrary = Arrays.asList(
	            new Song("Song A", "Pop", "Happy", 120),
	            new Song("Song B", "Rock", "Energetic", 140),
	            new Song("Song C", "Jazz", "Relaxed", 90),
	            new Song("Song D", "Pop", "Calm", 85),
	            new Song("Song E", "Classical", "Calm", 60)
	        );

	        // Define user preferences
	        Set<String> genres = new HashSet<>(Arrays.asList("Pop", "Rock"));
	        Set<String> moods = new HashSet<>(Arrays.asList("Happy", "Energetic"));
	        int minTempo = 100;
	        int maxTempo = 150;

	        UserPreferences userPreferences = new UserPreferences(genres, moods, minTempo, maxTempo);

	        // Generate and display playlist
	        PlaylistGenerator generator = new PlaylistGenerator(songLibrary);
	        List<Song> playlist = generator.generatePlaylist(userPreferences);

	        System.out.println("Generated Playlist:");
	        for (Song song : playlist) {
	            System.out.println(song);
	        }
	    }

	}


