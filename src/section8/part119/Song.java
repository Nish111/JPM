package section8.part119;

public class Song {
    private String title;
    private double duration;

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return this.title + ": " + this.duration;
    }

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }
}
