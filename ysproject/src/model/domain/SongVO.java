package model.domain;

public class SongVO {
	private String songName;
	private String artist;
	private String genre;
	private String music;
	private String score;
	private String video;
	
	public SongVO() {
		super();
	}

	public SongVO(String songName, String artist, String genre, String music, String score, String video) {
		super();
		this.songName = songName;
		this.artist = artist;
		this.genre = genre;
		this.music = music;
		this.score = score;
		this.video = video;
	}

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getMusic() {
		return music;
	}

	public void setMusic(String music) {
		this.music = music;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public String getVideo() {
		return video;
	}

	public void setVideo(String video) {
		this.video = video;
	}


	@Override
	public String toString() {
		return "songName=" + songName + ", artist=" + artist + ", genre=" + genre + ", music=" + music
				+ ", score=" + score + ", video=" + video;
	}

	
	
}
