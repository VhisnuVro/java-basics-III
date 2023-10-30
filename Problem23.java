import java.util.Scanner;

// Write a program to input an integer N from user and print hollow inverted right triangle star pattern of N lines using '*'.

// See example for clarifications.

// Input Format

// First line is an integer N

// Constraints

// 1 <= N <= 1000

// Output Format

// N lines conatining only char '*' as per the question.

// Sample Input 0

// 5
// Sample Output 0

// *****
// *  *
// * *
// **
// *
// Sample Input 1

// 4
// Sample Output 1

// ****
// * *
// **
// *


public class Problem23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (j >= i) {
                    if (i == 0 || j == i || j == N - 1 || i == N - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}
