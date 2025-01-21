package com.mycompany.enumayb;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        try {
            
            File payl = new File("ImpootantFile.txt");
            if (payl.createNewFile()) {
                System.out.println("File Created: " + payl.getName());
            } else {
                System.out.println("File already exists.");
            }
        }
        catch (IOException e) {
            System.out.println("An error occurreed.");
            e.printStackTrace();
        }
    }
}
