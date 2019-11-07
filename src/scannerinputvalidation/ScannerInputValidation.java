/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scannerinputvalidation;

import java.util.Scanner;

/**
 *
 * @author MC03353
 */
public class ScannerInputValidation {

    public static void main(String[] args) {
        
        positiveInt();
    }
    
    public static void positiveInt(){ //public access, static so we can call it in the main (above), void because we aren't expacting a return type
        Scanner sc = new Scanner(System.in); //initialise Scanner and give it the name sc
        int num; //declare an int called number
        
        do {
            System.out.print("Enter a positive number: ");
            while (!sc.hasNextInt()) {//while Scanners input is not a whole number i.e.
                System.out.println("Must be a number");//
                sc.next(); //you need this otherwise wil not break from loop
            }
            num = sc.nextInt();
        } while (num <= 0);//will run the loop unit the number is greater than or equal to 0 

        System.out.println("Your positive number is: " + num);
    }
}
