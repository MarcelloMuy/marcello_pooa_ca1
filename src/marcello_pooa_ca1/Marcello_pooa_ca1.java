/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package marcello_pooa_ca1;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Marce
 */
public class Marcello_pooa_ca1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Create a new 'File' object
        File studentsList = new File ("C:\\Users\\Marce\\Desktop\\students.txt");
//        Try-catch block, will create a new scanner object or catch an error
        try {
            Scanner myScanner = new Scanner(studentsList);
        } catch (Exception e) {
            System.out.println("Something went wrong!" + e);
        }
    }
    
}
