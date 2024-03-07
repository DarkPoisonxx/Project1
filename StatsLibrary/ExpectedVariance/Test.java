package StatsLibrary.ExpectedVariance;

public class Test {
    public static void main(String[] args) {
        double[] x = {1,2,3,4,5,6};
        System.out.println("The varaince of: " );
        Variance.printArray(x);
        double variance;
        //Find Variance Test
        variance = Variance.findVariance(x,3);
        System.out.println("\n" +  "is: " + variance);

        //find Expected Test
        System.out.println(Expected.findExpected(x));

        //Find Deviation Test
        System.out.println("Deviation: " + StandatdDeviation.findDeviation(variance));
        System.out.println("Deviation: " + StandatdDeviation.findDeviation(x,3));
    }   
}
