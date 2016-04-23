package com.company;
import java.io.*;
import java.util.Scanner;

/**
 * Created by Harsh P Vyas on 3/17/2016.
 */
public class CountFiles {


    String fileName [] = new String[20];

    // This will reference one line at a time
    String line = null;

public void countFilesinServer(){
    try {
        // FileReader reads text files in the default encoding.
        Scanner in = new Scanner(System.in);

        BufferedReader bufferedReader;
        // Always wrap FileReader in BufferedReader.
       for(int i=0;i<fileName.length;i++) {
           fileName[i]= in.nextLine();
           FileReader fileReader = new FileReader(fileName[i]);
           bufferedReader = new BufferedReader(fileReader);
           int count=0;
           while ((line = bufferedReader.readLine()) != null && count == 0) {
               System.out.println(line);
               count++;
           }
           bufferedReader.close();
       }
        // Always close files.

    }
    catch(FileNotFoundException ex) {
        System.out.println("Unable to open file '" + fileName + "'");
    }
    catch(IOException ex) {
        System.out.println("Error reading file '" + fileName + "'");
        // Or we could just do this:
        // ex.printStackTrace();
    }

}
}
