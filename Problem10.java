import java.util.Scanner;

// Write a program to print all Natural numbers from N to 1 where you have to take N as input from user

// Input Format

// A single line representing N

// Constraints

// 1 <= N <= 10000000

// Output Format

// N space separated integers from N to 1.

// Sample Input 0

// 5
// Sample Output 0

// 5 4 3 2 1

public class Problem10 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();   
        for(int i =N; i>=1 ; i--)
        {
            System.out.print(i + " ");
        }
        scanner.close();
    }
}
