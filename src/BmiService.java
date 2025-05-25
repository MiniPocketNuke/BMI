public class BmiService {
    public int calculate(double height, int weight) { // Changes
        return (int) (weight / Math.pow(height,2)); // Changes
    }
}
