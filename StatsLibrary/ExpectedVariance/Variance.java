package StatsLibrary.ExpectedVariance;

import StatsLibrary.CentralTendancies.CentralTendancies;
public class Variance {
    
    //Method for finding variance
    public static double findVariance(double[] x, int dataPoints){
        double varainaceTotal = 0;
        double mean = CentralTendancies.findMean(x);
        for (int i = 0; i < x.length - 1; i++){
            varainaceTotal += (x[i] - mean) * (x[i]- mean);
        }
        return varainaceTotal/dataPoints;
    }
    // Method to print a readable array
    public static void printArray(double[] array){
        for (int i = 0; i < array.length; i++) {
            if (i==array.length-1){
                System.out.print(array[i] + "");
            }
            else
            System.out.print(array[i] + ", ");
        }
    }
}
