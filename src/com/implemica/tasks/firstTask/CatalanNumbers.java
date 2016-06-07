package com.implemica.tasks.firstTask;

import java.math.BigInteger;

/**
 * Created by Dariia on 07.06.2016.
 */
// public class to calculate the catalan number.
// the Catalan numbers form a sequence of natural numbers that occur in various counting problems,
// often involving recursively-defined objects.
// This class we'll be use with class FactorialUtil for to calculate the factorial of a number

public class CatalanNumbers {

    //this method to calculate Catalan numbers
    //where int countN this is a number for which you want to calculate Catalan number
    public BigInteger sumCatalanNumbers(int countN) {

        //create instance of the class FactorialUtils for using his methods in this class
        FactorialUtil factorial = new FactorialUtil();

        //return Catalan number
        return factorial.factorial(2 * countN).divide(factorial.factorial(countN).multiply(factorial.factorial(countN + 1)));
    }
}
