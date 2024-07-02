package Task3.Dao;

import Task3.Model.Podcast;
import Task3.Model.Song;

import java.util.ArrayList;
import java.util.List;

public class Catalog {
    private static Catalog instance;
    private List<Song> songs;
    private List<Podcast> podcasts;

    private Catalog() {
        songs = new ArrayList<>();
        podcasts = new ArrayList<>();
    }

    public static Catalog getInstance() {
        if (instance == null) {
            instance = new Catalog();
        }
        return instance;
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public List<Song> getAllSongs() {
        return new ArrayList<>(songs);
    }

    public void addPodcast(Podcast podcast) {
        podcasts.add(podcast);
    }

    public List<Podcast> getAllPodcasts() {
        return new ArrayList<>(podcasts);
    }
}

