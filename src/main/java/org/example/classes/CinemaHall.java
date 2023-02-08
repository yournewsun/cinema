package org.example.classes;

import java.util.ArrayList;

public class CinemaHall {
    String cinemaHallName;
    int numberOfRows;
    int numberOfSeatsInARow;
    ArrayList<RowSeat> hallSize = new ArrayList<>();

    //Constructors

    public CinemaHall() {
    }

    public CinemaHall(String cinemaHallName) {
        this.cinemaHallName = cinemaHallName;
    }

    public CinemaHall(String cinemaHallName, int numberOfRows, int numberOfSeatsInARow) {
        this.cinemaHallName = cinemaHallName;
        this.numberOfRows = numberOfRows;
        this.numberOfSeatsInARow = numberOfSeatsInARow;
    }
    //----------> End constructors

    //Getters and setters

    public String getCinemaHallName() {
        return cinemaHallName;
    }

    public void setCinemaHallName(String cinemaHallName) {
        this.cinemaHallName = cinemaHallName;
    }

    public int getNumberOfRows() {
        return numberOfRows;
    }

    public void setNumberOfRows(int numberOfRows) {
        this.numberOfRows = numberOfRows;
    }

    public int getNumberOfSeatsInARow() {
        return numberOfSeatsInARow;
    }

    public void setNumberOfSeatsInARow(int numberOfSeatsInARow) {
        this.numberOfSeatsInARow = numberOfSeatsInARow;
    }

    public ArrayList<RowSeat> getHallSize() {
        return hallSize;
    }

    public void setHallSize(ArrayList<RowSeat> hallSize) {
        this.hallSize = hallSize;
    }
}
