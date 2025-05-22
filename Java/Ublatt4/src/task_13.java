import java.util.Arrays;

public class task_13 {
    public static void main(String[] args) {
        testnormalized(3, 9, 1, 2, 3, 4, 5, 15, 18, 21, 24, 27);
        testnormalized(0, 1, -2, -1, 0, 0.5, 0.6, 0.7, 0.8, 0.9, 1.5, 2.5, 3.5, 4.5, 6.5);
        testnormalized(1, 5, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    }

    static double normalized(double min, double max, double value) {
        if (value <= min) {
            return 0.0;
        } else if (value >= max) {
            return 1.0;
        } else {
            return (value - min) / (max - min);
        }
    }

    static double[] normalized(double min, double max, double... values) {
        double[] res = new double[values.length];
        for (int i = 0; i < values.length; i++) {
            res[i] = normalized(min, max, values[i]);
        }
        return res;
    }

    static void testnormalized(double min, double max, double... values) {
        System.out.println("normalized:");
        System.out.println("min = " + min + ", max = " + max + ", values =" + Arrays.toString(values));
        System.out.println("Result = " + Arrays.toString(normalized(min, max, values)));
    }

    static double denormalized(double min, double max, double normalizedValue) {
        if (normalizedValue < 0) {
            return 0.0;
        } else if (normalizedValue > 1) {
            return 1.0;
        } else {
            return min + (max - min) * normalizedValue;
        }
    }

    static boolean isNormalized(double... values) {
        for (double v : values) {
            if (v < 0 || v > 1) {
                return false;
            }
        }
        return true;
    }
}