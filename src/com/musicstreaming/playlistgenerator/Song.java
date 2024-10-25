package com.musicstreaming.playlistgenerator;

public class Song {
	 private String title;
	    private String genre;
	    private String mood;
	    private int tempo;

	    public Song(String title, String genre, String mood, int tempo) {
	        this.title = title;
	        this.genre = genre;
	        this.mood = mood;
	        this.tempo = tempo;
	    }

	    public String getTitle() { return title; }
	    public String getGenre() { return genre; }
	    public String getMood() { return mood; }
	    public int getTempo() { return tempo; }

	    @Override
	    public String toString() {
	        return title + " [" + genre + ", " + mood + ", " + tempo + " BPM]";
	    }

}
