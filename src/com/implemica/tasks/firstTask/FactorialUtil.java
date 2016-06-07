package com.implemica.tasks.firstTask;

import java.math.BigInteger;

/**
 * Created by Dariia on 07.06.2016.
 */
// public class to calculate the factorial number.
// This class we can use in another classes where necessary to calculate the factorial of a number

public class FactorialUtil {

    // this method to calculate factorial
    // where int n this is a number for which you want to find factorial
    public BigInteger factorial (int n) {
        BigInteger result = BigInteger.ONE;

        // if n equals one - return result who equals one
        if (n == 1) return result;

        //calculate factorial of number n according to the recurrence formula of factorial - (factorial(n-1)*n)
        result = factorial(n-1).multiply(BigInteger.valueOf(n));
        return result;
    }
}
