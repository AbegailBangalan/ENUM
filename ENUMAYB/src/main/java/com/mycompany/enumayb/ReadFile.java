package com.mycompany.enumayb;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args){
        try {
            File objective = new File("ImpootantFile.txt");
            Scanner ayb = new Scanner(objective);
            
            while (ayb.hasNextLine()) {
                String data = ayb.nextLine();
                System.out.println(data);
            }
            ayb.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        
    }
}
