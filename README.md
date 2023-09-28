# SensorDataProcessor
Nouf Mohammed Aljedaani 2110018
Abrar Omar Alamoudi 2110876

import java.io.BufferedWriter;
import java.io.FileWriter;

public class SensorDataProcessor {
private double[][][] data;
private double[][] limit;

    public SensorDataProcessor(double[][][] data, double[][] limit) {
        this.data = data;
        this.limit = limit;
    }

    private double average(double[] array) {
        double sum = 0;
        for (double value : array) {
            sum += value;
        }
        return sum / array.length;
    }