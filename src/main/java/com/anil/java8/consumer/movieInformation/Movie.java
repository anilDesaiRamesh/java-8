package com.anil.java8.consumer.movieInformation;

public class Movie {
    String stName;
    String sthero;
    String stHeroine;

    public Movie(String stName, String sthero, String stHeroine) {
        this.stName = stName;
        this.sthero = sthero;
        this.stHeroine = stHeroine;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "stName='" + stName + '\'' +
                ", sthero='" + sthero + '\'' +
                ", stHeroine='" + stHeroine + '\'' +
                '}';
    }

    public String getStName() {
        return stName;
    }

    public void setStName(String stName) {
        this.stName = stName;
    }

    public String getSthero() {
        return sthero;
    }

    public void setSthero(String sthero) {
        this.sthero = sthero;
    }

    public String getStHeroine() {
        return stHeroine;
    }

    public void setStHeroine(String stHeroine) {
        this.stHeroine = stHeroine;
    }
}
