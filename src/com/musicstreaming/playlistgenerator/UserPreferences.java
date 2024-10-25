package com.musicstreaming.playlistgenerator;
import java.util.Set;

public class UserPreferences {
    private Set<String> preferredGenres;
    private Set<String> preferredMoods;
    private int minTempo;
    private int maxTempo;

    public UserPreferences(Set<String> genres, Set<String> moods, int minTempo, int maxTempo) {
        this.preferredGenres = genres;
        this.preferredMoods = moods;
        this.minTempo = minTempo;
        this.maxTempo = maxTempo;
    }

    public Set<String> getPreferredGenres() { return preferredGenres; }
    public Set<String> getPreferredMoods() { return preferredMoods; }
    public int getMinTempo() { return minTempo; }
    public int getMaxTempo() { return maxTempo; }
}
	 