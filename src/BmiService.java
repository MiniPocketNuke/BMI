public class BmiService {
    public double calculate(double height, int weight) {
        return (int) (weight / Math.pow(height,2));
    }
}
