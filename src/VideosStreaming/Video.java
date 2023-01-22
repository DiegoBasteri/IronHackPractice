package VideosStreaming;

public abstract class Video {
    private String name;
    private int duration;
    private String resolution;
    private String company;

    public Video(String name, int duration, String resolution, String company) {
        this.name = name;
        this.duration = duration;
        this.resolution = resolution;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Video{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                ", resolution='" + resolution + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
