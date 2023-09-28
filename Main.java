//Nouf here i add main to make To ensure that the code works as intended

public class Main {
    public static void main(String[] args) {
        // Sample data and limits
        double[][][] data = {
            {{1, 2, 3}, {4, 5, 6}},
            {{7, 8, 9}, {10, 11, 12}}
        };
        
        double[][] limit = {
            {1, 2, 3},
            {4, 5, 6}
        };

        // Create an instance of SensorDataProcessor
        SensorDataProcessor processor = new SensorDataProcessor(data, limit);

        // Call the calculate method
        processor.calculate(2.0);
    }
}
