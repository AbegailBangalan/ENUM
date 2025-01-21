package com.mycompany.enumayb;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        try {
            FileWriter sulat =  new FileWriter("ImpootantFile.txt");
            sulat.write("is IT the right course for me?");
            sulat.close();
            System.out.println("Done!");
        }
        catch (IOException e) {
            System.out.println("Something went wrong.");
            e.printStackTrace();
        }
        
    }
    
}
