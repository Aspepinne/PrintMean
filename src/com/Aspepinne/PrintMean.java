package com.Aspepinne;

public class PrintMean {

    public static void main(String[] args) {
        // heltalsdivision (skriver int istället för double)
        System.out.println("Mean of 1, 1, 3, 3: " + meanCalc(1d , 1d , 3d , 3d));
        System.out.println("Mean of 1, 2, 3, 4: " + meanCalc(1d , 2d , 3d , 4d));
        System.out.println("Mean of 1, -2, 3, -4: " + meanCalc(1d , -2d , 3d , -4d));
        System.out.println("Mean of -1, -11, 24, 2: " + meanCalc(-1d , -11d , 24d , 2d));
    }

    public static String meanCalc(double a, double b, double c, double d){
        // Test
        double mean = (a+b+c+d) / 4;
        String meanString = String.valueOf(mean);
        return meanString;
    }
}
