package net.htlgrieskirchen.pos2.kaltseisSebastian;

import java.awt.*;
import java.lang.reflect.Array;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.List;

public class EratosthenesPrimeSieve implements PrimeSieve {

    int menge;
    private List<Integer> prime = new ArrayList();
    private int counter = 0;

    public EratosthenesPrimeSieve(int menge) {
        prime.add(menge);
    }

    @Override
    public boolean isPrime(int p) {

        boolean isprime;
        for (int i = p; i < prime.get(menge) ; i++) {

            if (prime.get(menge)  <= 0) {
                isprime = false;
            } else {
                if (prime.get(menge) == 1 || p == 2) {
                    isprime = true;


                } else {
                    isprime = true;

                    for (int x = 2; x < p; x++) {
                        if (p % x == 0) {
                            isprime = false;
                            break;
                        }
                    }
                }
            }

            if (isprime) {
               printPrimes();
            }
        }
      return true;
    }

    @Override
    public void printPrimes() {
        for (int i = 0; i < prime.get(menge); i++) {
            counter++;
            isPrime(prime.get(menge));
            System.out.println(counter);
        }
    }
}
