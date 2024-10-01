public class MinMaxCalculation {
    public static double[] minMax(double ... numbers) {
        double min = Double.POSITIVE_INFINITY;
        double max = Double.NEGATIVE_INFINITY;
        for (double n : numbers) {
            if (n < min) {
                min = n;
            }
            if (n > max) {
                max = n;
            }
        }
        double[] nums = {min, max};
        return nums;
    }
}
