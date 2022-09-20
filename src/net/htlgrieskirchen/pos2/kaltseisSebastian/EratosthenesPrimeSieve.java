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
        for (int i = p; i < prime.size() ; i++) {

            if (p <= 0) {
                isprime = false;
            } else {
                if (p == 1 || p == 2) {
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
                System.out.println(p + " " + "Primzahl");
            } else {
                System.out.println(p + " " + "keine Primzahl");
            }
        }
      return true;
    }

    @Override
    public void printPrimes() {
        for (Integer o:prime) {
            System.out.println(o);

        }
    }
}
