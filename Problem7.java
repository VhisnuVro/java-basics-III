import java.util.Scanner;

// Write a program to print all Natural numbers from 1 to N where you have to take N as input from user

// Input Format

// A single line representing N

// Constraints

// 1 <= N <= 1000000

// Output Format

// N space separated integers from 1 to N.

// Sample Input 0

// 3
// Sample Output 0

// 1 2 3

public class Problem7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        for (int i = 1; i <= N; i++) {

        System.out.print(i+" ");
          
        }

        scanner.close();
    }
}
