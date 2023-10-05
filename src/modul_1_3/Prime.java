package modul_1_3;
/*
10.11 Primtal
Skriv et program der udregner alle primtal under 1.000.000 og udskriver det
største.
Gør dette ved at implementere Eratosthenes Si
Kvadratroden af i udregnes som java.lang.Math.sqrt(i).

WIKI:
In mathematics, the sieve of Eratosthenes is an ancient algorithm for finding all prime numbers up to any given limit.

It does so by iteratively marking as composite (i.e., not prime) the multiples of each prime, starting with the first prime number, 2.
The multiples of a given prime are generated as a sequence of numbers starting from that prime, with constant difference between them that is equal to that prime.[1]
This is the sieve's key distinction from using trial division to sequentially test each candidate number for divisibility by each prime.[2]
Once all the multiples of each discovered prime have been marked as composites, the remaining unmarked numbers are primes.

The earliest known reference to the sieve (Ancient Greek: κόσκινον Ἐρατοσθένους, kóskinon Eratosthénous) is in Nicomachus of Gerasa's Introduction to Arithmetic,[3]
an early 2nd cent. CE book which attributes it to Eratosthenes of Cyrene, a 3rd cent. BCE Greek mathematician,
though describing the sieving by odd numbers instead of by primes.[4]

One of a number of prime number sieves, it is one of the most efficient ways to find all of the smaller primes.
It may be used to find primes in arithmetic progressions.[5]


A prime number is a natural number that has exactly two distinct natural number divisors: the number 1 and itself.

To find all the prime numbers less than or equal to a given integer n by Eratosthenes' method:

Create a list of consecutive integers from 2 through n: (2, 3, 4, ..., n).
Initially, let p equal 2, the smallest prime number.
Enumerate the multiples of p by counting in increments of p from 2p to n, and mark them in the list (these will be 2p, 3p, 4p, ...;
the p itself should not be marked).
Find the smallest number in the list greater than p that is not marked. If there was no such number, stop. Otherwise, let p now equal this new number
(which is the next prime), and repeat from step 3.
When the algorithm terminates, the numbers remaining not marked in the list are all the primes below n.
The main idea here is that every value given to p will be prime, because if it were composite it would be marked as a multiple of some other,
smaller prime. Note that some of the numbers may be marked more than once (e.g., 15 will be marked both for 3 and 5).

As a refinement, it is sufficient to mark the numbers in step 3 starting from p2, as all the smaller multiples of p will have already been marked at that point.
This means that the algorithm is allowed to terminate in step 4 when p2 is greater than n.[1]

Another refinement is to initially list odd numbers only, (3, 5, ..., n), and count in increments of 2p in step 3, thus marking only odd multiples of p.
This actually appears in the original algorithm.[1][4] This can be generalized with wheel factorization,
forming the initial list only from numbers coprime with the first few primes and not just from odds (i.e., numbers coprime with 2),
and counting in the correspondingly adjusted increments so that only such multiples of p are generated that are coprime with those small primes,
in the first place.[7]

 */

import java.util.Arrays;
public class Prime {
    public static void main(String[] args) { // NOTE This method is finding all NOT PRIMES
        // It is doing this by making a list of all multiples of primes.
        // since multiples of divisors larger than the sqrt of n are not neccesary they are already there, since they have smaller divisors.
        // I.E. First not prime 4 is 2*2, second not prime is 6 (2*2*2 or 3*2) etc
        int n = 1_000_000;
        double sqrtn = java.lang.Math.sqrt(n);// we need the sqrt because any divisor greater than this would be detected
        // by its smaller "partner divisor" i.e n = 81, 3*27, 9*9 , 27*3 (already detected)
        boolean[] is_Prime = new boolean[n]; // an array with primes
        Arrays.fill(is_Prime, true); // starts with all true - so we only fill in the not primes
        for (int i = 2; i < sqrtn; i++) {
            if (is_Prime[i]) {
                for (int j = i * i; j < n; j = j + i) {
                    is_Prime[j] = false;


                }
            }
        }

        for (int k = n - 1; k > 1; k--) {
            if (is_Prime[k]) {
                System.out.println("Highest prime is: " + (k));
                break;
            }
        }

/*
        // Following is a total printout from top to buttom.
        for (int k = n - 1; k > 1; k--) {
            if (is_Prime[k]) {
                System.out.println(k);
            }
        }
 */
    }
}







