
// Take an integer N as input, print the corresponding stair pattern for N.

// Input Format

// First and only line of input contains a single integer N.

// Constraints

// 1

// Output Format

// Output the stair pattern corresponding to the given N.

// Sample Input 0

// 4
// Sample Output 0

// *
// **
// ***
// ****

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        // Loop to print the stair pattern
        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
       scanner.close();
    }
}
