package com.example.demo.model;

public class MovieDto {
    private Long id;
    private String title;
    private String description;
    private String genre;
    private Integer year;
    private String director;
    private String image;

    public MovieDto(Long id, String title, String description, String genre, Integer year, String director, String image) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.genre = genre;
        this.year = year;
        this.director = director;
        this.image = image;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}

