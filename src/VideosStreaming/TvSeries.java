package VideosStreaming;

public class TvSeries extends Video{

    private int rating;
    private String broadcastChannel;
    private String yearOfIssue;

    public TvSeries(String name, int duration, String resolution, String company, int rating, String broadcastChannel, String yearOfIssue) {
        super(name, duration, resolution, company);
        this.rating = rating;
        this.broadcastChannel = broadcastChannel;
        this.yearOfIssue = yearOfIssue;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getBroadcastChannel() {
        return broadcastChannel;
    }

    public void setBroadcastChannel(String broadcastChannel) {
        this.broadcastChannel = broadcastChannel;
    }

    public String getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(String yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }



    }

