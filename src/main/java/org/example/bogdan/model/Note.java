package org.example.bogdan.model;


import java.time.LocalDate;
import java.util.Date;

public class Note {
    private String message;
    private LocalDate date;

    public Note(String message) {
        this.message = message;
        this.date = LocalDate.now();
    }

    @Override
    public String toString() {
        return date.toString()+" -> "+message;
    }
}
