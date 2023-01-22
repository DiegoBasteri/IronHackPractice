package VideosStreaming;

public class Movie extends Video{
    private  int rating;
    private String platform;

    public Movie(String name, int duration, String resolution, String company, int rating, String platform) {
        super(name, duration, resolution, company);
        this.rating = rating;
        this.platform = platform;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "rating=" + rating +
                ", platform='" + platform + '\'' +
                '}';
    }
}
