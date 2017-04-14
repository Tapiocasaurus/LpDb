package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Albums")
public class LpEntry {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;
	@Column(name = "ALBUMNAME")
	private String albumName;
	@Column(name = "ARTIST")
	private String artist;
	@Column(name = "GENRE")
	private String genre;
	@Column(name = "YEAR")
	private int year;
	@Column(name = "TRACKS")
	private int tracks;
	@Column(name = "LENGTH")
	private int length;
	
	public LpEntry() {
		
	}
	
	public LpEntry(String aN, String ar, String ge, int ye, int nu, int le) {
		this.albumName = aN;
		this.artist = ar;
		this.genre = ge;
		this.year = ye;
		this.tracks = nu;
		this.length = le;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAlbumName() {
		return albumName;
	}

	public void setAlbumName(String albumName) {
		this.albumName = albumName;
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

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getTracks() {
		return tracks;
	}

	@Override
	public String toString() {
		return "LpEntry [albumName=" + albumName + ", artist=" + artist + ", genre=" + genre + ", year=" + year
				+ ", tracks=" + tracks + ", length=" + length + "]";
	}

	public void setTracks(int tracks) {
		this.tracks = tracks;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
}
