package AssiOnComparator;

public class Album {
	private int id;
	private String albumName;
	private String composer;
	private int yearOfRelease;
	private float playTime;
	
	public Album(int id, String albumName, String composer, int yearOfRelease, float playTime) {
		super();
		this.id = id;
		this.albumName = albumName;
		this.composer = composer;
		this.yearOfRelease = yearOfRelease;
		this.playTime = playTime;
	}
	@Override
	public String toString() {
		return "Album [id=" + id + ", albumName=" + albumName + ", composer=" + composer + ", yearOfRelease="
				+ yearOfRelease + ", playTime=" + playTime + "]";
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
	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public int getYearOfRelease() {
		return yearOfRelease;
	}
	public void setYearOfRelease(int yearOfRelease) {
		this.yearOfRelease = yearOfRelease;
	}
	public float getPlayTime() {
		return playTime;
	}
	public void setPlayTime(float playTime) {
		this.playTime = playTime;
	}
	
	

}
