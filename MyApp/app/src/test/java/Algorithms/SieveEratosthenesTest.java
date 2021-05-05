package Algorithms;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class SieveEratosthenesTest {

    @Test
    public void sieveErat() {
        List<Integer> primes = new ArrayList<Integer>();
        primes.add(2);
        primes.add(3);
        primes.add(5);
        primes.add(7);
        primes.add(11);
        primes.add(13);
        primes.add(17);
        primes.add(19);
        SieveEratosthenes sieve = new SieveEratosthenes();
        assertEquals(primes, sieve.sieveErat(19));
        assertEquals(primes, sieve.sieveErat(20));
        assertEquals(primes, sieve.sieveErat(21));
        assertEquals(primes.size(), sieve.sieveErat(21).size());

    }
}