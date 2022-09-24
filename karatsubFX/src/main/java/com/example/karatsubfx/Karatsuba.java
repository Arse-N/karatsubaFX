package com.example.karatsubfx;

import java.math.BigInteger;

/** Class Karatsuba **/
public class Karatsuba
{
    /** Function to multiply two numbers **/

    public long multiply(long x, long y)
    {
        if (x < 10 && y < 10) {

            // Multiplying the inputs entered
            return x * y;
        }

        // Declaring variables in order to
        // Find length of both integer
        // numbers x and y
        int noOneLength = numLength(x);
        int noTwoLength = numLength(y);

        // Finding maximum length from both numbers
        // using math library max function
        int maxNumLength
                = Math.max(noOneLength, noTwoLength);

        // Rounding up the divided Max length
        Integer halfMaxNumLength
                = (maxNumLength / 2) + (maxNumLength % 2);

        // Multiplier
        long maxNumLengthTen
                = (long)Math.pow(10, halfMaxNumLength);

        // Compute the expressions
        long a = x / maxNumLengthTen;
        long b = x % maxNumLengthTen;
        long c = y / maxNumLengthTen;
        long d = y % maxNumLengthTen;


        // Compute all mutilpying variables
        // needed to get the multiplication
        long z0 = multiply(a, c);
        long z1 = multiply(a + b, c + d);
        long z2 = multiply(b, d);

        long ans = (z0 * (long)Math.pow(10, halfMaxNumLength * 2) +
                ((z1 - z0 - z2) * (long)Math.pow(10, halfMaxNumLength) + z2));

        return ans;
    }

    public static int numLength(long n)
    {
        int noLen = 0;
        while (n > 0) {
            noLen++;
            n /= 10;
        }

        // Returning length of number n
        return noLen;
    }
    /** Function to calculate length or number of digits in a number **/
//    public int getSize(long num)
//    {
//        int ctr = 0;
//        while (num != 0)
//        {
//            ctr++;
//            num /= 10;
//        }
//        return ctr;
//    }
}
