package org.example.classes;

import java.text.SimpleDateFormat;

public class Movie {
    String movieTitle;
    SimpleDateFormat theBeginningOfTheMovieSession;
    int duration;

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public SimpleDateFormat getTheBeginningOfTheMovieSession() {
        return theBeginningOfTheMovieSession;
    }

    public void setTheBeginningOfTheMovieSession(SimpleDateFormat theBeginningOfTheMovieSession) {
        this.theBeginningOfTheMovieSession = theBeginningOfTheMovieSession;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}

