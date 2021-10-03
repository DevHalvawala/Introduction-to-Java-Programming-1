/* (Mersenne prime)A prime number is called a Mersenne prime if it can be written
in the form for some positive integer p. Write a program that finds all
Mersenne primes with and displays the output as follows
p      2^p – 1
2      3
3      7
5      31
...*/

//20CS018 - DEV HALVAWALA

public class Exercise05_28 {
  // Main method 
    public static void main(String[] args) {
      // Displaying table header
        System.out.println("\np           2^p-1");

        // Displaying all Mersenne primes with p <= 31
        for (int p = 2; p <= 31; p++) {
            if (isPrime(p)) {
              System.out.printf("%-13d", p);
              System.out.println(mersennePrime(p));
            }
          }
        }
      //Check whether number is prime
        public static boolean isPrime(long n) {
          if (n < 2)
            return false;
          for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
              //Number is not prime
              return false;
          }
          //Number is prime
          return true;
        }
      // Function to generate mersenne
      //Method of Mersenne Prime number
        public static int mersennePrime(int num) {
          return (int) Math.pow(2, num) - 1;
        }
    }

