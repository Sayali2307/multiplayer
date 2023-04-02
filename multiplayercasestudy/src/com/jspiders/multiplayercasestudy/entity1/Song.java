package com.jspiders.multiplayercasestudy.entity1;

public class Song {

	private int id;
	private String SongName;
	private String Singer;
	private double duration;
	private String moviealbum;
	private String lyricist;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSongName() {
		return SongName;
	}
	public void setSongName(String songName) {
		SongName = songName;
	}
	public String getSinger() {
		return Singer;
	}
	public void setSinger(String singer) {
		Singer = singer;
	}
	public double getDuration() {
		return duration;
	}
	public void setDuration(double duration) {
		this.duration = duration;
	}
	public String getMoviealbum() {
		return moviealbum;
	}
	public void setMoviealbum(String moviealbum) {
		this.moviealbum = moviealbum;
	}
	public String getLyricist() {
		return lyricist;
	}
	public void setLyricist(String lyricist) {
		this.lyricist = lyricist;
	}
	@Override
	public String toString() {
		return "Song [id=" + id + ", SongName=" + SongName + ", Singer=" + Singer + ", duration=" + duration
				+ ", moviealbum=" + moviealbum + ", lyricist=" + lyricist + "]";
	}
	
	
}
