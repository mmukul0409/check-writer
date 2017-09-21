package com.app.checkwriter;

import java.util.InputMismatchException;

/**
 * Main class for Running the Application
 * @author Mukul Mangla
 *
 */

import java.util.Scanner;

public class CheckWriterApplication {
    @SuppressWarnings("resource")
    public static void main(final String[] args) {
        double number = 0;
        EnglishCheckWriter checkWriter = new EnglishCheckWriter();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number :");
        try{
            number = scanner.nextDouble();
        }catch(InputMismatchException e){
            System.out.println(Constants.INVALID_NUMBER);
            System.exit(0);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        String valueInWords = checkWriter.processNumber(number);
        System.out.println("English Equivalent : " + valueInWords);
    }
}
