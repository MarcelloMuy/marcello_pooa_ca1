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
//            Loops through the student's information 3 lines at time
            while (myScanner.hasNextLine()) {
//                Student full name
                String fullName = myScanner.nextLine();
//                Student classes
                int classes = Integer.parseInt(myScanner.nextLine());
//                Student number
                String studentNumber = myScanner.nextLine();
//                Validates the first line that contains the student's name
//                Gives an appropriate error message
                String[] names = fullName.split(" ");
                if (names.length == 2) {
                    System.out.println("Has two names");
                    if (names[0].matches("[a-zA-Z]+")) {
                        System.out.println("First Name has only letters");
                        if (names[1].matches("[a-zA-Z0-9]+")) {
                            System.out.println("Second name contain numbers or letters");
                        } else {
                            System.out.println("Sorry, second name should only contain numbers or letters!");
                        }
                    } else {
                        System.out.println("Sorry, first name does not have only letters!");
                    }
                } else {
                    System.out.println("Sorry, does not have two names!");
                }
                
                System.out.println();
        }
        } catch (Exception e) {
            System.out.println("Something went wrong!" + e);
        }
    }
    
}
