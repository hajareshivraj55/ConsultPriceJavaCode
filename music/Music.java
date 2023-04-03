package com.music;

import java.util.List;

public class Music implements MusicInterface{
	String song;

	public Music() {
		super();
	}

	public Music(String song) {
		super();
		this.song = song;
	}

	public String getSong() {
		return song;
	}

	public void setSong(String song) {
		this.song = song;
	}

	@Override
	public String toString() {
		return "Music [song=" + song + "]";
	}

	@Override
	public void rotateList(List<Music> lst) {
		for(int i=0;i<1;i++) {
			Music temp=lst.get(0);
			for(int j=0;j<lst.size()-1;j++) {
				lst.set(j, lst.get(j+1));
			}
			lst.set(lst.size()-1
					, temp);
		}
		
	}	
}
