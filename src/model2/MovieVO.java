package model2;

public class MovieVO {
    private String title;
    private String direction;
    private String year;
    private String country;

    public MovieVO(String title, String direction, String year, String country) {
        this.title = title;
        this.direction = direction;
        this.year = year;
        this.country = country;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "MovieVO{" +
                "title='" + title + '\'' +
                ", direction='" + direction + '\'' +
                ", year='" + year + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
