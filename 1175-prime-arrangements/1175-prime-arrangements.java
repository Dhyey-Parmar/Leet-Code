class Solution {

    public boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public int numPrimeArrangements(int n) {

        int prime = 0;

        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                prime++;
            }
        }

        int nonPrime = n - prime;

        long ans = 1;

        for (int i = 1; i <= prime; i++) {
            ans = ans * i;
            ans = ans % 1000000007;
        }

        for (int i = 1; i <= nonPrime; i++) {
            ans = ans * i;
            ans = ans % 1000000007;
        }

        return (int) ans;
    }
}