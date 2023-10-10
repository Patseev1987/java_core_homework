package org.example.bogdan;

import org.example.bogdan.model.Note;
import org.example.bogdan.saver.FileSaver;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the note:");
        String message = scanner.nextLine();
        Note note = new Note(message);
        FileSaver fileSaver = new FileSaver();
        fileSaver.saveNote(note);
    }
}
