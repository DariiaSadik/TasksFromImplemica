package com.implemica.tasks.thirdTask;

import com.implemica.tasks.firstTask.FactorialUtil;
/**
 * Created by Dariia on 07.06.2016.
 */

public class SumHundredFactorial {
    private FactorialUtil factorialUtil = new FactorialUtil();

    public int sumHundredFactorial() {
        //create instance of the class FactorialUtils for using his methods in this class
        //finding factorial of number 100
        String hundred = factorialUtil.factorial(100).toString();

        //The string to convert to an array
        char [] arrayNumber = hundred.toCharArray();

        int sumNumbers = 0;

        //if the number we summarize the values, passing along the cycle
        for (char number : arrayNumber) {
            if (Character.isDigit(number))
                sumNumbers = sumNumbers + Character.getNumericValue(number);
        }
        return sumNumbers;
    }

    public void print(){

        //print result
        System.out.println(sumHundredFactorial());
    }
    public static void main(String[] args) {
        SumHundredFactorial sumHundredFactorial = new SumHundredFactorial();
        sumHundredFactorial.print();
    }
}
