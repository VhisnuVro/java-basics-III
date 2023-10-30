
// You are given an integer N you need to print all the Prime Numbers between 1 and N.

// Prime numbers are numbers that have only 2 factors: 1 and themselves. For example, the first 5 prime numbers are 2, 3, 5, 7, and 11.

// Input Format

// First and only line of input contains a single integer N.

// Constraints

// 1 <= N <= 300

// Output Format

// Print all the prime numbers between between 1 and N each in a new line.

// Sample Input 0

// 5
// Sample Output 0

// 2
// 3
// 5
// Explanation 0

// Prime numbers between [1, 5] are (2, 3, 5).

// Sample Input 1

// 10
// Sample Output 1

// 2
// 3
// 5
// 7
// Explanation 1

// Prime numbers between [1, 10] are (2, 3, 5, 7)

import java.util.Scanner;

public class Problem18 {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for (int i = 2; i <= N; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }

        scanner.close();

        
    }
}
