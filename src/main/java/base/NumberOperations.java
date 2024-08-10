package base;

import java.math.BigDecimal;
import java.math.BigInteger;

import static java.lang.Math.abs;
public class NumberOperations {
    public static Integer find(int[] array, int value) {
        //Integer index =  new Integer(null) -- this is a wrong way of initialisation
        Integer index = null;
        for (int i = 0; i < array.length; ++i) {
            if (array[i] == value) {
                index = i;
                break;
            } else {
                index = null;
            }
        }
        return index;
    }
    public static Integer find(double[] array, double value, double eps) {
        Integer index = null;
        double difference;
        for (int i = 0; i < array.length; ++i){
            difference = abs(array[i] - value);
            if (difference <= eps) {
                index = i;
                break;
            } else {
                index = null;
            }
        }
        return index;
    }
    public static Double calculateDensity(double weight, double volume, double min, double max) {
        double density;
        Double answer;
        density = weight/volume;
        if ((density >= min)&&(density <= max)) {
            answer = density;
        } else {
            answer = null;
        }
        return answer;
    }
    public static Integer find(BigInteger[] array, BigInteger value) {
        Integer index = null;
        for (int i =0; i < array.length; i++) {
            if (value.equals(array[i])) {
                index = i;
                break;
            } else {
                index = null;
            }
        }
        return index;
    }
    public static BigDecimal calculateDensity(BigDecimal weight, BigDecimal volume, BigDecimal min, BigDecimal max) {
        BigDecimal density;
        density = weight.divide(volume);
        if ( (density.abs().compareTo(min) >=0) && (density.abs().compareTo(max) <= 0) ) {
            return density;
        } else {
            return null;
        }
    }
}
