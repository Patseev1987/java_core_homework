package org.example.bogdan.saver;


import org.example.bogdan.model.Note;

import java.io.FileWriter;
import java.io.IOException;

public class FileSaver {
    private final String FILE_PATH = "nodes.txt";
    public void saveNote(Note note){

      try(  FileWriter fileWriter = new FileWriter(FILE_PATH,true)){
          fileWriter.write(note.toString()+"\n");
          System.out.printf("Note: %s \nwas success saved",note.toString());
      } catch (IOException e) {
          System.out.println("File is not found.");
      }
    }
}
