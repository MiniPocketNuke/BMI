public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double HeightMeters = 1.87;
        int WeightKilograms = 98;
        int index = (int) service.calculate(HeightMeters, WeightKilograms);
        System.out.println(index);
    }
}
