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
    private static final Scanner SC = new Scanner(System.in);//initialise public Scanner and give it the name SC
    
    public static void main(String[] args) {
//        regExCheck();
//        stringCheck();
//        positiveInt();
//        nextDouble();
//        nextFloat();
//        nextBoolean();
//        nextByte();
        test();

    }
    
    public static void test(){//start of method
//        Write a short program which asks a user for 10 ages (ints), stores 
//        them and returns the average (double).

        //declare variable int for user age
        int iInput = 0, iAge = 0, iCount = 0;
        
        //declare double for average age 
        double dAverage;
        
            do { //do while loop runs code before condition check
                System.out.println("Enter " + (10-iCount) + " age(s)"); //user prompt
                               
                while((!SC.hasNextInt() && (iInput < 0) || (iInput > 120))){        //checks user input
                    System.out.println("Must be an integer between 0 and 120");     //to make sure its 
                    SC.next();                                                      //an integer
                }
                
                iInput = SC.nextInt();
                iAge += iInput; //adds value of user input to iAge
                iCount++; //adds +1 to counter
            }while(iCount < 10); //checks counter to make sure less than 10
            
            dAverage = iAge/iCount;
            
        System.out.print("Average is: " + dAverage + "\n");    
    }//end of method
    
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
    
    public static void nextDouble(){
        double num;
        
        System.out.print("Enter a double: ");
       
        while (!SC.hasNextDouble()) {//while Scanners input is not a decimal
                System.out.println("Must be a decimal number");//
                SC.next();//advances Scanner to next line. hasNext will not advance to next line so program will get caught in loop
        
        }
        num = SC.nextDouble();

        System.out.println("Your number is: " + num);    
    }
    
    public static void nextFloat(){
        float num;
        
        do {// a do while loop will run through the code before performing the logic check
            System.out.print("Enter a float: ");
            while (!SC.hasNextFloat()) {//while Scanners input is not a decimal
                System.out.println("Must be a floating point number");//
                SC.next();//advances Scanner to next line. hasNext will not advance to next line so program will get caught in loop
            }
            num = SC.nextFloat();
        } while (num <= 0);//will run the loop unit the number is greater than or equal to 0 

        System.out.println("Your number is: " + num);    
    }
    
    public static void nextByte(){
        byte bByte;
            
        System.out.print("Enter a byte: ");
        
        while (!SC.hasNextDouble()) {//while Scanners input is not a decimal
                System.out.println("Must be a byte");//
                SC.next();//advances Scanner to next line. hasNext will not advance to next line so program will get caught in loop
        }
        bByte = SC.nextByte();

        System.out.println("Your byte is: " + bByte);    
    }
    
    public static void nextBoolean(){
        boolean bool;
        
        System.out.print("Enter a boolean: ");
        while (!SC.hasNextBoolean()) {//while Scanners input is not a decimal
                System.out.println("Must be a boolean");//
                SC.next();//advances Scanner to next line. hasNext will not advance to next line so program will get caught in loop
            }
        bool = SC.nextBoolean();

        System.out.println("Your byte is: " + bool);    
    }
    
}
