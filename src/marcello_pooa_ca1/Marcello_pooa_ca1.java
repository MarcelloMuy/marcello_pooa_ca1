/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package marcello_pooa_ca1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
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
        File statusList = new File ("C:\\Users\\Marce\\Desktop\\status.txt");
//        

//        Try-catch block, will create a new scanner and new BufferedWriter object or catch an error
            try (Scanner myScanner = new Scanner(studentsList);
                 BufferedWriter writer = new BufferedWriter(new FileWriter(statusList))) {
//                Loops through the student's information 3 lines at time
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
//                    Check for 2 names
                    if (names.length == 2) {
//                        Check for only letters in the first name
                         if (names[0].matches("[a-zA-Z]+")) {
//                             Check for only letters and numbers in the last name
                            if (names[1].matches("[a-zA-Z0-9]+")) {
//                                Get a string with the two names
                                String name = names[0] + " " + names[1];
//                                 Validates classes integer
                                if (classes >= 1 && classes <= 8) {
//                                    Validates student number
                                    if (studentNumber.matches("\\d{2}[A-Za-z]{2,4}\\d+")) {
//                                        Write information in status.txt
                                        try {
                                        writer.write(studentNumber+" - "+names[1]);                                      
                                        writer.newLine();
                                        String classesString = String.valueOf(classes);
                                        writer.write(classesString);
                                        writer.newLine();
                                        System.out.println( name + " information added to status.txt");
                                        } catch (Exception e) {
                                        System.out.println("Something went wrong!" + e);
                                        }
                                    } else {
                                        System.out.println("Can't add " +names[0] + " " +names[1] + " information, (" + studentNumber + ") is a invalid student number");
                                    }                                    
                                } else {
                                    System.out.println("Can't add " +names[0] + " " +names[1] + " information, number of classes should be between 1 and 8");
                                }
                            } else {
                                System.out.println("Can't add " +names[0] + " " +names[1]+ " information, second name should only contain numbers or letters!");
                            }
                        } else {
                            System.out.println("Can't add " +names[0] + " " +names[1]+ " information, first name does not have only letters!");
                        }
                    } else {
                        System.out.println("Can't add " +names[0] + " information, does not have two names!");
                    }

                    System.out.println();
                }             
            } catch (Exception e) {
            System.out.println("Something went wrong!" + e);
            }
    }
    
}
