package com.resources;

public class Game {
    private String name;
    private String platform;
    private String releaseDate;
    private String developer;

    public Game(String name, String platform, String releaseDate, String developer) {
        this.name = name;
        this.platform = platform;
        this.releaseDate = releaseDate;
        this.developer = developer;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Game{" +
                "name='" + name + '\'' +
                ", platform='" + platform + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", developer='" + developer + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }
}
