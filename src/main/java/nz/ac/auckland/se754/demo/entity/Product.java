package nz.ac.auckland.se754.demo.entity;

public class Product {

    private int id;
    private String name;
    private String description;
    private String artistName;
    private String genre;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getArtistName() {
        return artistName;
    }

    public String getGenre() {
        return genre;
    }

}
