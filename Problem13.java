import java.util.Scanner;

// Take an integer N as input and print the count of its factors. The factor of a number is the number that divides it perfectly leaving no remainder.

// Example: 1, 2, 3, and 6 are factors of 6

// Input Format

// The first and only line of input contains a single integer N.

// Constraints

// 1 <= N <= 300

// Output Format

// Print the count of factors of N.

// Sample Input 0

// 5
// Sample Output 0

// 2
// Explanation 0

// Factors of 5 are 1 and 5.

// Sample Input 1

// 10
// Sample Output 1

// 4

public class Problem13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input1 = scanner.nextInt();
        int count = 0;
        
        // Loop up to square root of N
        for (int i = 1; i * i <= input1; i++) {
            if (input1 % i == 0) {
                // If 'i' is a factor, increment the count
                count++;
                // If 'i' is not the square root of N, then N/i is also a factor
                if (i != input1 / i) {
                    count++;
                }
            }
        }

        // Output the count of factors
        System.out.println(count);

        scanner.close();
    }
}
