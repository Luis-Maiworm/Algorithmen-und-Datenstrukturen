package Algorithms;

import java.util.ArrayList;
import java.util.List;

public class SieveEratosthenes {

    public List<Integer> sieveErat(int a) {

        boolean[] isPrimeNumber = new boolean[a + 1];
        List<Integer> primes = new ArrayList<Integer>();
        for (int i = 2; i <= a; i++) {
            isPrimeNumber[i] = true;
        }
        for (int i = 2; i <= a; i++) {
            if (isPrimeNumber[i]) {
                primes.add(i);
                for (int j = i; j * i <= a; j++) {
                    isPrimeNumber[i * j] = false;
                }
            }
        }
        return primes;
    }
}
