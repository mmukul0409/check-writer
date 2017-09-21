package com.app.checkwriter;

/**
 * Main class for Running the Application
 * @author Mukul Mangla
 *
 */

import java.util.Scanner;

public class CheckWriterApplication {
    @SuppressWarnings("resource")
    public static void main(final String[] args) {
        EnglishCheckWriter checkWriter = new EnglishCheckWriter();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number :");
        double number = scanner.nextDouble();
        String valueInWords = checkWriter.processNumber(number);
        System.out.println("English Equivalent : " + valueInWords);
    }
}
