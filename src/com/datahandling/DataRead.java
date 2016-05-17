package com.datahandling;

import java.io.*;

/**
 * Created by Harsh P Vyas on 5/8/2016.
 */
public class DataRead {

    public static void main(String [] args) throws IOException {

        try {

            FileReader in = new FileReader("C:\\Users\\Harsh P Vyas\\Desktop\\DataSperation\\cleveland.data.txt");
            BufferedReader br = new BufferedReader(in);
            String line;
            String arr[];
            File file = new File("C:\\Users\\Harsh P Vyas\\Desktop\\DataSperation\\clevelandfileData.txt");
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);

            // if file doesnt exists, then create it
            if (!file.exists()) {
                file.createNewFile();
            }

            while ((line=br.readLine()) != null) {
                if(line.contains("name")) {
                    arr=line.split("name");         // Split by name (No need of name param in data.)
                    for(int i=0;i<arr.length;i++)
                            bw.write(arr[0]);
                    bw.newLine();
                }
                else
                    bw.write(line+" ");
            }
            in.close();

            System.out.println("Done");

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

}
