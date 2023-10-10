package Assignment9;

public class Playlist {
	
	String name;
	Song first;
	
	public Playlist(){
		name = "library";
		first = Song.END;
	}
	
	public Playlist(String name) {
		this.name = name;
		first = Song.END;
	}
	
	public String getName() { 
		return name;
	}
	
	public void add(Song song) { // to code
	}
	
	public int size() { // to code
		return -1;
	}
	
	public Song removeFirst() { // to code
		return null;
	}
	
	public int remove(Song song) { // to code
		return -1;
	}
	
	public Song head() {
		return first;
	}
	
	public int getPosition(Song song) { // to code
		return -1;
	}
	
	public String listSongs() { // to code
		return "";
	}
}