package net.htlgrieskirchen.pos2.kaltseisSebastian;

public class EratosthenesPrimeSieve implements PrimeSieve {


    int menge;
    private int[]prime;
    private int counter = 0;

    public EratosthenesPrimeSieve(int menge) {
        this.menge = menge;
    }

    @Override
    public boolean isPrime(int p) {

        if (p <= 2) {
            return (p == 2);
        }
        for (int i = 2; i * i <= p; i++) {
            if (p % i == 0) {
                counter++;
                return false;
            }
        }
        return true;
    }

    @Override
    public void printPrimes() {

    }
}
