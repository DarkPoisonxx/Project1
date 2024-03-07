package StatsLibrary.ExpectedVariance;

import StatsLibrary.CentralTendancies.CentralTendancies;

public class StandatdDeviation {
    //finding deviation with variance method
    public static double findDeviation(double variance){
        return Math.sqrt(variance);
    }

    //Finding deviation with array 
    public static double findDeviation(double[] x,int n){
        double varainaceTotal = 0;
        double mean = CentralTendancies.findMean(x);
        for (int i = 0; i < x.length - 1; i++){
            varainaceTotal += (x[i] - mean) * (x[i]- mean);
        }
        double variance = varainaceTotal/n;
        return Math.sqrt(variance);
    }
}
