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
    public static final Scanner SC = new Scanner(System.in);//initialise public Scanner and give it the name SC
    
    public static void main(String[] args) {
        regExCheck();
//        stringCheck();
//        positiveInt();
    }
    
    public static void positiveInt(){ //public access, static so we can call it in the main (above), void because we aren't expacting a return type
        int num; //declare an int called number
        
        do {// a do while loop will run through the code before performing the logic check
            System.out.print("Enter a positive number: ");
            while (!SC.hasNextInt()) {//while Scanners input is not a whole number i.e.
                System.out.println("Must be a number");//
                SC.next();//advances Scanner to next line. hasNext will not advance to next line so program will get caught in loop
            }
            num = SC.nextInt();
        } while (num <= 0);//will run the loop unit the number is greater than or equal to 0 

        System.out.println("Your positive number is: " + num);
    }//end of positiveInt method
    
    public static void stringCheck() {//will check for matching Strings
        System.out.println("Please enter a String");
        
        while(!SC.hasNext("word")){
            System.out.println("String does not match");
            SC.nextLine();//advances Scanner to next line. hasNext will not advance to next line so program will get caught in loop
        }//end of while loop
        
        String string = SC.nextLine();
        System.out.println("We have a match " + string);
    }//end of stringCheck
    
        public static void regExCheck() {//will check for regular expression
        System.out.println("Please enter a sentance");
        
        while(!SC.hasNext("[willCheckForAnyLettersInHere]")){
            System.out.println("No matches Found");
            SC.nextLine();//advances Scanner to next line. hasNext will not advance to next line so program will get caught in loop
        }//end of while loop
        
        String string = SC.nextLine();
        System.out.println("We have a match " + string);
    }//end of stringCheck
    
}
