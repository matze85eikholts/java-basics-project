package net.thumbtack.school.base;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

public class TestNumberOperations {

    @Test
    public void testFindInteger() {
        assertEquals((Integer) 3, NumberOperations.find(new int[]{0, 2, 4, 6, 8}, 6));
        assertEquals((Integer) 4, NumberOperations.find(new int[]{0, 2, 4, 6, 8}, 8));
        assertEquals((Integer) null, NumberOperations.find(new int[]{0, 2, 4, 6, 8}, 10));
        assertEquals((Integer) null, NumberOperations.find(new int[]{}, 1));
    }

    @Test
    public void testFindDouble() {
        assertEquals((Integer) 3, NumberOperations.find(new double[]{0, 2, 4, 6, 8}, 6, 1E-6));
        assertEquals((Integer) 4, NumberOperations.find(new double[]{0, 2, 4, 6, 8}, 8, 1E-4));
        assertEquals((Integer) null, NumberOperations.find(new double[]{0, 2, 4, 6, 8}, 10, 1));
        assertEquals((Integer) null, NumberOperations.find(new double[]{}, 1, 100));
    }

    @Test
    public void testFindBigInteger() {
        assertEquals((Integer) 3, NumberOperations.find(new BigInteger[]{
                        new BigInteger("0"),
                        new BigInteger("22222222222222222222222222222222222"),
                        new BigInteger("4444444444444444444444444444444444444444444444444444"),
                        new BigInteger("6666666666666666666666666666666666666666666666666666666666666666666666666666666"),
                        new BigInteger("8888888888888888888888888888888888888888888888888888888888888888888888888")},
                        new BigInteger("6666666666666666666666666666666666666666666666666666666666666666666666666666666")
        ));
        assertEquals((Integer) 4, NumberOperations.find(new BigInteger[]{
                        new BigInteger("0"),
                        new BigInteger("22222222222222222222222222222222222"),
                        new BigInteger("4444444444444444444444444444444444444444444444444444"),
                        new BigInteger("6666666666666666666666666666666666666666666666666666666666666666666666666666666"),
                        new BigInteger("8888888888888888888888888888888888888888888888888888888888888888888888888")},
                        new BigInteger("8888888888888888888888888888888888888888888888888888888888888888888888888")
        ));
        assertEquals((Integer) null, NumberOperations.find(new BigInteger[]{
                        new BigInteger("0"),
                        new BigInteger("22222222222222222222222222222222222"),
                        new BigInteger("4444444444444444444444444444444444444444444444444444"),
                        new BigInteger("6666666666666666666666666666666666666666666666666666666666666666666666666666666"),
                        new BigInteger("8888888888888888888888888888888888888888888888888888888888888888888888888")},
                        new BigInteger("999999999999999999999999999999999999999999999999999999999999999999999999999")
        ));
        assertEquals((Integer) null, NumberOperations.find(new BigInteger[]{}, new BigInteger("999999999999999999999999999999999999999999999999999999999999999999999999999")));
    }

    @Test
    public void testCalculateDensityDouble() {
        assertEquals((Double) 3.5, NumberOperations.calculateDensity(7, 2, -10, 10));
        assertEquals((Double) null, NumberOperations.calculateDensity(700, 2, -10, 10));
        assertEquals((Double) null, NumberOperations.calculateDensity(1E-6, 2, 1, 10));
    }

    @Test
    public void testCalculateDensityBigDecimal() {
        assertEquals(new BigDecimal(3.5), NumberOperations.calculateDensity(new BigDecimal("7E10000"), new BigDecimal("2E10000"), new BigDecimal(-10), new BigDecimal(10)));
        assertEquals((BigDecimal) null, NumberOperations.calculateDensity(new BigDecimal("7E1002"), new BigDecimal("2E1000"), new BigDecimal(-10), new BigDecimal(10)));
        assertEquals((BigDecimal) null, NumberOperations.calculateDensity(new BigDecimal("1E-6000"), new BigDecimal("2E-1000"), new BigDecimal(1), new BigDecimal(10)));
    }
}
