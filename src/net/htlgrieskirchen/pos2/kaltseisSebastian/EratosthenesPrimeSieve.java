package net.htlgrieskirchen.pos2.kaltseisSebastian;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class EratosthenesPrimeSieve implements PrimeSieve {


    int menge;
    ArrayList prime = new ArrayList();
    private int counter = 0;

    public EratosthenesPrimeSieve(int menge) {
        this.menge = menge;
    }

    @Override
    public boolean isPrime(int p) {

        if(p==0||p==1)
        {
            return false;
        }

        if(p==2||p==3||p==5)
        {
            prime.add(p);
            return false;
        }

        if(p%2 == 0)
        {
            return false;
        }

        if(p%3 == 0)
        {
            return false;
        }

        if(p%5 == 0)
        {
            return false;
        }


        return true;
    }

    @Override
    public void printPrimes() {
        for (int i = 0; i < prime.size(); i++) {
            System.out.println(prime.get(i));
        }
    }
}
