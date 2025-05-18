import java.util.LinkedList;

class Playlist {
    public static void main(String[] args) {
        LinkedList<String> songs = new LinkedList<>();

        songs.add("Song A");
        songs.add("Song B");
        songs.add("Song C");

        songs.remove("Song B");

        for (String song : songs) {
            System.out.println(song);
        }
    }
}
