package Practice;

class Solution {
  public long prime_Sum(int n) {
    if (n < 2)
      return 0; // No prime numbers below 2

    boolean[] isPrime = new boolean[n + 1];
    for (int i = 2; i <= n; i++) {
      isPrime[i] = true; // Assume all numbers are prime
    }

    for (int p = 2; p * p <= n; p++) {
      if (isPrime[p]) {
        for (int i = p * p; i <= n; i += p) {
          isPrime[i] = false; // Mark multiples as non-prime
        }
      }
    }

    long sum = 0;
    for (int i = 2; i <= n; i++) {
      if (isPrime[i]) {
        sum += i; // Add prime numbers to sum
      }
    }
    return sum;
  }

  public static void main(String[] args) {
    Solution obj = new Solution();
    int n = 10; // Example input
    System.out.println("Sum of primes up to " + n + ": " + obj.prime_Sum(n));
  }
}
