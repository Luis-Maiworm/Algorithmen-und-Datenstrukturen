package Algorithms;

import org.junit.Test;

import static org.junit.Assert.*;

public class GCDEuclidSubtractionRecTest {

    @Test
    public void calc() {
        GCDEuclidSubtractionRec gcd = new GCDEuclidSubtractionRec();
        assertEquals(12, gcd.calc(36,12));
        assertEquals(300, gcd.calc(900,1200));
        assertEquals(15, gcd.calc(30,45));
        assertEquals(24, gcd.calc(96,216));
        assertEquals(99, gcd.calc(495,891));
    }
}