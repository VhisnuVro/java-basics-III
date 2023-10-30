import java.util.Scanner;

// Write a program to print all odd numbers from 1 to N where you have to take N as input from user. Here N is inclusive.

// Input Format

// A single line representing N

// Constraints

// 1 <= N <= 2000000

// Output Format

// All odd numbers from 1 to N separated by spaces.


public class Problem8 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        for (int i = 1; i <= N; i= i+2) {
            
        System.out.print(i+" ");
          
        }

        scanner.close();
    }
}
