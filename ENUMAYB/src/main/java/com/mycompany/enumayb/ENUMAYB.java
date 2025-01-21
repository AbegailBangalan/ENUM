/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.enumayb;

/**
 *
 * @author Student
 */
public class ENUMAYB {
    
    enum CupSize {
        SMALL,
        MEDIUM,
        LARGE
    }

    public static void main(String[] args) {
        CupSize myVar = CupSize.MEDIUM;
        
        switch(myVar) {
            case SMALL:
                System.out.println("Small 12oz");
                break;
            case MEDIUM:
                System.out.println("Medium 16oz");
                break;
            case LARGE:
                System.out.println("Large 22oz");
                break;
                
        }
    }
}
