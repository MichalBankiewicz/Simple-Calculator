package pl.akademiakodu.AK_Spring_ExerciseMethod_BasicCalculator.models;

import javax.crypto.MacSpi;

public class CalculatorAverage {

    public int squareOf(int a) {
//        //todo implement method
//        return 0;
        return (int) Math.pow(a, 2);
    }

    public int elementOf(int a) {
//        //todo implement method
//        return 0;
        int result = (int) Math.sqrt(a);
        return result;
    }

    public int factorial(int a) {
//        //todo implement method
//        return 0;
        int sum = 1;
        for (int i = 2; i <= a; i++) {
            sum = sum * i;
        }
        return sum;
    }

    public boolean isPrimeNumber(int a) {
        for (int i = 2; i < a; i++) {
            if (a % i == 0)
                return false;
        }
            return true;

        }
    }

