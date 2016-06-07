package com.implemica.tasks.firstTask;

import java.util.Scanner;

/**
 * Created by Dariia on 07.06.2016.
 */
public class TestClass {
    private CatalanNumbers catalanNumbers;
    private int number;

    public void inputValue() throws IllegalArgumentException {

        //create instance of the class Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter a number, and press Enter");
        if(scanner.hasNextInt())
            number = scanner.nextInt();
        else
            throw new IllegalArgumentException("You did't enter a number, or number is not integer");
    }

    public void printResult() {

        //create instance of the class CatalanNumbers for using his method sumCatalanNumbers
        catalanNumbers = new CatalanNumbers();

        //we call the method inputValue() and output result
        inputValue();
        System.out.println("Catalan number for " + number + ": ");
        System.out.println(catalanNumbers.sumCatalanNumbers(number));
    }

    public void printOneHundred() {

        //create instance of the class CatalanNumbers for using his method sumCatalanNumbers
        catalanNumbers = new CatalanNumbers();

        //the output values of the first hundred
        for (int i = 1; i <= 100; i++){
            System.out.println(i + " = " + catalanNumbers.sumCatalanNumbers(i));
        }
    }

    public static void main(String[] args) {

        TestClass t = new TestClass();
        t.printResult();

        System.out.println("\nHundred");
        t.printOneHundred();


    }
}
